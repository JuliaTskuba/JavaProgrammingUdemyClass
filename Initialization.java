package academy.learnprogramming;

public class Initialization {
    public void InitializationFirst(int[] arrayInitial, int[] array, compareArrayElements cAE) {

        if((arrayInitial.length % 2 != 0)) {
            for (int i = 0; i <= (int) arrayInitial.length / 2; i++) {
                if (i == (int) arrayInitial.length / 2) {
                    arrayInitial[i * 2] = array[i * 2];
                } else {
                    arrayInitial[i * 2] = cAE.compareArrayElementsMax(array[i * 2], array[i * 2 + 1]);
                    arrayInitial[i * 2 + 1] = cAE.compareArrayElementsMin(array[i * 2], array[i * 2 + 1]);
                }
            }
        } else {
            for (int i = 0; i <= ((int) arrayInitial.length / 2) - 1; i++) {
                arrayInitial[i * 2] = cAE.compareArrayElementsMax(array[i * 2], array[i * 2 + 1]);
                arrayInitial[i * 2 + 1] = cAE.compareArrayElementsMin(array[i * 2], array[i * 2 + 1]);
            }
        }
    }

    public void InitializationSecond(int[] arraySecond, int[] arrayInitial, int[] array, compareArrayElements cAE) {

        if((arraySecond.length % 2 != 0)) {
            for (int i = 0; i <= (int) (arraySecond.length / 2); i++) {
                if (i == (int) arraySecond.length / 2) {
                    arrayInitial[i * 2] = array[i * 2];
                } else {
                    arraySecond[i * 2] = cAE.compareArrayElementsMax(array[i * 2 + arrayInitial.length], array[(i * 2 + arrayInitial.length) + 1]);
                    arraySecond[i * 2 + 1] = cAE.compareArrayElementsMin(array[i * 2 + arrayInitial.length], array[(i * 2 + arrayInitial.length) + 1]);
                }
            }
        } else {
            for (int i = 0; i <= (int)(arraySecond.length / 2) - 1; i++) {
                arraySecond[i * 2] = cAE.compareArrayElementsMax(array[i * 2 + arrayInitial.length], array[(i * 2 + arrayInitial.length) + 1]);
                arraySecond[i * 2 + 1] = cAE.compareArrayElementsMin(array[i * 2 + arrayInitial.length], array[(i * 2 + arrayInitial.length) + 1]);
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }
    }
}
