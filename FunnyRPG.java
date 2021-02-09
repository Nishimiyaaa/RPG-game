import java.util.Scanner;

public class FunnyRPG {
   public static void main(String []args) {
      
      Scanner input = new Scanner(System.in); 
      Monster goblin = new Monster("Goblin");
      
      System.out.println("What is your character's name?"); 
      String character = input.next();
      
      Human userChar = new Human(character);
   
      System.out.println(userChar.getName() + "'s your character's name.");
   
   
      while (true) {
         //asks if user would like to attack
         System.out.print(goblin.getName() + " roars! ");
         System.out.println("Would you like to Attack? Yes or No?");
         String user = input.next();
         
         //If user says yes, the user attacks monster
         if (user.toLowerCase().equals("yes")) { 
            goblin.takeDamage(userChar.getAttack());  
            System.out.println("You did: " + userChar.getAttack() + " damage to the Monster! \nThe Monster has " + goblin.getHealth() + " HP left!");
            
            //Finds if the monster is dead
            if (goblin.getHealth() <= 0) {   
               System.out.println("The Monster's Defeated!");
               //increases Monster's Stats
               //put monster stat increase in MonsterClass the next time when you get on
               userChar.increaseExperience(goblin.getExperience());
               goblin.increaseDeaths(1);
               goblin.setHealth(25);
               goblin.increaseHealth(10);
               //Add max hp   
               goblin.increaseAttack(2);
               goblin.increaseDefense(1);
               goblin.increaseExperience(25);
               goblin.increaseLevel(1);
            }
            //Player Levels UP
            else if (userChar.getExperience() >= userChar.getRequiredXP()) {
              //Next time when getting on program, create couple classes for stat increase and put it in here
            }
            
            //Monster attacks user
            
           // else if 
             //  userChar.takeDamage(goblin.getAttack());
               
         
         }
         else if (user.toLowerCase().equals("no")) {  
            System.out.println("NEXT PART COMING OUT SOON!");     
         }    
      }
      /*int mHp = 25, x = 2;
      goblin.setHealth(mHp);
      goblin.getHealth();
      goblin.increaseHealth(1);
      goblin.setHealth(mHp);
      System.out.println(goblin.getHealth());
      //System.out.println(goblin.increaseHealth(goblin.getHealth()));
      */
   }
}
//  if (input.next().toLowerCase().equals("yes"))



// Scanner input = new Scanner(System.in);
// String a = input.next();
// int a = half(4);
// a = 2;

// 

/*

public double half(double num)
{
   return num/2.0;
}

*/
//if (Defeated%2 == 0) {
//prints everything 
//}






// Run(1,000,000,000)
// Random Algorithm 1: RLUUDBU
// Random Algorithm 2: LLULRDB
// 3 bits to represent color, 6 bits to represent position, 4 bits to represent specific cube rotation -> 13 bits per cube position. 10~ cube rotations
// per algorithm means 130 bits per algorithm.
//

