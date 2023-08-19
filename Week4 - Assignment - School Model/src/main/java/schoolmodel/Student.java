package schoolmodel;

public class Student extends Person implements Learnable {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void takeCourse(Course course) {
        System.out.println(getName() + " is taking " + course.getName() + " course.");
    }

    // Other methods related to students
}
