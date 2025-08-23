
package com.assignment9_sets.assignment2;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, Product> products = new HashMap();
        products.put(1, new Product(1001, "Laptop", (double)1200.0F));
        products.put(2, new Product(1002, "Smartphone", (double)800.0F));
        products.put(0, new Product(1003, "Tablet", (double)600.0F));
        System.out.println("All products " + String.valueOf(products));
        System.out.println();
        System.out.println("remove a product " + String.valueOf(products.remove(1)));
        System.out.println("All products after removal " + String.valueOf(products));
        System.out.println();
        System.out.println(" Find a product by its ID");
        System.out.println("enter the product id ");
        Integer id = input.nextInt();
        boolean found = false;

        for(Product p : products.values()) {
            if (p.getProductId().equals(id)) {
                System.out.println("Product found: " + String.valueOf(p));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found");
        }

        System.out.println();
        System.out.println("Enter the product price to show all products cheaper than a given price. ");
        Double price = input.nextDouble();
        boolean foundCheaper = false;

        for(Product p : products.values()) {
            if (p.getPrice() < price) {
                System.out.println("Product cheaper than " + price + ": " + String.valueOf(p));
                foundCheaper = true;
            }
        }

        if (!foundCheaper) {
            System.out.println("No products found cheaper than " + price);
        }

        Map<Integer, Product> sortedproducts = new TreeMap(products);
        System.out.println("All products are sorted" + String.valueOf(sortedproducts));
        System.out.println();
        List<Product> product1 = new ArrayList(products.values());
        Collections.sort(product1, Collections.reverseOrder());
        System.out.println("All products sorted by price in descending order: " + String.valueOf(product1));

        for(Product p : product1) {
            for(Map.Entry<Integer, Product> entry : sortedproducts.entrySet()) {
                if (p.equals(entry.getValue())) {
                    PrintStream var10000 = System.out;
                    String var10001 = String.valueOf(entry.getKey());
                    var10000.println("key " + var10001 + " value " + String.valueOf(entry.getValue()));
                }
            }
        }

        System.out.println();
        Collections.sort(product1);
        System.out.println("All products sorted by price in Ascending order: " + String.valueOf(product1));

        for(Product p : product1) {
            for(Map.Entry<Integer, Product> entry : sortedproducts.entrySet()) {
                if (p.equals(entry.getValue())) {
                    PrintStream var25 = System.out;
                    String var26 = String.valueOf(entry.getKey());
                    var25.println("key " + var26 + " value " + String.valueOf(entry.getValue()));
                }
            }
        }

        System.out.println();
        Collections.sort(product1, new ProductNameComparator());
        System.out.println("All products sorted by name in product name: " + String.valueOf(product1));
        System.out.println("product sorted by product name : ");

        for(Product p : product1) {
            for(Map.Entry<Integer, Product> entry : products.entrySet()) {
                if (p.equals(entry.getValue())) {
                    System.out.println(entry);
                }
            }
        }

    }
}
