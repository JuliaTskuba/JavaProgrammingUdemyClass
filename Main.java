package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Contacts contacts = new Contacts("", "");
        MobilePhone mp = new MobilePhone();
        ArrayList<Contacts> AL = new ArrayList<>();

        // 0 Quit, 1 print list of contacts, 2 add new contact,
        // 3 update existing contact, 4 remove contact, and
        // 5 search/find contact
        boolean condition = true;
        while (condition) {
            System.out.println(
                    "Enter 0: quit\n" +
                            "Enter 1: print list of contacts\n" +
                            "Enter 2: add new contact\n" +
                            "Enter 3: update existing contact\n"+
                            "Enter 4: remove contact\n"+
                            "Enter 5: search/find contact"
            );
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            switch (answer) {
                case "0":
                    condition = false;
                    break;
                case "1":
                    System.out.println("List of contact names:");
                    for (int i = 0; i < AL.size(); i++) {
                        System.out.println(AL.get(i).getName());
                    }
                    break;
                case "2":
                    System.out.println("Please enter the name of the contact:");
                    String name = scanner.nextLine();
                    System.out.println("Please enter the number of the contact:");
                    String number = scanner.nextLine();

                    mp.store(AL, new Contacts(name, number));
                    break;
                case "3":
                    System.out.println("Please enter the name of the contact you would like to update:");
                    String name2 = scanner.nextLine();
                    System.out.println("Please enter the new name of the contact you would like to update:");
                    String name3 = scanner.nextLine();
                    mp.modify(AL, name2, name3);
                    break;
                case "4":
                    System.out.println("Which contact name would you like removed?: ");
                    String name4 = scanner.nextLine();
                    mp.remove(AL, name4);
                    break;
                case "5":
                    System.out.println("Which contact would you like to search for: ");
                    String name5 = scanner.nextLine();
                    mp.query(AL, name5);
                    break;

            }

        }
    }
}
