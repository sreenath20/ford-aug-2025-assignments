package assignment_09.product_price_catalog;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.price, p2.price);
    }
}
