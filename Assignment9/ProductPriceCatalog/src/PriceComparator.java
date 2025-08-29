import java.util.Comparator;
import java.util.Objects;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        //ascending order
        return Double.compare(p1.getPrice(), p2.getPrice());
        //for descinding
//        return Double.compare(p2.getPrice(), p1.getPrice());
    }
}
