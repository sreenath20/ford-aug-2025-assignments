package javatopic.day2.assignments;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        Double principal = sc.nextDouble(); //p
        System.out.print("Enter the annual interest rate: ");
        Float Interest_rate = sc.nextFloat()/100;//r
        System.out.print("Enter the tensure: ");
        Integer Tensure=sc.nextInt();//n


        Double EMI;
        Double Numerator;
        Double Denominator;
        Double second=Math.pow((1.0+Interest_rate),Tensure);
        Numerator=principal*Interest_rate *(second);
        Denominator=second-1;
        EMI=Numerator/Denominator;
        System.out.printf("EMI: %.2f%n", EMI);


    }
}
