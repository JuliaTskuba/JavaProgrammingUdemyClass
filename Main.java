package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // conditional logic

        boolean isAlien = false;
        if(!isAlien)
            System.out.println("It is not an Alien");

        // remember not to puy semicolon after if statement (if no code block ({})
        if(isAlien) {
            System.out.println("Is !an Alien");
            System.out.println("And I am scared of Aliens");

        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got top score!");
        }

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }


    }
}
