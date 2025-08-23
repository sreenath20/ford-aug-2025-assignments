package Assignment9.EmployeeDirectory;


import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new HashSet<>();

        // Add employees
        employeeSet.add(new Employee(1, "Alice", "HR"));
        employeeSet.add(new Employee(2, "Bob", "IT"));
        employeeSet.add(new Employee(3, "Charlie", "Finance"));
        employeeSet.add(new Employee(2, "Bob Duplicate", "IT")); // won't be added (duplicate ID)
        displayEmployees(employeeSet);

        // Remove employee by ID
        employeeSet.removeIf(e -> e.getId() == 3);
        System.out.println("\nAfter Removing ID 3:");
        displayEmployees(employeeSet);

        // Update department of employee with ID 2
        for (Employee e : employeeSet) {
            if (e.getId() == 2) {
                e.setDepartment("Support");
                break;
            }
        }

        System.out.println("\nAfter Updating Department of ID 2:");
        displayEmployees(employeeSet);

        // Search by ID
        int searchId = 1;
        System.out.println("\nSearch by ID " + searchId + ":");
        for (Employee e : employeeSet) {
            if (e.getId() == searchId) {
                System.out.println(e);
            }
        }

        // Search by Department
        String searchDept = "Support";
        System.out.println("\nEmployees in Department: " + searchDept);
        for (Employee e : employeeSet) {
            if (e.getDepartment().equalsIgnoreCase(searchDept)) {
                System.out.println(e);
            }
        }

        // Sort by Name
        List<Employee> sortedByName = new ArrayList<>(employeeSet);
        sortedByName.sort(new EmployeeNameComparator());
        System.out.println("\nEmployees Sorted by Name:");
        displayEmployees(sortedByName);

        // Sort by Department then ID
        List<Employee> sortedByDeptId = new ArrayList<>(employeeSet);
        sortedByDeptId.sort(new EmployeeDepartmentComparator());
        System.out.println("\nEmployees Sorted by Department then ID:");
        displayEmployees(sortedByDeptId);
    }

    public static void displayEmployees(Collection<Employee> employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
