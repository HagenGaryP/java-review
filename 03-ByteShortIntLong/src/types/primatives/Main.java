/********************************       PRIMITIVES  notes       *********************************
 *
 * Primitive types are the most basic data types available within the Java language.
 *
 * There are 8: boolean , short , char , short , int , long , float and double.
 *
 * These types serve as the building blocks of data manipulation in Java.
 * Such types serve only one purpose — containing pure, simple values of a kind.
 *
 * example:
 *
 * public class Primitives {
 *
 *     public static void main(String[] args) {
 *         int x = 5; // Declaration statement - to define variable by indicating data type and name.
 *
 *         int y = (2 + 4) * (22 - 7);
 *         int total = x + y;
 *
 *         System.out.println(total);
 *     }
 * }
 */


/**************************         JAVA PACKAGES        ********************************************
 *
 * A package is a way to organize your Java projects.
 *
 * Think of them like folders/directories with subfolders inside.
 *
 * Companies use their domain names reversed as Java Packages.
 * For example:
 * companyName.subfolder would be 'subfolder.companyName' as a Java Package.
 *
 * This was done by creating project from template and then defining the base project.
 *
 * I didn't have a company folder so it only created one called types.primatives
 */


package types.primatives;

public class Main {

    public static void main(String[] args) {

        // ints - An int has a larger range than Bytes and Shorts, 32 bits, width of 32
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;

        System.out.println("Minimum INT value = " + minIntValue); // Min INT value = -2147483648
        System.out.println("Maximum INT value = " + maxIntValue); // Max INT value = 2147483647
        // going beyond these limits will be an 'overflow' or 'underflow'

        // bytes - A Byte occupies 8 bits (has a width of 8)
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum Byte value = " + minByteValue); // Minimum Byte value = -128
        System.out.println("Maximum Byte value = " + maxByteValue); // Maximum Byte value = 127

        // shorts - A Short occupies 16 bits, and has a width of 16
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Minimum short value = " + minShortValue); // Minimum short value = -32768
        System.out.println("Maximum short value = " + maxShortValue); // Maximum short value = 32767

        // Long - A Long occupies 64 bits, and has a width of 64.

        long myLongValue = 100L; // Must be expressed with 'L' at end, otherwise it's treated as an int.

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Minimum long value = " + minLongValue); // Minimum long value = -9223372036854775808
        System.out.println("Maximum long value = " + maxLongValue); // Maximum long value = 9223372036854775807

        /***** casting in Java ****
         byte newByteValue = (minByteValue / 2); // ERROR:
         Required type: byte
         Provided: int

         To cast, wrap the type you want in parentheses before the value
         */
        byte newByteValue = (byte)(minByteValue / 2); // now the int is cast as a byte

    }
}

/***********************              wrapper class           ****************************************
 *
 * Java uses the concept of a wrapper class for all 8 primitive types.
 *
 * In the case of an INT, we can use 'Integer', and by doing that it gives us
 * ways to perform operations on an int.
 *
 * */


/**************************         Java Overflow and Underflow        ***************************************
 *
 * Overflow and underflow is a condition where you cross the limit of prescribed size for a data type.
 *
 * When overflow or underflow condition is reached, either the program will crash or
 * the underlying implementation of the programming language will have its own way of handing things.
 *
 *
 * In Java arithmetic operators don’t report overflow and underflow conditions.
 * They simply swallow it! It is a very dangerous thing to do.
 * If one doesn’t know how Java handles overflow and underflow then he will not be aware of
 * things happening behind while doing arithmetic operations.
 *
 *
 *
 **********************       Overflow and Underflow in Java int operators        **************************
 *
 *
 * Arithmetic integer operations are performed in 32-bit precision.
 * When the resultant value of an operation is larger than 32 bits (the maximum size an int variable can hold)
 * then the low 32 bits only taken into consideration and the high order bits are discarded.
 *
 * When the MSB (most significant bit) is 1 then the value is treated as negative.
 */


/********************************       CASTING in Java       *********************************
 *
 * Casting means to treat or convert a number from one type to another.
 *
 * We put the type we want the number to be in parenthesis like this:
 * (byte)(myMinByteValue/2);
 *
 */