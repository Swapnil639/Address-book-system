package com.bridgelabz;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class AddressBook {
    static Map<String, AddressBookSystem> addressBookSystemMap = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    // Main method
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook program");

        boolean condition = true;
        while (condition) {
            System.out.println("\n" + "1.AddNewAddressBook" + "\n" + "2.AddContact" + "\n" + "3.EditContact" + "\n" + "4.DeleteContact" + "\n" + "5.AddMultipleContact" + "\n" + "6.ShowAddressBookDetails");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    addNewAddressBook();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    addMultipleContact();
                    break;
                case 6:
                    showAddressBookDetails();
                    break;
                default:
                    System.out.println("Exit");
            }
        }
    }

    public static void addNewAddressBook() {
        System.out.println("Enter the name of new address book");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookSystemMap.get(bookName);
        AddressBookSystem addressBook = new AddressBookSystem();
        if (book == null) {
            addressBookSystemMap.put(bookName, addressBook);
            System.out.println(addressBookSystemMap.entrySet());
            System.out.println("Successfully added new address book");
        } else {
            System.out.println("Address book with this name already exist");
        }
    }

    public static void addContact() {
        System.out.println("Enter the name of address book to add contact");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookSystemMap.get(bookName);
        AddressBookSystem addressBook = new AddressBookSystem();
        if (book == null) {
            System.out.println("No book found with this name ");
        } else {
            addressBook.addContactDetails();
        }
    }

    public static void editContact() {
        System.out.println("Enter the name of address book edit ");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookSystemMap.get(bookName);
        AddressBookSystem addressBook = new AddressBookSystem();
        if (book == null) {
            System.out.println("Address book doesn't exist");
        } else {
            addressBook.editContactDetails();
        }
    }

    public static void deleteContact() {
        System.out.println("Enter the name of address book to delete contact");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookSystemMap.get(bookName);
        AddressBookSystem addressBook = new AddressBookSystem();
        if (book == null) {
            System.out.println("Address book doesn't exist");
        } else {
            addressBook.deleteContact();
        }
    }

    public static void addMultipleContact() {
        System.out.println("Enter the address book name to add multiple contact");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookSystemMap.get(bookName);
        AddressBookSystem addressBook = new AddressBookSystem();
        if (book == null) {
            System.out.println("Address book doesn't exist");
        } else {
            addressBook.addMultipleContact();
        }
    }

    public static void showAddressBookDetails() {
        System.out.println("Enter Address Book System Name");
        String bookName = scanner.next();
        AddressBookSystem address = addressBookSystemMap.get(bookName);
        AddressBookSystem addressBookSystem = new AddressBookSystem();
        if (address == null) {
            System.out.println("No book found this name");
        } else {
            addressBookSystem.showAddressBookDetails();
        }
    }
}