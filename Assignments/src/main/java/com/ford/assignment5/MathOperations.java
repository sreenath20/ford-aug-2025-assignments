package com.ford.assignment5;
class MathOperations {


    public int add(int a, int b) {
        return a + b;
    }


    public double add(double a, double b) {
        return a + b;
    }


    public int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Add integers: " + math.add(5, 10));
        System.out.println("Add doubles: " + math.add(5.5, 3.2));
        System.out.println("Add array: " + math.add(new int[]{1, 2, 3, 4}));
    }
}
