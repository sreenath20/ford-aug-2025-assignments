package com.assignment5_polymorphism.assignment1;

public class MathOperations {
    public  int add(int a, int b) {
        return a+b;
    }
    public double add(double a , double b) {
        return a+b;
    }
    public int add(int[] arr)   {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
