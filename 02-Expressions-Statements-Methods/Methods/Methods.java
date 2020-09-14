/******************************************         METHODS IN JAVA         **************************************
 *
 * A method is essentially a function within a class, which allows you to reuse code/logic.
 *
 * When creating a method, and defining the parameters, you do not need to define them in that method.
 *
 * Methods are a way to send values back to where they're called, and it allows communication between code/methods
 *
 * CANNOT BE VOID - void means it will not send back / return any information.
 */

public class Methods {

    public static void main(String[] args) { // this is a method - "the main method"
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // once this line of code is reached/executed, it will run the method, then pick up after
        // arguments are being sent to the function/method
//
//        calculatedScore(gameOver, score, levelCompleted, bonus); // variable arguments

//        int highScore = calculatedScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your high score was " + highScore);
//
//        calculatedScore(true, 800, 8, 200); // actual values, not variables
//
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }

        // challenge

        int highScorePosition = calculateHighScorePosition(2000);
        displayHighScorePosition("Gary", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Chris", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Mike", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Joe", highScorePosition);
    }

    // needs to be 'public static'
    // pass this method the variables as parameters
    public static int calculatedScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        // this will only be executed when the if-statement is NOT executed.  only one return per method.
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the scoreboard!");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}

/***  OUTPUT  ****
 Gary managed to get into position 1 on the scoreboard!
 Chris managed to get into position 2 on the scoreboard!
 Mike managed to get into position 3 on the scoreboard!
 Joe managed to get into position 4 on the scoreboard!
*/