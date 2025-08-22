package com.ford.assignment6.hr;


public class HRPortal {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("Name: " + emp.name);
        System.out.println("Employee ID: " + emp.employeeId);
        System.out.println("Department: " + emp.department);
        // System.out.println("Salary: " + emp.salary);     //compile error
        System.out.println("Salary via method: " + emp.getSalary());
    }
}
