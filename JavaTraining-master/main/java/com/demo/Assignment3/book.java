package com.demo.Assignment3;
//----------------Assignment 8----------------
public class book {
    private String title;
    private String author;
    private String ISBN;
    private double price;
    book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }
    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Price: " + price);

    }
    public static void main(String[] args){

        PrintedBook p1=new PrintedBook("Harry potter","XYZ","YZX",3500.09,"XYZ");
        p1.display();
    }

}
class PrintedBook extends book{
    private String coverType;
    PrintedBook(String title, String author, String ISBN, double price,String coverType) {
        super(title, author, ISBN, price);
        this.coverType = coverType;

    }
    void display(){
        super.display();
        System.out.println("Cover Type: " + coverType);

    }
}
class Ebook extends book{
    private String fileFormat;
    Ebook(String title, String author, String ISBN, double price,String fileFormat) {
        super(title, author, ISBN, price);
        this.fileFormat = fileFormat;

    }
    void display(){
        super.display();
        System.out.println("File Format: " + fileFormat);
    }
}

