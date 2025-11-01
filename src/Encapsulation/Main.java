package Encapsulation;

class Main {
    public static void main(String[] args) {
        // Player player = new Player();
        // player.name = "Sara";
        // player.weapon = "sord";
        // player.health = 30;
        // player.loseHealth(20);
        // player.loseHealth(100);
        // System.out.println(player.healthRemaining());

        EnhancedPlayer Nadia = new EnhancedPlayer("Nadia");
        EnhancedPlayer Tim = new EnhancedPlayer("Tim", 200, "gun"); 
        // encapsulation: privating the fields that no one can acces for example the health manualy and it has a default value;
        System.out.println("Initial health is " + Nadia.healthRemainingPlayer());
        System.out.println("Initial health is " + Tim.healthRemainingPlayer());

    }
    
}