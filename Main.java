package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(canPack(1, 0, 4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {return false;}
        for (int i = bigCount; i >= 0; i--){
            for (int j = smallCount; j >= 0; j--) {
                if(i*5 + j == goal) return true;
                else continue;
            }

        }
        return false;

    }
}
