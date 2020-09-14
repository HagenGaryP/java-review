/*********************************      Char and Boolean - Primative types      ************************
 *
 * A char occupies two bytes of memory, which is 16 bits, and thus has a width of 16.
 *
 * The reason it is not just a single byte (8 bits), is that it allows you to store Unicode characters.
 *
 * Unicode is an international encoding standard for use with different languages and scripts,
 * by which each letter, digit, or symbol is assigned a unique numeric value that applies
 * across different platforms and programs.
 * Unicode uses a combination of the two bytes that a char takes up in memory
 * and it can represent one of 65535 different types of characters.
 *
 * View the unicode table at ->  https://unicode-table.com/en/#basic-latin
 *
 *
 **********************     BOOLEAN primitive type      ***********
 *
 * A boolean value allows for two choices, True or False, Yes or No, 1 or 0.
 *
 * In Java terms we have a boolean primative type and it can be set ONLY to true or false.
 * */

package types.primatives;

public class Main {

    public static void main(String[] args) {

        // chars
        char myChar = 'D';                  // char can only store one character
        char myUnicodeChar = '\u0044';      // the unicode representation of 'D'

        System.out.println(myChar);         // D
        System.out.println(myUnicodeChar);  // D

        // booleans
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanvalue = false;
    }
}
