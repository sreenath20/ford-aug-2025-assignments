package day9.Assignment3;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Set<Course> courseSet = new HashSet<>();
        Map<Student, Set<Course>> enrollmentMap = new HashMap<>();

        // Add courses
        Course c1 = new Course("OOPS", 101);
        Course c2 = new Course("DBMS", 102);
        Course c3 = new Course("DAA", 103);
        Course c4 = new Course("AI", 104);

        courseSet.add(c1);
        courseSet.add(c2);
        courseSet.add(c3);
        courseSet.add(c4);

        // Add students and register courses
        Student s1 = new Student("ABCD", 1001);
        Student s2 = new Student("EFGH", 1002);

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
        System.out.println("\nStudents enrolled in DBMS:");
        for (Map.Entry<Student, Set<Course>> entry : enrollmentMap.entrySet()) {
            if (entry.getValue().contains(c3)) {
                System.out.println(entry.getKey());
            }
        }

        // Sorting Courses by Name
        List<Course> sortedCourses = new ArrayList<>(courseSet);
        sortedCourses.sort(new CourseNameComparator());
        System.out.println("Courses Sorted by Name:");
        displaySet(sortedCourses);

        // Sorting Students by Name
        List<Student> sortedStudents = new ArrayList<>(enrollmentMap.keySet());
        sortedStudents.sort(new StudentNameComparator());
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
