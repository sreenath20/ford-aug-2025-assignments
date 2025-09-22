package javatopic.day10_collections_set.assignments.assignment1;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getId().compareTo(e2.getId());
    }
}
