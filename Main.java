package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
     //   for (int i = 8; i >= 2; i--) {
     //       System.out.println("10,000 at " + i + "% " + "interest = " + String.format("%.2f", calculateInterest(10000, i)));
      //  System.out.println(isPrime(4));
        isPrimes(10);
        }



    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;

    }

    public static void isPrimes(int n) {
        int d = 0;
        for (int i = n; i > 0; i++ ) {
            if (isPrime(i)) {
                d++;
                System.out.println(i);
            }
            if(d==3) {break;}

        }
    }
}
