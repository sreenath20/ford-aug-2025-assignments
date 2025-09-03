package com.assignment.day10_set.assignment2;

import java.util.Comparator;

public class ProductPriceComparatorDescending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o2.price, o1.price);
    }
}
