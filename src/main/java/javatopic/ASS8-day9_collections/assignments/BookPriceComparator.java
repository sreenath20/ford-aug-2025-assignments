package javatopic.day9_collections.assignments;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getPrice().compareTo(b2.getPrice());

    }
}
