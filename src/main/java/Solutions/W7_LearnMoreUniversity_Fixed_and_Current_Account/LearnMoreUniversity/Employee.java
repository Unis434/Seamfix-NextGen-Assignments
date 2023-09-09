package Solutions.W7_LearnMoreUniversity_Fixed_and_Current_Account.LearnMoreUniversity;

public class Employee extends Person {
    double salary;
    String departmentName;
    String designation;
    int employeeID;

    public Employee(String firstName, String lastName, int age, double salary, String departmentName, String designation, int employeeID) {
        super(firstName, lastName, age);
        this.salary = salary;
        this.departmentName = departmentName;
        this.designation = designation;
        this.employeeID = employeeID;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + departmentName);
        System.out.println("Designation: " + designation);
    }
}
