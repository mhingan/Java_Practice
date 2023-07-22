package org.example.ContactsApp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContactHandler {
    private List<Contact> contacts = new ArrayList<>();
        public Contact createContact(String name, String phoneNumber, String email, String additionalInfo){
            Contact contact = new Contact(name, phoneNumber, email, additionalInfo);
            validateContact(contact);
            contacts.add(contact);
            System.out.println(contact);
            return contact;
        }

        public void validateContact(Contact contact){
            if(contact.getName().isEmpty() || contact.getName() == null){
                throw new NullPointerException("Name is empty/null.");
            }
            if (contact.getPhoneNumber().isEmpty() || contact.getPhoneNumber() == null){
                throw new NullPointerException("Phone number is empty.");
            }
            if (contact.getPhoneNumber().matches("[a-z]+$")){
                throw new NumberFormatException("Phone number is not a number." + contact.getPhoneNumber());
            }
            if(contact.getEmail().isEmpty()){
                contact.setEmail("No email added.");
            }
            if(contact.getAdditionalInfo().isEmpty() || contact.getAdditionalInfo() == null){
                contact.setAdditionalInfo("No additional info added.");
            }
            System.out.println("Contact validate: SUCCESS.");

        }

}
