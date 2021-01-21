package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isPalindrome(-121));


    }

    public static boolean isPalindrome(int n) {

        int reverse = 0;
        int og = Math.abs(n);
        while (Math.abs(n) > 0) {
            int lastDigit = Math.abs(n) % 10;
            reverse *= 10;
            reverse += lastDigit;
            n /= 10;


        }
        return Math.abs(og) == Math.abs(reverse);

    }
}
