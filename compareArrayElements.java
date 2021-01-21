package academy.learnprogramming;

public class compareArrayElements {
    public int compareArrayElementsMax(int element1, int element2) {
        if (element1 >= element2) {
            return element1;
        } else return element2;
    }

    public int compareArrayElementsMin(int element1, int element2) {
        if (element1 >= element2) {
            return element2;
        } else return element1;
    }

    public boolean compareValue(int element1, int element2) {
        if (element1 >= element2) {
            return true;
        } else return false;
    }

    public void CompareIteration(int[] array, compareArrayElements cAE, switchArrayLocation sAL) {
        if (array.length % 2 == 0) {
            for (int i = 2; i <= (int) array.length - 2; i *= 2) {
                for (int p = 1; p <= i / 2; p++) {
                    int j = 0;
                    int k = 1;
                    if (cAE.compareValue(array[i], array[j])) {
                        sAL.switchArrayLocation(array, i, j);
                    }
                    if (cAE.compareValue(array[i + 1], array[i])) {
                        sAL.switchArrayLocation(array, i + 1, i);
                    }
                    if (cAE.compareValue(array[i], array[k])) {
                        sAL.switchArrayLocation(array, i, k);
                    }
                    if (cAE.compareValue(array[i + 1], array[i])) {
                        sAL.switchArrayLocation(array, i + 1, i);
                    }
                    j = +2;
                    k = +2;
                }
            }
        }
    }

}
