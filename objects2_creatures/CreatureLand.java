/*
CIT_111 CCAC Spring 2018
Objects2_Exercise
 */
package objects2_creatures;

import java.util.Random;

/**
 *
 * @author james_000 
 */
public class CreatureLand {
    
    public static void main(String[] args){
        //robodog scene
        printbreak();
        System.out.println("Scene R has begun...");
        SceneR();
        System.out.println("Scene has ended");
        //owl scene
        printbreak();
        System.out.println("Scene O has begun...");
        SceneO();
        System.out.println("Scene has ended");
        

        
    }//close main
    
    public static void SceneO(){
        
        
        Creature owl = new Creature();
        owl.name = "Julie";
        owl.species = "owl";
              
        owl.setBiteSizeInPercent(40);
        
        SizedDonut donutOwl = new SizedDonut();
        donutOwl.donutId = 300;
        donutOwl.name = "Apple Crisp";
        donutOwl.sizeInmm = 50;
        
        System.out.println (owl.name + " the " + owl.species + " has taken a bite of her\n"
        + donutOwl.name + " donut.");
        
        donutOwl.simulateEating(owl.getBitSizeInPercent());
        
        System.out.println("She bites off " + owl.getBitSizeInPercent() + " %.\nThis leaves " + donutOwl.getPercRemaining() + " % of her donut.");
    }// close method
    
    public static void SceneR(){
        
        int thresh = 100;
        Random rand = new Random();
        int biteSize = rand.nextInt(thresh);
        
        Creature roboDog = new Creature();
        roboDog.name = "Fido";
        roboDog.species = "iPooch";
        roboDog.setBiteSizeInPercent(biteSize);
        
        SizedDonut roboDonut = new SizedDonut();
        roboDonut.donutId = 100;
        roboDonut.name = "Chocolate";
        roboDonut.sizeInmm = rand.nextInt(thresh);
        
        SizedDonut roboDonut2 = new SizedDonut();
        roboDonut2.donutId = 102;
        roboDonut2.name = "Powedered";
        roboDonut2.sizeInmm = 50;
        roboDonut.simulateEating(biteSize);
        
        System.out.println ( roboDog.name + " the " + roboDog.species + " has taken a bite of his "
        + roboDonut.name + " donut.");     
        
        System.out.println("He bites off " + biteSize + "%. This leaves " + roboDonut.getPercRemaining() + "% of the " + 
                roboDonut.name + " donut.");
        
        System.out.println("");
        
        biteSize = rand.nextInt(thresh);
        roboDog.setBiteSizeInPercent(biteSize);
        roboDonut2.simulateEating(biteSize);
        
        
        System.out.println("Then he finds a " + roboDonut2.name + " donut."
                + "He bites of " + roboDog.getBitSizeInPercent() + "%.\nThis leaves " + roboDonut2.getPercRemaining() + "% of his second donut.");
                
    }//close method
    
    public static void printbreak(){
        System.out.println("");
        System.out.println("***************");
        System.out.println("");
        
    }
}//close class
