package com.assignments.assignment5;

public class MathOperations {
    Integer add(Integer a, Integer b) {
        return a + b;
    }

    Double add(Double a, Double b) {
        return a + b;
    }

    Integer[] add(Integer[] a, Integer[] b) {
        if (a.length != b.length) return null;
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + b[i];
        }
        return a;
    }
}
