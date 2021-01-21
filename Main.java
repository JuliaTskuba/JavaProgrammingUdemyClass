package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String abc = getDurationString(65, 45);
        System.out.println(abc);
        String def = getDurationString(3945);
        System.out.println(def);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        return (minutes / 60 < 10 ? "0" + minutes / 60 : minutes / 60) + "h "
                + (minutes % 60 < 10 ? "0" + minutes % 60 : minutes % 60)
                + "m " + (seconds < 10 ? "0" + seconds : seconds) + "s";


    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        } else return getDurationString(seconds / 60, seconds % 60);
    }
}

