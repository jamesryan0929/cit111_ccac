package FinalProject;
/*
CCAC CIT_111 Spring 2018 Final Project
*/
public class GameLand {
    
    
    
   public static void main(String[] args){
       Player user = new Player();
       Dice dice = new Dice();
       
        //testing min/max die values
       // dice.diScores();
       
       
       user.create(); //this allows users to create a character using the Player Object function above
       
             
        // This section is just a recap of the information the user entered from above
       
       System.out.println("Your character:");
       System.out.println("* * * * * * * * ");
       System.out.println("Name: " + user.name);
       
       printDivide();
       
        // character baselineLevel is determined by random via simulated Dice throw
        // dice.getTotalDi();
        
       System.out.println("Character's baseline level is determined by dice total divided by two:");
       System.out.println();
       
       
       dice.diScores(); //display values of both dice
       System.out.println("Dice Total " + dice.getTotalDi()); //display value of sum of both dice
       System.out.println("Level " + user.getBaselineLev(dice.getTotalDi())); // determine baselineLevel by passing sum of dice values to 
                                                                              // Player class, where the math will be done to determine the 
                                                                              // the inital level of a new character. 
       printDivide();
       
       //print user stats
       System.out.println("Strenght: " + user.strength);
       System.out.println("Dexterity: " + user.dex);
       System.out.println("Intelligence: " + user.intel);
       System.out.println("Wisdom: " + user.wisdom);
       System.out.println("Constitution: " + user.constitution);
       System.out.println("Charisma: " + user.charisma);
      
       printDivide();
       
       System.out.println("Total HP: " + user.getHP(0)); //access the user total HP and print it
       
       printDivide();
       
   }//close main()
       
     
    private static void printDivide(){
       System.out.println("***************");
   }//close method
   
}//close class
