package academy.learnprogramming;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine(){
        return "Starting engine.";
    }

    public String accelerate(){
        return  "Accelerating";
    }

    public String breaking(){
        return "Breaking";
    }
}

class Telsa extends Car {
    public Telsa(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public boolean isEngine() {
        return false;
    }

    @Override
    public String startEngine() {
        return "Starting Tesla";
    }

    @Override
    public String accelerate() {
        return "Accelerating Tesla";
    }

    @Override
    public String breaking() {
        return "Breaking Tesla";
    }
}

class Toyota extends Car {
    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public boolean isEngine() {
        return true;
    }

    @Override
    public String startEngine() {
        return "Starting Toyota";
    }

    @Override
    public String accelerate() {
        return "Accelerating Toyota";
    }

    @Override
    public String breaking() {
        return "Breaking Toyota";
    }
}

class Subaru extends Car {
    public Subaru(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public boolean isEngine() {
        return true;
    }

    @Override
    public String startEngine() {
        return "Starting Subaru";
    }

    @Override
    public String accelerate() {
        return "Accelerating Subaru";
    }

    @Override
    public String breaking() {
        return "Breaking Subaru";
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
