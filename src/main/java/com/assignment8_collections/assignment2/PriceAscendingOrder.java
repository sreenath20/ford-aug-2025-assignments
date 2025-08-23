package com.assignment8_collections.assignment2;

import java.util.Comparator;

public class PriceAscendingOrder implements Comparator<Book> {
    public int compare(Book book1, Book book2) {
        return Double.compare(book1.getPrice(), book2.getPrice());
    }
}
