package com.ford.assignment9;


import java.util.*;

class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {      return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", department='" + department + '\'' + '}';
}
}

class EmployeeDirectory {
    private Set<Employee> employees = new HashSet<>();

    public boolean addEmployee(Employee emp) {
        return employees.add(emp);
    }

    public boolean removeEmployee(int id) {
        return employees.removeIf(emp -> emp.getId() == id);
    }

    public boolean updateDepartment(int id, String newDept) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                emp.setDepartment(newDept);
                return true;
            }
        }
        return false;
    }

    public void viewAllEmployees() {
        employees.forEach(System.out::println);
    }

    public Employee findById(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) return emp;
        }
        return null;
    }

    public List<Employee> findByDepartment(String dept) {
        List<Employee> result = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getDepartment().equalsIgnoreCase(dept)) {
                result.add(emp);
            }
        }
        return result;
    }

    public List<Employee> sortByName() {
        List<Employee> sorted = new ArrayList<>(employees);
        sorted.sort(Comparator.comparing(Employee::getName));
        return sorted;
    }

    public List<Employee> sortByDeptThenId() {
        List<Employee> sorted = new ArrayList<>(employees);
        sorted.sort(Comparator.comparing(Employee::getDepartment)
                .thenComparing(Employee::getId));
        return sorted;
    }
}

public class EmployeeDirectoryApp {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        directory.addEmployee(new Employee(1, "loke", "HR"));
        directory.addEmployee(new Employee(2, "Babu", "IT"));
        directory.addEmployee(new Employee(3, "Chandru", "Finance"));
        directory.addEmployee(new Employee(4, "maha", "IT"));

        System.out.println("All Employees:");
        directory.viewAllEmployees();

        System.out.println("\nFind by ID (2):");
        System.out.println(directory.findById(2));

        System.out.println("\nEmployees in IT:");
        directory.findByDepartment("IT").forEach(System.out::println);

        System.out.println("\nSorted by Name:");
        directory.sortByName().forEach(System.out::println);

        System.out.println("\nSorted by Department then ID:");
        directory.sortByDeptThenId().forEach(System.out::println);

        System.out.println("\nUpdating Department of ID 3 to 'IT'");
        directory.updateDepartment(3, "IT");

        System.out.println("\nRemoving Employee with ID 1");
        directory.removeEmployee(1);

        System.out.println("\nFinal Employee List:");
        directory.viewAllEmployees();
    }
}
