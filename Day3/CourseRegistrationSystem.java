
import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private String email;
    private int age;
    public Person(String name, String email, int age) { this.name = name; this.email = email; this.age = age; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getAge() { return age; }
}

class Student extends Person {
    private String studentId;
    private List<String> courseList = new ArrayList<>();
    public Student(String name, String email, int age, String studentId) {
        super(name, email, age);
        this.studentId = studentId;
    }
    public void registerCourse(String courseCode) { courseList.add(courseCode); }
    public List<String> getCourseList() { return new ArrayList<>(courseList); }
    public String getStudentId() { return studentId; }
}

class Professor extends Person {
    private String employeeId;
    private String subjectTaught;
    public Professor(String name, String email, int age, String employeeId, String subject) {
        super(name, email, age);
        this.employeeId = employeeId; this.subjectTaught = subject;
    }
    public String getEmployeeId() { return employeeId; }
    public String getSubjectTaught() { return subjectTaught; }
}

class Course {
    private String code;
    private String title;
    private Professor professor;
    private List<Student> enrolled = new ArrayList<>();

    public Course(String code, String title, Professor professor) {
        this.code = code; this.title = title; this.professor = professor;
    }

    public void registerStudent(Student s) {
        enrolled.add(s);
        s.registerCourse(code);
    }

    public void listStudents() {
        System.out.println("Course: " + code + " - " + title);
        for (Student s : enrolled) {
            System.out.println("  " + s.getStudentId() + " - " + s.getName());
        }
    }
}

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr. R. Smith","rsmith@uni.edu",45,"E100","Software Engineering");
        Course course = new Course("CS401","Software Design", prof);

        Student s1 = new Student("Eva","eva@uni.edu",20,"S2001");
        Student s2 = new Student("Frank","frank@uni.edu",21,"S2002");

        course.registerStudent(s1);
        course.registerStudent(s2);

        course.listStudents();
    }
}
