package Assignment8.studentresultmanagement;

import java.util.Comparator;

public class SortByRollNo implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollNo(), s2.getRollNo());
    }
}

