package Solutions.W8_Assignment.Library_Management_System;

import java.util.Scanner;

// Class for hardware books
class HardwareBook extends Book {
    private String hardwareCategory;
    private String publisher;

    // Constructor
    public HardwareBook(String author, String title, double price, int stock, int pages, String hardwareCategory, String publisher) {
        super(author, title, price, stock, pages);
        this.hardwareCategory = hardwareCategory;
        this.publisher = publisher;
    }

    public String getHardwareCategory() { return hardwareCategory; }
    public void setHardwareCategory(String hardwareCategory) { this.hardwareCategory = hardwareCategory; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    @Override
    public void acceptDetails() {
        super.acceptDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hardware category: ");
        hardwareCategory = scanner.nextLine();
        System.out.print("Enter publisher: ");
        publisher = scanner.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Hardware Category: " + hardwareCategory);
        System.out.println("Publisher: " + publisher);
    }
}

