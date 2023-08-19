package schoolmodel;

public class Main {
    public static void main(String[] args) {
        // Create instances of objects
        Principal principal = new Principal("Damilola", 45);
        Teacher teacher = new Teacher("Daniel", 35);
        Student student = new Student("Unisa Kamara", 20);
        Applicant applicant = new Applicant("Chuks", 16);

        // Admit applicants and expel students using Principal
        principal.admitApplicant(applicant);
        principal.expelStudent(student);

        // Teacher teaches a course
        teacher.teachCourse(new Course("Introduction to Java", teacher));

        // Student takes a course and enrolls in it
        Course JavaCourse = new Course("Introduction to Java", teacher);
        student.takeCourse(JavaCourse);
        JavaCourse.enrollStudent(student);

        // Output results of interactions
        System.out.println();
        System.out.println("Interactions completed!");
    }
}
