/******************************************      FOR LOOP STATEMENT         **************************************
 *
 * The For statement is used to loop code, which is just executing the code block multiple times.
 *
 * This loop will only run if the specified condition is met, and it will run until condition is no longer met.
 *
 *
 * SYNTAX:
 *
 *      for(init; terminate condition; increment or decrement) {
 *          // code to be executed
 *      }
 *
 * Can loop forwards or backwards, and can be used to iterate over something like an Array or other Iterable Object.
 *
 *
 */



public class ForStatement {


    public static void main(String[] args) {
        // example of executing the same thing multiple times manually
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        // FOR LOOP
//        for (int i = 0; i < 2; i++) {
//            System.out.println("Loop " + i + " hello!");
//        }

        for (int i = 2; i < 5; i++) {
            // using String.format() method will convert the number to a string with a specified decimal precision.
            // "%.2f" indicates 2 decimal places, for example -> String.format("%.2f", 3.14159265) would return 3.14
            System.out.println("$10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        /**
         * The java string format() method returns the formatted string by given locale, format and arguments.
         *
         * If you don't specify the locale in String.format() method,
         * it uses default locale by calling Locale.getDefault() method.
         *
         * Parameters
         *      locale : specifies the locale to be applied on the format() method.
         *      format : format of the string.
         *      args : arguments for the format string. It may be zero or more.
         *
         * Returns -> formatted string
         *
         * The format() method of java is like sprintf() function in c language and printf() method of java language.
         *
         *  *** Internal implementation ***
         * public static String format(String format, Object... args) {
         *        return new Formatter().format(format, args).toString();
         *    }
         */
        }

        // prime challenge starts here
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                // break out if count is 3
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate / 100));
    }

    // commonly asked question - write a function the determine if a given number n is prime or not.
    public static boolean isPrime(int n) {
        if (n == 1) return false;
        // the standard and less efficient way
//        for (int i = 2; i <= n/2; i++) {
//            if (n % i == 0) return false;
//        }

        // optimized version - using Math.sqrt(n)
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    /**
     * Explanation behind the optimized version of "isPrime"
     *
     * The main detail of the above function is that one of the numbers, "a or b",
     * will always be less than the square root of n.
     *
     * If n is not a prime number then there are two numbers, when multiplied, that give n   --> (a * b) = n
     *
     * So, this means we do not have to loop from 2 to n,
     * instead we can loop from 2 to (the square root of n)
     */

}
