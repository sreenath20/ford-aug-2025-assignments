package com.fullstackabi.assignment.Assign3.EncapsulationInheritance.Ex7LibraryMgmntSystem;

public class PrintedBook extends Book{

    public PrintedBook(String title, String author, Integer ISBN, Double price) {
        super(title, author, ISBN, price);
    }

    int pages;
    String coverType;
    public PrintedBook() {
        super();
    }
   public void displayFields(int pages,String coverType){
        System.out.println("Printed Books with pages and covertypes");
        System.out.println("Book Title : " +getTitle());
        System.out.println("Book Author: " +getAuthor());
        System.out.println("Book ISBN : " +getISBN());
        System.out.println("Book Price: " +getPrice());
        System.out.println("Book pages: " +pages);
        System.out.println("Book Cover Type: " +coverType);
    }

}
