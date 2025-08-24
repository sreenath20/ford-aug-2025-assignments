package com.harini.assignment8.question2;

public class Book implements Comparable<Book>{
    Integer bookId;
    String title;
    String author;
    Double price;
    public Book(Integer bookId, String title, String author, Double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }


    @Override
    public int compareTo(Book o) {
        return this.bookId.compareTo(o.bookId);
    }
    public String toString(){
        return "Book {" +
                "BookId: "
                +bookId+", title: "+title+", author: "+author+", price: "+price+"}";
    }
}
