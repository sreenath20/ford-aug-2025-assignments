package com.oops.day6.interfaces;

public class C implements A {

    @Override
    public void display() {
        System.out.println("Display name "+A.name);
        System.out.println("Display data "+ data);

    }
    public void function() {
        System.out.println("This is a default method in class C, overriding A's default method");
    }


}
