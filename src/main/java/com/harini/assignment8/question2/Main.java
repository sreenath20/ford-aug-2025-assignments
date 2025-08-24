package com.harini.assignment8.question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book(2,"Java Programming","John",489.54);
        Book book2 = new Book(4,"Python Programming","Tom",345.9);
        Book book3 = new Book(1,"C++ Programming","Regina",517.9);
        Book book4 = new Book(5,"Data Science","Thomas",389.76);
        Book book5 = new Book(3,"Data Analyst","John Toe",389.40);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        System.out.println(bookList);
        Collections.sort(bookList);
        System.out.println(bookList);
        bookList.sort(new AuthorNameComparator());
        System.out.println(bookList);
        bookList.sort(new PriceComparator());
        System.out.println(bookList);

    }
}
