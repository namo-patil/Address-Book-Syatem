package com.bridgelabz.addressbook;

import static com.bridgelabz.addressbook.AddressBookImpl.scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.optionCheck();
    }

    public void optionCheck() {
        AddressBookImpl addressBook = new AddressBookImpl();

        System.out.println("-------------------Choose Option---------------------- ");
        System.out.println("1. Enter to Add contact.");
        System.out.println("2. Enter to Edit Existing Details.");
        System.out.println("3. Enter to Delete Details.");
        System.out.println("4. Enter to Display Contact.");
        System.out.println("5. Enter to Exit from Address Book Program.");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                addressBook.addPerson();
                System.out.println();
                optionCheck();
                break;
            case 2:
                addressBook.editContact();
                System.out.println();
                optionCheck();
                break;
            case 3:
                addressBook.deleteContact();
                System.out.println();
                optionCheck();
                break;
            case 4:
                addressBook.displayList();
                System.out.println();
                optionCheck();
                break;
            case 5:
                System.out.println("You are exit from Address Book Program!!!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Input");
                optionCheck();
                break;
        }
    }
}




