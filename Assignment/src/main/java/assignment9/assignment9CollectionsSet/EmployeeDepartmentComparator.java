package assignment9.assignment9CollectionsSet;

import java.util.Comparator;

public class EmployeeDepartmentComparator implements Comparator<EmployeeDirectory> {
    public int compare(EmployeeDirectory e1, EmployeeDirectory e2) {
        return e1.getDepartment().compareTo(e2.getDepartment());
    }
}
