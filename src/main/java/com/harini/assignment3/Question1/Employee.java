package com.harini.assignment3.Question1;

public class Employee { // This is POJO class - plain old java object, no writing any business logic rather just simply hold the data
   // This class is an example of encapsulation
    private String name;
    private String department;
    private String id;
    private double salary;
    //Default constructor
    public Employee(){};
    //Parameterized constructor
    public Employee(String name, String department, String id,double salary) {
        this.name = name;
        this.department = department;
        this.id = id;
        this.salary = salary;
    }

    public String getEmail() {
        return department;
    }

    public void setEmail(String email) {
        this.department = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + department + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
