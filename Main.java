package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National USA Bank");
        bank.addBranch("Jerome");
        bank.addCustomer("Jerome", "Julia", 100.00);
        bank.addCustomer("Jerome", "Yury", 200.00);
        bank.addCustomer("Jerome", "Becky", 300.00);

        bank.addBranch("Lafayette");
        bank.addCustomer("Lafayette", "Susan", 500.000);
        bank.addCustomer("Lafayette", "Michelle", 600.000);
        bank.addCustomer("Lafayette", "Tom", 700.000);

        bank.addCustomerTransaction("Jerome", "Julia", 10.25);
        bank.addCustomerTransaction("Jerome", "Julia", 100.25);
        bank.addCustomerTransaction("Jerome", "Julia", 1000.25);

        bank.exposeBranch("Lafayette", false);
    }
}
