import java.util.Scanner;

public class FunnyRPG {
   public static void main(String []args) {  
   
      Scanner input = new Scanner(System.in); 
      Monster goblin = new Monster("XQC");
      
      System.out.println(goblin.getExperience()); 
      
      while (true) {
         System.out.println("Would you like to Attack? Yes or No?");
         String user = input.next();
         
         if (user == "Yes") {
         //attack statements go under 
         }
         else 
            System.out.println("COMING OUT!");         
      }
      
   }
}

//if (Defeated%2 == 0) {
//prints everything 
//}