/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object1;

/**
 *
 * @author james_000
 */
public class DonutLand {
    
    public static void main(String[] args){
        final int firstBiteSize = 12;
        
        //creat a "handle" variable that can store references to Donut
        Donut firstDonut;
        //creat a new Donut (an instance of the Donut Class) and connect
        // this new object to out "handle" variable firstDonut
        firstDonut = new Donut();
        
        //access firstDonut's name property which is type String, and
        // store the name "Chloe" in this particular Donut object's memory bin.
        firstDonut.name = "Chloe";
        
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
        
    }//close main
    
    private static void printDivider(){
        System.out.println("....................");
    }//close method
    
}//close class
