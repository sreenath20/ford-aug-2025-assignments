package assignment_09.student_course_enrollment;

import java.util.*;

public class StudentCourseEnrollment {
    private static HashSet<Course> availableCourses = new HashSet<>();
    private static HashMap<Student, HashSet<Course>> enrollments = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nUniversity Enrollment System\n");

        availableCourses.add(new Course(101, "Java Programming"));
        availableCourses.add(new Course(102, "Data Structures"));
        availableCourses.add(new Course(103, "Computer Networks"));
        availableCourses.add(new Course(104, "Database Systems"));

        Student rahul = new Student(201, "Rahul Sharma");
        Student priya = new Student(202, "Priya Singh");

        HashSet<Course> rahulCourses = new HashSet<>();
        rahulCourses.add(new Course(101, "Java Programming"));
        rahulCourses.add(new Course(102, "Data Structures"));
        enrollments.put(rahul, rahulCourses);

        HashSet<Course> priyaCourses = new HashSet<>();
        priyaCourses.add(new Course(103, "Computer Networks"));
        priyaCourses.add(new Course(104, "Database Systems"));
        enrollments.put(priya, priyaCourses);

        while (true) {
            System.out.println("\n1. Add Course  2. Register Student  3. Update Registration  4. Remove Student  5. Search  6. Sort  7. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: addCourse(); break;
                case 2: registerStudent(); break;
                case 3: updateRegistration(); break;
                case 4: removeStudent(); break;
                case 5: searchMenu(); break;
                case 6: sortMenu(); break;
                case 7: System.out.println("Exited Successfully!"); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    private static void addCourse() {
        System.out.print("Course ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Course newCourse = new Course(id, "");
        if (availableCourses.contains(newCourse)) {
            System.out.println("Course ID already exists!");
            return;
        }

        System.out.print("Course Name: ");
        String name = scanner.nextLine();
        availableCourses.add(new Course(id, name));
        System.out.println("Course added!");
    }

    private static void registerStudent() {
        System.out.print("Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Student Name: ");
        String name = scanner.nextLine();

        Student student = new Student(studentId, name);

        System.out.println("Available Courses:");
        for (Course course : availableCourses) {
            course.displayCourse();
        }

        System.out.print("Enter Course ID to register: ");
        int courseId = scanner.nextInt();

        Course selectedCourse = null;
        for (Course course : availableCourses) {
            if (course.courseId == courseId) {
                selectedCourse = course;
                break;
            }
        }

        if (selectedCourse != null) {
            HashSet<Course> studentCourses = enrollments.get(student);
            if (studentCourses == null) {
                studentCourses = new HashSet<>();
                enrollments.put(student, studentCourses);
            }
            studentCourses.add(selectedCourse);
            System.out.println("Student registered successfully!");
        } else {
            System.out.println("Course not found!");
        }
    }

    private static void updateRegistration() {
        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();

        Student student = null;
        for (Student s : enrollments.keySet()) {
            if (s.studentId == studentId) {
                student = s;
                break;
            }
        }

        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.println("1. Add Course  2. Drop Course");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter Course ID to add: ");
            int courseId = scanner.nextInt();
            for (Course course : availableCourses) {
                if (course.courseId == courseId) {
                    enrollments.get(student).add(course);
                    System.out.println("Course added!");
                    return;
                }
            }
            System.out.println("Course not found!");
        } else if (choice == 2) {
            System.out.print("Enter Course ID to drop: ");
            int courseId = scanner.nextInt();
            HashSet<Course> studentCourses = enrollments.get(student);
            studentCourses.removeIf(course -> course.courseId == courseId);
            System.out.println("Course dropped!");
        }
    }

    private static void removeStudent() {
        System.out.print("Enter Student ID to remove: ");
        int studentId = scanner.nextInt();

        Student toRemove = null;
        for (Student student : enrollments.keySet()) {
            if (student.studentId == studentId) {
                toRemove = student;
                break;
            }
        }

        if (toRemove != null) {
            enrollments.remove(toRemove);
            System.out.println("Student removed!");
        } else {
            System.out.println("Student not found!");
        }
    }

    private static void searchMenu() {
        System.out.println("\n1. Find Student's Courses  2. Find Students in Course");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: findStudentCourses(); break;
            case 2: findCourseStudents(); break;
            default: System.out.println("Invalid choice!");
        }
    }

    private static void findStudentCourses() {
        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();

        for (Student student : enrollments.keySet()) {
            if (student.studentId == studentId) {
                System.out.println("Courses for " + student.name + ":");
                for (Course course : enrollments.get(student)) {
                    course.displayCourse();
                }
                return;
            }
        }
        System.out.println("Student not found!");
    }

    private static void findCourseStudents() {
        System.out.print("Enter Course ID: ");
        int courseId = scanner.nextInt();

        System.out.println("Students registered for Course ID " + courseId + ":");
        boolean found = false;
        for (Student student : enrollments.keySet()) {
            for (Course course : enrollments.get(student)) {
                if (course.courseId == courseId) {
                    student.displayStudent();
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("No students found!");
        }
    }

    private static void sortMenu() {
        System.out.println("\n1. Sort Courses by Name  2. Sort Students by Name");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: sortCourses(); break;
            case 2: sortStudents(); break;
            default: System.out.println("Invalid choice!");
        }
    }

    private static void sortCourses() {
        ArrayList<Course> sortedCourses = new ArrayList<>(availableCourses);
        Collections.sort(sortedCourses, new CourseComparator());

        System.out.println("Courses sorted by Name:");
        int count = 1;
        for (Course course : sortedCourses) {
            System.out.print(count + ". ");
            course.displayCourse();
            count++;
        }
    }

    private static void sortStudents() {
        ArrayList<Student> sortedStudents = new ArrayList<>(enrollments.keySet());
        Collections.sort(sortedStudents, new StudentComparator());

        System.out.println("Students sorted by Name:");
        int count = 1;
        for (Student student : sortedStudents) {
            System.out.print(count + ". ");
            student.displayStudent();
            count++;
        }
    }
}
