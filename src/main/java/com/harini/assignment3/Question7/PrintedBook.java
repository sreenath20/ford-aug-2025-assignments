package com.harini.assignment3.Question7;

import java.awt.print.Book;

public class PrintedBook extends Books{
    int pages;
    String coverType;

    public PrintedBook(String name, String author, String ISBN, double price, int pages, String coverType) {
        super(name, author, ISBN, price);
        this.pages = pages;
        this.coverType = coverType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Total Pages: " + pages);
        System.out.println("Cover Type: " + coverType);
    }
}
