package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {
    // store, modify, remove and query contact names
    private Contacts contacts;

    public MobilePhone() {
    }

    public void store(ArrayList<Contacts> arrayList, Contacts contacts) {
        if (arrayList.indexOf(contacts.getName()) >= 0) {
            System.out.println("You already have a contact under that name");
        } else {
            arrayList.add(contacts);
        }
    }

    public void modify(ArrayList<Contacts> arrayList, String name, String name2) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getName().equalsIgnoreCase(name)) {
                arrayList.set(i, new Contacts(name2, arrayList.get(i).getNumber()));
            }
        }
    }

    public void remove(ArrayList<Contacts> arrayList, String contact) {
        int j = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getName().equalsIgnoreCase(contact)) {
                arrayList.remove(i);
                System.out.println(contact + " has been removed.");
                j++;

            }
        }
        if (j == 0) {
            System.out.println(contact + " does not exist");
        }
    }

    public void query(ArrayList<Contacts> arrayList, String contact) {
        if(arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).getName().equalsIgnoreCase(contact)) {
                    System.out.println("contact found");
                }
            }
        }
        else {
            System.out.println("contact not found");}
    }

}
