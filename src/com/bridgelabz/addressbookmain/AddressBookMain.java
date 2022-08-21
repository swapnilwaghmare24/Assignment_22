package com.bridgelabz.addressbookmain;

import com.bridgelabz.addressbook.AddressBook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to address book program");
        AddressBook addressBook=new AddressBook();
        addressBook.addContact();
        addressBook.addContact();
        addressBook.editContacts();
        addressBook.deleteContact();
    }
}
