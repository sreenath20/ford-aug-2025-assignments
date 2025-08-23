package com.assignment6_part1.assignment1.package1;

public class HRPortal {
    public  HRPortal(double salary, String employeeID,String name, String department) {
        Employee employee = new Employee(salary, employeeID,name, department);
        System.out.println("within the package you can acces private , protected , default, public data member");
        System.out.println("Employee ID: " + employee.EmployeeID);
        System.out.println("Department: " + employee.Department);
        System.out.println("Name: " + employee.name);
        System.out.println("Salary: " + employee.getSalary());
    }

}
