package oop.encapsulation;

/**
 * This file shows the proper way of coding (the Player class) with ENCAPSULATION

 * Encapsulation in Java is a mechanism of wrapping the data (variables)
   and code acting on the data (methods) together as a single unit.
   In encapsulation, the variables of a class will be hidden from other classes,
   and can be accessed only through the methods of their current class.
   Therefore, it is also known as data hiding.

 * To achieve encapsulation in Java −

    * Declare the variables of a class as private.

    * Provide public setter and getter methods to modify and view the variables values.
 */
public class EnhancedPlayer {
    private String fullName;
    private int hitPoints = 100; // default value for health is 100
    private String weapon;

    // CONSTRUCTOR
    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;

        // validation for health
        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }

        this.weapon = weapon;
    }

    // method to decrease the player's health
    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    // getter method to return the hitPoints value;
    public int getHealth() {
        return hitPoints;
    }
}
