package com.assignment1_wrapperclass;

import java.util.*;
public class Assignment3 {
    public static void main(String[] args) {
            Integer[] productPrice =new Integer[3];
            String[] productName = new String[3];
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < productPrice.length; i++) {
                System.out.println("Enter the product name: ");
                productName[i] = input.next();
                System.out.println("Enter the product price: ");
                productPrice[i] = input.nextInt();
            }
            // Minimum price
            int minprice=productPrice[0];
            int maxprice=productPrice[0];
            short minproduct=0;
            short maxproduct=0;
            for(short i=1;i<3;i++) {
                if(productPrice[i]<minprice) {
                    minprice=productPrice[i];
                    minproduct=i;
                }
                if (productPrice[i] > maxprice) {
                    maxprice = productPrice[i];
                    maxproduct=i;
                }
            }
            System.out.println("Product prices are: " + Arrays.toString(productPrice));
            System.out.println("Product name are: " + Arrays.toString(productName));
            System.out.println("Minimum price is: " + minprice+ " for the product: " + productName[minproduct]);
            System.out.println("Maximum price is: " + maxprice + " for the product: " + productName[maxproduct]);
            System.out.println("Enter the original prices of the product");
            Double originalPrice=input.nextDouble();
            for(short i=0;i<3;i++) {
               Double priceDifference= ((originalPrice-productPrice[i])/originalPrice)*100;
                System.out.printf("Price difference for %s is %.2f%%\n", productName[i], priceDifference);
            }

    }
}
