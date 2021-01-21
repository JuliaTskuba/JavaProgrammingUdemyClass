package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //same method name w/ diff params
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        double total = calcFeetAndInchesToCentimeters(-10);
        System.out.println(total);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 100;
    }

    public static int calculateScore( int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 100;
    }
    public static void calculateScore() {
        System.out.println("Unnamed player, no points");
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet <0 || (inches <0 || inches >12))
        {return -1;}

        else { return (feet*30.48D)+(inches*2.54D);}
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {return -1;}
        else { return calcFeetAndInchesToCentimeters((int) inches/12, (int) inches%12); }
    }

    


}
