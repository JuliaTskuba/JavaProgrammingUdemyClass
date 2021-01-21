package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getEvenDigitSum(220));
    }

    public static int getEvenDigitSum(int number) {
        int digit = 0;
        int sum = 0;
        if(number <0) { return -1;}
        while(number>0) {
            //System.out.println("made it");
            digit = number%10;
            number/=10;
            if (digit % 2 == 0) {
                sum +=digit;
            }

        }
        return sum;

    }
}
