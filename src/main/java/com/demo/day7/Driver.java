package com.demo.day7;

public class Driver { // class level modifier
    public String name = "ford"; // filed level modifier

    public static void main(String args[]) { // method level modifier
        // access modifiers
        // public
        // private
        // default
        // protected

        Parent parent = new Parent();
        System.out.println(parent.name);
        parent.name = "India";
        System.out.println(parent.name);
        // parent.password="123";// System.out.println(parent.name);
        //parent.display();//'display()' has private access in 'com.demo.day7.Parent'
        //parent.info();//Cannot resolve method 'info' in 'Parent'
        parent.help();
        parent.city = "Delhi";
        parent.address="USA";

    }
}
