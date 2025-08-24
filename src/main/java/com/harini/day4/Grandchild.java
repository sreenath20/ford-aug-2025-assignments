package com.harini.day4;

public class Grandchild extends Child{
    public Grandchild(){

    }
    public void display(){
        System.out.println("This is Grandchild");
        super.display();
    }

    @Override
    public void info() {
        System.out.println("This is Grandchild info");
        super.info();
    }
    public void detail(){
        System.out.println("This is Grandchild detail");
    }
}
