package com.assignment8_collections.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Employee> employeelist = new ArrayList<>();
        employeelist.add(new Employee(3, "aaa", "IT", (double)50000.0F));
        employeelist.add(new Employee(2, "bbb", "HR", (double)60000.0F));
        employeelist.add(new Employee(4, "ccc", "Finance", (double)70000.0F));
        System.out.println("employee list");
        System.out.println(employeelist);
        System.out.println("Sorting employee list by id");
        Collections.sort(employeelist);
        System.out.println(employeelist);
        String choice;

        while(true) {
            System.out.println("enter choice 1)update  2)delete 3)exit");
            choice = input.nextLine();
            if (choice.equals("update")) {
                System.out.println("enter id to update");
                Integer id = input.nextInt();
                input.nextLine();

                for(Employee e : employeelist) {
                    if (e.getId().equals(id)) {
                        System.out.println("enter new name");
                        String name = input.nextLine();
                        e.setName(name);
                        System.out.println("enter new department");
                        String department = input.nextLine();
                        e.setDepartment(department);
                        System.out.println("enter new salary");
                        Double salary = input.nextDouble();
                        input.nextLine(); // consume the newline character
                        e.setSalary(salary);
                        System.out.println("Employee updated: " + e);
                        break; // exit the loop after updating
                    }
                }
            } else if (choice.equals("exit")) {
                Collections.sort(employeelist);
                Employee e1 = new Employee(3, "aba", "IT", (double)50000.0F);
                System.out.println("employee id 3 exists at index: " + employeelist.indexOf(e1));
                System.out.println("employee id 3 exists: " + employeelist.contains(e1));
                return;
            } else if (choice.equals("delete")) {
                System.out.println("enter id to delete");
                Integer id = input.nextInt();
                input.nextLine(); // consume the newline character

                boolean found = false;
                for(int i = 0; i < employeelist.size(); i++) {
                    Employee e = employeelist.get(i);
                    if (e.getId().equals(id)) {
                        System.out.println("Employee found: " + e);
                        employeelist.remove(i);
                        found = true;
                        break; // exit the loop after deleting
                    }
                }

                if (found) {
                    System.out.println("Employee with id " + id + " deleted.");
                } else {
                    System.out.println("Employee with id " + id + " not found.");
                }
            } else {
                System.out.println("Invalid choice, please try again.");
            }

            System.out.println(employeelist);
        }
    }
}