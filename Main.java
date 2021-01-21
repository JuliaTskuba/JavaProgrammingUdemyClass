package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] array = {5, 4, 3, 2, 1};
        // printArray(array);
        reverse(array);
        printArray(array);

    }

    private static void reverse(int[] array) {
        int[] array2 = new int[array.length];
        // array2 = array;
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[((array.length) - i) - 1] = array2[i];
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
