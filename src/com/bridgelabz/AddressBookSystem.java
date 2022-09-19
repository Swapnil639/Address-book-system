package com.bridgelabz;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBookSystem {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Contact> addressBook = new ArrayList<Contact>();

    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Problem");
        AddressBookSystem addressBookList = new AddressBookSystem();
        addressBookList.addContactDetails();
        boolean condition = true;

        while (condition == true) {
            System.out.println("1.AddContact" + "\n" + "2.EditContact" + "\n" + "3.DeleteContact" + "\n" + "4.AddMultipleContact" + "\n" + "5.ShowAddressBookDetails");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    addressBookList.addContactDetails();
                    break;
                case 2:
                    addressBookList.editContactDetails();
                    break;
                case 3:
                    addressBookList.deleteContact();
                    break;
                case 4:
                    addressBookList.addMultipleContact();
                    break;
                case 5:
                    addressBookList.showAddressBookDetails();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    public void addContactDetails() {
        Contact details = new Contact();
        System.out.println("Enter a first name:");
        details.setFirstName(scanner.next());
        System.out.println("Enter a last name:");
        details.setLastName(scanner.next());
        System.out.println("Enter a Address:");
        details.setAddress(scanner.next());
        System.out.println("Enter a City name:");
        details.setCity(scanner.next());
        System.out.println("Enter a state:");
        details.setState(scanner.next());
        System.out.println("Enter a email:");
        details.setEmail(scanner.next());
        System.out.println("Enter a zip code:");
        details.setZip(scanner.next());
        System.out.println("Enter a phone number:");
        details.setPhoneNumber(scanner.next());

        addressBook.add(details);
        System.out.print(addressBook);
        System.out.println("successfully added new contacts");
    }
    public void editContactDetails() {
        System.out.println("enter a name for edit:");
        String editName = scanner.next();
        for (int i = 0; i < addressBook.size(); i++) {
            if (addressBook.get(i).getFirstName().equals(editName)) {
                System.out.println("select options");
                System.out.println("\n0.First Name\n1.Last Name\n2.Address\n3.City\n4.State\n5.Zip\n6.Phone Number");
                int editOption = scanner.nextInt();

                switch (editOption) {
                    case 1:
                        System.out.println("Enter a First name:");
                        String editFirstName = scanner.next();
                        addressBook.get(i).setFirstName(editFirstName);
                        System.out.println(editFirstName);
                        break;
                    case 2:
                        System.out.print("Enter a Last name:");
                        addressBook.get(i).setLastName(scanner.next());
                        break;
                    case 3:
                        System.out.print("Enter a Address:");
                        addressBook.get(i).setAddress(scanner.next());
                        break;
                    case 4:
                        System.out.print("Enter a city:");
                        addressBook.get(i).setCity(scanner.nextLine());
                        break;
                    case 5:
                        System.out.print("Enter a state:");
                        addressBook.get(i).setState(scanner.nextLine());
                        break;
                    case 6:
                        System.out.print("Enter a zip code:");
                        addressBook.get(i).setZip(scanner.nextLine());
                        break;
                    case 7:
                        System.out.print("Enter a phone number:");
                        addressBook.get(i).setPhoneNumber(scanner.nextLine());
                        break;
                    case 8:
                        System.out.print("Enter a email:");
                        addressBook.get(i).setEmail(scanner.nextLine());
                        break;
                    default:
                        System.out.println("enter valid contact");
                }
            }
            System.out.println("Edited list is:");
            System.out.println(addressBook);
        }
    }

    public void deleteContact() {
        System.out.println("confirm the name to delete contact");
        String confirmName = scanner.next();
        for (int i = 0; i < addressBook.size(); i++) {
            if (addressBook.get(i).getFirstName().equals(confirmName)) ;
            Contact person = addressBook.get(i);
            addressBook.remove(person);
        }
        System.out.println(addressBook);
    }

    public void addMultipleContact() {
        System.out.println("Enter Number of Contacts to Add into Contact Book");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            addContactDetails();
            System.out.println(i + 1 + " Contact added Successfully.. ");
        }
    }

    public void showAddressBookDetails() {
        if (addressBook.isEmpty()) {
            System.out.println("Address book is empty");
        } else {
            Set<Contact> set = addressBook.stream().collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Contact::toString))));
            set.forEach(System.out::println);
        }
    }
}