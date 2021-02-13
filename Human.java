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
   
   public double getDefense() // gets the defense
   {
      return defense;
   } 
   
   public double getHealth() // gets the health
   {
      return health;
   }
   
   public double getExperience() // gets the experience
   {
      return experience;
   }
   
   public double getAttack() // gets the attack
   {
      return attack;
   }
   
   public double getRequiredXP() // gets required xp
   {
      return requiredXP;
   } 
   
   public void setName(String n) //Sets the name
   {
      name = n;
   }
   
   public void setLevel(int l) // sets the level
   {
      level = l;
   }
   
   public void setDefense(double d) // sets defense
   {
      defense = d;
   }
   
   public void setHealth(double h) // set health
   {
      health = h;
   }
   
   public void setExperience(double e) // set experience
   {
      experience = e;
   }
   
   public void setAttack(double a) // set attack
   {
      attack = a;
   }
   
   public void setRequiredXP(double re) // sets the required xp
   {
      requiredXP = re;
   }
   
   public void takeDamage(double a) // takes a amount of damage
   {
      setHealth ( getHealth() + getDefense() - a);
   }
   
   public void increaseExperience(double e) // increases experience by e amount
   {
      setExperience (getExperience() + e);
   }
   
   public void increaseRequiredXP(double re) // increases required xp by re amount
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
   public void takeMonsterXP(Monster monster, double percentageToTake) // takes a percentage of a monsters hp
   {
      increaseExperience(monster.getExperience());
   }
   */
   
}