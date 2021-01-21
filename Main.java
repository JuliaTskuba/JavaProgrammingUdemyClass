package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(hasSharedDigit(12, 13));
    }

    public static boolean hasSharedDigit(int n_1, int n_2) {
        if (n_1 < 10 || n_2 < 10 || n_1 > 99 || n_2 > 99) {
            return false;
        }
        int digit_1 = 0;
        int digit_2 = 0;
        while (n_1 > 0) {
            digit_1 = n_1 % 10;
            n_1 /= 10;
            while (n_2 > 0) {
                if (digit_2 == digit_1) {
                    return true;
                }
                digit_2 = n_2 % 10;
                n_2 /= 10;
            }
            if (digit_1 == digit_2) {
                return true;
            }

        }
        return false;


    }
}
