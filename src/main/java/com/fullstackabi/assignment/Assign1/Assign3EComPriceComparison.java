package com.fullstackabi.assignment.Assign1;

import java.util.Scanner;

public class Assign3EComPriceComparison {
    public static void main(String[] args) {

        System.out.println("E-Commerce Product Comparison");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Product Price from Amazon Website");
        Double amazonProductPrice = scan.nextDouble();
        System.out.println("Enter the Product Price from FlipKart Website");
        Double flipkartProductPrice = scan.nextDouble();
        System.out.println("Enter the Product Price from Meesho Website");
        Double meeshoProductPrice = scan.nextDouble();

        // Comparing amazon with flipkart and lower of that with meesho
        Double highPrice = amazonProductPrice > flipkartProductPrice ? amazonProductPrice : flipkartProductPrice;
        Double lowPrice = highPrice > meeshoProductPrice ?  (meeshoProductPrice > flipkartProductPrice ?  flipkartProductPrice : meeshoProductPrice) :  highPrice;
        System.out.println("High Price is :" +highPrice);
        System.out.println("Low Price is :" +lowPrice);

    }
    }
