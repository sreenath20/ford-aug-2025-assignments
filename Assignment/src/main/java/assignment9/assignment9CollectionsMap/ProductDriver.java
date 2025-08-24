package assignment9.assignment9CollectionsMap;

import java.util.*;

public class ProductDriver {
    public static void main(String[] args) {
        Map<Integer, ProductPriceCatalog> productHashMap = new HashMap<>();

//Add new products;

        productHashMap.put(1, new ProductPriceCatalog(1, "Laptop", 55000.45));
        productHashMap.put(76, new ProductPriceCatalog(76, "Headphones", 5000.01));
        productHashMap.put(5, new ProductPriceCatalog(5, "Mobile", 32000.77));
        productHashMap.put(3, new ProductPriceCatalog(3, "Sunglasses", 6000.35));

        System.out.println("The product HashMap is " + productHashMap);

//Remove a product;

        productHashMap.remove(1);
        System.out.println("The product HashMap after removing a product is " + productHashMap);

//Update price of a product
        productHashMap.replace(76, new ProductPriceCatalog(76, "Headphones", 5899.01));
        System.out.println("The product HashMap after updating the price is " + productHashMap);

        ProductPriceCatalog modifyProductPrice = productHashMap.get(3);
        modifyProductPrice.setProductPrice(4750.99);
        System.out.println("The product HashMap after updating the price of Sunglasses is " + productHashMap);

// View all products
        System.out.println(productHashMap.values());

//Searching

        for (ProductPriceCatalog product : productHashMap.values()) {
            if (product.getProductId() == 5) {
                System.out.println("The retrieved product is " + product);
            }
        }


//Sorting

        List<ProductPriceCatalog> productList = new ArrayList<>(productHashMap.values());
        System.out.println("Product list before sorting : " + productList);
//productlist.sort(new Productnamecomparator)
        Collections.sort(productList,new ProductNameComparator());
        System.out.println("Product list after sorting with Product Name: " + productList);

        Collections.sort(productList,new ProductPriceComparator());
        System.out.println("Product list after sorting with Product Price: " + productList);

        Collections.sort(productList, new ProductPriceComparator().reversed());
        System.out.println("Product list after sorting in descending order: " + productList);
    }
}
