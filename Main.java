package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getCreditLimit());

        VipCustomer customer2 = new VipCustomer("string", 10.0);
        System.out.println(customer2.getCreditLimit());

        VipCustomer customer3 = new VipCustomer("string", 100.0, "juliagoll");
        System.out.println(customer3.getCreditLimit());
    }
}
