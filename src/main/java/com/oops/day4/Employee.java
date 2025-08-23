package com.oops.day4;

public class Employee {
    private String name;
    private String email;
    private String empid;


    public Employee() {

    }
    public Employee( String name, String email, String empid) {
        this.name = name;
        this.email = email;
        this.empid = empid;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", empid='" + empid + '\'' +
                '}';
    }
}
