package com.assignments.assignment9;

import java.util.Comparator;

public class ProductPriceIncreasingComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.price.compareTo(o2.price);
    }
}
