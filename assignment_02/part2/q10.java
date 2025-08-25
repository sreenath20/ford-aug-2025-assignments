package assignment_02.part2;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----  Dynamic Tax Bracket Calculator  -----");

        System.out.println("TAX GUIDELINES\n≤ 2.5L → 0%\n" +
                "2.5L–5L → 5%\n" +
                "5L–10L → 20%\n" +
                "10L → 30%\n");

        double[] incomeArray = new double[5];

        for(int i=0;i<5;i++){
            System.out.println("Enter User"+(i+1)+" Income:");
            incomeArray[i]=sc.nextDouble();
        }
        for(int i = 0; i <5; i++){
            double income=incomeArray[i];
            byte taxRate=0;
            if(income<=250000){
                taxRate=0;
            }
            else if(income>250000 && income<=500000){
                taxRate=5;
            }
            else if(income>500000 && income<=1000000){
                taxRate=20;
            }
            else if(income>1000000){
                taxRate=30;
            }
            double taxAmount=(income*taxRate)/100;

            System.out.printf("\n-- User %d--\nIncome: %.2f\nTax Rate: %d%%\nTax Amount: %.2f\n",(i+1),income,taxRate,taxAmount);
        }
    }
}
