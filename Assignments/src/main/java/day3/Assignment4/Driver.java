package day3.Assignment4;

public class Driver {
    public static void main(String[] args) {
        Student student = new Student("abc", "abc@gmail.com", 21, 5);
        Person professor = new Professor("xyz", "xyz@gmail.com", 40, "Java", "CS345");
        Course course1 = new Course("DAA", "CS010");
        Course course2 = new Course("OOP", "CS020");
        Course course3 = new Course("DBMS", "CS021");
        student.registerCourse(course1);
        student.registerCourse(course2);
        student.registerCourse(course3);
        student.displayCourses();
    }
}
