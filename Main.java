package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(sumOdd(1,10));
    }

    public static boolean isOdd(int number) {
        if (number <= 0) return false;
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if(end<start || end <= 0 || start <= 0) {return -1;}
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
