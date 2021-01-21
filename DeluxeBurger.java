package academy.learnprogramming;

public class DeluxeBurger extends BaseBurger {

    private String freeAdditions1;
    private String freeAdditions2;
    private double freeAdditionsCost1;
    private double freeAdditionsCost2;

    public DeluxeBurger(Bread bread, Meat meat) {
        super(bread, meat);
        this.freeAdditions1 = "Drink";
        this.freeAdditions2 = "Chips";
        this.freeAdditionsCost1 = 0.00;
        this.freeAdditionsCost2 = 0.00;
    }

    public String getFreeAdditions1() {
        return freeAdditions1;
    }

    public String getFreeAdditions2() {
        return freeAdditions2;
    }

    public double getFreeAdditionsCost1() {
        return freeAdditionsCost1;
    }

    public double getFreeAdditionsCost2() {
        return freeAdditionsCost2;
    }

    @Override
    public void additionalItems() {
    }
}
