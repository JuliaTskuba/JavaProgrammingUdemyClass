package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);
        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Julia", calculateHighScorePosition(1500));
        displayHighScorePosition("Yury", calculateHighScorePosition(900));
        displayHighScorePosition("Susan", calculateHighScorePosition(400));
        displayHighScorePosition("Tom", calculateHighScorePosition(50));


    }

    public static int calculateScore( boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playersName, int position) {
        System.out.println(playersName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playersScore) {
        if(playersScore > 1000) {
            return 1;
        } else if (playersScore >500 && playersScore < 1000) {
            return 2;
        }else if (playersScore >100 && playersScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
