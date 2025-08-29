public class Main {
    public static void main(String[] args) {
        StudentRegistration reg = new StudentRegistration();

        // --- Add students and their courses ---
        reg.addNewCourse(new Student(1, "Ravi"), new Course("Java", 103));
        reg.addNewCourse(new Student(2, "Anjali"), new Course("Python", 101));
        reg.addNewCourse(new Student(3, "Kiran"), new Course("Data Structures", 102));
        reg.addNewCourse(new Student(4, "Meena"), new Course("Databases", 104));
        reg.addNewCourse(new Student(5, "Arjun"), new Course("Operating Systems", 105));
        reg.addNewCourse(new Student(5, "Arjun"), new Course("Databases", 104)); // Adding a second course


        System.out.println("\n--- Attempt to Add Duplicate Course ---");
        reg.addNewCourse(new Student(5, "Arjun"), new Course("Databases", 104)); // Duplicate

        // update --- Drop a course ---
        System.out.println("\n--- Drop Course ---");
        reg.dropCourseById(1, "Java"); // Should succeed
        reg.dropCourseById(2, "Math");      // Should fail

        // --- Remove a student ---
        System.out.println("\n--- Remove Student ---");
        reg.removeStudentById(2); // Should remove Meena
        reg.removeStudentById(99); // Should show not found

        // --- Get courses by student ID ---
        System.out.println("\n--- Courses Registered by Student (ID: 1) ---");
        reg.getCourses(5);

        System.out.println("\n--- Courses Registered by Student (ID: 4) ---");
        reg.getCourses(4); // Already removed

        // --- Get students by course name ---
        System.out.println("\n--- Students Registered for 'Java' ---");
        reg.getStudents("operating systems");

        System.out.println("\n--- Students Registered for 'Databases' ---");
        reg.getStudents("Databases"); // Arjun dropped this

        // --- Sort all students by name ---
        System.out.println("\n--- Sorted Students ---");
        reg.sortByStudentName();

        // --- Sort all courses by name ---
        System.out.println("\n--- Sorted Courses ---");
        reg.sortByCourseName();
        System.out.println();

        // displaying all students with courses registered
        reg.displayAllStudentsWithCourses();

    }
}
