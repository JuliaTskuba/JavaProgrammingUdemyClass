package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 1;
        while (count!=6) {
            System.out.println("count is " + count);
            count++;
        }
        System.out.println(isEvenNumber(2));

        int number = 4;
        int counter = 0;
        int finishNumber = 20;
        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            {System.out.println(number + " is an even number.");
            counter++;
            if(counter == 5)  break;}
            ;
        }
    }

    public static boolean isEvenNumber(int number) {
        while (number % 2 == 0)
        {return true;}
        return false;
    }
}
