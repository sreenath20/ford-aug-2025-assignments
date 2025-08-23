package Assignment9.StudentCourseEnrollment;

import java.util.Comparator;

public class SortStudentByName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
}
