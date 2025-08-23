package Assignment3.UniversityCourseRegistrationSystem;

public class Driver {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr.Khan", "khan@university.edu", 45, "Computer Science", "123");
        Course javaCourse = new Course("Java Programming", prof);

        Student s1 = new Student("Ram", "ram@gmail.com", 20, "S101");
        Student s2 = new Student("Sam", "sam@gmail.com", 21, "S102");

        s1.registerCourse(javaCourse);
        s2.registerCourse(javaCourse);

        s1.listCourses();
        s2.listCourses();

        javaCourse.listEnrolledStudents();
    }
}
