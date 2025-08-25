package com.assignments.assignment6_1.HRPortal;

public class Employee {
    private Double salary;
    Integer employeeId;
    protected String department;

    public Employee(Integer employeeId,String department,Double salary){
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;

    }
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
