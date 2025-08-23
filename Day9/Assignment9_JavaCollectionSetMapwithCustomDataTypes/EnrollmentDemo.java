package Assignment9_JavaCollectionSetMapwithCustomDataTypes;

import java.util.*;
import java.util.stream.Collectors;

class Course {
    private final int courseId;
    private final String courseName;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() { return courseId; }
    public String getCourseName() { return courseName; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseId == course.courseId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }

    @Override
    public String toString() {
        return "Course{id=" + courseId + ", name='" + courseName + "'}";
    }
}

class Student {
    private final int studentId;
    private String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId() { return studentId; }
    public String getName() { return name; }
    public void setName(String newName) { this.name = newName; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student s = (Student) o;
        return studentId == s.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return "Student{id=" + studentId + ", name='" + name + "'}";
    }
}

class EnrollmentSystem {
    private final Set<Course> courseCatalog = new HashSet<>();
    private final Map<Student, Set<Course>> registrations = new HashMap<>();

    // Add a new course to the catalog
    public boolean addCourse(Course c) {
        return courseCatalog.add(c);
    }

    // Register a student for one or more courses
    public void register(Student s, Collection<Course> coursesToAdd) {
        // Ensure provided courses exist in the catalog
        Set<Course> valid = coursesToAdd.stream()
                .filter(courseCatalog::contains)
                .collect(Collectors.toSet());
        registrations.computeIfAbsent(s, k -> new HashSet<>()).addAll(valid);
    }

    // Update registration: replace student's course set
    public void updateRegistration(Student s, Collection<Course> newCourses) {
        Set<Course> valid = newCourses.stream()
                .filter(courseCatalog::contains)
                .collect(Collectors.toSet());
        registrations.put(s, valid);
    }

    // Drop courses for a student
    public void dropCourses(Student s, Collection<Course> toDrop) {
        Set<Course> reg = registrations.get(s);
        if (reg != null) reg.removeAll(toDrop);
    }

    // Remove a student entirely
    public void removeStudent(Student s) {
        registrations.remove(s);
    }

    // Find all courses taken by student
    public Set<Course> coursesOf(Student s) {
        return registrations.getOrDefault(s, Collections.emptySet());
    }

    // Find all students registered for a given course
    public List<Student> studentsForCourse(Course c) {
        return registrations.entrySet().stream()
                .filter(e -> e.getValue().contains(c))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    // Get all courses sorted by name
    public List<Course> allCoursesSorted() {
        return courseCatalog.stream()
                .sorted(Comparator.comparing(Course::getCourseName, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }

    // Get all students sorted by name
    public List<Student> allStudentsSorted() {
        return registrations.keySet().stream()
                .sorted(Comparator.comparing(Student::getName, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }

    // Helpers for demo/debug
    public Set<Course> getCourseCatalog() { return Collections.unmodifiableSet(courseCatalog); }
    public Map<Student, Set<Course>> getRegistrations() { return Collections.unmodifiableMap(registrations); }
}

class EnrollmentDemo {
    public static void main(String[] args) {
        EnrollmentSystem es = new EnrollmentSystem();

        Course math = new Course(1, "Calculus");
        Course cs = new Course(2, "Computer Science");
        Course hist = new Course(3, "History");

        es.addCourse(math);
        es.addCourse(cs);
        es.addCourse(hist);

        Student alice = new Student(1001, "Alice");
        Student bob = new Student(1002, "Bob");

        es.register(alice, Arrays.asList(math, cs));
        es.register(bob, Arrays.asList(cs, hist));

        System.out.println("Courses of Alice: " + es.coursesOf(alice));
        System.out.println("Students in Computer Science: " + es.studentsForCourse(cs));

        es.dropCourses(bob, Collections.singleton(hist));
        System.out.println("Bob after dropping History: " + es.coursesOf(bob));

        System.out.println("All courses sorted: " + es.allCoursesSorted());
        System.out.println("All students sorted: " + es.allStudentsSorted());

        es.removeStudent(alice);
        System.out.println("After removing Alice, registrations: " + es.getRegistrations());
    }
}

