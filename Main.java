package academy.learnprogramming;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Welcome to Bill's Burgers!");
        System.out.println("At Bill's burgers, we have three types of burgers: Classic, Healthy and Deluxe, of these" +
                " three, which one would you prefer?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Classic")) {
            System.out.println("I see you selected Classic. Now I will ask you what kind of meat would you prefer?"
                    + " Your options are: Beef, Buffalo, or Veggie");
            Scanner scanner2 = new Scanner(System.in);
            String answer2 = scanner2.nextLine();
            Meat meat = new Meat(answer2);
            System.out.println("I see you selected: " + answer2 + " as your meat. Now I will ask you what kind of bread would you prefer?"
                    + " Your options are: Rye, Wheat, or Lettuce Wrap");
            Scanner scanner3 = new Scanner(System.in);
            String answer3 = scanner3.nextLine();
            Bread bread = new Bread(answer3, false);
            BaseBurger baseBurger = new BaseBurger(bread, meat);
            baseBurger.additionalItems();
            System.out.println("That brings the total cost to be: $" + baseBurger.getTotalCost() + "\n"
                    + "The base price of burger is: $" + baseBurger.getPriceNonAdditionalItems() + "\n"
                    + "Here is the breakdown of costs for each burger item: \n"
                    + "Bread- " + bread.getName() + ": $" + bread.getCost() + "\n"
                    + "Meat- " + meat.getName() + ": $" + meat.getCost() + "\n"
                    + "The base price of burger's additional item(s) is(are): $" + baseBurger.getPriceAdditionalItems() + "\n"
                    + "Here is the breakdown of costs for each additional item\n"
                    + "item 1- " + baseBurger.getAdditionalItems1() + ": $" + baseBurger.getAdditionalCost1() + "\n"
                    + "item 2- " + baseBurger.getAdditionalItems2() + ": $" + baseBurger.getAdditionalCost2() + "\n"
                    + "item 3- " + baseBurger.getAdditionalItems3() + ": $" + baseBurger.getAdditionalCost3() + "\n"
                    + "item 4- " + baseBurger.getAdditionalItems4() + ": $" + baseBurger.getAdditionalCost4() + "\n"
                    + "\n"
                    + "Thank you for shopping at Bill's Burgers, and we hope to see you again soon! :)");

        } else if (answer.equalsIgnoreCase("Healthy")) {
            System.out.println("I see you selected Healthy. Now I will ask you what kind of meat would you prefer?"
                    + " Your options are: Beef, Buffalo, or Veggie");
            Scanner scanner2 = new Scanner(System.in);
            String answer2 = scanner2.nextLine();
            Meat meat = new Meat(answer2);
            System.out.println("I see you selected: " + answer2);

            Bread bread = new Bread("rye", true);
            HealthyBurger healthyBurger = new HealthyBurger(bread, meat);
            healthyBurger.additionalItems2();
            healthyBurger.additionalItems();
            System.out.println("That brings the total cost to be: $" + healthyBurger.getTotalCost() + "\n"
                    + "The base price of burger is: $" + healthyBurger.getPriceNonAdditionalItems() + "\n"
                    + "Here is the breakdown of costs for each burger item: \n"
                    + "Bread- " + bread.getName() + ": $" + bread.getCost() + "\n"
                    + "Meat- " + meat.getName() + ": $" + meat.getCost() + "\n"
                    + "Additional items (free ad-ons)\n"
                    + healthyBurger.getAdditionalItem1() + "\n"
                    + healthyBurger.getAdditionalItem2() + "\n"
                    + "The base price of burger's additional item(s) is(are): $" + healthyBurger.getPriceAdditionalItems() + "\n"
                    + "Here is the breakdown of costs for each additional item\n"
                    + "item 1- " + healthyBurger.getAdditionalItems1() + ": $" + healthyBurger.getAdditionalCost1() + "\n"
                    + "item 2- " + healthyBurger.getAdditionalItems2() + ": $" + healthyBurger.getAdditionalCost2() + "\n"
                    + "item 3- " + healthyBurger.getAdditionalItems3() + ": $" + healthyBurger.getAdditionalCost3() + "\n"
                    + "item 4- " + healthyBurger.getAdditionalItems4() + ": $" + healthyBurger.getAdditionalCost4() + "\n"
                    + "\n"
                    + "Thank you for shopping at Bill's Burgers, and we hope to see you again soon! :)");
        } else if (answer.equalsIgnoreCase("Deluxe")) {
            System.out.println("I see you selected Deluxe. Now I will ask you what kind of meat would you prefer?"
                    + " Your options are: Beef, Buffalo, or Veggie");
            Scanner scanner2 = new Scanner(System.in);
            String answer2 = scanner2.nextLine();
            Meat meat = new Meat(answer2);
            System.out.println("I see you selected: " + answer2 + " as your meat. Now I will ask you what kind of bread would you prefer?"
                    + " Your options are: Rye, Wheat, or Lettuce Wrap");
            Scanner scanner3 = new Scanner(System.in);
            String answer3 = scanner3.nextLine();
            Bread bread = new Bread(answer3, false);
            DeluxeBurger deluxeBurger = new DeluxeBurger(bread, meat);
            System.out.println("Deluxe burger comes with a drink and chips free of charge. Yay!\n");
            deluxeBurger.additionalItems();
            System.out.println("That brings the total cost to be: $" + deluxeBurger.getTotalCost() + "\n"
                    + "The base price of burger is: $" + deluxeBurger.getPriceNonAdditionalItems() + "\n"
                    + "Here is the breakdown of costs for each burger item: \n"
                    + "Bread- " + bread.getName() + ": $" + bread.getCost() + "\n"
                    + "Meat- " + meat.getName() + ": $" + meat.getCost() + "\n"
                    + "Free additional items- " + deluxeBurger.getFreeAdditions1() + ": $" + deluxeBurger.getFreeAdditionsCost1()
                    + "\n" + deluxeBurger.getFreeAdditions2() + ": $" + deluxeBurger.getFreeAdditionsCost2() + "\n"

                    + "\n"
                    + "Thank you for shopping at Bill's Burgers, and we hope to see you again soon! :)");
        } else {
            System.out.println("that is not a valid answer.");
        }

    }
}
