package Solutions.W8_Assignment_CFFC_and_LMS.Library_Management_System;

import java.util.Scanner;

// Class for software books
class SoftwareBook extends Book {
    private String softwareVersion;
    private String softwareName;

    // Constructor
    public SoftwareBook(String author, String title, double price, int stock, int pages, String softwareVersion, String softwareName) {
        super(author, title, price, stock, pages);
        this.softwareVersion = softwareVersion;
        this.softwareName = softwareName;
    }

    public String getSoftwareVersion() { return softwareVersion; }
    public void setSoftwareVersion(String softwareVersion) { this.softwareVersion = softwareVersion; }

    public String getSoftwareName() { return softwareName; }
    public void setSoftwareName(String softwareName) { this.softwareName = softwareName; }

    @Override
    public void acceptDetails() {
        super.acceptDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter software version: ");
        softwareVersion = scanner.nextLine();
        System.out.print("Enter software name: ");
        softwareName = scanner.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Software Version: " + softwareVersion);
        System.out.println("Software Name: " + softwareName);
    }
}
