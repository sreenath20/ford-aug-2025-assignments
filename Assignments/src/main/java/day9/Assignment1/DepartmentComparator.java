package day9.Assignment1;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        int deptCompare = e1.getDepartment().compareToIgnoreCase(e2.getDepartment());
        if (deptCompare != 0) {
            return deptCompare;
        }
        return Integer.compare(e1.getId(), e2.getId());

    }
}
