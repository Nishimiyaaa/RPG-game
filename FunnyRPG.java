import java.util.Scanner;

public class FunnyRPG {
   public static void main(String []args) {
   
   
   
   
   
   
      Scanner input = new Scanner(System.in); 
      Monster goblin = new Monster("Goblin");
      System.out.println(goblin.deaths);
      while (true) {
         System.out.print(goblin.getName() + " roars! ");
         System.out.println("Would you like to Attack? Yes or No?");
         String user = input.next();
         
         if (input.next().toLowerCase().equals("yes")) { //checks for the user's input, changes all the letters to lower case, then finds if the statement user put in is equal to (" ")
            //attack statements go under
         }
         else if (input.next().toLowerCase().equals("no")) {  
            System.out.println("COMING OUT!");     
         }    
      }
   }
}
// 
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

