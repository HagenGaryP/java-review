/**************************************         STRINGS         **********************************************
 *
 * The String is a datatype that is NOT a primitive type in Java.
 *
 * It's actually a Class, but it's treated a little differently from the typical classes.
 *
 * A String is a sequence of characters (or a single char), and is limited by memory,
 * or the MAX_VALUE of an int, which is 2.14 billion.
 *
 *
 * Calculations are not done with Strings, but you can append with the plus operator.
 * If a calculation is desired you must cast the string to a numerical value.
 *
 *
 * Strings are immutable - meaning you cannot change a String once it is created.
 *
 * when manipulating a string, a new string is actually created, and no manipulation really takes place.
 *
 * As a result of a String being created, appending values to Strings is inefficient and not recommended.
 * Instead, use a StringBuffer (which can be changed).
 * */

public class Strings {

    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);

        // can append to the string with the plus (+) operator
        myString = myString + ", and this is added on to the sting";
        System.out.println("myString is equal to " + myString);
        // OUTPUT: myString is equal to This is a string, and this is added on to the sting

        // adding a number value to a string converts the number value to a string and appends it.
        String numString = "10";
        int myInt = 50;
        numString = numString + myInt;
        System.out.println("numString is equal to " + numString); // numString is equal to 1050
    }
}
