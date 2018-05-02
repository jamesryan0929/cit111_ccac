/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects2_creatures;

/**
 *
 * @author james_000
 */
public class Creature {
    
    // public member variable
    public String name;
    public String species;
    //private member variable
    private int biteSizeInPercent;
    
    //method to simulate eating donuts
    public void eatDonut(SizedDonut donutToEat){
        //guts go here
    }
    
    //"getter method for biteSizeInPercent
    public int getBitSizeInPercent(){
        return biteSizeInPercent;
    }
    
    //setter method for biteSizeInPercent
    public void setBiteSizeInPercent(int biteSizeInPercent){
        //we need guts to check bite size
        this.biteSizeInPercent = biteSizeInPercent;
    }//close class
    
    
    
}
