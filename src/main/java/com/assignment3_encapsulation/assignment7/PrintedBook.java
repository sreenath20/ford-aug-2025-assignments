package com.assignment3_encapsulation.assignment7;

public class PrintedBook extends Book {
    private int pages;
    private String coverType;

    public PrintedBook(String title, String author, String ISBN, double price, int pages, String coverType) {
        super(title, author, ISBN, price);
        this.pages = pages;
        this.coverType = coverType;
    }

    public int getPages() {
        return pages;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    @Override
    public void displayDetails() {
        System.out.println("=== PRINTED BOOK DETAILS ===");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Price: $" + getPrice());
        System.out.println("Pages: " + pages);
        System.out.println("Cover Type: " + coverType);
        System.out.println("============================");
    }
}
