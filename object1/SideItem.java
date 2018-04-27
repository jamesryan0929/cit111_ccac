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
public class SideItem {
    
    public boolean isVegan;
    public boolean addSide = true;
    public String name;
    int user = 0;
    Scanner userIn = new Scanner(System.in);
    
    int hummus = 0;
    int tahini = 0;
    int quinoa = 0;
    
        public void side(){

            while(addSide){

                System.out.println("Do you need to add a side item?");
                System.out.println("1 - Hummus");
                System.out.println("2 - Tahini");
                System.out.println("3 - Quinoa Salad");
                System.out.println("4 - Nothing added");

                user = userIn.nextInt();
                
                System.out.println("Quantity:");
                System.out.println("Hummus: " + hummus);
                System.out.println("Tahini: " + tahini);
                System.out.println("Quimoa Salad " + quinoa);

                switch(user){
                    case 1:
                        hummus = hummus + 1;
                    case 2:
                        tahini = tahini + 1;
                    case 3:
                        quinoa = quinoa + 1;
                    case 4: 
                        addSide = !addSide;
                    default:
                        break;
                } //switch
            }// close while
    }
    
}
