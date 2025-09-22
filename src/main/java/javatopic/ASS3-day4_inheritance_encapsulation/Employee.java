package javatopic.day4_inheritance_encapsulation;
// this is called encapsulation

public class Employee {   //POJO plain old java object , there is no business logic in it it simple hold the data
    //data members        // Employee is the user defined data type
    private String name; // info compiler this data is not visible outside this block
    private String email;
    private String id;


    // default constructor
    public Employee() { //this function is intended for default initialization

    }

    //paramaterized constructor
    public Employee(String name, String email, String id) {   //POJO
        this.name = name;    // this is 1000 that is inturn an address
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name; // implicit name is this.name , this is reference to the memory the obj store
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


    // its a template that give a string formate
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
