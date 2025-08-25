package com.assignments.assignment6_1.Managers;

import com.assignments.assignment6_1.HRPortal.Employee;

public class Manager extends Employee {
    String projectName;

    public Manager(Integer employeeId, String department, Double salary,String projectName) {
        super(employeeId, department, salary);
        this.projectName = projectName;
    }
    public void displayDepartment(){
        System.out.println("Department : "+department);
    }
}
