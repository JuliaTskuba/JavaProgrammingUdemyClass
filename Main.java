package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        getGreatestCommonDivisor_2((Integer.MAX_VALUE - 1), Integer.MAX_VALUE);
        System.out.println(getGreatestCommonDivisor((Integer.MAX_VALUE - 1), Integer.MAX_VALUE));

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        long start = System.nanoTime();
        for (int i = first; i > 0; i--) {
            if (first % i == 0) {
                for (int j = second; j > 0; j--) {
                    if (second % i == 0) {
                        if (i == j) {
                            long finish = System.nanoTime();
                            System.out.println(finish - start);
                            return j;
                        } else continue;
                    }
                }
            }
        }
        long finish = System.nanoTime();
        System.out.println(finish - start);
        return 1;

    }

    public static int getGreatestCommonDivisor_2(int first, int second) {
        int max = 0;
        long start = System.nanoTime();
        if (first <= second) {
            max = first;
        } else max = second;

        for (int i = max; i > first && i <= second; i--) {
            if (first % i == 0 && second % i == 0)
                return i;
            long finish = System.nanoTime();
            System.out.println(finish - start);
            break;

        }
        return -1;

    }
}
