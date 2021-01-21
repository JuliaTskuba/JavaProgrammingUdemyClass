package academy.learnprogramming;

public class Bread {
    private double cost;
    private String name;

    public Bread(String name, boolean isHealthyBurger) {
        this.name = name;

        if(isHealthyBurger) {
            System.out.println("You have selected Healthy Burger. That means you will get Rye Bread");
            cost = 3.00;
        }
        else {
            switch (name.toLowerCase()) {
                case "wheat":
                    cost = 1.00;
                    break;
                case "rye":
                case "lettuce wrap":
                    cost = 3.00;
                    break;
                default:
                    System.out.println("Not a valid bread entry");
                    break;
            }
        }

    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
