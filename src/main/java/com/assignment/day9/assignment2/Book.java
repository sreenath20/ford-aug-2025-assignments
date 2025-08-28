package com.assignment.day9.assignment2;

class Book extends Object implements Comparable<Book>{
    private int bookId;
    private String title;
    private String author;
    private Double price;

    public Book() {
    }
    public Book(int bookId, String title, String author, Double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.getTitle());
    }
}

