package Assignment8.studentresultmanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Create
        students.add(new Student(3, "John", 85.0));
        students.add(new Student(1, "Alice", 92.5));
        students.add(new Student(5, "David", 78.0));
        students.add(new Student(2, "Bob", 88.5));

        System.out.println("Initial List:");
        printList(students);

        // Search student by rollNo
        Student s1 = new Student(1, "Dummy", 0); // dummy for comparison
        if (students.contains(s1)) {
            System.out.println("Student with rollNo 1 exists.");
        } else {
            System.out.println("Student not found.");
        }

        // Update marks for rollNo 5
        for (Student s : students) {
            if (s.getRollNo() == 5) {
                s.setMarks(82.0);
                System.out.println("Updated marks for rollNo 5.");
                break;
            }
        }

        // Delete student by rollNo
        students.removeIf(s -> s.getRollNo() == 3);
        System.out.println("After Deleting student with rollNo 3:");
        printList(students);

        // Sort by marks (Comparable)
        Collections.sort(students);
        System.out.println("Sorted by Marks (Descending):");
        printList(students);

        // Sort by name (Comparator)
        Collections.sort(students, new SortByName());
        System.out.println("Sorted by Name (Alphabetical):");
        printList(students);

        // Sort by rollNo (Comparator)
        Collections.sort(students, new SortByRollNo());
        System.out.println("Sorted by RollNo (Ascending):");
        printList(students);
    }

    public static void printList(List<Student> list) {
        for (Student s : list) {
            System.out.println(s);
        }
        System.out.println();
    }
}
