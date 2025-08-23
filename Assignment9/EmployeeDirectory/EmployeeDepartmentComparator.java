package Assignment9.EmployeeDirectory;

import java.util.Comparator;

public class EmployeeDepartmentComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int deptCompare = e1.getDepartment().compareToIgnoreCase(e2.getDepartment());
        if (deptCompare != 0) {
            return deptCompare;
        }
        return Integer.compare(e1.getId(), e2.getId());
    }
}
