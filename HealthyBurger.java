package academy.learnprogramming;

import java.util.Scanner;

public class HealthyBurger extends BaseBurger {

    private String additionalItem1;
    private String additionalItem2;

    public HealthyBurger(Bread bread, Meat meat) {
        super(bread, meat);
    }

    public String getAdditionalItem1() {
        return additionalItem1;
    }

    public String getAdditionalItem2() {
        return additionalItem2;
    }

    public void additionalItems2() {
        int count = 1;
        while (count < 3) {
            Scanner scanner = new Scanner(System.in);
            if(count == 1) {
            System.out.println("In addition, that means you get two additional items" +
                    " at no cost to you! Please enter those items here: ");}
            else if(count ==2 ) {
                System.out.println("Please enter one more additional item");
            }
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("no")){
                break;
            }
            if(count == 1) {
                additionalItem1 = answer;
            }
            if(count == 2) {
                additionalItem2 = answer;
            }
            count++;
        }
    }

    @Override
    public String getName() {
        return "Healthy Burger";
    }
}
