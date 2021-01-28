import java.util.Scanner;

public class RPGgameTemplate {
   public static void main(String []args) {
   
   Scanner input = new Scanner(System.in);
   
      int PLevel = 1, PAttack = 5, PDefense = 2, PHealth = 100;   //PLevel = Player's level, PAttack = Player's attack, PDefense = Player's Defense, PHealth = Player's Health
      double Rxp = 100, Pxp = 0, Mxp = 25, RawPDMG; 
      int Defeated = 1, MLevel = 1, MAttack = 5, MDefense = 2, MHealth = 25;
      
   
      System.out.println("Would you like to attack? Sorry there isn't a no"); //finds if the user wants to attack, no option for now but there will be an option later on
      String UserAttack = input.nextLine();
      
      
     while (
      
      while (PHealth > 0) {       //This tells you if the player's health goes > 0 or not 
         if (Rxp >= Pxp) {         //If required xp passes or equals to Player's xp, the player will level up in one of the if statements
             
            if (Rxp <= Pxp) {          //If the Player's xp passes the required amount of xp, the player will lvl up and get more attack, defense, and health meanwhile the xp required amount will go up
                Plevel++; 
                Rxp = Rxp*1.5;
                PAttack = PAttack + 2;
                PDefense = PDefense + 2;
         }
      }
      //Steps on what to do
      //1. User attacks Monster (RawPDMG = Player's Attack - Monster's Defense) (MHealth = MHealth - RawPDMG) 
      //2. Find out if the Player's Attack killed the Monster (MHealth <= 0)
      //(Xp Section and Increasing the Monster's Stats on it's death) 
      //2.1 If the Player has killed the Monster, The Player gains xp (Pxp = Pxp + Mxp)
      // The Monster Gains a Level (MLevel++;) <-- MLevel++ is adding 1 to the original amount of MLevel 
      //2.2 After the monster dies, The next monster has increased stats from the previous Monster (MAttack = MAttack + 2; MDefense = MDefense + 2;) 
      //2.3 After, the player has gained the xp, The amount of xp that the Monster drops increases by 1.5x (Mxp = Mxp*1.5)
      //2.4 Make a If statement on if (Mlevel > Defeated) then all the programs that corresponds to the Monster dying and remaking another with improved stats will work (Will Have to Change Later)
      //3. Monster's Attack (Player's Health - Monster's Attack)
      //4. Find if the player is alive to move on (Player's Health > 0) <-- Finds if the Player's Health is above 1
      //5. 
   }
}
