package day8.Assignment4;

import java.util.Comparator;

public class RollnoComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollNo.compareTo(o2.rollNo);
    }
}
