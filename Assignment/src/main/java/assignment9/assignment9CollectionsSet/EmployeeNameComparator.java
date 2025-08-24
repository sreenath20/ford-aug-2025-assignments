package assignment9.assignment9CollectionsSet;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<EmployeeDirectory> {

    public int compare(EmployeeDirectory e1, EmployeeDirectory e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
