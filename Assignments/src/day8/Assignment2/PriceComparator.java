package day8.Assignment2;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.price.compareTo(o2.price);
    }
}
