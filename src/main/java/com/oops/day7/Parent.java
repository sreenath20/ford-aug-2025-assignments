package com.oops.day7;

public class Parent {
    Parenttwo ptwo=new Parenttwo();
    public String name="ford";
    private String password="1234";
    private void display() {
        System.out.println("display method");
    }
    public void help() {
        display();
        System.out.println("password is "+ password);
    }
}
class Parenttwo {

}
