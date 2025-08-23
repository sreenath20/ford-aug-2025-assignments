package com.fullstackabi.assignment.Assign9.CollectionsSetMap.Ex2Map;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {

        return o1.productName.compareTo(o2.productName);
    }
}
