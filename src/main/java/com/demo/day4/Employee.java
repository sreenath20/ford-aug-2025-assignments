package com.demo.day4;

public class Employee { //POJO : plain old java object
    //just to store the data no business logic

    //Data Members
    private String name;
    private String email;
    private String id;
    protected Double basicsalary;

    public Employee() {
    }

    public Employee(String name, String email, String id, Double basicsalary) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.basicsalary = basicsalary;
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

    public Double getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(Double basicsalary) {
        this.basicsalary = basicsalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                ", basicsalary=" + basicsalary +
                '}';
    }

    public Double calculatesalary(){
        return this.basicsalary;
    }

}
