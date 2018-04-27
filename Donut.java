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
public class Donut {
    
    //member variable
    private int percRemaining = 100;
    public String name;
    
    //method: takes in an integer representing the size of the bite
    //being taken of this donut. returns nothing
    public void simulateEating (int percentEaten){
        //subtract the bite size from the existing donut percent remaining
        percRemaining = percRemaining - percentEaten;
    }//close method
    
    //method: takes no input parametere and returns perc Remaining
    public int getPercRemaining(){
        //very simple guts: just send back the value of one the object's
        //member variables to the calling method. this is called a "getter"
        return percRemaining;
    }//close method
    
    /*
    There is no main() in this class!!
    we must make this object with the new keyword inside another class
   in order for this class to do anything 
    */
}//close class
