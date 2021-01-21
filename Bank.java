package academy.learnprogramming;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initial) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.newCustomer(customerName, initial);
        }
        return false;
    }

    // add a transaction for an existing customer for that branch
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if(branch != null ) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for(int i = 0; i<branches.size();i++) {
            Branch branches = this.branches.get(i);
            if(branches.getName().equalsIgnoreCase(branchName)){
                return branches;
            }
        }
        return null;
    }

    public boolean exposeBranch(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch == null){
            return false;
        }
        System.out.println("Customers details for branch "+ branch.getName());
        for(int i = 0; i < branch.getCustomers().size(); i++) {
            System.out.println("Customer " + (i+1) + "--> " + branch.getCustomers().get(i).getName());
            if(showTransactions) {
                for(int j = 0; j <branch.getCustomers().get(i).getTransactions().size(); j++) {
                    System.out.println("Transaction " + (j+1) + "--> " + branch.getCustomers().get(i).getTransactions().get(j));
                }
            }
        }
        return true;

    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
}
