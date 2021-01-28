import java.util.Scanner;

public class RPGgameTemplate {
   public static void main(String []args) {
   
   Scanner input = new Scanner(System.in);
   
      int PLevel = 1, PAttack = 5, PDefense = 5, PHealth = 100;
      double Rxp = 100, Pxp = 0; 
      int DMonsters = 1, MLevel = 1, MAttack = 2, MDefense = 2, MHealth = 25;
      
   
      System.out.println("Would you like to attack? Sorry there isn't a no");
      String UserAttack = input.nextLine();
      
      
      
      while (Rxp >= Pxp) {
         if (DMonsters 
         if (Rxp <= Pxp) {
            Plevel++; 
            Rxp = Rxp*1.5;
            PAttack = PAttack + 2;
            PDefense = PDefense + 2;
         }
      }
   
   
   }
}
