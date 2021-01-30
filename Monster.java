public class Monster {

   private String name;
   private double experience;
   private double health;
   private double defense;
   private int level;
   private int deaths;
   
   // DEFAULTS: XP - 25, HP - 25, DF - 2, LVL - 1, DTH - 0 
   
   public Monster(String n, double xp, double hp, double df, int lvl, int death) // Monster Constructor, takes all private instance variables
   {
      setName(n);
      setExperience(xp);
      setHealth(hp);
      setDefense(df);
      setLevel(lvl);
      setDeaths(0);
   }
   
   public Monster(String n) // Monster Constructor, sets name, assigns default values to XP, HP, DF, LVL and DTHs (25,25,2,1,0) respectively
   {
      setName(n);
      setExperience(25);
      setHealth(25);
      setDefense(2);
      setLevel(1);
      setDeaths(0);
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
   
   public double getDefense() // Get Monster Defense
   {
      return defense;
   }
   
   public int getLevel() // Get Monster Level
   {
      return level;
   }
   
   public int getDeaths() // Get Monster Deaths
   {
      return deaths;
   }
   
   public void setName(String n) // Set Name Of Monster
   {
      name = n;
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
      setHealth( getHealth() + h);
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
   
   public String toString() // Prints stats of the monster
   {
      String toReturn = getName() + " has " + getHealth() + " health and " + getDefense() + " defense. ";
      toReturn = toReturn + getName() + " is level " + getLevel() + " and has " + getExperience() + " experience and has " + getDeaths() + " deaths."; 
      return toReturn;
   }
}
