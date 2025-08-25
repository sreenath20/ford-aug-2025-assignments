package com.demo.Assignment5;

public class MathOperation {
    int add(int a,int b)
    {
        return a+b;
    }
    double add(double a,double b)
    {
        return (a+b);
    }
    int add(int[]arrayOfNumber){
        int sum=0;
        for(int k:arrayOfNumber){
            sum=sum+k;
        }

    return sum;
    }

}

