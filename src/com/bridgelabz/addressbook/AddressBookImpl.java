package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookImpl implements AddressBook {
    @Override
    public void addContact() {
        Contact contact = new Contact();
        Scanner scanner = new Scanner(System.in);

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
        System.out.println("Enter zip code :");
        int zipCode = scanner.nextInt();
        System.out.println("Enter phone number :");
        long phoneNumber = scanner.nextLong();
        System.out.println("Enter email :");
        String email = scanner.nextLine();

        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZipCode(zipCode);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);

        System.out.println("-----------PERSON DETAILS------------");
        System.out.println("First Name : " + contact.getFirstName());
        System.out.println("First Name : " + contact.getLastName());
        System.out.println("First Name : " + contact.getAddress());
        System.out.println("First Name : " + contact.getCity());
        System.out.println("First Name : " + contact.getState());
        System.out.println("First Name : " + contact.getZipCode());
        System.out.println("First Name : " + contact.getPhoneNumber());
        System.out.println("First Name : " + contact.getEmail());
    }
}
