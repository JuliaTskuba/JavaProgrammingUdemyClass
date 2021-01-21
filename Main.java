package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // amile is equal to 1.609344
        double miles = 100;
        double kilometres = (miles*1.609344);

        int highScore = 50;
        if(highScore ==50){
            System.out.println("This is an expression");
        }

        // practice parsing out expressions:
        int score = 100;
        if (score > 99) {
            System.out.println("You got the high score!");
            score = 0;
        }
    }
}
