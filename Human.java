public class Human 
{
   private String name; 
   private String stats;
   private int level;
   private double defense;
   private double health;
   private double experience; 

   public Human(String n) {
      setName(n);
      setLevel(1);
      setDefense(2);
      setHealth(100);
      setExperience(0);
   }
   
   public void setName()
   {
      return name;
   }
   
   public int setLevel()
   {
      return level;
   }
   
   public double setDefense() 
   {
      return defense;
   } 
   
   public double setHealth() 
   {
      return health;
   }
   
   public double setExperience() 
   {
      return experience;
   }
   
   public String getStats() 
   {
      return stats;
   }
   
   public void takeDamage(double dmg)
   {
      if ( !( getDefense() > dmg ) )
         setHealth( getHealth() + getDefense() - dmg);
   }
   
   public void takeRawDamage(double dmg) // Monster Takes Raw Damage (not considering defense)
   {
      setHealth( getHealth() - dmg );   
   }
   
   /*
   public void getStats() {
      System.out.println(setName + " stats are: \n Level: " + setLevel + "\n Defense: " + setDefense + "\n Health: " + setHealth + "\n Experience: " + setExperience);
   }
   */
  /*  
      int plevel = 1;
      int pAttack = 5, pDefense = 5;
      double pHealth = 100;
      double pExp = 0, rExp = 100;
   
      if (pExp >= 100)
      {
      plevel++;
      pExp = pExp * 1.25;
      pAttack = pAttack + 2;
      pDefense = pDefense +2;
      pHealth = pHealth * 1.5;
   }
   */


}