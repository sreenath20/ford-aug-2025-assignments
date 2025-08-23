
package com.assignment8_collections.assignment2;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private Integer bookId;
    private String title;
    private String author;
    private Double price;

    public Book(Integer bookId, String title, String author, Double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Integer getBookId() {
        return this.bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String toString() {
        return "Book{bookId=" + this.bookId + ", title='" + this.title + "', author='" + this.author + "', price=" + this.price + "}";
    }

    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }

    public boolean equals(Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            Book book = (Book)o;
            return Objects.equals(this.bookId, book.bookId) && Objects.equals(this.title, book.title) && Objects.equals(this.author, book.author) && Objects.equals(this.price, book.price);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.bookId, this.title, this.author, this.price});
    }
}