package academy.learnprogramming;

public class Meat {
    private double cost;
    private String name;

    public Meat(String name) {
        this.name = name;

        switch(name.toLowerCase()) {
            case "beef":
                cost = 4.00;
                break;
            case "veggie":
                cost = 2.00;
                break;
            case "buffalo":
                cost = 3.00;
                break;
            default:
                System.out.println("Not a valid meat entry");
                break;
        }

    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
