package com.demo.day5;

public class C implements A,B {


    @Override
    public void displayB() {
        System.out.println("Dipaly B implementation");
    }

    @Override
    public void displayA() {
        System.out.println("Dipaly A implementation");
    }
}
