package com.harini.day4;

public class Child extends Parent{
    public int data1 = 120;
    public Child(){
        super();
    }
    public void display(){
        System.out.println("This is Child");
        super.display();
    }
    public void info(){
        System.out.println("This is Child info");
    }
}
