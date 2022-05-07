package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookImpl implements AddressBook {
    Contact contact = new Contact();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addContact() {
        System.out.println("Enter first name :");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name :");
        String lastName = scanner.nextLine();
        System.out.println("Enter address :");
        String address = scanner.nextLine();
        System.out.println("Enter city :");
        String city = scanner.nextLine();
        System.out.println("Enter state :");
        String state = scanner.nextLine();
        System.out.println("Enter email :");
        String email = scanner.nextLine();
        System.out.println("Enter zip code :");
        int zipCode = scanner.nextInt();
        System.out.println("Enter phone number :");
        long phoneNumber = scanner.nextLong();

        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setEmail(email);
        contact.setZipCode(zipCode);
        contact.setPhoneNumber(phoneNumber);

        System.out.println("-----------PERSON DETAILS------------");
        System.out.println("First Name : " + contact.getFirstName());
        System.out.println("Last Name : " + contact.getLastName());
        System.out.println("Address : " + contact.getAddress());
        System.out.println("City : " + contact.getCity());
        System.out.println("State : " + contact.getState());
        System.out.println("e-mail : " + contact.getEmail());
        System.out.println("Zip Code : " + contact.getZipCode());
        System.out.println("Phone number : " + contact.getPhoneNumber());
        System.out.println();
    }

    @Override
    public void editContact() {
        System.out.println("-----------UPDATING PERSON DETAILS------------");
        System.out.println("Enter first name :");
        String editName = scanner.nextLine();
        if (editName.equalsIgnoreCase(contact.getFirstName())) {
            addContact();
        } else {
            System.out.println("Please Enter Valid First Name of a Person,");
            editContact();
        }
    }
}
