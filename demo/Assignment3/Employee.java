package com.demo.Assignment3;
//----------------------Assignment 1-------------------------
public class Employee {
    private String name;
    private String dept;
    private int id;
    private double salary;
    public Employee(String name, String dept, int id, double salary) {
        this.name = name;
        this.dept = dept;
        this.id = id;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;

    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;

    }
    public double getSalary() {
        return salary;

    }
    public void setSalary(double salary) {
        this.salary = salary;

    }


}
