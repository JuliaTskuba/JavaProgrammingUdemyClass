package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        numberToWords(2000);
        //System.out.println(getDigitCount(20));

    }

    public static void numberToWords(int number) {
        int lastDigit = 0;
        int reverse = reverse(number);
        if (number < 0) System.out.println("Invalid Value");
        else if(number ==0) {
            System.out.println("Zero");}
        else {
            while (reverse != 0) {
                lastDigit = reverse % 10;
                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reverse /= 10;
            }

        }
        if(getDigitCount(reverse(number)) != getDigitCount(number)) {
            for(int i = 1; i <= (getDigitCount(number)-getDigitCount(reverse(number))); i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        int original = number;
        int og = Math.abs(number);
        while (Math.abs(number) > 0) {
            int lastDigit = Math.abs(number) % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        return (original < 0 ? reverse*-1: reverse);

    }

    public static int getDigitCount(int number) {
        if(number <0) {return -1;}
        if(number == 0) { return 1;}
        int count = 0;
        while(number >0) {
            number/=10;
            count++;
        }
        return count;
    }
}
