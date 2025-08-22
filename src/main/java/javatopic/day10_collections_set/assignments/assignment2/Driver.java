package javatopic.day10_collections_set.assignments.assignment2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Driver {
    public static void main(String args[]) {

        //CREATE
        HashMap<Integer, Product> productMap = new HashMap<Integer, Product>();
        productMap.put(1, new Product(100, "Laptop", 100000.0));
        productMap.put(2, new Product(101, "Tablet", 50000.0));
        productMap.put(3, new Product(102, "Headphone", 50000.0));
        productMap.put(4, new Product(103, "Printer", 50000.0));
        productMap.put(5, new Product(104, "Earphone", 50000.0));
        productMap.put(6, new Product(105, "Tablet", 50000.0));
        System.out.println("products in the map are ");
        System.out.println(productMap);

        // VIEW
        System.out.println("Reading MAP with get ");
        System.out.println(productMap.get(1));
        System.out.println(productMap.get(4));
        System.out.println(productMap.get(3));

        //REMOVE
        System.out.println("remove value with key 4"+productMap.remove(4));
        System.out.println("remove key 1 and its value if matches: "+productMap.remove(1,new Product(100, "Laptop", 100000.0)));
        System.out.println("remove key 1 and its value if matches"+productMap.remove(1,new Product(1000, "Tablet", 50000.0)));
        System.out.println(productMap);
        System.out.println("GET(1)"+productMap.get(1));

        //UPDATE
        System.out.println(productMap.replace(2, new Product(100, "Laptop", 100000.0)));
        productMap.replace(5, new Product(100, "Tablet", 50000.0));
        System.out.println(productMap);

        productMap.put(6, new Product(101, "mouse", 5000.0));
        System.out.println(productMap);



        //SEARCHING
        System.out.println("\n search product with id 100");
        for(Product product : productMap.values()) {
            if (product.getProductId().equals(100)) {
                System.out.println(product);
                break;
            }
        }

        System.out.println("\n find product cheaper than 75000 ");
        for(Product product : productMap.values()) {
            if(product.getPrice()<75000) {
                System.out.println(product);
            }
        }

        //SORTING
        //look into the key and sort
        Map<Integer,Product> sortedMap = new TreeMap<Integer,Product>(productMap);
        System.out.println("\nsorted by the key\n"+sortedMap);








    }
}
