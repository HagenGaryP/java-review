/***************************************    INHERITANCE CHALLENGE 1   **************************************************
 *
 * Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
 * Create another class that is a specific type of Car that inherits from the Car class.
 *
 * You should be able to handle steering, changing gears, and moving (speed).
 * You will want to decide where to put the appropriate state and behaviors (fields and methods).
 * Include the changing gears and moving/speed.
 *
 * For your specific type of vehicle you will want to add something specific for THAT type of car.
 *
 *
 ***********************************************************************************************************************
 *
 *
 */

package oop.inheritance;

public class Main {

    public static void main(String[] args) {
        // challenge

        Outlander outlander = new Outlander(36);

        outlander.steer(45); // degrees
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);
    }
}
