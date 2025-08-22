package com.assignments.assignment8;

import java.util.List;

public class Book implements Comparable<Book>{
    Integer id;
    String title;
    String author;
    Double price;

    public Book() {}
    public Book(Integer id, String title, String author, Double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    void displayBooks(List<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
