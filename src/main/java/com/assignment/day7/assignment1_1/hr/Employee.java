package com.assignment.day7.assignment1_1.hr;

public class Employee {
    private Double salary = 75000.00;
    int employeeId = 12345;
    protected String department = "Engineering";


    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
