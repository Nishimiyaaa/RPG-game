import java.util.Scanner;

public class FunnyRPG {
   public static void main(String []args) {  
   
<<<<<<< Updated upstream
      Scanner input = new Scanner(System.in); 
=======
      Scanner input = new Scanner(System.in);  
>>>>>>> Stashed changes
      
      while (true) {
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

//if (Defeated%2 == 0) {
//prints everything 
//}