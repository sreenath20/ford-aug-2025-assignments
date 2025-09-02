package assignment_08.student_result_management;

import java.util.Comparator;

public class RollNoComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.rollNo, s2.rollNo);
    }
}
