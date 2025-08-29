import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return Double.compare(book1.getPrice(), book2.getPrice());
    }
}
