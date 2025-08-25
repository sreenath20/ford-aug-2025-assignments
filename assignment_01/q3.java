package assignment_01;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Assignment 3: E-Commerce Price Comparison Engine
        /*Take product prices from 3 websites. Find the lowest, highest, and price difference percentage
using arithmetic and comparison operators. Use ternary operators for clean logic and wrapper
classes for input parsing. Print all prices, best deal, and difference %.*/
        System.out.println("##########    E-Commerce Price Comparison Engine    ##########\n");

        System.out.print("Enter the Product Name: ");
        String productName=sc.nextLine();
        System.out.println("Enter the Price of Product from three Websites! ");
        System.out.println("Price from website 1: ");
        Double pricefromWebsite1=sc.nextDouble();
        System.out.println("Price from website 2: ");
        Double pricefromWebsite2=sc.nextDouble();
        System.out.println("Price from website 3: ");
        Double pricefromWebsite3=sc.nextDouble();
        Double minPrice= Math.min((Math.min(pricefromWebsite1,pricefromWebsite2)),pricefromWebsite3);
        Double maxPrice= Math.max((Math.max(pricefromWebsite1,pricefromWebsite2)),pricefromWebsite3);
        Double difference= maxPrice - minPrice;
        Double differencePercentage= ((maxPrice-minPrice)/((maxPrice+minPrice)/2))*100.0;
        System.out.printf("\nDifference: %.2f",difference);
        System.out.println("\nPrice from website 1: "+pricefromWebsite1);
        System.out.println("Price from website 2: "+pricefromWebsite2);
        System.out.println("Price from website 3: "+pricefromWebsite3);
        System.out.print("\n"+"BEST DEAL PRICE!"+minPrice);
        System.out.printf("\nDifferent Percentage: %.2f", differencePercentage);

    }
}
