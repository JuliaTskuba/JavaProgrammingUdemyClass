package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printSquareStar(8);


    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 1; row <= number; row++) {
                for (int column = 1; column <= number; column++) {
                    // 1 - in first row or last row
                    if (column == number) {
                        System.out.print("*");
                        System.out.println();
                    } else if (row == 1 || row == number) {
                        System.out.print("*");
                    }
                    // 2 - in first column or last column
                    else if (column == 1) {
                        System.out.print("*");
                    }
                    // 4 - number - row + 1
                    else if (column == number - row + 1) {
                        System.out.print("*");
                    } else if (column == row) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}

