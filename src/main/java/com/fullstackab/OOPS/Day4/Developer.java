package com.fullstackab.OOPS.Day4;

public class Developer extends EmployeeData {

    private double projectAllowance = 1000.00;

    public double calculateSalary(){
        employeeSalary = super.employeeSalary + this.projectAllowance;
        return employeeSalary;
    }

}
