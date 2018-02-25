/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniProject;

/**
 * CIT_111 Intro to Java
 * @author James_Hayes
 */
import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args){
        //define an int variable for car's fuel efficency
        System.out.println("*******Will I Make it?******"); //create a header
        
        double carMpg; //define an int variable for car's fuel efficency
        double gasRem; //define integer-type varable for gas remaining in vehicle
        double distNext; //define integer-type variable for distance to next gas station
        double distRem; //define distance remaining after car has run out of gas
        Scanner userInputScanner = new Scanner(System.in);//create scanner object
        
        System.out.println("Please enter your car's estimated fuel efficency");//prompt user to enter estimated fuel-efficiecy
        carMpg = userInputScanner.nextDouble();//define user entry as value to variable carMpg
        
        System.out.println("Enter the amount of gas remaining:");//prompt user to enter remaing gas
        gasRem = userInputScanner.nextDouble();//define user entry as value of variable gasRem
        
        System.out.println("Enter distance to next gas station");//prompt user to enter distance to next gas station
        distNext = userInputScanner.nextDouble();//define user entry as value of varaible distNext
        
        distRem = (distNext - gasRem*carMpg); //find miles remaining after car has run out of gas
        
        
        //create if/else statement comparing (gas remaining multiplied by car's fuels efficiency)       
        if(gasRem*carMpg < distNext){
            System.out.println("Red Alert! You'll be marooned!! You will be short " + distRem + " miles"); //create response if statement it true
            System.out.println("with your current fuel levels the minimumn fuel to distance ratio will be: " + distNext/gasRem + " to make the next station");
        }else{
            System.out.println("Whew! You'll make it to the next station."); //respone if statement if false
        }//close if/else     
        
    }//close main
}//close class
