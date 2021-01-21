package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Contacts> contacts = new ArrayList<>();
        Contacts abc = new Contacts("j","1");
        contacts.add(abc);
        System.out.println(contacts.get(0).getName());
        System.out.println(contacts.indexOf(abc));

    }
}
