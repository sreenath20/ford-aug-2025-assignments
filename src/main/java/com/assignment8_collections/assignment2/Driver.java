package com.assignment8_collections.assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Book> books = new ArrayList();
        books.add(new Book(1, "ddd", "zzz", (double)45.0F));
        books.add(new Book(2, "bbb", "yyy", (double)40.0F));
        books.add(new Book(3, "ccc", "xxx", (double)50.0F));
        System.out.println(books);
        Collections.sort(books);
        System.out.println("sorted books by name" + String.valueOf(books));
        Collections.sort(books, new PriceAscendingOrder());
        System.out.println("sorted books by price" + String.valueOf(books));
        Collections.sort(books, new authorAlphabeticOrder());
        System.out.println("sorted books by author name" + String.valueOf(books));
    }
}
