package com.assignment.day9_collections.assignment2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day9Assignment2 {
    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book(1, "Java Programming", "Author A", 500.0));
        bookList.add(new Book(2, "Python Programming", "Author B", 600.0));
        bookList.add(new Book(3, "C++ Programming", "Author C", 700.0));
        bookList.add(new Book(4, "JavaScript Programming", "Author D", 400.0));
        bookList.add(new Book(5, "Ruby Programming", "Author E", 300.0));

        System.out.println("Books in the list:");
        for (Book book : bookList) {
            System.out.println("ID: " + book.getBookId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Price: " + book.getPrice());
        }

        System.out.println("Books sorted by title:");
        Collections.sort(bookList);

        for (Book book : bookList) {
            System.out.println("ID: " + book.getBookId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Price: " + book.getPrice());
        }

        System.out.println("Books sorted by price:");
        bookList.sort(new BookPriceComparator());
        for (Book book : bookList) {
            System.out.println("ID: " + book.getBookId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Price: " + book.getPrice());
        }

        System.out.println("Books sorted by author:");
        bookList.sort(new BookAuthorComparator());
        for (Book book : bookList) {
            System.out.println("ID: " + book.getBookId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Price: " + book.getPrice());
        }



    }
}
