package com.assignment.day10_set.assignment2;

import java.util.*;

public class Day10Assignment2 {
    public static void main(String[] args) {

        Set<Product> products = new HashSet<>();
        products.add(new Product(101,"Laptop",45000));
        products.add(new Product(105,"Mobile",25000));
        products.add(new Product(103,"Tablet",15000));
        products.add(new Product(102,"Desktop",55000));
        products.add(new Product(104,"SmartWatch",5000));

        System.out.println("Products in HashSet:");
        for(Product p:products) {
            System.out.println(p.productid+" "+p.name+" "+p.price);
        }

        //remove a product
        products.remove(new Product(103,"Tablet",15000));
        System.out.println("\nAfter removing product with ID 103:");
        for(Product p:products) {
            System.out.println(p.productid + " " + p.name + " " + p.price);
        }

        //update price of a product
        for(Product p:products) {
            if(p.productid == 102) {
                p.price = 52000; // updating price
            }
        }

        //view all products
        System.out.println("\nAfter updating price of product with ID 102:");
        for(Product p:products) {
            System.out.println(p.productid + " " + p.name + " " + p.price);
        }

        //search product by id
        int searchId = 105;
        boolean found = false;
        for(Product p:products) {
            if(p.productid == searchId) {
                System.out.println("\nProduct found: " + p.productid + " " + p.name + " " + p.price);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("\nProduct with ID " + searchId + " not found.");
        }

        //find all products with price less than 30000
        System.out.println("\nProducts with price less than 30000:");
        for(Product p:products) {
            if (p.price < 30000) {
                System.out.println(p.productid + " " + p.name + " " + p.price);
            }
        }

        //sorting

        List <Product> productList = new ArrayList<>(products);

        System.out.println("\nProducts sorted by ID:");
        Collections.sort(productList);
        for(Product p:products) {
            System.out.println(p.productid + " " + p.name + " " + p.price);
        }

        System.out.println("Products sorted by NAME:");
        productList.sort(new ProductNameComparator());
        for(Product p:products) {
            System.out.println(p.productid + " " + p.name + " " + p.price);
        }

        System.out.println("Products sorted by PRICE:");
        productList.sort(new ProductPriceComparator());
        for(Product p:products) {
            System.out.println(p.productid + " " + p.name + " " + p.price);
        }

        System.out.println("Products sorted by PRICE DESCENDING:");
        productList.sort(new ProductPriceComparatorDescending());
        for(Product p:products) {
            System.out.println(p.productid + " " + p.name + " " + p.price);
        }



    }
}
