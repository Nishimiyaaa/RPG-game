public class Human
{
   private String name; 
   private String stats;
   private int level;
   private double defense;
   private double health;
   private double experience;    
   private double attack;
   private double requiredXP;
   
   
   public Human(String n, double xp, double hp, double df, int lvl, double atk) //custom stats incase if wanted
   {
      setName(n);
      setExperience(xp);
      setHealth(hp);
      setDefense(df);
      setLevel(lvl);
      setAttack(atk);
   }
   
   public Human(String n) //default stats
   {
      setName(n);
      setLevel(1);
      setDefense(2);
      setHealth(100);
      setExperience(0);
      setAttack(5);
      setRequiredXP(100);
   }
   
   public String getName() //For an example, Return is only used when someone gives you something and you need to give back 
   //(Ex. Someone gave me a hp they wanted so I returned the amount of hp they wanted) 
   //You don't use return when you're just giving something out (Ex. I dealt 5 damage, there is no point to return the 5 damage that you dealt because it stays the same in a way or like name)
   {  
      return name;
   }

   public int getLevel()         //gets the name
   {
      return level;
   }
   
   public double getDefense() 
   {
      return defense;
   } 
   
   public double getHealth() 
   {
      return health;
   }
   
   public double getExperience() 
   {
      return experience;
   }
   
   public double getAttack()
   {
      return attack;
   }
   
   public double getRequiredXP() 
   {
      return requiredXP;
   } 
   
   public void setName(String n) //Sets the name
   {
      name = n;
   }
   
   public void setLevel(int l)   
   {
      level = l;
   }
   
   public void setDefense(double d) 
   {
      defense = d;
   }
   
   public void setHealth(double h)
   {
      health = h;
   }
   
   public void setExperience(double e) 
   {
      experience = e;
   }
   
   public void setAttack(double a)
   {
      attack = a;
   }
   
   public void setRequiredXP(double re)
   {
      requiredXP = re;
   }
   
   public void takeDamage(double a)
   {
      setHealth ( getHealth() + getDefense() - a);
   }
   
   public void increaseExperience(double e) 
   {
      setExperience (getExperience() + e);
   }
   
   public void increaseRequiredXP(double re)
   {
      setRequiredXP ( getRequiredXP() * re ); 
   }
   
   public String toReturn() //returning with no return statement makes it so it basically 
   {
      String toReturn = name + " has " + health + ", " + defense + ", and " + experience + getName() + getAttack();;
      toReturn = toReturn + name + " stats are: \n Level: " + level + "\n Defense: " + defense + "\n Health: " + health + "\n Experience: " + experience;
      return toReturn;
   }
   

  /*  
      int plevel = 1;
>>>>>>> cca726bd81e7023a98a693ae2b2e6904b1f071eb
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