package assignment_09.product_price_catalog;

import java.util.Comparator;

public class NameComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return p1.name.compareTo(p2.name);
    }
}
