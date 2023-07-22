package org.example.ContactsApp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Contact> contacts = new ArrayList<>();

        ContactHandler contactHandler = new ContactHandler();
        Contact cont1 = contactHandler.createContact("mihai", "0754989070", "", "");
        Contact cont2 = contactHandler.createContact("John", "0754989070", "john.smith@example.com", "Software Engineer");
        Contact cont3 = contactHandler.createContact("Emma", "0754123670", "emma.johnson@example.com", "Marketing Specialist");
        Contact cont4 = contactHandler.createContact("Daniel", "0754998650", "daniel.williams@example.com", "Accountant");
        Contact cont5 = contactHandler.createContact("Olivia", "0754112270", "olivia.brown@example.com", "Graphic Designer");
        Contact cont6 = contactHandler.createContact("James", "0754980030", "james.miller@example.com", "Sales Manager");


        contacts.add(cont1);
        contacts.add(cont2);
        contacts.add(cont3);
        contacts.add(cont4);
        contacts.add(cont5);
        contacts.add(cont6);


        System.out.println("------------------------------------");
        contacts.sort((a, b) -> b.getName().compareTo(a.getName()));
        System.out.println(contacts);


    }
}
