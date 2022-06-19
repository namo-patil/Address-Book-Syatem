package com.bridgelabz.addressbook;

import java.util.List;

public interface AddressBook {

    public Contact addPerson();
    public List<Contact> editContact();
    public List<Contact> deleteContact();
    void displayList();

}
