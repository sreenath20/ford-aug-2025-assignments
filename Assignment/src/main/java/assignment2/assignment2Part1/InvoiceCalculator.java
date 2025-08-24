package assignment2.assignment2Part1;

import java.util.Scanner;

public class InvoiceCalculator {
    public static void main(String[] args) {

        // Billing system for retail store
        Double totalInvoice = 0.00;
        Scanner scannername = new Scanner(System.in);

        for (int j = 1; j <= 5; j++) {

            System.out.println("Kindly provide the price of item" + j);
            Double invoiceAmount = scannername.nextDouble();
            totalInvoice += invoiceAmount;
        }
        System.out.println("Total price is " + totalInvoice);

    }
}
