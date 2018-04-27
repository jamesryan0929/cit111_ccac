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
public class FancyBacon {
    private int percRemaining = 100;
    public String name;
    public String name2;
    
    public void eatSwineForTwo(int percEaten, int percEatentwo){ //for shared portion size
        percRemaining = percRemaining - percEaten - percEatentwo;
    }
    
    public void eatSwine(int percEaten){ //for single portion size
        percRemaining = percRemaining - percEaten;
    } //close method
    
    public int getRemaining(){
        
        return percRemaining;
    } //close method
    
    
}
