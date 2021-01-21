package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printYearsAndDays(1051200);
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes <0 ) {
            System.out.println("Invalid Value");
        } else {
            //  day = minutes * ( 1/60) * (1/24)
            // year = minutes * (1/60) * (1/24) * (1/365)
            System.out.println(minutes + " min = " + (int) (minutes * (1.0 / (60.0 * 24.0 * 365.0))) + " y and " + (int) ((minutes / ((60.0 * 24.0))) - ((int) (minutes * (1.0 / (60.0 * 24.0 * 365.0)))) * 365) + " d");
        } }
}
