/*************************************      Parsing Values from a String         **********************************
 *
 * Sometimes you have to convert a string value into another primitive data type.
 *
 * This can be done with the "parse method", which is a static method
 * that can be used to converted or "parse" a string type into a number type.
 *
 * For instance, we would call this parse method on the wrapper class of the data type and pass the string as an arg.
 *
 *      Integer.parseInt("value")
 *
 * So, when parsing other types, make sure the wrapper class and the parseDATATYPE agree,
 * And if you're storing as a variable, then of course that variable needs to be declared as the type returned.
 *
 *
 * Parsing is useful when we need to convert a string into a number, in order to use that number for calculations.
 *
 *
 */

public class ParsingFromString {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        // Integer is the "wrapper class" that we call parseInt() method on
        int number = Integer.parseInt(numberAsString);
        /**
         * parseInt() will try to convert the string passed in as an argument into a number (type specific)
         *
         * If the value returned from parseInt() is the type specified (i.e., int)
         * it will successfully convert the string to an integer.
         *
         * If the conversion fails, we'll get an error
         */
        System.out.println("number = " + number);

        numberAsString += 1; // Java will automatically convert the number added (1) into a string and concat the strings
            // so, numberAsString would have the value of "20181", which is not what we wanted.

        // this will add 1 to the value of "number" since that variable is an int and not a string like the above
        number += 1; // --> 2019
        System.out.println();
        System.out.println("numberAsString incremented = " + numberAsString); // 20181
        System.out.println("int number incremented = " + number); // 2019

        // converting a string that isn't a true number will throw an error: java.lang.NumberFormatException
//        String numAsStringWithChars = "2018a";
//        int notANumber = Integer.parseInt(numAsStringWithChars);
//        System.out.println("this will not compile correctly, notANumber = " + notANumber);
        /**
         * Exception in thread "main" java.lang.NumberFormatException: For input string: "2018a"
         */
        System.out.println();

        // using parse method with the "double type"
        String numString = "2018.125";
        double dNumber = Double.parseDouble(numString);
        System.out.println("double number = " + dNumber);

        // using parse method with the "float type"
        String fNumString = "3.14159265";
        float fNumber = Float.parseFloat(fNumString);
        System.out.println("float number = " + fNumber); // 3.1415927  (rounded since using a float)

    }

}
