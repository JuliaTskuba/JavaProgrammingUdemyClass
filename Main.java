package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        inputThenPrintSumAndAverage();
       // System.out.println(Math.round(3.66666666));
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int average = 0;
        int count = 1;
        int sum = 0;

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                sum = number + sum;
                average = (int)Math.round((double)sum/count);
                count++;
            } else {
                System.out.println("SUM = " + sum +
                        " AVG = " + average);
                break;
            }
            scanner.nextLine();
        }
    }
}
