/********************************  PRIMITIVE notes for Float and Double     *********************************
 *
 * Primitive types are the most basic data types available within the Java language.
 *
 * There are 8: boolean , short , char , short , int , long , float and double.
 *
 * These types serve as the building blocks of data manipulation in Java.
 * Such types serve only one purpose — containing pure, simple values of a kind.
 *
 *
 * ***********************      FLOATING POINT NUMBERS      *************************************************
 *
 * Real numbers, used for more precision in calculations by expressing number with decimal point.
 *
 *
 * ***********************      SINGLE AND DOUBLE PRECISION     *********************************************
 *
 * Precision refers to the format and amount of space occupied by the type.
 *
 * Single precision occupies 32 bits (so, has a width of 32).
 *
 * Double precision occupies 64 bits (width of 64).
 *
 *
 * As a result, the float has a range from 1.4E-45 to 3.4028235E+38
 * and the double is much more precise,
 * with a range from 4.9E-324 to 1.7976931348623157E+308
 */

package types.primatives;

public class Main {

    public static void main(String[] args) {

        // float
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;

        System.out.println("Float min val = " + minFloatValue); // Float min val = 1.4E-45
        System.out.println("Float max val = " + maxFloatValue); // Float max val = 3.4028235E38

        // double
        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double min val = " + minDoubleValue); // Double min val = 4.9E-324
        System.out.println("Double max val = " + maxDoubleValue); // Double max val = 1.7976931348623157E308

        int myIntValue = 5;
        float myFloatValue = 5.25f; // f at the end to indicate it is a float.
        double myDoubleValue = 5.25d; // d at the end to indicate it is a double.
    }
}
