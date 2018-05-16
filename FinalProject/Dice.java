package FinalProject;

import java.util.Random;

/**
 * CCAC CIT_111 Spring 2018 Final Project
 * simulated dice for digital tabletop role playing adventure
 */
public class Dice {
    
    Random rand = new Random(); //create random member
    
    //set dice boundries to 1 and 6 modifiable for different dice styles
    int min = 1; 
    int max = 6;
    //digital dice throw
    int diOne = rand.nextInt((max - min) + 1) + min; 
    int diTwo = rand.nextInt((max - min) + 1 ) + min;
    
    //di total
    int totalDi;
    
    public int getTotalDi(){ //return total dice throw
        totalDi = diOne + diTwo;
        return totalDi;
    }
    
    public void diScores(){ //this method is for demo purposes
        System.out.println("First die roled a " + diOne);
        System.out.println("Second die roled a " + diTwo);
    }
        
}//close class
