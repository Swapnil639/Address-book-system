package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    static Map<String, AddressBookClass> bookClassMap = new HashMap<String, AddressBookClass>();
    static Scanner scanner = new Scanner(System.in);
    static AddressBookClass addressBook = new AddressBookClass();

    public static void main(String[] args) {

        System.out.println("Welcome To AddressBook program");
        boolean condition = true;
        while (condition) {
            System.out.println("choose options \n1 : AddNewAddressBook\n2 : AddContact\n3 : EditContact\n4 : Delete Contact\n5 : Add multiple contacts\n6 : ShowContacts \n7 : MoreOptions \n8 : Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> addAddressBook();
                case 2 -> addAddressBookContact();
                case 3 -> editAddressBookContact();
                case 4 -> deleteAddressBookContact();
                case 5 -> addMultipleContactsToAddressBook();
                case 6 -> showContactsInAddressBook();
                case 7 -> moreOptions();
                case 8 -> {
                    condition = false;
                    System.out.println("Exiting the loop ");
                }
                default -> System.out.println("Enter the correct number");
            }
        }
    }

    public static void moreOptions() {
        boolean condition = true;
        while (condition) {
            System.out.println("Choose the options\n1 : SearchContactByCity\n2 : SortingByPersonName\n3 : SortingByCity\n4 : BackToMainMenu ");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> searchByCityOrState();
                case 2 -> sortingByPersonName();
                case 3 -> sortingByCity();
                case 4 -> {
                    condition = false;
                    System.out.println("Back To Main menu");
                }
                default -> System.out.println("Enter the correct option");
            }
        }
    }

    public static void addAddressBook() {
        System.out.println("Enter the New AddressBook name");
        String bookName = scanner.next();
        AddressBookClass book = bookClassMap.get(bookName);
        if (book == null) {
            bookClassMap.put(bookName, addressBook);
            System.out.println(bookClassMap.entrySet());
            System.out.println("SuccessFully added New AddressBook");
        } else {
            System.out.println("AddressBook with this name already exists ");
        }
    }

    public static void addAddressBookContact() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBookClass book = bookClassMap.get(bookName);
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            addressBook.addContact(scanner);
        }
    }

    public static void editAddressBookContact() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBookClass book = bookClassMap.get(bookName);
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            addressBook.editContacts();
        }
    }

    public static void deleteAddressBookContact() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBookClass book = bookClassMap.get(bookName);
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            addressBook.deleteContact();
        }
    }

    public static void addMultipleContactsToAddressBook() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBookClass book = bookClassMap.get(bookName);
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            addressBook.addMultipleContacts();
        }
    }

    public static void showContactsInAddressBook() {
        System.out.println("Enter the AddressBookName ");
        String bookName = scanner.next();
        AddressBookClass book = bookClassMap.get(bookName);
        if (book == null) {
            System.out.println("No book found with these name");
        } else {
            addressBook.showContacts();
        }
    }

    // ability to view
    public static void searchByCityOrState() {
        System.out.println("Enter the AddressBookName ");
        String bookName = scanner.next();
        AddressBookClass book = bookClassMap.get(bookName);
        if (book == null) {
            System.out.println("No book found with these name");
        } else {
            addressBook.searchMethod();
        }
    }

    public static void sortingByPersonName() {
        System.out.println("Enter the AddressBookName ");
        String bookName = scanner.next();
        AddressBookClass book = bookClassMap.get(bookName);
        if (book == null) {
            System.out.println("No book found with these name");
        } else {
            addressBook.sortingByPersonName();
        }
    }

    public static void sortingByCity() {
        System.out.println("Enter the AddressBookName ");
        String bookName = scanner.next();
        AddressBookClass book = bookClassMap.get(bookName);
        if (book == null) {
            System.out.println("No book found with these name");
        } else {
            addressBook.sortingByCity();

        }
    }
}