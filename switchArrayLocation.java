package academy.learnprogramming;

public class switchArrayLocation {
    public void switchArrayLocation(int[] array, int i, int ii) {
        int first = array[i];
        int second = array[ii];
        array[i] = second;
        array[ii] = first;
    }

}
