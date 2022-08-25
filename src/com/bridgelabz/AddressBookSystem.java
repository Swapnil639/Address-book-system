package com.bridgelabz;

import java.util.Scanner;

public class AddressBookSystem {
    public Scanner scanner = new Scanner(System.in);
    public Contact contact = new Contact();

    public static void main(String[] args) {
        System.out.println("***********************************************************");
        System.out.println("Welcome to Address Book System ");
        AddressBookSystem obj = new AddressBookSystem();
        obj.addContactDetails();
        obj.editContactDetails();
    }

    void addContactDetails() {
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
        int zip = scanner.nextInt();
        contact.setZip(zip);

        System.out.println("Enter Phone number");
        long phoneNumber = scanner.nextLong();
        contact.setPhoneNumber(phoneNumber);

        System.out.println("Enter Email");
        String email = scanner.next();
        contact.setEmail(email);

        System.out.println(contact);

    }

    void editContactDetails() {
        System.out.println("1.first Name \t2.last Name \t3.Address \t4.city \t5.State \t6. Zip \t7.Phone Number \t8.Email");
        System.out.println("Enter a number for edit");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Enter First name");
                String firstName = scanner.next();
                contact.setFirstName(firstName);
                break;

            case 2:
                System.out.println("Enter Last name");
                String lastName = scanner.next();
                contact.setLastName(lastName);
                break;

            case 3:
                System.out.println("Enter Address");
                String address = scanner.next();
                contact.setAddress(address);
                break;

            case 4:
                System.out.println("Enter City name");
                String city = scanner.next();
                contact.setCity(city);
                break;

            case 5:
                System.out.println("Enter State name");
                String state = scanner.next();
                contact.setState(state);
                break;

            case 6:
                System.out.println("Enter Zip code");
                int zip = scanner.nextInt();
                contact.setZip(zip);
                break;

            case 7:
                System.out.println("Enter Phone number");
                long phoneNumber = scanner.nextLong();
                contact.setPhoneNumber(phoneNumber);
                break;

            case 8:
                System.out.println("Enter Email");
                String email = scanner.next();
                contact.setEmail(email);
                break;

        }
        System.out.println(contact);
    }
}
