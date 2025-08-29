import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        StudentOperation studentOp = new StudentOperation();

        // 1. Add new students
        System.out.println("1.Adding students...");
        studentOp.addStudent(new Student(101, "Eve", 91.5));
        studentOp.addStudent(new Student(101, "Bob", 88.0));
        studentOp.addStudent(new Student(104, "David", 95.0));
        studentOp.addStudent(new Student(103, "carlson", 82.3));
        studentOp.addStudent(new Student(105, "Eve", 89.0)); // duplicate marks allowed

//       printing all added students
        studentOp.getStudentList();
        System.out.println();

        // 2. Delete a student by roll number
        System.out.println("\n 2.Deleting student with roll number 105...");
        studentOp.deleteStudent(105);

        System.out.println("\nStudents after deletion:");
        printStudents(studentOp);

        // 3. Update marks by roll number
        System.out.println("\n 3.Updating marks for roll number 104 to 90.0...");
        studentOp.updateStudentMarks(104, 90.0);

        System.out.println("\nStudents after updating marks:");
        printStudents(studentOp);

        // 4. Search for a student by roll number
        System.out.println("\n 4.Searching for student with roll number 102...");
        studentOp.searchStudentByRollNo(102);



        // 5. Show sorting results by different criteria:

        // Sort by marks (descending order)
        System.out.println("\n 5.Students sorted by marks (descending):");
        Collections.sort(studentOp.getStudentsList());  // Comparable implemented in Student
        printStudents(studentOp);

        // Sort by name (alphabetical order)
        System.out.println("\nStudents sorted by name (alphabetical):");
        Collections.sort(studentOp.getStudentsList(), new NameComparator());
        printStudents(studentOp);

        // Sort by roll number (ascending order)
        System.out.println("\nStudents sorted by roll number (ascending):");
        Collections.sort(studentOp.getStudentsList(), new RollNumberComparator());
        printStudents(studentOp);

    }

    private static void printStudents(StudentOperation studentOp) {
        if (studentOp.getStudentsList().isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : studentOp.getStudentsList()) {
                System.out.println(s);
            }
        }
    }
    }

