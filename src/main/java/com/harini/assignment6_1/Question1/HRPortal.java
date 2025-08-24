package com.harini.assignment6_1.Question1;

public class HRPortal {
    public static void main(String[] args) {
        Employee employee = new Employee(75000,"IT","hr33");
        employee.getSalary();
        employee.department = "VSEM";
        System.out.println(employee.employeeId);
    }
}
