package com.ford.assignment2;

public class TaxCalculator {

        public static void main(String[] args) {
            double[] incomes = {200000, 350000, 750000, 1500000, 250000};

            for (double income : incomes) {
                double taxPercent;
                double taxAmount;

                if (income <= 250000) {
                    taxPercent = 0.0;
                } else if (income <= 500000) {
                    taxPercent = 5.0;
                } else if (income <= 1000000) {
                    taxPercent = 20.0;
                } else {
                    taxPercent = 30.0;
                }

                taxAmount = (taxPercent / 100) * income;

                System.out.printf("Income: ₹%.2f, Tax: %.1f%%, Tax Amount: ₹%.2f%n", income, taxPercent, taxAmount);
            }
        }


}
