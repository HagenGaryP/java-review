package oop.encapsulation;

/**
 *
 */
public class Player {
    // public scope for variables
    public String fullName;
    public int health;
    public String weapon;
    // not using a constructor, but will use two other methods

    // method to decrease the player's health
    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    // method to return the current health value.
    public int healthRemaining() {
        return this.health;
    }

}
