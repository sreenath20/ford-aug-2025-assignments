package assignment_08.employee_management_system;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nEmployee Management System \n");

        employees.add(new Employee(101, "Rajesh Kumar", "IT", 50000));
        employees.add(new Employee(102, "Priya Ravi", "HR", 45000));
        employees.add(new Employee(103, "Amit Singh", "Finance", 55000));

        while (true) {
            System.out.println("\n1. Add  2. Update  3. Delete  4. Search  5. Display  6. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: addEmployee(); break;
                case 2: updateEmployee(); break;
                case 3: deleteEmployee(); break;
                case 4: searchEmployee(); break;
                case 5: displayAllEmployees(); break;
                case 6: System.out.println("Exited Successfully!"); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    private static void addEmployee() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (employees.contains(new Employee(id, "", "", 0))) {
            System.out.println("ID already exists!");
            return;
        }
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Department: ");
        String dept = scanner.nextLine();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        employees.add(new Employee(id, name, dept, salary));
        System.out.println("Employee added!");
    }

    private static void updateEmployee() {
        System.out.print("Enter ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                System.out.print("New Department: ");
                emp.setDepartment(scanner.nextLine());
                System.out.print("New Salary: ");
                emp.setSalary(scanner.nextDouble());
                System.out.println("Updated!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    private static void deleteEmployee() {
        System.out.print("Enter ID to delete: ");
        int id = scanner.nextInt();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.remove(i);
                System.out.println("Deleted!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    private static void searchEmployee() {
        System.out.print("Enter ID to search: ");
        int id = scanner.nextInt();
        Employee searchEmp = new Employee(id, "", "", 0);
        if (employees.contains(searchEmp)) {
            int index = employees.indexOf(searchEmp);
            System.out.println("Found at position: " + (index + 1));
            employees.get(index).displayEmployee();
        } else {
            System.out.println("Not found!");
        }
    }

    private static void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees!");
            return;
        }
        System.out.println("\nAll Employees:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.print((i + 1) + ". ");
            employees.get(i).displayEmployee();
        }
    }
}
