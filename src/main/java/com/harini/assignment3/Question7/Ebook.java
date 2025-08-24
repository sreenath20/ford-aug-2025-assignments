package com.harini.assignment3.Question7;

public class Ebook extends Books {
    String fileSize;
    String format;

    public Ebook(String name, String author, String ISBN, double price, String fileSize, String format) {
        super(name, author, ISBN, price);
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("File Size: " + fileSize);
        System.out.println("Format: " + format);
    }
}
