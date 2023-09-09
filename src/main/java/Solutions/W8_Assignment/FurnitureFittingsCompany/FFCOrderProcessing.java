package Solutions.W8_Assignment.FurnitureFittingsCompany;

import java.util.Scanner;

public class FFCOrderProcessing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Chuks Furniture and Fittings Company (CFFC)!");

        while (true) {
            int choice = 0;

            try {
                System.out.println("Please select the furniture item you want to order:");
                System.out.println("1. Chair");
                System.out.println("2. Bookshelf");
                System.out.println("3. Exit");

                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                if (choice == 3) {
                    break; // Exit the program
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid choice.");
                continue; // Restart the loop
            }

            FurnitureItem orderedItem = null;

            try {
                if (choice == 1) {
                    System.out.println("Enter chair details:");
                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Width: ");
                    double width = scanner.nextDouble();
                    System.out.print("Height: ");
                    double height = scanner.nextDouble();

                    orderedItem = new Chair(price, width, height);
                } else if (choice == 2) {
                    System.out.println("Enter bookshelf details:");
                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Width: ");
                    double width = scanner.nextDouble();
                    System.out.print("Height: ");
                    double height = scanner.nextDouble();

                    orderedItem = new Bookshelf(price, width, height);
                } else {
                    System.out.println("Invalid choice. Please select 1 for Chair, 2 for Bookshelf, or 3 to Exit.");
                    continue; // Restart the loop
                }
            } catch (Exception e) {
                System.out.println("Invalid input for furniture details. Please enter valid numeric values.");
                continue; // Restart the loop
            }

            if (orderedItem != null) {
                displayOrder(orderedItem);
            }
        }

        scanner.close();
    }

    public static void displayOrder(FurnitureItem item) {
        System.out.println("Your order details:");
        System.out.println("Item: " + item.getItemName());
        System.out.println("Price: SLE " + item.getPrice());
        System.out.println("Width: " + item.getWidth() + " inches");
        System.out.println("Height: " + item.getHeight() + " inches");
    }
}




