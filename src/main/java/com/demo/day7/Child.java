package com.demo.day7;

public class Child extends Parent{

    void diaplsy(){
        System.out.println("Public "+super.name);
        //'password' has private access in 'com.demo.day7.Parent'
        //System.out.println("private "+super.password);
        System.out.println("default "+super.city);
        System.out.println("protected "+super.address);
    }
}
