package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        minAndMaxInputChallenge();
    }

    public static void minAndMaxInputChallenge() {
        Scanner scanner = new Scanner(System.in);


        int max = 0;
        int min = 0;

        while (true) {
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {

                int number = scanner.nextInt();

                if (number > max) {
                    if (min == 0) {
                        min = max;
                    }
                    max = number;
                } else if (number < min) {
                    min = number;
                }

            } else {
                System.out.println("Max: " + max + "\n"
                        + "Min: " + min);
                break;
            }
            scanner.nextLine();
        }


    }
}
