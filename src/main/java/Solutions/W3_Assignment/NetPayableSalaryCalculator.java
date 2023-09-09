package Solutions.W3_Assignment;

import java.util.Scanner;

public class NetPayableSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate HRA, which is 50% of basic salary
        double hra = 0.5 * basicSalary;

        // Calculate Special allowance, which is 75% of basic salary
        double specialAllowance = 0.75 * basicSalary;

        // Calculate PF deduction, which is 12% of basic salary
        double pfDeduction = 0.12 * basicSalary;

        // Calculate total salary
        double totalSalary = basicSalary + hra + specialAllowance;

        // Calculate net payable salary
        double netPayableSalary = totalSalary - pfDeduction;

        System.out.println("HRA: " + hra);
        System.out.println("Special Allowance: " + specialAllowance);
        System.out.println("PF Deduction: " + pfDeduction);
        System.out.println("Net Payable Salary: " + netPayableSalary);

        scanner.close();
    }
}
