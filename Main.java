package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        // 1 MB = 1024 KB
        // int MB = kiloBytes*(1/1024));
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB " + "= " + (int) (kiloBytes / 1024) + " MB and " + (kiloBytes % 1024)
                    + " KB");
        }

    }
}
