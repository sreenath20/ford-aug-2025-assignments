package com.fullstackab.OOPS.Day4;

public class Manager extends EmployeeData {

    private double bonus = 1000.00 ;

    public Manager() {
      //  super.employeeSalary;
        this.bonus = bonus;
    }


    public double calculateSalary(){
        employeeSalary = super.employeeSalary + this.bonus;
        return employeeSalary;
    }
}
