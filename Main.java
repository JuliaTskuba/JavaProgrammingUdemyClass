package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasEqualSum(1,1,1));

    }

    public static boolean hasEqualSum(int param1, int param2, int param3) {

        return ((param1 + param2) == param3);
    }
}
