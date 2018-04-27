package object1;
import java.util.Scanner;
/**
Sample of using a boolean object as a switch in a while loop.
 */
public class PowerOfBoolean {
     public static void main(String[] args){
         boolean check = true;
         int test = 0;
         Scanner userIn = new Scanner(System.in);
         
         while(check){ //while check = true
             
            System.out.println("You are stuck in a while loop");
            System.out.println("Enter an integer value:");
            
            test = userIn.nextInt();
            
            if (test <= 15){
                printDivider();
                System.out.println("test value is " + test);
            }else{
                printDivider();
                System.out.println("test value is " + test);
                System.out.println("You broke out!");
                printDivider();
                printDivider();
                
                check = !check; //this switches the check value to false
                                // causing the while loop to terminate
                                
            }//close if/else 
          
        }//close while
        System.out.println("You are now outside of the while loop.");
         
     }//close main
     
     private static void printDivider(){
        System.out.println("....................");
    }//close method     

}//close class
