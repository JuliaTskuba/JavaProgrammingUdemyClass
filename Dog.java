package academy.learnprogramming;

import org.w3c.dom.ls.LSOutput;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog is chewing");
    }

    @Override
    public void eat() {
        //super.eat();
        System.out.println("override");
        chew();
    }

    public void walk() {
        System.out.println("animal walking ");
        move(5);
    }
    public void run() {
        System.out.println("animal walking ");
        super.move(10);
    }
}
