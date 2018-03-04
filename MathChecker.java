/*
 *CCAC CIT_111 Intro to Java Math Checker Project
 *A simple program to ask a math problem and check user input against the answer
 */
package classExercise;

import java.util.Scanner;
/**
 *
 * @author james_000
 */
public class MathChecker {
    public static void main(String[] args){
        System.out.println("** Math Checker **");
        
        final int CORRECT_ANS = (52 % 7) * 2; //hard-coded math problem
        int userInput; //int variable for user input
       
        Scanner inputScan = new Scanner(System.in); //generate scanner for userInput
        
        while(true){
            //user attempt 1
            System.out.println("Compute the value of (52 % 7) * 2...");
            userInput = inputScan.nextInt();
            if(userInput == CORRECT_ANS){
                System.out.println("Good Job!");
                               
            }else{
                if(userInput < 6){
                    System.out.println("Sorry! That answer is too low. Try again.");
                    
                }else{
                    System.out.println("Sorry, that answer is too high. Try again");
                }//close else
            }//close if/else
            
            //user attempt 2
            System.out.println("Compute the value of (52 % 7) * 2...");
            userInput = inputScan.nextInt();
            if(userInput == CORRECT_ANS){
                System.out.println("Good Job!");
            }else{
                if(userInput < 6){
                    System.out.println("Sorry! That answer is too low. Try again.");
                    
                }else{
                    System.out.println("Sorry, that answer is too high. Try again.");
                }//close else
                
            }//close if/else
            
            //user attempt 3
            System.out.println("Compute the value of 52 % 7) * 2...");
            userInput = inputScan.nextInt();
            if(userInput == CORRECT_ANS){
                System.out.println("Good Job! Third time is the charm!!!");
                
            }else{//missed question three times, provide answer with explaination of answer. 
                System.out.println("Sorry, the correct answer was 6");
                System.out.println("52 % 7 is signifying the remainder after dividing 52 by 7");
                System.out.println("52 divided by 7 would be 7 with a remainder of 3...");
                System.out.println("So this would simplify to 3 * 2... which is 6");
                break;
            }//close else
            
            
        }//close while()
    }//close main
}//close class
