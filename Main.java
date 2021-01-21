package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int topScore = 80;
        int secondTopScore = 100;

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Greater or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("this is NOT an error, it was fixed, newValue was = 50, need to use = X2");
        }

        boolean isCar = false;
        if (isCar) // (isCar)
             {
            System.out.println("This is (-NOT-) supposed to happen");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("wasCar is true");

        }

        int ageOfClient = 20;
        // think of if this else that
        boolean isEighteenOrOver = ageOfClient == 20 ? true : false;
        System.out.println(isEighteenOrOver);


//        Integer i = new Integer(5);
      //  Integer j = new Integer(5);
       // System.out.println(i.equals(j));
        //System.out.println(j==i);
    }
}
