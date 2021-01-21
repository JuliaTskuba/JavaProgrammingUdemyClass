package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(sumFirstAndLastDigit(109));
    }

    public static int sumFirstAndLastDigit(int number) {

        int sum = 0;
        if (number < 0) {
            return -1;
        }
        int firstNumber = number % 10;
        int lastNumber = 0;

        while (number > 0) {
            int accumulation = number % 10;
            number /= 10;
            if (number < 10) {
                lastNumber = accumulation;
            }
        }
        return firstNumber + lastNumber;

    }
}
