package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int switchValue = 3;
        char var1 = 'A';

        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("value 3,4,5");
                break;
            default:
                System.out.println("wasn't one or two");
                break;
        }
                switch(var1) {
                    case 'A':
                        System.out.println("Value was A");
                        break;
                    case 'B':
                        System.out.println("Value was B");
                        break;
                    case 'C': case 'D': case 'E':
                        System.out.println("Value was C, D or E");
                        break;
                    default:
                        System.out.println("Wasn't a,b,c,d or e");
                }
                String ABC = "January";
        switch(ABC.toLowerCase()) {
            case "january":
                System.out.println("Value was A");
                break;
            case "B":
                System.out.println("Value was B");
                break;
            case "C":
                System.out.println("Value was C, D or E");
                break;
            default:
                System.out.println("Wasn't a,b,c,d or e");
        }
        printDayOfTheWeek(2);




        }

        public static void printDayOfTheWeek(int day) {
        switch(day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");


        }
        }

}
