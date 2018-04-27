/*
CIT_111 Spring 2018
Simple Object Exercises
 */
package object1;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author james_000
 */
public class FoodLand {
    
    
    public static void main(String[] args){

        int user;
        boolean isOrdering = true;
        Scanner userIn = new Scanner(System.in);
        
        while(isOrdering){
        
            System.out.println("What do you need to order today?");
            System.out.println("1. Falafel");
            System.out.println("2. Monkfish");
            System.out.println("3. Pork Belly");
            System.out.println("4. A Donut");
            System.out.println("5. Done");

            printDivider();

            System.out.println("Enter the corresponding int:");
            user = userIn.nextInt();

            switch(user){
                case 1:
                    falafel();
                    break;
                case 2:
                    monkFish();
                    break;
                case 3:
                    porkBelly();
                    break;
                case 4:
                    donut();
                    break;
                default:
                    isOrdering = !isOrdering;
                    
            }//close switch
        }//close while
       
        System.out.println("Have a good day!!!");
       
    }//close main
    
    private static void printDivider(){
        System.out.println("");
        System.out.println("....................");
        System.out.println("");
    }//close method
    
    public static void donut(){
        
            Random random = new Random();
            int thresh = 25;
            int firstBiteSize = random.nextInt(thresh);
        
        Scanner userIn = new Scanner(System.in);
        
        
        
        //creat a "handle" variable that can store references to Donut
        Donut firstDonut;
        //creat a new Donut (an instance of the Donut Class) and connect
        // this new object to out "handle" variable firstDonut
        firstDonut = new Donut();
        
        //access firstDonut's name property which is type String, and
        // store the name "Chloe" in this particular Donut object's memory bin.
        System.out.println("Who is eating the Donut?");
        firstDonut.name = userIn.nextLine();
        
        //print a test of Chloe's member variable values
        System.out.println("When first created, " + firstDonut.name + "'s\n"
                + "percent remaining is " + firstDonut.getPercRemaining());
        printDivider();
        
        System.out.println("Calling simulateEating and passing in\n" +
                "a bit size of " + firstBiteSize);
        printDivider();
        // call a method simulateEating on out firstDonut object and pass
        // in the int variable firstBiteSize as a parameter.
        firstDonut.simulateEating(firstBiteSize);
        
        System.out.println("After being eaten, " + firstDonut.name + "'s\n" 
                + "percent remaining is " + firstDonut.getPercRemaining());
        printDivider();
    }//close donut method
    
    private static void falafel(){
        
            Random random = new Random();
            int thresh = 25;
            int firstBiteSize = random.nextInt(thresh);
        
        
        Scanner userIn = new Scanner(System.in);

        String veganIn;
        
        Falafel firstFalafel;
        firstFalafel = new Falafel();                
        
        System.out.println("Who is eating the Falafel?");
        firstFalafel.name = userIn.nextLine();
        
        System.out.println("Vegan Option Required? : y or n?");
        veganIn = userIn.nextLine();
        printDivider();
        
        firstFalafel.veganTzat(veganIn);
        
        printDivider();
        
        System.out.println("When first created, " + firstFalafel.name + "'s\n"
                + "percent remaining is " + firstFalafel.getRemaining());
        printDivider();
        
        System.out.println("Calling simulateEating and passing in\n" +
                "a bit size of " + firstBiteSize);
        printDivider();
       
        firstFalafel.eatFalafel(firstBiteSize);
        
        System.out.println("After being eaten, " + firstFalafel.name + "'s\n" 
                + "percent remaining is " + firstFalafel.getRemaining());
        
        printDivider();

    }//close method
    
    public static void monkFish(){
        Scanner userIn = new Scanner(System.in);
        Random random = new Random();
        int thresh = 25;
        int firstBiteSize = random.nextInt(thresh);
        
        monkFish firstMonk;
        firstMonk = new monkFish();
                
        System.out.println("Who is eating the monkfish?");
        firstMonk.name = userIn.nextLine();
        
        System.out.println("When first created, " + firstMonk.name + "'s\n"
                + "percent remaining is " + firstMonk.getRemaining());
        printDivider();
        
        System.out.println("Calling simulateEating and passing in\n" +
                "a bit size of " + firstBiteSize);
        printDivider();
       
        firstMonk.eatMonk(firstBiteSize);
        
        System.out.println("After being eaten, " + firstMonk.name + "'s\n" 
                + "percent remaining is " + firstMonk.getRemaining());
        
        printDivider();
    }//close method
    
    public static void porkBelly(){
        
        Scanner userIn = new Scanner(System.in);
        Scanner userSt = new Scanner(System.in);
        Random random = new Random();
        int thresh = 25;
        int firstBiteSize = random.nextInt(thresh);
        int secondBiteSize = random.nextInt(thresh);

        FancyBacon pork;
        
        pork = new FancyBacon();
        
        
        System.out.println("Single or Shared size portion?");
        System.out.println("1. Single");
        System.out.println("2. Shared");
        boolean isShared = true; //using as a switch for if/else
        
        int portion = userIn.nextInt();
        
        if (portion == 1){
            isShared = !isShared;
        }//close if
        
        if (isShared){
            System.out.println("Shared Portion Size:");
            System.out.println("Who is eating the Pork Belly?");

            pork.name = userSt.nextLine();
            
            System.out.println("And?");
            
            pork.name2 = userSt.nextLine();

            System.out.println("When first created, " + pork.name + " and " + pork.name2 + "'s\n"
                    + "percent remaining is " + pork.getRemaining());
            printDivider();

            System.out.println("Calling simulateEating and passing in\n" +
                    " bite sizes of " + firstBiteSize + " and " + secondBiteSize);
            printDivider();
            
            pork.eatSwineForTwo(firstBiteSize, secondBiteSize);

            System.out.println("After being eaten, " + pork.name + " and " + pork.name2 +  "'s\n"
                    + "percent remaining is " + pork.getRemaining());
            printDivider();
            
        }else{
            System.out.println("Single Portion Size:");
            System.out.println("Who is eating the Pork Belly?");

            pork.name = userSt.nextLine();

            System.out.println("Ewww... " + pork.name + "! \nDon't you know that stuff is bad for you?");

            System.out.println("When first created, " + pork.name + "'s\n"
                    + "percent remaining is " + pork.getRemaining());
            printDivider();

            System.out.println("Calling simulateEating and passing in\n" +
                    "a bit size of " + firstBiteSize);
            printDivider();
            
            pork.eatSwine(firstBiteSize);

            System.out.println("After being eaten, " + pork.name + "'s\n" 
                    + "percent remaining is " + pork.getRemaining());

            printDivider();
        }//close if/else
        
    }//close method
    
}//close class

    

