public class Monster {

   private String name;
   private double experience;
   private double health;
   private double maxHealth;
   private double defense;
   private double attack;
   private int level;
   private int deaths;
   
   // DEFAULTS: XP - 25, HP - 25, DF - 2, ATK - 3,LVL - 1, DTH - 0 
   
   public Monster(String n, double xp, double hp, double df, double atk, int lvl, int deaths) // Monster Constructor, takes all private instance variables
   {
      setName(n);
      setExperience(xp);
      setHealth(hp);
      setDefense(df);
      setAttack(atk);
      setLevel(lvl);
      setDeaths(deaths);
   }
   
   public Monster(String n) // Monster Constructor, sets name, assigns default values to XP, HP, DF, LVL and DTHs (25,25,2,1,0) respectively
   {
      setName(n);
      setExperience(25);
      setHealth(25);
      setDefense(2);
      setAttack(3);
      setLevel(1);
      setDeaths(0);
      setMaxHealth(25);
   }
   
   public String getName() // Get Monster Name 
   {
      return name;
   }
   
   public double getExperience() // Get Experience Of Monster
   {
      return experience;
   }
   
   public double getHealth() // Get Monster Health
   {
      return health;
   }
   
   public double getMaxHealth()  //Get Max Health
   {
      return maxHealth;
   }
   
   public double getDefense() // Get Monster Defense
   {
      return defense;
   }
   
   public double getAttack() // Get Monster Attack
   {
      return attack;
   }
   
   public int getLevel() // Get Monster Level
   {
      return level;
   }
   
   public int getDeaths() // Get Monster Deaths
   {
      return deaths;       //this is where you get death because you return it to the original value
   }

   public void setName(String n) // Set Name Of Monster
   {
      name = n;  
   }
   
   public void setMaxHealth(double mH) //Set Max Of Health
   {
      maxHealth = mH;
   }
   
   public void setExperience(double e) // Set Experience Of Monster
   {
      experience = e;
   }

   public void setHealth(double h) // Set Health of Monster
   {
      health = h;
   }
   
   public void setDefense(double d) // Set Defense of Monster
   {
      defense = d;
   }
   
   public void setAttack(double a) // Set Attack of Monster
   {
      attack = a;
   }
   
   public void setLevel(int l) // Set Level of Monster
   {
      level = l;
   }
   
   public void setDeaths(int d) // Set Amount of Death Monsters has.
   {
      deaths = d;
   }
   
   public void increaseExperience(double a) // Increase Monster's XP By a Amount
   {
      setExperience( getExperience() + a );
   }
   
   public void increaseHealth(double h) // Increase Monster's Health By h Amount
   {
      setHealth( getHealth() + h );
   }
   
   public void increaseMaxHealth(double mH) // increase monster's max health by mH amount
   {
      setMaxHealth( getMaxHealth() + mH );
   }
   
   public void increaseAttack(double a)   // Increase Monsetr's Attack By a Amount
   {
      setAttack ( getAttack() + a );
   }
   
   public void increaseDefense(double d) // Increase Monster's Defense By d Amount
   {
      setDefense( getDefense() + d );
   }
   
   public void increaseLevel(int l) // Increase Monster's Level By l Amount
   {
      setLevel( getLevel() + l);
   }
   
   public void increaseDeaths(int d) // Increases Monster's Death By d Amount
   {
      setDeaths( getDeaths() + d );
   }
   
   public void takeRawDamage(double dmg) // Monster Takes Raw Damage (not considering defense)
   {
      setHealth( getHealth() - dmg );   
   }
   
   public void takeDamage(double dmg) // Monster Takes Damage (damage taken is equal to damage - defense)
   {
      if ( !( getDefense() > dmg ) )
         setHealth( getHealth() + getDefense() - dmg);
   }
   
   public void updateIfMonsterDead(double a, double mH, double atk, double d) // Checks if monster is dead
   {
      if ( getMaxHealth() <= 0) 
      {
         increaseStats(a, mH, atk, d);
      }
   }
    
   public void increaseStats(double a, double mH, double atk, double d) // Increases stats for the monster when it dies 
   {
      increaseExperience(a);
      increaseMaxHealth(mH);
      increaseAttack(atk);
      increaseDefense(d);
      increaseLevel(1);
      increaseDeaths(1);
   }
   
   public String toString() // Prints stats of the monster, this is what is returned when the object is called without any method e.g print(goblin);
   {
      String toReturn = getName() + " has " + getHealth() + " health and " + getDefense() + " defense. ";
      toReturn = toReturn + getName() + " is level " + getLevel() + " and has " + getExperience() + " experience and has " + getDeaths() + " deaths."; 
      return toReturn;
   } 
   
}
