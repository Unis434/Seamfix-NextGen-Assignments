package Solutions.W8_Assignment.Library_Management_System;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Main class to manage the library
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Book> bookInventory = new HashMap<>();
        int bookId = 1;

        while (true) {
            System.out.println("\nSelect book category:");
            System.out.println("1. Software Book");
            System.out.println("2. Hardware Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            if ("1".equals(choice)) {
                SoftwareBook softwareBook = new SoftwareBook("", "", 0.0, 0, 0, "", "");
                softwareBook.acceptDetails();
                bookInventory.put(bookId++, softwareBook);
                softwareBook.display();
            } else if ("2".equals(choice)) {
                HardwareBook hardwareBook = new HardwareBook("", "", 0.0, 0, 0, "", "");
                hardwareBook.acceptDetails();
                bookInventory.put(bookId++, hardwareBook);
                hardwareBook.display();
            } else if ("3".equals(choice)) {
                break;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        System.out.println("\nBook Inventory:");
        for (Map.Entry<Integer, Book> entry : bookInventory.entrySet()) {
            System.out.println("Book ID: " + entry.getKey());
            entry.getValue().display();
        }

        System.out.print("Do you want to restart the program? (yes/no): ");
        String restart = scanner.nextLine();
        if ("yes".equalsIgnoreCase(restart)) {
            main(args);
        } else {
            System.out.println("Goodbye!");
        }
    }
}
