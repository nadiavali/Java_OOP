package Encapsulation;

public class EnhancedPlayer{
    private String name;
    private int health;
    private String weapon;

     

    public EnhancedPlayer(String name) {
       this(name, 100, "Sowrd");
    }



    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health <= 0) this.health = 1;
        else if (health >= 100) this.health = 100;
        else this.health = health;
        this.weapon = weapon;
    }


    public void loseHealth(int damage) {
        health = this.health - damage; 
        if (health <= 0) System.out.println("The player is knocked out of game...");
   
}

    public void restoreHealth(int extraHealth) {
       health = this.health + extraHealth;
       if (health >= 0) System.out.println("The player is restored to 100%.");
       this.health = 100;
    }

    public int healthRemainingPlayer() {
       return health;


}
}
