package assignment_09.employee_directory;

import java.util.*;

public class EmployeeDirectory {
    private static HashSet<Employee> employees = new HashSet<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nEmployee Directory System\n");

        employees.add(new Employee(101, "Rajesh Kumar", "IT"));
        employees.add(new Employee(102, "Priya Sharma", "HR"));
        employees.add(new Employee(103, "Amit Singh", "Finance"));
        employees.add(new Employee(104, "Neha Gupta", "IT"));

        while (true) {
            System.out.println("\n1. Add  2. Remove  3. Update  4. View All  5. Search  6. Sort  7. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: addEmployee(); break;
                case 2: removeEmployee(); break;
                case 3: updateEmployee(); break;
                case 4: viewAllEmployees(); break;
                case 5: searchMenu(); break;
                case 6: sortMenu(); break;
                case 7: System.out.println("Exited Successfully!"); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    private static void addEmployee() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Employee newEmp = new Employee(id, "", "");
        if (employees.contains(newEmp)) {
            System.out.println("Employee ID already exists!");
            return;
        }

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Department: ");
        String dept = scanner.nextLine();

        employees.add(new Employee(id, name, dept));
        System.out.println("Employee added!");
    }

    private static void removeEmployee() {
        System.out.print("Enter ID to remove: ");
        int id = scanner.nextInt();

        Employee toRemove = new Employee(id, "", "");
        if (employees.remove(toRemove)) {
            System.out.println("Employee removed!");
        } else {
            System.out.println("Employee not found!");
        }
    }

    private static void updateEmployee() {
        System.out.print("Enter ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Employee emp : employees) {
            if (emp.id == id) {
                System.out.print("New Department: ");
                emp.department = scanner.nextLine();
                System.out.println("Department updated!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    private static void viewAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees!");
            return;
        }

        System.out.println("\nAll Employees:");
        int count = 1;
        for (Employee emp : employees) {
            System.out.print(count + ". ");
            emp.displayEmployee();
            count++;
        }
    }

    private static void searchMenu() {
        System.out.println("\n1. Search by ID  2. Search by Department");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1: searchById(); break;
            case 2: searchByDepartment(); break;
            default: System.out.println("Invalid choice!");
        }
    }

    private static void searchById() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();

        for (Employee emp : employees) {
            if (emp.id == id) {
                System.out.println("Found:");
                emp.displayEmployee();
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    private static void searchByDepartment() {
        System.out.print("Enter Department: ");
        String dept = scanner.nextLine();

        boolean found = false;
        System.out.println("Employees in " + dept + ":");
        for (Employee emp : employees) {
            if (emp.department.equalsIgnoreCase(dept)) {
                emp.displayEmployee();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found in this department!");
        }
    }

    private static void sortMenu() {
        System.out.println("\n1. Sort by Name  2. Sort by Department then ID");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        ArrayList<Employee> sortedList = new ArrayList<>(employees);

        switch (choice) {
            case 1:
                Collections.sort(sortedList, new NameComparator());
                System.out.println("Sorted by Name:");
                break;
            case 2:
                Collections.sort(sortedList, new DeptIDComparator());
                System.out.println("Sorted by Department then ID:");
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        int count = 1;
        for (Employee emp : sortedList) {
            System.out.print(count + ". ");
            emp.displayEmployee();
            count++;
        }
    }
}
