public class Monster {

   private String name;
   private double experience;
   private double health;
   private double defense;
   private int level;
   private int deaths;
   
   public Monster()
   {
   
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
   
   
}