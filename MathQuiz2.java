/*
CCAC CIT_100 Week 6
Mystery Door Math Quiz Combo

This is a simple program that allows user to select one of three types of math
types to work within and if a problem is missed the correct answer will be provided.
 */
package classExercises;

//import required packages
import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.sqrt;


/**
 *
 * @author james_hayes 
 */
public class MathQuiz2 {
    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in); //create scanner object
        
        //declare required variables
        int userSel; //user selection 
        int i = 0; //user index for while()
        int thresh = 25; //threshold to taper difficulty of equations
        int thresh_lg = 100; //threshhold for decimal method only
        
        
        Random ranVar = new Random(); //generate random object
        
        //list of varibles for equations
        int x = ranVar.nextInt(thresh); 
        int y = ranVar.nextInt(thresh);
        int m = ranVar.nextInt(thresh);
        double z = ranVar.nextInt(thresh_lg); 
       
        
        while(i==0){
        
            System.out.println("***Math Quiz 2.0***");
            System.out.println("");
            System.out.println("Which area would you like to practice?");
            System.out.println("1 - Decimals and Percentages");
            System.out.println("2 - Algebra");
            System.out.println("3 - Geometry");
            userSel = userIn.nextInt();            
            
            switch(userSel){
                case 1:
                    decimalsPercents(z);
                    break;
                case 2:
                    algebra(x,y,m);
                    break;
                case 3:
                    geometry(x,y);
                    break;
                default:
                    System.out.println("Error: Selection Invalid.");
                    break;
            }//close switch
            
            System.out.println("Would you like try another section?"); //allow user to exit or try another problem
            System.out.println("Press 0 for Yes");
            System.out.println("Press 1 for No");
            i = userIn.nextInt();
            
            
            if(i==0){ //user answers 1 this indicates they wish to exit program
                x = ranVar.nextInt(thresh);
                y = ranVar.nextInt(thresh);
                m = ranVar.nextInt(thresh);
                z = ranVar.nextInt(thresh_lg);               
            }else{//if user wishes to continue we will generate new random values for all variables
                System.out.println("Thank you for checking out my project.");
                System.out.println("Have a good day!");
                break;
            }//close if/else
        }//close while    
    }//close main method
    
    //decimals and percentages method start... conversions of percentages to decimals.  
    public static void decimalsPercents(double x){ 
        Scanner userIn = new Scanner(System.in);
        double userAns;
        
        System.out.println("***Decimals and Percents***");
        System.out.println("What would be the decimal equivalent to " + x +"%?");
        userAns = userIn.nextDouble();
        
        if(userAns == x/100.0){
            System.out.println("Great job!");
        }else{
            System.out.println("This is incorrect");
            System.out.println("The answer was " + x/100.0);
        }//close if/else
    }//close decimals and percents
    
    //algebra method start... this method will generate a simple equation of a line for users to solve
    public static void algebra(int x, int m, int b){ 
        Scanner userIn = new Scanner(System.in);
        double userAns;
        double ans = (m * x + b); //standard equation of a line y=mx+b
        System.out.println("***Algebra***");
        System.out.println("(y - " + b + ") / " + m + " = "+ x); 
        userAns = userIn.nextDouble();
        
        if(userAns == ans){
            System.out.println("Great job!");
        }else{
            System.out.println("This is incorrect");
            System.out.println("The answer was " + ans);
        }//close if/else
    }//close algebra
    
    //geomtry method start... this method will generate a set of random variables for a pythagorean theorem problem. 
    public static void geometry(int a, int b){ 
        Scanner userIn = new Scanner(System.in);
        double userAns;
        double ansFull = sqrt(a*a + b*b); 
        double ans = Math.round(ansFull * 100)/ 100.0; //rounding to two decimal places. Always divide int variables by double for accurate rounding
        
        System.out.println("***Geometry***");
        System.out.println("If a the measurments of two of a given triangle's side is known...");
        System.out.println("Side 1 = " + a);
        System.out.println("Side 2 = " + b);
        System.out.println("Side 3's length can by found via the Pythagorean theorem");
        System.out.println("Find the length of the third side. Round to nearth hundreth.");
        userAns = userIn.nextDouble();
        
        if(userAns == ans){
            System.out.println("Great job!");
        }else{
            System.out.println("This is incorrect");
            System.out.println("The answer was " + ans);
        }//close if/else
        
    }//close geometry
}
