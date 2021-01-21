package academy.learnprogramming;
import java.util.Scanner;

public class Main {



                   /*DECLARING SCANNER OBJECT OUTSIDE MAIN METHOD i.e Static method */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	// write your code here
        System.out.println("Enter a number");
        int n = input.nextInt();
        System.out.println(n);
        int m = input.nextInt();
        System.out.println(n + " " + m);
    }
}
