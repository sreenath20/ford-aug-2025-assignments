package com.assignment3_encapsulation.assignment1;

public class Driver1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "aaa", 60000.0, "Mech");
        Manager mgr1 = new Manager(2, "bbb", 80000.0, "IT", 5, "Project X");

        System.out.println(emp1);
        System.out.println(mgr1);
    }
}
