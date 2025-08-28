package com.demo.day4;

public class Child extends Parent {

    Integer data=10;

    public Child() {
        super();
    }

    public void display() {
        System.out.println("Child Display data : "+this.data);
        System.out.println("Child Display parent data : "+super.data);
        super.display();
    }

    public void info(){
        System.out.println("Child Info");
    }

}
