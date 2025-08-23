package com.assignment3_encapsulation.assignment4;

public class Professor extends Person {
    private int employeeid;
    private String subjecttaught;

    public Professor(int employeeid,String name, String email, int age,  String subjecttaught) {
        super(name,email, age);
        this.employeeid = employeeid;
        this.subjecttaught = subjecttaught;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getSubjecttaught() {
        return subjecttaught;
    }

    public void setSubjecttaught(String subjecttaught) {
        this.subjecttaught = subjecttaught;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + getName() + '\'' +
                ", employeeid=" + employeeid +
                ", email='" + getEmail() + '\'' +
                ", age=" + getAge() +
                ", subjecttaught='" + subjecttaught + '\'' +
                '}';
    }
}
