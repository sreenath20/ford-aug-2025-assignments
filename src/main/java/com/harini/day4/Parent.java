package com.harini.day4;

import java.util.Objects;

public class Parent {
    public int data1 = 100;
    public Parent() {}
    public void display(){
        System.out.println("This is Parent");
    }
    public void print(){
        System.out.println("This is Parent not overriden");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent = (Parent) o;
        return data1 == parent.data1;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(data1);
    }
}
