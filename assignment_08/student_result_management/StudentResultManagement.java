package assignment_08.student_result_management;

import java.util.*;

public class StudentResultManagement {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nStudent Result Management System\n");

        students.add(new Student(101, "Rahul Sharma", 85.5));
        students.add(new Student(102, "Priya Shree", 92.0));
        students.add(new Student(103, "Amit Singh", 78.0));
        students.add(new Student(104, "Neha Gupta", 89.5));

        while (true) {
            System.out.println("\n1. Add  2. Delete  3. Update  4. Search  5. Display  6. Sort  7. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: deleteStudent(); break;
                case 3: updateMarks(); break;
                case 4: searchStudent(); break;
                case 5: displayAllStudents(); break;
                case 6: sortMenu(); break;
                case 7: System.out.println("Exited Successfully!"); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();
        if (students.contains(new Student(rollNo, "", 0))) {
            System.out.println("Roll No already exists!");
            return;
        }
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Marks: ");
        double marks = scanner.nextDouble();
        students.add(new Student(rollNo, name, marks));
        System.out.println("Student added!");
    }

    private static void deleteStudent() {
        System.out.print("Enter Roll No to delete: ");
        int rollNo = scanner.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).rollNo == rollNo) {
                students.remove(i);
                System.out.println("Student deleted!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    private static void updateMarks() {
        System.out.print("Enter Roll No to update: ");
        int rollNo = scanner.nextInt();
        for (Student student : students) {
            if (student.rollNo == rollNo) {
                System.out.print("New Marks: ");
                student.marks = scanner.nextDouble();
                System.out.println("Marks updated!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    private static void searchStudent() {
        System.out.print("Enter Roll No to search: ");
        int rollNo = scanner.nextInt();
        Student searchStudent = new Student(rollNo, "", 0);
        if (students.contains(searchStudent)) {
            int index = students.indexOf(searchStudent);
            students.get(index).displayStudent();
        } else {
            System.out.println("Student not found!");
        }
    }

    private static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students!");
            return;
        }
        System.out.println("\nAll Students:");
        for (int i = 0; i < students.size(); i++) {
            System.out.print((i + 1) + ". ");
            students.get(i).displayStudent();
        }
    }

    private static void sortMenu() {
        System.out.println("\n1. Sort by Marks  2. Sort by Name  3. Sort by Roll No");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Collections.sort(students);
                System.out.println("Sorted by Marks (Highest first):");
                displayAllStudents();
                break;
            case 2:
                Collections.sort(students, new NameComparator());
                System.out.println("Sorted by Name (Alphabetical):");
                displayAllStudents();
                break;
            case 3:
                Collections.sort(students, new RollNoComparator());
                System.out.println("Sorted by Roll No (Ascending):");
                displayAllStudents();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
