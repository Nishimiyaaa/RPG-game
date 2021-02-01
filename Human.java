public class Human 
{
   private String name; 
   private String stats;
   private int level;
   private double defense;
   private double health;
   private double experience; 

   public Human(String n, int l, double d, double h, double e) 
   {
      getName(n);
      getLevel(1);
      getDefense(2);
      getHealth(100);
      getExperience(0);
   }
   
   public String setName() //For an example, Return is only used when someone gives you something and you need to give back 
   //(Ex. Someone gave me a hp they want so I returned the amount of hp they wanted) 
   //You don't use return when you're just giving something out (Ex. I dealt 5 damage, there is no point to return the 5 damage that you dealt because it stays the same in a way or like name)
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
   
   public void getName(String n) //This makes it so you get the name from  getName(n) in Monster and comes to this statement making n equal to name
   {
   name = n;
   }
   
   public void getLevel(int l) 
   {
   level = l;
   }
   
   public void getDefense(double d) 
   {
   defense = d;
   }
   
   public void getHealth(double h)
   {
   health = h;
   }
   
   public void getExperience(double e) 
   {
   experience = e;
   }
   
   public String printStats()
   {
      System.out.println(name + " stats are: \n Level: " + level + "\n Defense: " + defense + "\n Health: " + health + "\n Experience: " + experience);
      return stats;
   }
   

  /*    int plevel = 1;
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