package com.fullstackab.OOPS.Day4;

import java.util.Objects;

public class Parent {
     int data=100;

    public Parent() {
    }

    public void display(){
        System.out.println("Parent Data = :" +data);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent = (Parent) o;
        return data == parent.data;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(data);
    }
}
