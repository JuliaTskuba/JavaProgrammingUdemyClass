package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of array");
        int answer = scanner.nextInt();
        System.out.println("Please enter the values of array");
        int[] array = readIntegers(answer);
        System.out.println(findMin(array));
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
