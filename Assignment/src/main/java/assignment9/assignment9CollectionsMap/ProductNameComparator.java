package assignment9.assignment9CollectionsMap;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<ProductPriceCatalog> {
    public int compare(ProductPriceCatalog p1, ProductPriceCatalog p2) {
        return p1.getProductName().compareTo(p2.getProductName());
    }
}
