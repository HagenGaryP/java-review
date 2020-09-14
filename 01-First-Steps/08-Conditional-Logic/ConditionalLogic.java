/***************************************        CONDITIONAL LOGIC       *************************************
 *
 * Conditional Logic uses specific statements to allow us to check a condition and execute certain code
 * based on whether that condition (the expression) is true or false.
 *
 *
 * if-then Rule - Always use a Code Block
 *
 * Using the if-statement with the curly braces, code block, when using an if-then
 *
 * A code block allows more than one statement to be executed - a block of code.
 *
 * The format is:
 *
 * if (expression) {
 *     // statement1
 *     // statement2
 *     // etc...
 * }
 *
 *
 */

//public class ConditionalLogic {
//
//    public static void main(String[] args) {
//        boolean isAlien = false;
//        // if statement
//        if (!isAlien) { // same as saying (isAlien == false)
//            System.out.println("It is not an alien!");
//            System.out.println("This is executed as well, when using a code block!");
//        }
//    }
//}

/***************************************        Logical AND Operator       *************************************
 *
 * When you want to check if BOTH condition 1 and condition 2 are true, before executing code, use && 'and' operator.
 *
 * && is the logical AND which operates on boolean operands - Checking if both conditions are met (true or false).
 */
//
//public class ConditionalLogic {
//
//    public static void main(String[] args) {
//        int topScore = 80;
//        if (topScore < 100) {
//            System.out.println("You got the high score!");
//        }
//        // Logical 'and' operator
//        int secondTopScore = 60;
//        if (topScore > secondTopScore && topScore < 100) {
//            System.out.println("Greater than second top score and less than 100");
//        }
//
//    }
//}


/***************************************        Logical OR Operator       *************************************
 *
 * When you want to check if EITHER condition 1 OR condition 2 are true, before executing code, use || 'or' operator
 *
 * || is the logical OR which operates on boolean operands - Checking if either condition is true or false.
 */

//public class ConditionalLogic {
//
//    public static void main(String[] args) {
//        int topScore = 80;
//        // Logical 'or' operator
//        int secondTopScore = 60;
//        if ((topScore > 90) || (secondTopScore <= 90)) {
//            System.out.println("Either or both of the conditions are true");
//        }
//
//    }
//}


/***************************************        TERNARY OPERATOR      *************************************
 *
 * The ternary operator is a shortcut to assigning one of two values to a variable depending on a condition.
 *
 * it's a shortcut of the if-else statement.  For example:
 *
 * int ageOfClient = 20;
 *
 * boolean isEighteenOrOver = ageOfClient == 20 ? true : false;
 * // operand one - ageOfClient = 20 in this case is the condition we are checking.
 * // It needs to return true or false.
 * // Operand two - true in this case, is the value assigned to the variable isEighteenOrOver if condition is true.
 * // Operand three - false, in this case, is value of variable isEighteenOrOver if condition above was false.
 *
 * So, the ternary above would return TRUE because ageOfClient has the value 20.
 *
 * It can be a good idea to use parentheses to make the code easier to read:
 * boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
 *
 */

public class ConditionalLogic {

    public static void main(String[] args) {
        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to execute");
        }

        isCar = true;
        // TERNARY
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }
}