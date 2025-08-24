package com.harini.assignment9.question2;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Product> productMap = new HashMap<Integer,Product>();
        Product product1 = new Product("Pencil",10.0,12);
        Product product2 = new Product("Pen",30.0,21);
        Product product3 = new Product("Notebook",40.0,32);
        Product product4 = new Product("Pencil Box",50.0,45);
        Product product5 = new Product("Exam Pad",60.0,56);
        productMap.put(12,product1);
        productMap.put(21,product2);
        productMap.put(32,product3);
        productMap.put(45,product4);
        productMap.put(56,product5);
        System.out.println("Printing the product map "+productMap);
        productMap.remove(32);
        Product p =productMap.get(45);
        if(p!=null){
            p.setPrice(100.0);
        }
        System.out.println("Printing the product map after remove and updation "+productMap);
        List<Product> productList = new ArrayList<Product>(productMap.values());
        Collections.sort(productList);
        Map<Integer,Product> sortedMap = new HashMap<>();
        for(Product product:productList){
            sortedMap.put(product.getId(),product);
        }
        System.out.println("Printing the sorted product list by price "+productList);
        Collections.sort(productList,Collections.reverseOrder());
        System.out.println("Printing the descending sorted product list by price "+productList);
        productList.sort(new NameComparator());
        System.out.println("Printing the sorted product list by name "+productList);
        System.out.println("Product at id 21 is found? "+productMap.get(21));
        Double maxPrice = 50.0;
        for(Product p1:productList){
            if(p1.getPrice()>maxPrice){
                System.out.println(p1);
            }
        }



    }
}
