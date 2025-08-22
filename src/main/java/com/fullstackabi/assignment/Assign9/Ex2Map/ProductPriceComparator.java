package com.fullstackabi.assignment.Assign9.Ex2Map;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        // Return 1 if p1's price is greater, -1 if less, and 0 if equal.
        // This sorts in ascending order.
      return Double.compare(o1.getProductPrice(), o2.getProductPrice());
        // this sorts in descending order
      //  return Double.compare(o2.getProductPrice(), o1.getProductPrice());
    }
}
