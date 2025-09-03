package com.assignment.day10_set.assignment2;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.price, o2.price);
    }
}
