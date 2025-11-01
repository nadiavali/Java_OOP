package Encapsulation;

public class Player {

    public String reName;
    public int healthPercentage;
    public String weapon;

   
    public void loseHealth(int damage) {
             healthPercentage = this.healthPercentage - damage; 
             if (healthPercentage <= 0) System.out.println("The player is knocked out of game...");
        
    }
    
    public void restoreHealth(int extraHealth) {
        healthPercentage = this.healthPercentage + extraHealth;
        if (healthPercentage >= 0) System.out.println("The player is restored to 100%.");
        this.healthPercentage = 100;
    }

    public int healthRemaining() {
        return healthPercentage;
    }
}