package academy.learnprogramming;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReadingUserInputChallenge();
    }

    public static void ReadingUserInputChallenge() {
        int count = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number #" + count + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (!hasNextInt) {
                System.out.println("Invalid Number");
            } else {
                int number = scanner.nextInt();
                sum = number + sum;
                count++;
                if (hasNextInt && count == 11) {
                    System.out.println(sum);
                    break;
                }
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
