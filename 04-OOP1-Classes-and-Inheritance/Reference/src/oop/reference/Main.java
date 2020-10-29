/***********************************    REFERENCE vs OBJECT vs INSTANCE vs CLASS    ************************************
 *
 * Using the analogy of building a house to understand Classes.
 *
 * A CLASS is basically a blueprint for a house.
 * Using the blueprint plans, we can build as many houses as we want, based on those plans.
 *
 * Each house built (i.e., instantiated using the "new" operator) is an OBJECT known as an INSTANCE.
 *
 * REFERENCE:
 * Each house you build has an address (a physical location).
 * In other words, if you want to tell someone where you live, you give the address to your house.
 * This would be the reference.
 *
 * You can copy that reference as many times as you'd like, but there's still just one house.
 * Meaning, you aren't copying the house itself, but you're referencing the houses address again.
 *
 * we can pass references as parameters to constructors and methods.
 *
 *
 *
 * Keep in mind that in Java, you always have references to an OBJECT in memory.
 * There is no way to access an object directly.  Everything is done using a reference (variable);
 *
 ***********************************************************************************************************************
 *
 *
 */

package oop.reference;

public class Main {

    public static void main(String[] args) {
	    // create a new house
        House blueHouse = new House("blue"); // blueHouse variable points/references the object in memory.
        // store this blue house in another reference variable.
        House anotherHouse = blueHouse;  // creates another REFERENCE to the same OBJECT in memory.

        System.out.println(blueHouse.getColor()); // blue
        System.out.println(anotherHouse.getColor()); // blue

        // set the color of "anotherHouse" to "red"
        anotherHouse.setColor("red");
        System.out.println(blueHouse.getColor()); // red
        System.out.println(anotherHouse.getColor()); // red

        // create a green house
        House greenHouse = new House("green");
        // REASSIGN "anotherHouse" to greenHouse
        anotherHouse = greenHouse;

        System.out.printf("%nAfter reassigning the variable %n%n");

        // The houses will be the following colors (output commented)
        System.out.println(blueHouse.getColor()); // red
        System.out.println(greenHouse.getColor()); // green
        System.out.println(anotherHouse.getColor()); // green

        /**
         * In the file "House.java", we have a class called House, with "color" as an instance variable (field).
         *
         * The Main class (with the main method) is creating instances of the House class, changing the color
         * and printing the results.
         *
         * The line House blueHouse = new House("blue"); creates a new instance of the House class.
         * Remember, House is a blueprint, and we're assigning it to the blueHouse variable.
         * In other words, it is a REFERENCE to the object in memory.
         *
         * The line House anotherHouse = blueHouse; creates another REFERENCE to the same OBJECT in memory.
         * So at that point we have two references pointing to the same object in memory.
         * There is still just one house, but two references to that one single OBJECT.
         * Think of it like writing your address on two separate pieces of paper.
         *
         * anotherHouse.setColor("red"); will set the color for both variables "anotherHouse" and "blueHouse".
         * This is because those variables are both REFERENCES that point to the same OBJECT in memory.
         * Changing the color of one of these variables will change the object's color that they both point to.
         *
         * House greenHouse = new House("green"); creates another instance of the House class with color set to green.
         * So, now we have two OBJECTS in memory, but we have three REFERENCES (blueHouse, anotherHouse, greenHouse).
         * The variable (reference) "greenHouse" points to a DIFFERENT OBJECT in memory, but blueHouse and anotherHouse
         * point to the same object in memory.
         *
         * "anotherHouse = greenHouse;" is re-assigning the value of anotherHouse.
         * In other words, we are DEREFERENCING "anotherHouse", so it will point to a different object in memory.
         *
         *
         */
    }
}
