import java.util.Scanner;

/*************************************      READING USER INPUT        **********************************
 *
 * Aside from using the static parse method, we can also use other methods called nextLine and Scanner.
 *
 * Scanner is a class that is a simple text scanner that can pass both Primitive types and Strings,
 * so essentially scanner uses parse methods internally.
 *
 * The method called "next" returns a string, allowing us to save the returned value and store as a variable.
 *
 * This is useful for prompting the user for data to input.
 *
 *
 *
 * There are some problems that might occur when the user enters invalid input.
 *
 * 1) Negative numbers would cause issues because it will calculate the age to be the current year + the input number
 *
 * 2) Entering the wrong data type
 */

public class ReadingUserInput {

    public static void main(String[] args) {
        // Scanner class -->  instantiating with the 'new' keyword to create a new scanner instance
        Scanner scanner = new Scanner(System.in); // System.in  is used for input, instead of system.out

        System.out.println("Enter your year of birth: ");

        // hasNextInt method - checks to see if the next input entered is a integer.
        // if the input does not qualify as an int, it will return false.  Allows us to avoid type errors.
        boolean hasNextInt = scanner.hasNextInt();

        // handling the potential errors from the user entering invalid input
        if (hasNextInt) {
            // scanner's nextInt() method parses the string into an integer for us.
            int yearOfBirth = scanner.nextInt();

            // handle next line character, solving the "enter key issue"
            scanner.nextLine();

            System.out.println("Enter your name: ");

            // using nextLine method on Scanner instance we created above
            String name = scanner.nextLine();

            // calculate the age and print it out to the user.
            int age = 2020 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("invalid input for year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }


        /**
         * After we've finished using a scanner, we should close it using the "close" method.
         *
         * Note: Using Scanner methods after the scanner is closed will throw an error.
         *
         * The reason we want to close the scanner after we're done using it is because
         * it releases the underlying memory that Scanner was using internally.
         *
         * When the user enters in a number and presses enter, this will end the line.
         * So, it's recommended after a call to "nextInt", to call the next line again without assigning to a variable.
         *
         * In other words, in order to handle the "Enter key issue", we have to call next line, so the scanner knows.
         *
         * Internally, the scanner is checking for a line separator from the user.
         * Enter is a line separator, so when we hit enter as a user, we are typing a line separator.
         * This is interpreted as input by the Scanner.
         *
         * When we reach the nextLine method without accounting for this "enter key issue", the input becomes Enter
         * Which means it is essentially just skipping the part where we tried to store the name variable input.
         *
         *
         */


        scanner.close();
    }

}