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
      
         System.out.print(goblin.getName() + " roars! ");
         System.out.println("Would you like to Attack? Yes or No?");
         String user = input.next();
         
         if (user.toLowerCase().equals("yes")) { //checks for the user's input, changes all the letters to lower case, then finds if the statement user put in is equal to (" ")
            System.out.println("You did: " + userChar.getAttack() + " damage to the Monster! \nThe Monster has " + goblin.takeDamage(userChar.getAttack()) + " HP left!");
            //attack statements go under
            if (goblin.getHealth() <= 0) {   //Finds if the monster is dead or not
               goblin.increaseDeaths(goblin.getDeaths());
               System.out.println("The Monster's Defeated!");
               break;
            }
         }
         else if (user.toLowerCase().equals("no")) {  
            System.out.println("NEXT PART COMING OUT SOON!");     
         }    
      }
      int mHp = 25, x = 2;
      goblin.setHealth(mHp);
      System.out.println(goblin.getHealth());
      System.out.println(goblin.increaseHealth(1));
      goblin.setHealth(mHp);
      System.out.println(goblin.getHealth());
      //System.out.println(goblin.increaseHealth(goblin.getHealth()));
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

