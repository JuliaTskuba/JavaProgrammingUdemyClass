package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getLargestPrime(88));
    }

    public static int getLargestPrime(int number) {
        if (number < 0) {
            return -1;
        }
        for (int i = number; i > 0; i--) {
            if (number % i == 0) {
                //System.out.println(i);
                //check if prime
                for (int j = i - 1; j >= 1; j--) {
                    if (j == 1) {
                        return i;
                    } else if (i % j == 0) {
                        break;
                    } else {
                      //  System.out.println(i + " " + j);
                    }


                }

            }

        }
        return -1;
    }
}
