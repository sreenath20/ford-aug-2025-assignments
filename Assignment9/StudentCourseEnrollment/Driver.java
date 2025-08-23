package Assignment9.StudentCourseEnrollment;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Set<Course> courseSet = new HashSet<>();
        Map<Student, Set<Course>> enrollmentMap = new HashMap<>();

        // Add courses
        Course c1 = new Course(1, "Mathematics");
        Course c2 = new Course(2, "Physics");
        Course c3 = new Course(3, "Chemistry");
        Course c4 = new Course(4, "Computer Science");

        courseSet.add(c1);
        courseSet.add(c2);
        courseSet.add(c3);
        courseSet.add(c4);

        // Add students and register courses
        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(102, "Bob");

        enrollmentMap.put(s1, new HashSet<>(Arrays.asList(c1, c2)));
        enrollmentMap.put(s2, new HashSet<>(Arrays.asList(c3, c4)));

        System.out.println("All Courses:");
        displaySet(courseSet);

        System.out.println("All Student Enrollments:");
        displayEnrollment(enrollmentMap);

        // Update: Add course to student s1
        enrollmentMap.get(s1).add(c3);

        // Update: Remove course from student s2
        enrollmentMap.get(s2).remove(c4);

        // Remove student
        enrollmentMap.remove(s2);

        System.out.println("After Updating Enrollments:");
        displayEnrollment(enrollmentMap);

        // Search: Find courses taken by a student
        System.out.println("Courses taken by " + s1.getName() + ":");
        if (enrollmentMap.containsKey(s1)) {
            for (Course course : enrollmentMap.get(s1)) {
                System.out.println(course);
            }
        }

        // Search: Find students registered for a given course
        System.out.println("\nStudents enrolled in Chemistry:");
        for (Map.Entry<Student, Set<Course>> entry : enrollmentMap.entrySet()) {
            if (entry.getValue().contains(c3)) {
                System.out.println(entry.getKey());
            }
        }

        // Sorting Courses by Name
        List<Course> sortedCourses = new ArrayList<>(courseSet);
        sortedCourses.sort(new SortCourseByName());
        System.out.println("Courses Sorted by Name:");
        displaySet(sortedCourses);

        // Sorting Students by Name
        List<Student> sortedStudents = new ArrayList<>(enrollmentMap.keySet());
        sortedStudents.sort(new SortStudentByName());
        System.out.println("Students Sorted by Name:");
        for (Student s : sortedStudents) {
            System.out.println(s);
        }
    }

    public static void displaySet(Collection<?> set) {
        for (Object obj : set) {
            System.out.println(obj);
        }
    }

    public static void displayEnrollment(Map<Student, Set<Course>> map) {
        for (Map.Entry<Student, Set<Course>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }
}

