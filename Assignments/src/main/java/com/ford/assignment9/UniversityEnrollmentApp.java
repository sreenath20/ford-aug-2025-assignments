package com.ford.assignment9;

import java.util.*;

class Course {
    private int courseId;
    private String courseName;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() { return courseId; }
    public String getCourseName() { return courseName; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return courseId == course.courseId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }

    @Override
    public String toString() {
        return "Course{" + "courseId=" + courseId + ", courseName='" + courseName + '\'' + '}';
    }
}

class Student {
    private int studentId;
    private String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId() { return studentId; }
    public String getName() { return name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", name='" + name + '\'' + '}';
    }
}

class UniversityEnrollmentSystem {
    private Set<Course> courses = new HashSet<>();
    private Map<Student, Set<Course>> registrations = new HashMap<>();

    // Add a new course
    public boolean addCourse(Course course) {
        return courses.add(course);
    }

    // Register a student for courses
    public void registerStudent(Student student, Set<Course> courseSet) {
        registrations.put(student, new HashSet<>(courseSet));
    }

    // Update student registration (add/drop courses)
    public boolean updateRegistration(Student student, Set<Course> newCourses) {
        if (registrations.containsKey(student)) {
            registrations.put(student, new HashSet<>(newCourses));
            return true;
        }
        return false;
    }

    // Remove a student
    public boolean removeStudent(Student student) {
        return registrations.remove(student) != null;
    }

    // Find courses taken by a student
    public Set<Course> getCoursesByStudent(Student student) {
        return registrations.getOrDefault(student, Collections.emptySet());
    }

    // Find students registered for a course
    public List<Student> getStudentsByCourse(Course course) {
        List<Student> result = new ArrayList<>();
        for (Map.Entry<Student, Set<Course>> entry : registrations.entrySet()) {
            if (entry.getValue().contains(course)) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    // Sort courses by name
    public List<Course> getCoursesSortedByName() {
        List<Course> sorted = new ArrayList<>(courses);
        sorted.sort(Comparator.comparing(Course::getCourseName));
        return sorted;
    }

    // Sort students by name
    public List<Student> getStudentsSortedByName() {
        List<Student> sorted = new ArrayList<>(registrations.keySet());
        sorted.sort(Comparator.comparing(Student::getName));
        return sorted;
    }

    // View all courses
    public void viewAllCourses() {
        courses.forEach(System.out::println);
    }

    // View all students
    public void viewAllStudents() {
        registrations.keySet().forEach(System.out::println);
    }
}

public class UniversityEnrollmentApp {
    public static void main(String[] args) {
        UniversityEnrollmentSystem system = new UniversityEnrollmentSystem();

        // Courses
        Course c1 = new Course(101, "Mathematics");
        Course c2 = new Course(102, "Physics");
        Course c3 = new Course(103, "Computer Science");

        system.addCourse(c1);
        system.addCourse(c2);
        system.addCourse(c3);

        // Students
        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(2, "Bob");
        Student s3 = new Student(3, "Charlie");

        // Register students
        system.registerStudent(s1, Set.of(c1, c3));
        system.registerStudent(s2, Set.of(c2));
        system.registerStudent(s3, Set.of(c1, c2, c3));

        System.out.println("All Courses:");
        system.viewAllCourses();

        System.out.println("\nAll Students:");
        system.viewAllStudents();

        System.out.println("\nCourses taken by Alice:");
        system.getCoursesByStudent(s1).forEach(System.out::println);

        System.out.println("\nStudents registered for Computer Science:");
        system.getStudentsByCourse(c3).forEach(System.out::println);

        System.out.println("\nCourses sorted by name:");
        system.getCoursesSortedByName().forEach(System.out::println);

        System.out.println("\nStudents sorted by name:");
        system.getStudentsSortedByName().forEach(System.out::println);

        System.out.println("\nUpdating Bob's registration to Mathematics only:");
        system.updateRegistration(s2, Set.of(c1));

        System.out.println("\nRemoving Charlie from the system:");
        system.removeStudent(s3);

        System.out.println("\nFinal Student List:");
        system.viewAllStudents();
    }
}
