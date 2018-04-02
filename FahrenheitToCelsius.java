/*
This is a simple conversion tool for converting Farenheit to three other units of temperature measurements. User will be prompted to enter the desired
temperture to be calculated for each unit of measurement. 
 */
package week9;
import java.util.Scanner;
/**
 *
 * @author james_000
 */
public class FahrenheitToCelsius {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); //create scanner for user inputs
        
        System.out.println("****Temperature converter****");
        System.out.println("");
        
        //Farhenheit to Celsius Conversion
        System.out.println("Enter the temperature in Fahrenheit you wish to convert to Celsius");        
        double userFahr = scan.nextDouble();
        double convertCel = fahrToCel (userFahr);
        System.out.println("The temperature " + userFahr + " Fahrenheit converted to Celsius is " + convertCel + " degrees celsius");
        System.out.println("************");
       
        //Fahrenheit to Kelvin Conversion
        System.out.println("Enter the temperature in Fahrenheit you wish to convert to Kelvin");        
        userFahr = scan.nextDouble();
        double convertKel = fahrToKel (userFahr);
        System.out.println("The temperature " + userFahr + " Fahrenheit converted to Kelvin is " + convertKel + "k");
        System.out.println("***********");
        
        //Farenheit to Planck Units
        System.out.println("Enter the temperature in Fahrenheit you wish to convert to Planck Units");        
        userFahr = scan.nextDouble();
        double convertPlanck = fahrToPlanck (userFahr);
        System.out.println("The temperature " + userFahr + " Fahrenheit converted to Planck Units is " + convertPlanck + "PU");
        System.out.println("***********");
    }//close main
    
    
    public static double fahrToCel(double fahrIn){ //class for Fahrenheit to Celsius Conversion
        double convertTemp = (fahrIn - 32) / 1.8 ;
        return convertTemp;    
    }//close method
    
    public static double fahrToKel (double fahrIn){ //class for Farenheit to Kelvin conversions
        double convertTemp = (fahrIn + 459.67) * 0.556; 
        return convertTemp;
    }//close method
             
    public static double fahrToPlanck (double fahrIn){ //class for Farenheit to Planck Units
        double convertTemp = 2.55 *(10^32) * fahrIn; 
        return convertTemp;
    }//close method 
}
