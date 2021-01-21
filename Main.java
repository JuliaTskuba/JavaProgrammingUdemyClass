package academy.learnprogramming;

import java.io.Console;
import java.lang.reflect.Array;
import java.time.temporal.JulianFields;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here

        System.out.println("Please enter the hangman word to be guessed: ");
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        String[] wordArray = word.split("");

        System.out.println("*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "!!!!!!!!!!!!!!!!DO NOT SCROLL UP!!!!!!!!!!!!!"



        );
        String guessPlaceHodler = "";
        String guessLettersWrong ="";
        /* Body Parts available = head, body, arm1, arm2, leg1, leg2*/
        int count = 6;
        /* game over if: loose or win */
        /* condition for win:
           win   -> guess word before count goes to 0
           loose -> count goes to 0
         */

        Boolean gameNotOver = true;
        String output = "\n " +
                "" +
                "" +
                "" +
                "        -----------    \n" +
                "        |          |\n" +
                "        |\n" +
                "        |\n" +
                "        |\n" +
                "        |\n" +
                "        |\n" +
                "        |\n" +
                "_________________" +
                "";

        while (gameNotOver) {

            System.out.println("Please guess a letter: ");
            Scanner scan = new Scanner(System.in);
            String guessedLetter = scan.nextLine();
            if (word.toLowerCase().contains(guessedLetter.toLowerCase()) && !guessPlaceHodler.toLowerCase().contains(guessedLetter.toLowerCase())) {
                System.out.println("Correct Letter");
                guessPlaceHodler = guessPlaceHodler.toLowerCase() + guessedLetter.toLowerCase();

                if (guessPlaceHodler.toLowerCase().chars().distinct().count() == word.toLowerCase().chars().distinct().count()) {
                    System.out.println("you win!!!");
                    gameNotOver = false;
                }

            } else if (guessPlaceHodler.toLowerCase().contains(guessedLetter.toLowerCase()) ||
                    guessLettersWrong.toLowerCase().contains(guessedLetter.toLowerCase())) {
                System.out.println("you already guesses this letter, try again");
            } else {
                System.out.println("Incorrect Letter");
                guessLettersWrong = guessLettersWrong + guessedLetter;
                count--;

            }
            if (count == 6) {
                System.out.println(output = "\n " +
                        "" +
                        "" +
                        "" +
                        "        -----------    \n" +
                        "        |          |\n" +
                        "        |\n" +
                        "        |\n" +
                        "        |\n" +
                        "        |\n" +
                        "        |\n" +
                        "        |\n" +
                        "_________________" +
                        "");
            } else if (count == 5) {
                System.out.println(output = "\n " +
                        "" +
                        "" +
                        "" +
                        "        ----------    \n" +
                        "        |         |\n" +
                        "        |         o \n" +
                        "        |\n" +
                        "        |\n" +
                        "        |\n" +
                        "        |\n" +
                        "        |\n" +
                        "_________________" +
                        "");
            } else if (count == 4) {
                System.out.println(output = "\n " +
                        "" +
                        "" +
                        "" +
                        "        ----------    \n" +
                        "        |         |\n" +
                        "        |         o \n" +
                        "        |         | \n" +
                        "        |\n" +
                        "        |\n" +
                        "        |\n" +
                        "        |\n" +
                        "_________________" +
                        "");
            } else if (count == 3) {
                System.out.println(output = "\n " +
                        "" +
                        "" +
                        "" +
                        "        ----------    \n" +
                        "        |         |\n" +
                        "        |         o \n" +
                        "        |         |/ \n" +
                        "        |\n" +
                        "        |\n" +
                        "        |\n" +
                        "        |\n" +
                        "_________________" +
                        "");
            } else if (count == 2) {
                System.out.println(output = "\n " +
                        "" +
                        "" +
                        "" +
                        "        ----------    \n" +
                        "        |         |\n" +
                        "        |         o \n" +
                        "        |        \\|/ \n" +
                        "        |\n" +
                        "        |\n" +
                        "        |\n" +
                        "        |\n" +
                        "_________________" +
                        "");
            } else if (count == 1) {
                System.out.println(output = "\n " +
                        "" +
                        "" +
                        "" +
                        "        ----------    \n" +
                        "        |         |\n" +
                        "        |         o \n" +
                        "        |        \\|/ \n" +
                        "        |          \\ \n" +
                        "        |\n" +
                        "        |\n" +
                        "        |\n" +
                        "_________________" +
                        "");
            } else {
                System.out.println("Sorry, you loose!");
                System.out.println(output = "\n " +
                        "" +
                        "" +
                        "" +
                        "        ----------    \n" +
                        "        |         |\n" +
                        "        |         o \n" +
                        "        |        \\|/ \n" +
                        "        |        / \\ \n" +
                        "        |\n" +
                        "        |\n" +
                        "        |\n" +
                        "_________________" +
                        "");
                gameNotOver = false;
            }
            for (int i = 0; i < wordArray.length; i++) {
                if (guessPlaceHodler.toLowerCase().contains(wordArray[i].toLowerCase())) {
                    System.out.print(wordArray[i]);
                } else {
                    System.out.print("_");
                }
            }
            System.out.println("\n");
        }


    }
}

