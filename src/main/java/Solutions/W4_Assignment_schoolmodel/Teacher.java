package Solutions.W4_Assignment_schoolmodel;

public class Teacher extends Person implements Teachable {
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teachCourse(Course course) {
        System.out.println(getName() + " is teaching " + course.getName() + " course.");
    }

    // Other methods related to teachers
}
