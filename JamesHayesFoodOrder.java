/*
 Simple POS for placing food orders that can calculate prices, tally number of items ordered
and maintain the number of of food items available in the kitchen
 */
package weekB1_scope;
import java.util.Scanner;


/**
 *CIT_111 Java Basics
 * @author James Hayes
 */
public class JamesHayesFoodOrder {
    
    //variables for ordering in a single session
    private static int hummusOrder = 0;
    private static int falafelOrder = 0;
    private static int babaOrder = 0;
    
    
    //variables for invetory available
    private static int hummus = 20;
    private static int falafel = 40;
    private static int baba = 15;
    
    //variable for pricing
    private static double orderTotal = 0;
    final static double HUM_PRICE = 3.99;
    final static double FAL_PRICE = 5.99;
    final static double BABA_PRICE = 4.99;
    final static double TAX = 0.07;
    
    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);//create scanner for case/switch
        int i = 0;
        int userSelect; //userselection
       
        while (i == 0){
            System.out.println("***** Menu *****");

            currentTotal();

            System.out.println("(1) Hummus");
            System.out.println("(2) Falafel");
            System.out.println("(3) Baba Ghanoush");
            System.out.println();
            userSelect = userIn.nextInt();
            
            switch(userSelect){
               case 1:
                   hummus();
                   break;
               case 2:
                   falafel(); 
                   break;
               case 3:
                   babaganoush();
                   break;
               default:
                   System.out.println("Error: Selection Invalid.");
                   break;
           }//close switch
        }
    }   //close main()
    
    public static void hummus(){
        if (hummus > 0){
            Scanner quantity = new Scanner(System.in);
            int quant;
            System.out.println("Enter Quantity:");
            quant = quantity.nextInt();
            hummusOrder = hummusOrder + quant; //add one order of hummus 
            hummus = hummus - quant; //subtract from invetory
            orderTotal = orderTotal + (quant * HUM_PRICE); //add cost of one order to the order
        }else{
            System.out.println("Sorry, insufficient quanities of this item");
            System.out.println("");
        }
    }//close method
    
    public static void falafel(){
        if (falafel > 0){
            Scanner quantity = new Scanner(System.in);
            int quant;
            System.out.println("Enter Quantity:");
            quant = quantity.nextInt();
            falafelOrder = falafelOrder + quant; // add one order of falafel
            falafel = falafel - quant; //remove one order of from invetory
            orderTotal = orderTotal + (quant * FAL_PRICE); //add cost to order total
        }else{
                System.out.println("Sorry, insufficient quanities of this item");
                System.out.println("");            
        }
    }//close method
    
    public static void babaganoush(){
        if (baba > 0){
            Scanner quantity = new Scanner(System.in);
            int quant;
            System.out.println("Enter Quantity:");
            quant = quantity.nextInt();
            babaOrder = babaOrder + quant;
            baba = baba -quant;
            orderTotal = orderTotal + (quant * BABA_PRICE);
        }else{
                System.out.println("Sorry, insufficient quanities of this item");
                System.out.println("");
            }
        
    }//close method
    
    public static void currentTotal(){
        System.out.println("*** Current Order Summary ***");
        System.out.println("Hummus - " + hummusOrder + " (" + hummus + " remaining)" );
        System.out.println("Falafel - " + falafelOrder + " (" + falafel + " remaining)");
        System.out.println("Baba Ghanoush - " + babaOrder + " (" + baba + " remaining)");
        System.out.println("");
        System.out.println("Current Total is $" + orderTotal);
        System.out.println("tax: $" + orderTotal * TAX);
        System.out.println("");
    }//close method
    
}
