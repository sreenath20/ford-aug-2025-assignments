package com.demo.Assignment9.map;

import java.util.*;

public class MapCRUDoperation {
    public static void main(String[] args) {
        Map<Integer, Product> productMap=new HashMap<>();
        productMap.put(111,new Product(1,"AK",2000.3));
        productMap.put(222,new Product(2,"bK",20400.3));
        productMap.put(333,new Product(3,"kK",1000.3));
        productMap.put(444,new Product(4,"dK",5000.3));
        productMap.put(555,new Product(5,"rK",7000.3));
    //remove

        productMap.remove(444);
        System.out.println(productMap);
        //update

        Product product1=productMap.get(222);
        product1.setPrice(200000.0);
        System.out.println(productMap);


        System.out.println("sorting");
        List<Product> productList= new ArrayList<>(productMap.values());
        productList.sort(new ComparatorByName_Map());
        //System.out.println(productListf);
    }
}
