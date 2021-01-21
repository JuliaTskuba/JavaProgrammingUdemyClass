package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        shouldWakeUp(true,1);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == true && ((hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay > 22 && hourOfDay <=23))) {
            return true;
        } else {
            return false;
        }
    }
}
