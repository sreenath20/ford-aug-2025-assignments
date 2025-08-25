package com.demo.Assignment8;

public class Book extends Object implements Comparable<Book> {
    private int bookid;
    private String booktitle;
    private String bookauthor;
    private Double price;

    public Book() {
    }

    public Book(int bookid, String booktitle, double price, String bookauthor) {
        this.bookid = bookid;
        this.booktitle = booktitle;
        this.price = price;
        this.bookauthor = bookauthor;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", booktitle='" + booktitle + '\'' +
                ", bookauthor='" + bookauthor + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Book o) {
        return this.booktitle.compareTo(o.booktitle);
    }
}
