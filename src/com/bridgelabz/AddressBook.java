package com.bridgelabz;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class AddressBook {
    static Map<String, AddressBookSystem> addressBookSystemMap = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    static AddressBookSystem addressBook = new AddressBookSystem();

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook program");

        boolean condition = true;
        while (condition) {
            System.out.println("\n" + "1.AddNewAddressBook" + "\n" + "2.AddContact" + "\n" + "3.EditContact" + "\n" + "4.DeleteContact" + "\n" + "5.AddMultipleContact" + "\n" + "6.ShowAddressBookDetails" + "\n" + "7.SearchContactByCityOrState" + "\n" + "8.MoreOptions");
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
                case 7:
                    searchByCityOrState();
                    break;
                case 8:
                    moreOptions();
                    break;
                default:
                    System.out.println("Exit");
            }
        }
    }

    public static void moreOptions() {
        boolean condition = true;
        while (condition) {
            System.out.println("\n" + "1.SortByPersonName" + "\n" + "2.SortByCity" + "\n" + "3.SortByState" + "\n" + "4.SortByZip" + "\n" + "5.Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    sortByPersonName();
                    break;
                case 2:
                    sortByCity();
                    break;
                case 3:
                    sortByState();
                    break;
                case 4:
                    sortByZip();
                    break;
                case 5:
                    condition = false;
                    System.out.println("Back To Main menu");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    // Method to add new address book
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

    // Method to add contact
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

    // Method to edit contact
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

    // Method to delete contact
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

    // Method to add multiple contacts
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

    // Method to display the address book details
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

    // Method to search contact by city or state
    public static void searchByCityOrState() {
        System.out.println("Enter the AddressBookName ");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookSystemMap.get(bookName);
        AddressBookSystem addressBookSystem = new AddressBookSystem();
        if (book == null) {
            System.out.println("No book found with these name");
        } else {
            addressBookSystem.searchContactDetails();
        }
    }

    // Method to sort contact by person name
    public static void sortByPersonName() {
        System.out.println("Enter the AddressBookName ");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookSystemMap.get(bookName);
        if (book == null) {
            System.out.println("No book found with these name");
        } else {
            addressBook.sortByPersonName();
        }
    }

    // Method to sort contact by city
    public static void sortByCity() {
        System.out.println("Enter the AddressBookName ");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookSystemMap.get(bookName);
        if (book == null) {
            System.out.println("No book found with these name");
        } else {
            addressBook.sortingByCity();
        }
    }

    // Method to sort contact by state
    public static void sortByState() {
        System.out.println("Enter the AddressBookName ");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookSystemMap.get(bookName);
        if (book == null) {
            System.out.println("No book found with these name");
        } else {
            addressBook.sortingByState();
        }
    }

    // Method to sort contact by zip
    public static void sortByZip() {
        System.out.println("Enter the AddressBookName ");
        String bookName = scanner.next();
        AddressBookSystem book = addressBookSystemMap.get(bookName);
        if (book == null) {
            System.out.println("No book found with these name");
        } else {
            addressBook.sortingByZip();
        }
    }
}