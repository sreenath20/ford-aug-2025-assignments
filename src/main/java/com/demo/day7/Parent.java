package com.demo.day7;

public class Parent {
    ParentTwo parentTwo = new ParentTwo();
    public String name="Ford";
    private String password = "123@India";
    // default modifier  = package protected
    String city = "Cennai"; // default modifier
    protected String address="India";

    private void display(){
        System.out.println("Am parent");
    }
    public void help(){// this reference is passed implicitly
        this.display();
        System.out.println("password"+this.password);
        System.out.println("password"+this.city);
        System.out.println("password"+this.address);
    }
}

class ParentTwo {
}