/******************************************         METHOD OVERLOADING         **************************************
 *
 * Method Overloading is the option where you use the same method name but with different parameters.
 *
 * when overloading a method, you need to create a unique method signature.
 *
 * Changing the data type of the return type is not enough to make it a unique method signature,
 * but changing the number of parameters WILL make it unique.
 */

public class MethodOverloading {

    public static void main(String[] args) {
//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New Score is " + newScore);
//        calculateScore(75);
//        calculateScore();

        // challenge
        double centimeters = calcFeetAndInchesToCentimeters(2, 6);
        if (centimeters < 0.0) {
            System.out.println("invalid parameters");
        }
        // same thing, but using the other overloaded method that takes only inches.
//        calcFeetAndInchesToCentimeters(30);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player" + playerName + " scored " + score + " points");
        return score * 1000;
    }

    // overloading
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    // overloading again
    public static int calculateScore() {
        System.out.println("Some player scored LITERALLY no points... HAHAHAH!");
        return 0;
    }

    /** CHALLENGE
     *
     * Create a method called 'calcFeetAndInchesToCentimeters' that takes in feet and inches as parameters.
     *
     * You should validate first param, feet, is greater than or equal to 0
     * and second param, inches, is greater than or equal to 0 AND less than or equal to 12.
     * return -1 from the method if either of the above is not true
     *
     * If params are valid, then calculate and return how many centimeters comprise the feet and inches.
     *
     * Create a 2nd method of the same name but with only one param, inches.
     *
     * Validate that inches >= 0 (if not then return -1)
     * Then calculate number of feet from the given number of inches, but there's a catch,
     * you have to call the other overloaded method, passing the correct feet and inches calculated.
     *
     * HINTS:
     * Use double for your number data types.
     * 1 inch = 2.54cm.   1 foot = 12 inches
     * Calling another overloaded method just requires you to use the right number of parameters.
     *
     */

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches >= 12)) {
            return -1;
        }
        // my initial solution
        inches += (feet * 12);
        return calcFeetAndInchesToCentimeters(inches);

        // other solution, when initial is commented out.
//        double centimeters = (feet * 12) * 2.54;
//        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        // my initial solution
        double centimeters = (inches * 2.54);
        System.out.println(inches + " inches is equal to " + centimeters + "cm");
        return centimeters;

        // other solution, when initial is commented out.
//        double feet = (int) inches / 12;
//        double remainingInches = (int) inches % 12;
//        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
//        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
