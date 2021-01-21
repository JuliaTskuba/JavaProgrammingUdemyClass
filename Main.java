package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // + operator
        // operand (15, 12)
        int myVar = 27;
        int result = 1+2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousresult = result;
        result = result - 1;
        System.out.println(result);
        System.out.println(previousresult);
        result = result * 10;
        System.out.println(result);

        result = result % 3;
        System.out.println(result);
    }
}
