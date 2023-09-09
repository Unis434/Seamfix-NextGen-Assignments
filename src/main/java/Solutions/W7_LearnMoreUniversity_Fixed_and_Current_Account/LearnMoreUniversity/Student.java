package Solutions.W7_LearnMoreUniversity_Fixed_and_Current_Account.LearnMoreUniversity;

public class Student extends Person {
    String[] coursesEnrolled;
    int studentID;

    public Student(String firstName, String lastName, int age, String[] coursesEnrolled, int studentID) {
        super(firstName, lastName, age);
        this.coursesEnrolled = coursesEnrolled;
        this.studentID = studentID;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentID);
        System.out.println("Courses Enrolled:");
        for (String course : coursesEnrolled) {
            System.out.println("- " + course);
        }
    }
}
