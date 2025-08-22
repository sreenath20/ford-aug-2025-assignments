package com.fullstackab.OOPS.Day4;

public class Employee { // POJO (Plain Old Java Object)
    //data members
    private String name;
    private String email;
    private String id;
    private String gender;

    //constructor
    public Employee() { // default constructor
    }

    // Parameterized Constructor
    public Employee(String name, String email, String id, String gender) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.gender = gender;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}


