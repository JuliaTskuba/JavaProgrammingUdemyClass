package academy.learnprogramming;

import java.util.Scanner;

public class BaseBurger {
    private String name;
    private Bread bread;
    private Meat meat;

    private double priceNonAdditionalItems;
    private double priceAdditionalItems;
    private double totalCost;

    private String additionalItems1;
    private String additionalItems2;
    private String additionalItems3;
    private String additionalItems4;
    private double additionalCost1;
    private double additionalCost2;
    private double additionalCost3;
    private double additionalCost4;


    public BaseBurger(Bread bread, Meat meat) {
        this.bread = bread;
        this.meat = meat;
    }


    public void additionalItems() {
        int i = 1;
        while (i < 5) {
            if (i == 1) {
                System.out.println(
                        "Would you like additional items? These will come at an additional cost. If yes please enter"
                                + " those items below, if no, state no"
                );
            }
            if (i > 1) {
                System.out.println("Would you like any additional items? State them here, if not say no");
            }
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("no"))
                break;
            switch (answer.toLowerCase()) {
                case "lettuce":
                    this.priceAdditionalItems += 1.00;
                    if (i == 1) {
                        additionalCost1 = 1.00;
                        additionalItems1 = "lettuce";
                    } else if (i == 2) {
                        additionalCost2 = 1.00;
                        additionalItems2 = "lettuce";
                    } else if (i == 3) {
                        additionalCost3 = 1.00;
                        additionalItems3 = "lettuce";
                    } else if (i == 4) {
                        additionalCost4 = 1.00;
                        additionalItems4 = "lettuce";
                    }
                    i++;
                    break;
                case "pickles":
                    this.priceAdditionalItems += 1.00;
                    if (i == 1) {
                        additionalCost1 = 1.00;
                        additionalItems1 = "pickles";
                    } else if (i == 2) {
                        additionalCost2 = 1.00;
                        additionalItems2 = "pickles";
                    } else if (i == 3) {
                        additionalCost3 = 1.00;
                        additionalItems3 = "pickles";
                    } else if (i == 4) {
                        additionalCost4 = 1.00;
                        additionalItems4 = "pickles";
                    }
                    i++;
                    break;
                case "avocado":
                    this.priceAdditionalItems += 3.00;
                    if (i == 1) {
                        additionalCost1 = 3.00;
                        additionalItems1 = "avocado";
                    } else if (i == 2) {
                        additionalCost2 = 3.00;
                        additionalItems2 = "avocado";
                    } else if (i == 3) {
                        additionalCost3 = 3.00;
                        additionalItems3 = "avocado";
                    } else if (i == 4) {
                        additionalCost4 = 3.00;
                        additionalItems4 = "avocado";
                    }
                    i++;
                    break;
                case "tomato":
                    this.priceAdditionalItems += 2.00;
                    if (i == 1) {
                        additionalCost1 = 2.00;
                        additionalItems1 = "tomato";
                    } else if (i == 2) {
                        additionalCost2 = 2.00;
                        additionalItems2 = "tomato";
                    } else if (i == 3) {
                        additionalCost3 = 2.00;
                        additionalItems3 = "tomato";
                    } else if (i == 4) {
                        additionalCost4 = 2.00;
                        additionalItems4 = "tomato";
                    }
                    i++;
                    break;
                default:
                    this.priceAdditionalItems += 0.50;
                    if (i == 1) {
                        additionalCost1 = 0.50;
                        additionalItems1 = answer;
                    } else if (i == 2) {
                        additionalCost2 = 0.50;
                        additionalItems2 = answer;
                    } else if (i == 3) {
                        additionalCost3 = 0.50;
                        additionalItems3 = answer;
                    } else if (i == 4) {
                        additionalCost4 = 0.50;
                        additionalItems4 = answer;
                    }
                    i++;
                    break;
            }
        }

    }

    public double getPriceNonAdditionalItems() {
        return (meat.getCost() + bread.getCost());
    }

    public double getPriceAdditionalItems() {
        return (priceAdditionalItems);
    }

    public double getTotalCost() {
        return getPriceNonAdditionalItems() + getPriceAdditionalItems();
    }


    public String getName() {
        return name;
    }

    public void setName() {
        name = "Base Burger";
    }

    public String getAdditionalItems1() {
        return additionalItems1;
    }

    public String getAdditionalItems2() {
        return additionalItems2;
    }

    public String getAdditionalItems3() {
        return additionalItems3;
    }

    public String getAdditionalItems4() {
        return additionalItems4;
    }

    public double getAdditionalCost1() {
        return additionalCost1;
    }

    public double getAdditionalCost2() {
        return additionalCost2;
    }

    public double getAdditionalCost3() {
        return additionalCost3;
    }

    public double getAdditionalCost4() {
        return additionalCost4;
    }
}
