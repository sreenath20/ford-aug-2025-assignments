package Assignments8_JavaCollectionList;

import java.util.ArrayList;
import java.util.Objects;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee other = (Employee) o;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("Employee{id=%d, name='%s', dept='%s', salary=%.2f}",
                id, name, department, salary);
    }
}

public class EmployeeManagement {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        // Seed with some employees
        employees.add(new Employee(101, "Alice", "Dev", 90000));
        employees.add(new Employee(102, "Bob", "QA", 70000));
        employees.add(new Employee(103, "Charlie", "DevOps", 85000));

        System.out.println("Initial employees:");
        displayAll();

        // Create (Add)
        System.out.println("\nAdding new employee (id=104)...");
        addEmployee(new Employee(104, "Diana", "Support", 60000));
        displayAll();

        // Update salary or department by id (use loop)
        System.out.println("\nUpdating employee 102 (change salary and department)...");
        // <-- fixed: pass a double literal so it matches Double parameter
        updateEmployee(102, 75000.0, "SDET");
        displayAll();

        // Delete by id (use loop)
        System.out.println("\nDeleting employee with id 103...");
        deleteEmployee(103);
        displayAll();

        // Search by id using contains() and indexOf() (requires equals)
        System.out.println("\nSearching for employee id 101 using contains() and indexOf()...");
        Employee probe = new Employee(101, "", "", 0);
        boolean found = employees.contains(probe);
        int idx = employees.indexOf(probe);
        System.out.println("contains? " + found + ", indexOf = " + idx);
        if (idx >= 0) System.out.println("Found: " + employees.get(idx));
    }

    static void addEmployee(Employee e) {
        if (!employees.contains(e)) {
            employees.add(e);
        } else {
            System.out.println("Employee with id " + e.id + " already exists.");
        }
    }

    static void updateEmployee(int id, Double newSalary, String newDepartment) {
        for (Employee e : employees) {
            if (e.id == id) {
                if (newSalary != null) e.salary = newSalary;
                if (newDepartment != null) e.department = newDepartment;
                System.out.println("Updated: " + e);
                return;
            }
        }
        System.out.println("Employee with id " + id + " not found.");
    }

    static void deleteEmployee(int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).id == id) {
                System.out.println("Removing: " + employees.get(i));
                employees.remove(i);
                return;
            }
        }
        System.out.println("Employee with id " + id + " not found.");
    }

    static void displayAll() {
        employees.forEach(System.out::println);
    }
}
