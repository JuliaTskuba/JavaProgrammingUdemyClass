package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isPerfectNumber(5));
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number < 1) return false;
        else {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
        }
        return (sum == number);

    }
}
