package com.fullstackabi.assignment.Assign3.EncapsulationInheritance.Ex7LibraryMgmntSystem;

public class AudioBook extends Book{

    public AudioBook(String title, String author, Integer ISBN, Double price) {
        super(title, author, ISBN, price);
    }

    double duration;
    String narrator;

    public AudioBook() {

    }

    public void displayFields(double duration, String narrator){
        System.out.println("Audio Books with Duration and Narrator");
        System.out.println("Book Title: " +getTitle());
        System.out.println("Book Author: " +getAuthor());
        System.out.println("Book ISBN: " +getISBN());
        System.out.println("Book Price: " +getPrice());
        System.out.println("Book Duration: " +duration+ " hrs");
        System.out.println("Book Narrated By: " +narrator);
    }
}
