package com.bridgelabz;

import java.util.Scanner;

public class AddressBookSystem {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("***********************************************************");
        System.out.println("Welcome to Address Book System ");
        addContactDetails();
    }

    public static void addContactDetails() {
        Contact contact = new Contact();
        System.out.println("Enter First name");
        String firstName = scanner.next();
        contact.setFirstName(firstName);

        System.out.println("Enter Last name");
        String lastName = scanner.next();
        contact.setLastName(lastName);

        System.out.println("Enter Address");
        String address = scanner.next();
        contact.setAddress(address);

        System.out.println("Enter City name");
        String city = scanner.next();
        contact.setCity(city);

        System.out.println("Enter State name");
        String state = scanner.next();
        contact.setState(state);

        System.out.println("Enter Zip code");
        String zip = scanner.next();
        contact.setZip(zip);

        System.out.println("Enter Phone number");
        String phoneNumber = scanner.next();
        contact.setPhoneNumber(phoneNumber);

        System.out.println("Enter Email");
        String email = scanner.next();
        contact.setEmail(email);

        System.out.println(contact);

    }
}
