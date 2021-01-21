package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int n = 92;
       System.out.println(sumDigits(n));
     //  System.out.println(n);
    }

    public static int sumDigits(int n) {
        if (n < 10) {
            return -1;
        }

        int sum = 0;
        while (n >= 1) {
            // sum = sum + n%10;
            sum += n % 10;
            n /= 10;
          //  System.out.println(n);
        }
        return sum;
    }
}
