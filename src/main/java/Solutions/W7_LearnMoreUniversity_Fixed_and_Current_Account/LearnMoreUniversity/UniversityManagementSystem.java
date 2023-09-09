package Solutions.W7_LearnMoreUniversity_Fixed_and_Current_Account.LearnMoreUniversity;

import java.util.Scanner;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Enter Employee Details");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter Student Details:");
                    System.out.print("First Name: ");
                    String studentFirstName = scanner.nextLine();
                    System.out.print("Last Name: ");
                    String studentLastName = scanner.nextLine();
                    System.out.print("Age: ");
                    int studentAge = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Student ID: ");
                    int studentID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Number of Courses Enrolled: ");
                    int numCourses = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    String[] coursesEnrolled = new String[numCourses];
                    for (int i = 0; i < numCourses; i++) {
                        System.out.print("Course " + (i + 1) + ": ");
                        coursesEnrolled[i] = scanner.nextLine();
                    }

                    // Create and display student object
                    Student student = new Student(studentFirstName, studentLastName, studentAge, coursesEnrolled, studentID);
                    student.displayDetails();
                    break;

                case 2:
                    System.out.println("Enter Employee Details:");
                    System.out.print("First Name: ");
                    String employeeFirstName = scanner.nextLine();
                    System.out.print("Last Name: ");
                    String employeeLastName = scanner.nextLine();
                    System.out.print("Age: ");
                    int employeeAge = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Employee ID: ");
                    int employeeID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Department Name: ");
                    String departmentName = scanner.nextLine();
                    System.out.print("Designation: ");
                    String designation = scanner.nextLine();

                    // Create and display employee object
                    Employee employee = new Employee(employeeFirstName, employeeLastName, employeeAge, salary, departmentName, designation, employeeID);
                    employee.displayDetails();
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

