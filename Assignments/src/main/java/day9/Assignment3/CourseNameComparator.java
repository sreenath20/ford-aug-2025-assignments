package day9.Assignment3;

import java.util.Comparator;

public class CourseNameComparator implements Comparator<Course> {
    @Override
    public int compare(Course c1, Course c2) {
        return c1.getCourseName().compareToIgnoreCase(c2.getCourseName());
    }
}
