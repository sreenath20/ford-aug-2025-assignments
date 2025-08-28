package com.assignment.day6;

class MathOperations{

    public int add(int a, int b) {
        return a + b;
    }

    public Double add(Double a, Double b) {
        return a + b;
    }

    public int[] add(int[] a, int[] b){
        int[] result = new int[a.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = a[i] + b[i];
        }
        return result;
    }
}

public class Day6Assignment1 {
    public static void main(String[] args) {

        MathOperations mathOps = new MathOperations();

        // Test adding two integers
        int intResult = mathOps.add(5, 10);
        System.out.println("Sum of integers: " + intResult); // Output: 15

        // Test adding two doubles
        Double doubleResult = mathOps.add(5.5, 10.2);
        System.out.println("Sum of doubles: " + doubleResult); // Output: 15.7

        // Test adding two integer arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] arrayResult = mathOps.add(array1, array2);

        System.out.print("Sum of integer arrays: ");
        for (int num : arrayResult) {
            System.out.print(num + " "); // Output: 5 7 9
        }

    }
}
