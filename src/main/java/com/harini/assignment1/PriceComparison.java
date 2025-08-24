package com.harini.assignment1;

import java.util.Scanner;

public class PriceComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price1: ");
        Double price1 = Double.parseDouble(input.next());
        System.out.print("Enter the price2: ");
        Double price2 = Double.parseDouble(input.next());
        System.out.print("Enter the price3: ");
        Double price3 = Double.parseDouble(input.next());
        Double highestPrice = (price1>price2)?((price1>price3)?price1:price3):((price2>price3)?price2:price3);
        Double lowestPrice = (price1<price2)?((price1<price3)?price1:price3):((price2<price3)?price2:price3);
        Double percentage = ((highestPrice - lowestPrice)/highestPrice)*100;
        System.out.println("Highest Price: "+highestPrice);
        System.out.println("Lowest Price: "+lowestPrice);
        System.out.println("Percentage: "+percentage);

    }
}
