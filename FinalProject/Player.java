package FinalProject;
/*
CCAC CIT_111 Spring 2018 Final Project
An object that allows a character creation for use in a future text-based role-playing adventure.
*/
import java.util.Scanner;

public class Player {
        public String name;
        public int hp;
        public int strength;
        public int dex;
        public int intel;
        public int wisdom;
        public int constitution;
        public int charisma;
        public int baselineLev;
        
        
        
        //determine the baseline level of a new user
        public int getBaselineLev(int totalDi){
            baselineLev = totalDi/2;
            return baselineLev;            
        }//close int
        
    
    // in an actual gaming environment this could be called to determine remaining HP after damage
    // has been taken. In this exercise however it is simply demonstrating character's starting HP.
    public int getHP(int damage){
        hp = (baselineLev + 100)*2;
        hp = hp - damage;
        return hp;
    }
    
    //method to create character
    public void create(){
       Scanner userIn = new Scanner(System.in); //create scanner object
       
       int bank = 60; //total spending points for character stats      
       
       System.out.println("Choose you're character's name:");
       name = userIn.nextLine();       
       printDivide();
       
       while (bank > 0){
                         
                System.out.println("You currently have " + bank + " points to distribute amongst the following stats:");
                System.out.println("Strength");
                System.out.println("Charisma");
                System.out.println("Intelligence");
                System.out.println("Wisdom");
                System.out.println("Constitution");
                System.out.println("Dexterity");
                System.out.println("* * * * * * * * ");
                System.out.println("");
                
                //strength
                System.out.println("Please enter you character's strength:");
                strength = userIn.nextInt();                
                bank = bank - strength;
                if (bank <= 0){ //if statement will break while loop if points bank drops below zero
                    break;
                }
                printDivide();
                
                //Charisma
                System.out.println("Bank: " + bank);
                System.out.println("Please enter you character's Charisma:");
                charisma = userIn.nextInt();
                bank = bank - charisma;
                if (bank <= 0){ 
                    break;
                }
                printDivide();
                
                //Inteligence
                System.out.println("Bank: " + bank);
                System.out.println("Please enter you character's Intelligence:");
                intel = userIn.nextInt();
                bank = bank - intel;
                if (bank <= 0){
                    break;
                }
                printDivide();
                
                //Wisdom
                System.out.println("Bank: " + bank);
                System.out.println("Please enter you character's Wisdom:");
                wisdom = userIn.nextInt();
                bank = bank - wisdom;
                if (bank <= 0){
                    break;
                }
                printDivide();
                
                //Constitution
                System.out.println("Bank: " + bank);
                System.out.println("Please enter you character's Constitution:");
                constitution = userIn.nextInt();
                bank = bank - constitution;
                if (bank <= 0){
                    break;
                }
                printDivide();
                
                //Dexterity
                System.out.println("Bank: " + bank);
                System.out.println("Please enter you character's Dexterity:");
                dex = userIn.nextInt();
                bank = bank - dex;
                if (bank <= 0){
                    break;
                }else{ //user will be forced to repeat this these selections if points are remaining
                    System.out.println("You have " + bank + " remaining points./n Try again!!");
                    bank = 60;
                    strength = 0;
                    dex = 0;
                    wisdom = 0;
                    charisma = 0;
                    intel = 0;
                    constitution = 0;                            
                }
                printDivide();  
        }//close while
       
    }//close method
    
    public void printDivide(){
       System.out.println("");
       System.out.println("***************");
       
      
    }
    
}//close class


