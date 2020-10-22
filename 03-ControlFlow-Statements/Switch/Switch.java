/******************************************      SWITCH STATEMENT         *********************************************
 *
 * The switch statement is not as versatile as the if/elseif/else statements,
 * since the switch only tests if that one variable is equal to a case value.
 *
 * A good use for a switch is if you're actually testing the same variable against dif values for that variable.
 *
 * If you don't use the 'break' keyword in your switch statement it will produce unpredictable results,
 * and basically just continue on to other code instead of breaking out of the switch.
 *
 * Switch statements need the 'default' keyword as the last (default) case.  It doesn't truly need a break.
 */



public class Switch {

    // SWITCH compared to IF, ELSE IF, ELSE STATEMENTS
    public static void main(String[] args) {
//        int value = 1;
//        int value = 2;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        } else if(value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

        // SWITCH STATEMENT version of the above if, else if, else statements
        int switchValue = 3;
        switch(switchValue) {
            // inside the switch statement, switch checks if a case value is equal to the "switchValue" passed in

            case 1:  // case is the keyword, it has a value of 1
                // the code inside this specific case's code block will be executed if switchValue == 1
                System.out.println("Value was 1");
                // the "break" keyword terminates the enclosing switch statement.  It breaks out of the switch.
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            // can have multiple case values accepted to run that block of code for either of those cases.
            case 3: case 4: case 5:
                System.out.println("Value was a 3, 4, or 5");
                System.out.println("More precisely it was a " + switchValue);
                break;

            // switch statements usually require a default case, which is essentially the "else"
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        System.out.printf("%n"); // newline character %n must be used with printf() method

        /** switch statement challenge:
         *
         * Create a switch statement using char instead of int, testing for A, B, C, D, or E.
         * Display a message if any of these are found and then break.
         * Add a default which displays a message saying not found.
         */
        char switchVal = 'A';
        switch(switchVal) {
            // inside the switch statement, switch checks if a case value is equal to the "switchValue" passed in

            case 'A':  // case is the keyword, it has a value of 1
                // the code inside this specific case's code block will be executed if switchValue == 1
                System.out.println("Value was A");
                // the "break" keyword terminates the enclosing switch statement.  It breaks out of the switch.
                break;

            case 'B':
                System.out.println("Value was B");
                break;

            // can have multiple case values accepted to run that block of code for either of those cases.
            case 'C': case 'D': case 'E':
                System.out.println("Value was a C, D, or E");
                System.out.println("More precisely it was a " + switchVal);
                break;

            // switch statements usually require a default case, which is essentially the "else"
            default:
                System.out.println("Value was not found");
                break;
        }

        System.out.printf("%n"); // newline character %n must be used with printf() method

        // switch wth Strings - and the scenario of uppercase and lowercase discrepancies

        String month = "june";

        switch(month.toLowerCase()) { // toLowerCase() is a method available on Strings to convert string to lowercase

            // since we're using ".toLowerCase()" we need to make sure our cases are in lowercase too.
            case "january":
                System.out.println("The month is January.");
                break;
            case "june":
                System.out.println("The month is June.");
                break;
            default:
                System.out.println("dunoooo what month you entered");
                break;
        }
    }

}
