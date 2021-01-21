package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasTeen(13, 10, 9));
    }

    public static boolean hasTeen(int param1, int param2, int param3){
        return (param1<=19 && param1>=13  ||
                param2<=19 && param2>=13  ||
                param3<=19 && param3>=13);
    }
    public static boolean isTeen(int param1){
        return (param1<=19 && param1>=13);
    }
}
