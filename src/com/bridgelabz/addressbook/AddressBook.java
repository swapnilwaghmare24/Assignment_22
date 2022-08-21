package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    public void addContact() {
        Contact contact=new Contact();
        System.out.println("Enter first name");
        String firstName=sc.next();
        contact.setFirstName(firstName);
        System.out.println("Enter last name");
        String lastName=sc.next();
        contact.setLastName(lastName);
        System.out.println("Enter address");
        String address=sc.next();
        contact.setAddress(address);
        System.out.println("Enter your city");
        String city=sc.next();
        contact.setCity(city);
        System.out.println("Enter your state");
        String state=sc.next();
        contact.setState(state);
        System.out.println("Enter zip");
        String zip=sc.next();
        contact.setZip(zip);
        System.out.println("Enter phone number");
        String phone=sc.next();
        contact.setPhone(phone);
        System.out.println("Enter email");
        String email=sc.next();
        contact.setEmail(email);
        System.out.println(contact);
    }
}
