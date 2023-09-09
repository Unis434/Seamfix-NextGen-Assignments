package Solutions.W8_Assignment.Library_Management_System;

import java.util.Scanner;

// Base class for all books
class Book implements BookOperations {
    private String author;
    private String title;
    private double price;
    private int stock;
    private int pages;

    public Book(String author, String title, double price, int stock, int pages) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.pages = pages;
    }

    // Getter and setter methods for book attributes
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter author's name: ");
        author = scanner.nextLine();
        System.out.print("Enter book title: ");
        title = scanner.nextLine();
        try {
            System.out.print("Enter book price: ");
            price = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter book stock: ");
            stock = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter number of pages: ");
            pages = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    @Override
    public void display() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
        System.out.println("Pages: " + pages);
    }
}


