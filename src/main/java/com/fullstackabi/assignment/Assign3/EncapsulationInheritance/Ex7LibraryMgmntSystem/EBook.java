package com.fullstackabi.assignment.Assign3.EncapsulationInheritance.Ex7LibraryMgmntSystem;

public class EBook extends Book{

    public EBook(String title, String author, Integer ISBN, Double price) {
        super(title, author, ISBN, price);
    }

    double fileSize;
    String format;

    public EBook() {

    }

    public void displayFields(double fileSize, String format){
        System.out.println("EBooks with fileSize and format");
        System.out.println("Book Title: " +getTitle());
        System.out.println("Book Author: " +getAuthor());
        System.out.println("Book ISBN: " +getISBN());
        System.out.println("Book Price: " +getPrice());
        System.out.println("Book FileSize : " +fileSize+ " GB");
        System.out.println("Book Format: " +format);
    }
}
