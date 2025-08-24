package com.harini.day4;

import com.harini.assignment3.Question1.Employee;

public class Developer extends Employee {
    String name = getName();
    String email = getEmail();
    String id = getId();
    double salary = getSalary();
    double projectAllowance ;
    public Developer(String name,String email,String id,double salary,double projectAllowance) {
        super(name,email,id,salary);
        this.projectAllowance = projectAllowance;
    }
//    public double calculateSalary() {
//        return super.calculateSalary() + this.projectAllowance;
//    }
}
