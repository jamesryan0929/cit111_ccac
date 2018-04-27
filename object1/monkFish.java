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
public class monkFish {
    private int percRemaining = 100;
    public String name;
    
    public void eatMonk(int percEaten){
        percRemaining = percRemaining - percEaten;
    } //close method
    
    public int getRemaining(){
        
        return percRemaining;
    } //close method
}
