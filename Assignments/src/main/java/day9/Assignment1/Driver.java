package day9.Assignment1;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new HashSet<>();

        // Add employees
        employeeSet.add(new Employee("ABC", 101, "GDIA"));
        employeeSet.add(new Employee("DEF", 202, "ET"));
        employeeSet.add(new Employee("GHI", 303, "Ford Credit"));
        employeeSet.add(new Employee("JKL", 404, "ET")); // duplicate ID
        displayEmployees(employeeSet);

        // Remove employee by ID
        employeeSet.removeIf(e -> e.getId() == 303);
        System.out.println("\n---After Removing ID 303:---");
        displayEmployees(employeeSet);

        // Update department of employee with ID 2
        for (Employee e : employeeSet) {
            if (e.getId() == 202) {
                e.setDepartment("Ford Pro");
                break;
            }
        }

        System.out.println("\n---After Updating Department of ID 202:---");
        displayEmployees(employeeSet);

        // Search by ID
        int searchId = 101;
        System.out.println("\n---Search by ID ---" + searchId + ":");
        for (Employee e : employeeSet) {
            if (e.getId() == searchId) {
                System.out.println(e);
            }
        }

        // Search by Department
        String searchDept = "ET";
        System.out.println("\n---Employees in the Department---: " + searchDept);
        for (Employee e : employeeSet) {
            if (e.getDepartment().equalsIgnoreCase(searchDept)) {
                System.out.println(e);
            }
        }

        // Sort by Name
        List<Employee> sortedByName = new ArrayList<>(employeeSet);
        sortedByName.sort(new NameComparator());
        System.out.println("\n---Employees Sorted by Name:---");
        displayEmployees(sortedByName);

        // Sort by Department then ID
        List<Employee> sortedByDeptId = new ArrayList<>(employeeSet);
        sortedByDeptId.sort(new DepartmentComparator());
        System.out.println("\n---Employees Sorted by Department and then ID:---");
        displayEmployees(sortedByDeptId);
    }

    public static void displayEmployees(Collection<Employee> employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }

    }
}
