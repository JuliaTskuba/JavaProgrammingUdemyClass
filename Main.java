package academy.learnprogramming;

import java.lang.Math;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(areEqualByThreeDecimalPlaces(0.1113, 0.111));

    }

    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {
        return ((int)(param1*1000) - (int)(param2*1000)) == 0;
    }
}
