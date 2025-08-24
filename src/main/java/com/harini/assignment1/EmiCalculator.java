package com.harini.assignment1;

import java.util.Scanner;

public class EmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer Tenure = input.nextInt();
        Double Principal = input.nextDouble();
        Float Rate = input.nextFloat();
        Float intermidiate=1.0f;
        for(int i=0; i<Tenure; i++){
            intermidiate *= (1+Rate);
        }
        System.out.println("Intermediate Value: "+intermidiate);
        Float EMI = (float) (Principal*Rate*intermidiate)/(intermidiate-1);
        EMI = Math.round(EMI*100)/100.0f;
        System.out.println("EMI: "+EMI);
    }
}
