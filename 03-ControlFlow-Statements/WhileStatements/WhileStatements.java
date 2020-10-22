/*************************************      WHILE & DO-WHILE LOOP STATEMENTS         **********************************
 *
 * While loops run "while" some condition is true, and continues to run/loop until condition is no longer true.
 *
 *
 *
 *
 * The Java do-while loop is used to iterate a part of the program several times.
 *
 * If the number of iteration is not fixed and you must have to execute the loop at least once,
 *  it is recommended to use do-while loop.
 *
 * The Java do-while loop is executed at least once because condition is checked after loop body.
 */



public class WhileStatements {


    public static void main(String[] args) {
        int count = 1;

        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        // can also write the above using while (true) - this ensures that you'll enter the loop, but remember to exit.
        count = 1;
        while(true) {
            // condition to exit loop
            if (count == 6) break; // breaking out of loop
            System.out.println("Count value is " + count);
            count++;
        }
/**
 * as an example of implementing the do-while loop, we could replicate a for loop in the form of a do-while
 *
 * KEEP IN MIND - The do-while loop will always execute AT LEAST ONCE, so this could lead to infinite loops
 *
 *  While loops are more commonly used than do-while loops.
 */

        // for loop to be used as conversion example for do-while
        for (int i = 1; i != 6; i++) {
            System.out.println("i's value is " + i);
        }

        count = 1; // if we set count = 6, this would cause infinite loop because condition only checks if exactly 6.
        // do-while loop
        do {
            System.out.println("Count value is " + count);
            count++; // if count > 6 at start, by the time it reaches the while, count >= 7, so condition always true.

        // while condition is true, execute again.
        } while (count != 6); // the while just takes in the condition to continue loop if true



        // using while loop with isEvenNumber() method we created
        int number = 4;
        int endingNumber = 20;
//        while (number <= endingNumber) {
//            number++;
//            if (!isEvenNumber(number)) continue;
//
//            System.out.println("Even number " + number);
//        }

        // CHALLENGE: make above while loop also keep track of total even numbers found, and break once 5 are found.
        int totalEven = 0;
        while (number <= endingNumber) {
            number++;
            if (isEvenNumber(number)) totalEven++;
            if (totalEven > 4) {
                System.out.println("Total even numbers = " + totalEven);
                break;
            }
        }
    }

    // create a method called isEvenNumber that takes in an int as a param, returns bool based on even/odd number passed
    public static boolean isEvenNumber(int number) {
        if((number % 2) == 0) return true;
        return false;
    }

}
