package com.bridgelabz;

import java.util.HashMap;
import java.util.Scanner;

import static com.bridgelabz.AddressBook.scanner;

public class AddressBookMain {

    public static final int ADD = 1;
    public static final int QUIT = 3;
    public static final int EDIT = 2;

    public static void main(String[] args) {
        System.out.println("<-------------Welcome To Address Book----------------->");

        Scanner scanner = new Scanner(System.in);
        HashMap<String, AddressBook> services = new HashMap<>();
        System.out.println("*****  Enter Unique Address Book Name  *****");
        String addressBookNameAsKey = scanner.nextLine().toUpperCase();
        System.out.println(addressBookNameAsKey);
        AddressBook addressBookNameValue = new AddressBook();
        services.put(addressBookNameAsKey, addressBookNameValue);


        boolean exit = false;
        System.out.println("Enter Your Choice");

        while (!exit) {
            System.out.println("1.Create/Add Contact\t 2.Update Contact\t 3.Quit");
            int choice = scanner.nextInt();

            switch (choice) {
                case ADD:
                    System.out.println("Add New Contact");
                    services.get(addressBookNameAsKey).addContact(null);
                    break;
                case EDIT:
                    System.out.println("Update Contact");
                    services.get(addressBookNameAsKey).editContact();
                    break;
                case QUIT:
                    exit = true;
                    System.out.println("Thank you.....!!!");
                    break;
                default:
                    System.out.println("Application is quit...");
                    break;
            }
        }

    }

}


