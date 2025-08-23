package Assignments8_JavaCollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Comparable: sort by marks descending
    @Override
    public int compareTo(Student other) {
        return Double.compare(other.marks, this.marks); // descending
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return rollNo == s.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public String toString() {
        return String.format("Student{roll=%d, name='%s', marks=%.2f}", rollNo, name, marks);
    }
}

// Comparator by name (alphabetical)
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.name.compareToIgnoreCase(b.name);
    }
}

// Comparator by rollNo (ascending)
class RollNoComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return Integer.compare(a.rollNo, b.rollNo);
    }
}

public class StudentManagement {
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        // Add students
        students.add(new Student(3, "Zara", 88.5));
        students.add(new Student(1, "Amit", 92.0));
        students.add(new Student(5, "Priya", 76.0));
        students.add(new Student(2, "Bob", 85.0));
        students.add(new Student(4, "Chen", 92.0));

        System.out.println("Original list:");
        display();

        // Sort by marks (Comparable) descending
        Collections.sort(students);
        System.out.println("\nSorted by marks (descending):");
        display();

        // Sort by name (Comparator)
        students.sort(new NameComparator());
        System.out.println("\nSorted by name (alphabetical):");
        display();

        // Sort by rollNo (Comparator)
        students.sort(new RollNoComparator());
        System.out.println("\nSorted by roll number (ascending):");
        display();

        // CRUD operations:
        System.out.println("\n-- CRUD operations --");

        // Add new student
        Student newStudent = new Student(6, "Isha", 81.0);
        addStudent(newStudent);
        display();

        // Delete by roll number
        System.out.println("\nDeleting student with rollNo 5...");
        deleteStudent(5);
        display();

        // Update marks by roll number
        System.out.println("\nUpdating marks for rollNo 2 to 90.5...");
        updateMarks(2, 90.5);
        display();

        // Search by roll number using equals() and indexOf()
        System.out.println("\nSearching for rollNo 1 using contains() and indexOf()...");
        Student probe = new Student(1, "", 0);
        boolean present = students.contains(probe);
        int idx = students.indexOf(probe);
        System.out.println("contains? " + present + ", indexOf = " + idx);
        if (idx >= 0) System.out.println("Found: " + students.get(idx));
    }

    static void addStudent(Student s) {
        if (!students.contains(s)) {
            students.add(s);
            System.out.println("Added: " + s);
        } else {
            System.out.println("Student with rollNo " + s.rollNo + " already exists.");
        }
    }

    static boolean deleteStudent(int rollNo) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).rollNo == rollNo) {
                System.out.println("Removing: " + students.get(i));
                students.remove(i);
                return true;
            }
        }
        System.out.println("Student with rollNo " + rollNo + " not found.");
        return false;
    }

    static boolean updateMarks(int rollNo, double newMarks) {
        for (Student s : students) {
            if (s.rollNo == rollNo) {
                s.marks = newMarks;
                System.out.println("Updated: " + s);
                return true;
            }
        }
        System.out.println("Student with rollNo " + rollNo + " not found.");
        return false;
    }

    static void display() {
        students.forEach(System.out::println);
    }
}
