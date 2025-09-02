package assignment_09.employee_directory;

import java.util.Comparator;

public class DeptIDComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        int deptCompare = e1.department.compareTo(e2.department);
        if (deptCompare == 0) {
            return Integer.compare(e1.id, e2.id);
        }
        return deptCompare;
    }
}
