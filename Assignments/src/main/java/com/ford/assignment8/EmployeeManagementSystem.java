package com.ford.assignment8;

import java.util.ArrayList;
import java.util.Scanner;



public class EmployeeManagementSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Search Employee by ID");
            System.out.println("5. Display All Employees");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    Employee emp = new Employee(id, name, dept, salary);
                    if (!employees.contains(emp)) {
                        employees.add(emp);
                        System.out.println("Employee added.");
                    } else {
                        System.out.println("Employee with this ID already exists.");
                    }
                }
                case 2 -> {
                    System.out.print("Enter ID to update: ");
                    int id = sc.nextInt();
                    Employee temp = new Employee(id, "", "", 0);
                    int index = employees.indexOf(temp);
                    if (index != -1) {
                        Employee emp = employees.get(index);
                        System.out.print("Update Department (current: " + emp.department + "): ");
                        sc.nextLine(); // consume newline
                        emp.department = sc.nextLine();
                        System.out.print("Update Salary (current: " + emp.salary + "): ");
                        emp.salary = sc.nextDouble();
                        System.out.println("Employee updated.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                }
                case 3 -> {
                    System.out.print("Enter ID to delete: ");
                    int id = sc.nextInt();
                    Employee temp = new Employee(id, "", "", 0);
                    if (employees.remove(temp)) {
                        System.out.println("Employee removed.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter ID to search: ");
                    int id = sc.nextInt();
                    Employee temp = new Employee(id, "", "", 0);
                    if (employees.contains(temp)) {
                        int index = employees.indexOf(temp);
                        System.out.println("Employee found: " + employees.get(index));
                    } else {
                        System.out.println("Employee not found.");
                    }
                }
                case 5 -> {
                    System.out.println("All Employees:");
                    for (Employee e : employees) {
                        System.out.println(e);
                    }
                }
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}
