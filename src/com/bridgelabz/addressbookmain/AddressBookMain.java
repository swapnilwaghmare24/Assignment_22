package com.bridgelabz.addressbookmain;

import com.bridgelabz.addressbook.AddressBook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to address book program");
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook=new AddressBook();
        boolean again=true;
        while(again) {
            System.out.println("enter 1-add contact 2-edit contact 3-delete contact");
            char choice = sc.next().charAt(0);
            switch (choice) {
                case '1':
                    addressBook.addContact();
                    break;
                case '2':
                    addressBook.editContacts();
                    break;
                case '3':
                    addressBook.deleteContact();
                    break;
                default:
                    System.out.println("invalid choice");
            }
            System.out.println("do you wish to perform operations again then type y");
            char userChoice=sc.next().charAt(0);
            if(userChoice=='y'|| userChoice=='Y')
                again=true;
            else
                again=false;

        }
    }
}
