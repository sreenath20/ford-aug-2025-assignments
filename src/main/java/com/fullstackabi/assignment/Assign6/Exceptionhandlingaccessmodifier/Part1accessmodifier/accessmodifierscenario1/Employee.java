package com.fullstackabi.assignment.Assign6.Exceptionhandlingaccessmodifier.Part1accessmodifier.accessmodifierscenario1;

public class Employee {
    //private - access only within this class only
    private Double salary;

    //default - package-private
    int empID;

    // access in the child class same or diff package
    protected String dept;

    //public access from anywhere
    public String name;

    public Employee(Double salary, int empID, String dept, String name) {
        this.salary = salary;
        this.empID = empID;
        this.dept = dept;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", empID=" + empID +
                ", dept='" + dept + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
