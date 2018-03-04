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
        int attempt = 1; //variable for number of attempts on a given problem
        Scanner inputScan = new Scanner(System.in); //generate scanner for userInput
        
        while(attempt < 3){ //user attempts are limited to 3 times, the loop will exit after two attempts
            System.out.println("Attempt #"+ attempt);
            System.out.println("Compute the value of (52 % 7) * 2...");
            userInput = inputScan.nextInt();
            if(userInput == CORRECT_ANS){
                System.out.println("Good Job!");
                attempt = 1;
                break;
                               
            }else{
                attempt = attempt + 1;
                if(userInput < 6){
                    System.out.println("Sorry! That answer is too low. Try again.");
                    
                }else{
                    System.out.println("Sorry, that answer is too high. Try again");
                    
                }//close else
            }//close if/else 
           
        }//close while()
        
        /*
        The while() loop will exit after two attempts. If the attempt variable reaches 3
        it will continue to the following if() statement. If the problem is missed a third
        time then an explaination will appear and explain to the user how the to solve the problem.
        */
        
        if (attempt == 3){
            System.out.println("Attempt #"+ attempt);
            System.out.println("Compute the value of (52 % 7) * 2...");
            userInput = inputScan.nextInt();
            if(userInput == CORRECT_ANS){
                System.out.println("Good Job!");
                attempt = 1;
            }else{
                System.out.println("Sorry, the correct answer was 6.");
                System.out.println("The expression 52 % 7 signifies the remainder");
                System.out.println("after 52 has been divided by 7, which would be 3.");
                System.out.println("So this expression simplifies to 3*2=6");
                }
            attempt = 1;// attempt variable is reset to 1 upon completeion of the question.
        }
    }//close main
}//close class
