/*****************    KEYWORDS, EXPRESSIONS, CODE BLOCKS and IF-THEN-ELSE CONTROL STATEMENTS      ********************
 *
 * if ( condition ) {
 *     // do something
 * } else if (other condition) {
 *     // do something else
 * } else {
 *     // gets executed if no other condition was met
 * }
 *
 *
 *
 ***************************************    scope of Code Blocks    **********************************************
 *
 * can use a variable inside of the code block that was declared outside of it,
 * but if a variable is declared inside of a code block, it will not be available OUTSIDE of that code block
 *
 * if (condition) {
 *     int newScore = 1050;
 *     // do something....
 * }
 * System.out.println("Your new score = " + newScore) // this would not have access to 'newScore'
 *
 *
 *
 ***************************************    IF-THEN-ELSE Recap    ***********************************************
 *
 * The if statement identifies which statement or code block to run based ont he value of an expression.
 *
 * In other words, based on a specific condition that is passed in to check.
 *
 * Inside the code block, defined by curly braces,  { we can have 1 or more statements inside here }
 *
 *
 * We can use the else statement after the if-statement.
 * In the case where the if-statement's condition is false, the else block will be executed.
 */

public class KeywordsAndExpressions {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelcompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("this will execute when no other if-condition is met");
        }
    }

}
