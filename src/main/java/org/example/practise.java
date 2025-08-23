package org.example;
import java.util.Scanner;
public class practise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Product Name: ");
        String productName=sc.next();
        System.out.println("Enter the Price of Product from three Websites! ");
        System.out.println("Price from website 1: ");
        Double pricefromWebsite1=sc.nextDouble();
        System.out.println("Price from website 2: ");
        Double pricefromWebsite2=sc.nextDouble();
        System.out.println("Price from website 3: ");
        Double pricefromWebsite3=sc.nextDouble();
        Double minPrice= Math.min((Math.min(pricefromWebsite1,pricefromWebsite2)),pricefromWebsite3);
        Double maxPrice= Math.max((Math.min(pricefromWebsite1,pricefromWebsite2)),pricefromWebsite3);
        Double difference= maxPrice - minPrice;
        Double differencePercentage=(maxPrice-minPrice)/100.0;
        System.out.println("Difference: "+difference);
        System.out.println("Price from website 1: "+pricefromWebsite1);
        System.out.println("Price from website 2: "+pricefromWebsite2);
        System.out.println("Price from website 3: "+pricefromWebsite3);
        System.out.println("Best Deal Price: "+minPrice);
        System.out.printf("%.2f%n Different Percentage: " ,differencePercentage);
    }
}
