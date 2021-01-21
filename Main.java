package academy.learnprogramming;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printArray(sortInt(getInt()));

    }

    public static int[] getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = scanner.nextInt();
        int array[] = new int[length];
        System.out.println("Enter the elements of the array of length " + length + ":");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }
    }

    public static int[] sortInt(int[] array) {
        splitArray splitArray = new splitArray();
        int array1[] = splitArray.splitArray(array);
        int arrayInitial[] = new int[array1[0]];
        int arraySecond[] = new int[array1[1]];
        compareArrayElements cAE = new compareArrayElements();

        // initial values
        Initialization initialization = new Initialization();
        initialization.InitializationFirst(arrayInitial, array, cAE);
        initialization.InitializationSecond(arraySecond, arrayInitial, array, cAE);

        switchArrayLocation sAL = new switchArrayLocation();
        // resorting of second arrays begins
        // first array

        cAE.CompareIteration(arrayInitial, cAE, sAL);
        cAE.CompareIteration(arraySecond, cAE, sAL);
//        if (cAE.compareValue(arrayInitial[2], arrayInitial[0])) {
//            sAL.switchArrayLocation(arrayInitial, 2, 0);
//        } else ;
//
//        if (cAE.compareValue(arrayInitial[2], arrayInitial[1])) {
//            sAL.switchArrayLocation(arrayInitial, 2, 1);
//        } else ;
//
//        // second array
//        if (cAE.compareValue(arraySecond[2], arraySecond[0])) {
//            sAL.switchArrayLocation(arraySecond, 2, 0);
//        } else ;
//
//        if (cAE.compareValue(arraySecond[3], arraySecond[2])) {
//            sAL.switchArrayLocation(arraySecond, 3, 2);
//        } else ;
//
//        if (cAE.compareValue(arraySecond[2], arraySecond[1])) {
//            sAL.switchArrayLocation(arraySecond, 2, 1);
//        } else ;
//
//        if (cAE.compareValue(arraySecond[3], arraySecond[2])) {
//            sAL.switchArrayLocation(arraySecond, 3, 2);
//        } else ;

        int j = 0;
        int k = 0;
        int p = 0;

        while (true) {
            if (p >= array.length) {
                break;
            } else if (j >= arraySecond.length) {
                array[p] = arrayInitial[k];
                p++;
                k++;
            } else if (k >= arrayInitial.length) {
                array[p] = arraySecond[j];
                p++;
                j++;
            } else if (arrayInitial[k] >= arraySecond[j]) {
                array[p] = arrayInitial[k];
                p++;
                k++;
            } else {
                array[p] = arraySecond[j];
                p++;
                j++;
            }
        }

        return array;
    }
}
