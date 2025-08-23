package com.fullstackabi.assignment.Assign6.Exceptionhandlingaccessmodifier.Part1accessmodifier;

import com.fullstackabi.assignment.Assign6.Exceptionhandlingaccessmodifier.Part1accessmodifier.accessmodifierscenario1.Employee;

public class Manager extends Employee {

    public Manager(Double salary, int empID, String dept, String name) {
        super(salary, empID, dept, name);
    }

    public void getDeptReport() {
        System.out.println("Employee Name is " + this.name);
        // empID default cannot be accessed in diff package
        //System.out.println("Employee ID is " this.empID);
        System.out.println("Employee Dept is " + this.dept);
        System.out.println("Employee salary is " +this.getSalary());
    }
}
