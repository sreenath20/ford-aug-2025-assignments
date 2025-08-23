package com.oops.day6.interfaces;

public interface A {
    static String name="ford";
    Integer data=205;


    void display();
    static void info() { //utility method
        System.out.println("This is a static method in interface A");

    }
    default void function() { //default method
        System.out.println("This is a default method in interface A");
    }
}
