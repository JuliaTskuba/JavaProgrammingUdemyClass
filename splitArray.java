package academy.learnprogramming;

public class splitArray {
    public int[] splitArray(int[] array) {
        int array2[] = {(int) array.length / 2, (array.length - ((int) array.length / 2))};
        return array2;
    }
}
