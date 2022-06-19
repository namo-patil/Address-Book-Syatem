package com.bridgelabz.addressbook;

import java.util.*;

public class AddressBookImpl implements AddressBook {
    static Scanner scanner = new Scanner(System.in);
    static List<Contact> contactList = new ArrayList<>();


    @Override
    public Contact addPerson() {

        System.out.println("Enter first name :");
        String firstName = scanner.next();
        System.out.println("Enter last name :");
        String lastName = scanner.next();
        System.out.println("Enter address :");
        String address = scanner.next();
        System.out.println("Enter city :");
        String city = scanner.next();
        System.out.println("Enter state :");
        String state = scanner.next();
        System.out.println("Enter zip code :");
        int zipCode = scanner.nextInt();
        System.out.println("Enter phone number :");
        long phoneNumber = scanner.nextLong();
        System.out.println("Enter email :");
        String email = scanner.next();

        Contact contact = new Contact(firstName, lastName, address, city, state, zipCode, phoneNumber, email);
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZipCode(zipCode);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);

        contactList.add(contact);

        return contact;
    }

    @Override
    public List<Contact> editContact() {
        System.out.println("-----------EDIT PERSON DETAILS------------");
        System.out.println("Enter First Name Of Person : ");
        Scanner scanner = new Scanner(System.in);
        String editName = scanner.next();

        for (int i = 0; i < contactList.size(); i++) {
            Contact contact = contactList.get(i);
            if (editName.equals(contact.getFirstName())) {
                System.out.println("Enter First Name : ");
                String firstName = scanner.next();
                System.out.println("Enter Last Name : ");
                String lastName = scanner.next();
                System.out.println("Enter your Address : ");
                String address = scanner.next();
                System.out.println("Enter your City : ");
                String city = scanner.next();
                System.out.println("Enter your State : ");
                String state = scanner.next();
                System.out.println("Enter Zip Code Of your Area : ");
                int zipCode = scanner.nextInt();
                System.out.println("Enter Phone Number : ");
                long phoneNumber = scanner.nextLong();
                System.out.println("Enter your Email : ");
                String email = scanner.next();

                contact.setFirstName(firstName);
                contact.setLastName(lastName);
                contact.setAddress(address);
                contact.setCity(city);
                contact.setState(state);
                contact.setZipCode(zipCode);
                contact.setPhoneNumber(phoneNumber);
                contact.setEmail(email);

                contactList.set(i, contact);

            } else {
                System.out.println("Enter Valid First Name: ");
            }
        }
        return contactList;
    }

    @Override
    public List<Contact> deleteContact() {
        System.out.println("============= Deleting Details ================");
        System.out.println("Enter First Name Of Person : ");
        String deleteName = scanner.next();
        try {
            for (Contact contact : contactList) {
                if (deleteName.equals(contact.getFirstName())) {
                    contactList.remove(contact);
                } else {
                    System.out.println("Enter Valid First Name: ");
                    deleteContact();
                }
            }
        } catch (ConcurrentModificationException e) {
            return contactList;
        }
        return contactList;
    }

    @Override
    public void displayList() {
        System.out.println("--------------------------------- Contact List -----------------------------------");
        if (contactList != null) {
            System.out.println(contactList);
        } else {
            System.out.println("List is Empty");
        }
    }
}
