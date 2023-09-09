package Solutions.W3_Assignment;

import java.util.Scanner;

public class CylinderVolumeCalculator {
    public static void main(String[] args) {
        final double PI = 22.0 / 7.0; // Value of π (pi)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Calculate the volume of the cylinder using the formula: Volume = π * r^2 * h
        double volume = PI * radius * radius * height;

        System.out.println("The volume of the cylinder is: " + volume);

        scanner.close();
    }
}
