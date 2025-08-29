import javax.swing.plaf.IconUIResource;
import java.util.*;

public class StudentRegistration {
    Map<Student, Set<Course>> studentRegistration;

    public StudentRegistration() {
        studentRegistration = new HashMap<>();

    }

//    CRUD operations
//    Adding Students and their registered courses

    public void addNewCourse(Student std, Course course) {

        //first check weather a student exits or not
        if (studentRegistration.containsKey(std)) {
//            if a student already exits
            Set<Course> studentCourses = studentRegistration.get(std);
//            then also check this student already registered for the course or not
            if (studentCourses.contains(course)) {
//                if already registered then it is a duplicate course registration
                System.out.println("Student with id " + std.getStudentId() +
                        " is already registered for the course " + course.getCourseName());
                return;
            }
//            if course is not present in the student courses then add the course into student course
            studentCourses.add(course);
        } else {
//            if student does not exits then add course and student information in studentRegistration Map
            Set<Course> newCourses = new HashSet<>();
            newCourses.add(course);
            studentRegistration.put(std, newCourses);
        }

        System.out.println("Student with id " + std.getStudentId() +
                " registered for the course " + course.getCourseName());

    }


    //updating  Stuednts registration

//    dropping course by student id and coursename

    public void dropCourseById(int stdId, String courseName) {
        //Checking weather student exists or not
        Student student = null;
        for (Student s : studentRegistration.keySet()) {
            if (s.getStudentId() == stdId) {
                student = s;
                break;
            }
        }

        if (student == null) {
            System.out.println("Student with id " + stdId + " is not found");
            return;
        }
        //checking weather course is present or not
        Course course = null;
        for (Course c : studentRegistration.get(student)) {
            if (courseName == c.getCourseName()) {
                course = c;
                break;
            }
        }
        if (course == null) {
            System.out.println("student with id " + stdId + " not registred for this course " + courseName);
            return;
        }

        studentRegistration.get(student).remove(course);
        System.out.println("Student with id " + stdId + " has been dropped");

    }

    // updating add course
    //we can use addNewCourse() Method for the updation for new registrations

    //Removing a student from system by his student id

    public void removeStudentById(int stdId) {
        Student student = null;
        for (Student s : studentRegistration.keySet()) {
            if (s.getStudentId() == stdId) {
                student = s;
                break;
            }
        }
        if (student == null) {
            System.out.println("Student with id " + stdId + " is not found");
            return;
        }
        studentRegistration.remove(student);
        System.out.println(" Student " + student.getStudentName() + "' (ID: " + stdId + ") removed successfully.");
    }

    //    search
//    searching all courses based on the student id
    public void getCourses(int stdId) {
        for (Student s : studentRegistration.keySet()) {
            if (s.getStudentId() == stdId) {
                System.out.println("courses registered by the student " + s.getStudentName() + " with student id " + stdId);
                if (studentRegistration.get(s) == null || studentRegistration.get(s).isEmpty()) {
                    System.out.println("No courses registered");
                } else {
                    for (Course c : studentRegistration.get(s)) {
                        System.out.println("- " + c.getCourseName() + " (ID: " + c.getCourseId() + ")");
                    }
                }

                return;
            }

        }
        System.out.println("Student with student id " + stdId + " not found.");

    }

//    displaying students who registered for a given course

    public void getStudents(String courseName) {
        boolean registered = false;
        for (Student s : studentRegistration.keySet()) {

            for (Course c : studentRegistration.get(s)) {

                if (c.getCourseName().equalsIgnoreCase(courseName)) {
                    System.out.println("- " + s.getStudentName() + " (ID: " + s.getStudentId() + ")");

                    registered = true;
                    break;
                }
            }

        }
        if (!registered) {
            System.out.println("no student registered the course " + courseName);

        }

    }


    //sort
//    sorted by courseName
    public void sortByCourseName() {
        //to sort all the courses by course name
        // first we need to append all the cources in a saperate set so that duplication will not happen
        //then we can convert Set into List so that we can use our custom courceNameComparator() to sort it.
        Set<Course> allCourses = new HashSet<>();

        for(Set<Course> course : studentRegistration.values()) {
            allCourses.addAll(course);
            //all courses are added to allCources Set
        }
        // converting into List
        List<Course> sortedCourses = new ArrayList<>(allCourses);
        sortedCourses.sort(new CourseNameComparator());
        System.out.println("Courses sorted by course name:");
        for (Course c : sortedCourses) {
            System.out.println("- " + c.getCourseName() + " (ID: " + c.getCourseId() + ")");

        }

    }

    //sorted by Student name

    public void sortByStudentName() {
       // no need for creating saperate Set for Students(keys)
        List<Student> sortedStudents = new ArrayList<>(studentRegistration.keySet());
        sortedStudents.sort(new StudentNameComparator());
        System.out.println("Students sorted by student name:");
        for (Student s : sortedStudents) {
            System.out.println("- "+  s.getStudentName() + " (ID: " + s.getStudentId() + ")");
        }



    }

    //displaying All Students With Courses

    public void displayAllStudentsWithCourses() {
        if (studentRegistration.isEmpty()) {
            System.out.println("No student registrations found.");
            return;
        }
        System.out.println("All Students with their Registered Courses:");
        for (Student s : studentRegistration.keySet()) {
            System.out.println("\nStudent Name: " + s.getStudentName());
            System.out.println("Student ID  : " + s.getStudentId());


            Set<Course> courses = studentRegistration.get(s);
            //checking a weather student has any courses registered or not

            if(courses == null || courses.isEmpty()) {
                System.out.println("No courses registered");

            }
            else{
                System.out.println("\n Registered Courses: ");
                for (Course c : courses) {
                    System.out.println("   - " + c.getCourseName() + " (ID: " + c.getCourseId() + ")");
                }
            }
        }


    }


}
