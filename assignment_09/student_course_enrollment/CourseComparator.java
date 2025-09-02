package assignment_09.student_course_enrollment;

import java.util.Comparator;

public class CourseComparator implements Comparator<Course> {
    public int compare(Course c1, Course c2) {
        return c1.courseName.compareTo(c2.courseName);
    }
}
