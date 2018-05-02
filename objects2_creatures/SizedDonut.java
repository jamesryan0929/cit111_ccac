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
public class SizedDonut {
    public String name;
    public int sizeInmm;
    public int donutId;
    
    private int percRemaining = 100;
    
    public void simulateEating(int percentEaten){
        percRemaining = percRemaining - percentEaten;
    }//close method
    
    public int getPercRemaining(){
        return percRemaining;
    }//close method
    
}//close class
