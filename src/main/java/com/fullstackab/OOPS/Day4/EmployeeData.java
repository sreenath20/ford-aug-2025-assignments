package com.fullstackab.OOPS.Day4;

public class EmployeeData {

    int employeeId;
    String employeeName;
    String employeeDesignation;
    Double employeeSalary;

    public EmployeeData() {
    }

    public EmployeeData(int employeeId, String employeeName, String employeeDesignation, Double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
        this.employeeSalary = employeeSalary;
    }

    public double calculateSalary(){
        System.out.println("Employee salary is : " + this.employeeSalary);
        return employeeSalary;
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}