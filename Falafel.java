/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object1;
import java.util.Scanner;

/**
 *
 * @author james_000
 */
public class Falafel {
    private int percRemaining = 100;
    public boolean isVegan;    
    public String name;
    
    Scanner userIn = new Scanner(System.in);
    
    public void eatFalafel(int percEaten){
        percRemaining = percRemaining - percEaten;
    }//close method
    
    public void veganTzat(String Veg){ //Vegan Tzatziki
        if (Veg.equals("y")){
            System.out.println("Vegan options selected");
            
        }else{
            System.out.println("Vegan options not selected");
            
        }           
    } //close method
    
    
    public int getRemaining(){
        return percRemaining;
    } //close method
    
    
}//close class
