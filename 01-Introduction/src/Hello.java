/************************           Part 1 of notes     ************************************************
*
* Java programs have keywords.
* Each has a specific meaning and sometimes they need to be used in specific orders.
* You write Java programs by following a specific set of rules, using a combination of these keywords.
*
* NOTE: Keywords are case sensitive - public and Public and even PUBLIC are different things.
*
* public and class are two java keywords - they have a specific meaning defined within the language's library.
*
* The 'public' java keyword is an ACCESS MODIFIER.
*
* An 'access modifier' allows us to define the scope or how other parts of your code (or even someone else's code)
* can access this code.
*
* For now we will use the public access modifier to give full access.
*
*
* Defining a class - The 'class' keyword is used to define a class with the name following the keyword.
*   -   Hello in this case, and left and right curly braces to define the class block.
*
* To define a class requires an optional access modifier, followed by class, followed by the left and right braces.
*
* */
public class Hello {

    public static void main(String[] args) { // parameters are defined within the parentheses

        System.out.println("Hello World! This is the intro!"); // prints to console on a new line

    }
}

/*****************************        DEFINING THE MAIN METHOD       *************************************
 *
 * A 'method' is a colleciton of statements (one or more) that performs an operation.
 *
 * The 'main' method is a special method that java looks for when running a program,
 * and it is the entry point of any java code.
*/


/*************************************       static          *********************************************
 *
 * static is a keyword used to describe how objects are managed in memory.
 *
 * It means that the static object belongs specifically to the class, instead of instances of that class.
 *
 * Variables, methods, and nested classes can be static.
 *
 *
 * Think of a class for a book. How many instances of class 'Book' could there be?
 * If we created a variable for page count and did not make it static,
 * that variable would be re-used every time a new instance of the 'Book' class was created.
 *
 * Instead, we can make the variable static and make it part of the class itself.
 * The same holds true for classes themselves.
 *
 * A static class is really a class within a class. In fact, static classes are often called static nested classes.
 */


/**************************************           void        *******************************************
 *
 * The void keyword specifies that a method should not have a return value.
 *
 * Tip: If you want a method to return a value, you can use a primitive data type (such as int, char, etc.)
 * instead of void, and use the return keyword inside the method.
 * */

/*************************************          code block      ****************************************
 *
 * A code block is a grouping of two or more statements.
 *
 * This is done by enclosing the statements between opening and closing curly braces.
 *
 * Once a block of code has been created, it becomes a logical unit that can be used any
 *   place that a single statement can.
 */
