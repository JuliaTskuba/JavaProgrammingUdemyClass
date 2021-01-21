package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(hasSameLastDigit(1,1,2));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }
        return ((num1%10) == (num2%10) || (num1%10) == (num3%10) || (num2%10) == (num3%10));

    }

    public static boolean isValid(int n) {
        if (n >= 10 && n <= 1000) {
            return true;
        } else return false;
    }
}
