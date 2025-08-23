package com.oops.day7;

public class Driver {
    public String name = "ford";

    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.name);
        parent.name = "toyota";
        System.out.println(parent.name);
        // parent.password="1234";  private data members cannot be accessed outside the clas
        // parent.display();  private methods cannot be accessed outside the class
        parent.help();
    }
}
