package com.assignment5_polymorphism.assignment1;

public class Driver {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        // Test integer addition
        int intSum = mathOps.add(5, 10);
        System.out.println("Integer addition: " + intSum); // Output: 15

        // Test double addition
        double doubleSum = mathOps.add(5.5, 10.2);
        System.out.println("Double addition: " + doubleSum); // Output: 15.7

        // Test array addition
        int[] arr = {1, 2, 3, 4, 5};
        int arraySum = mathOps.add(arr);
        System.out.println("Array addition: " + arraySum); // Output: 15
    }
}
