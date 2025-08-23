package com.assignment3_encapsulation.assignment7;

public class EBook extends Book {
    private double fileSize;
    private String format;

    public EBook(String title, String author, String ISBN, double price, double fileSize, String format) {
        super(title, author, ISBN, price);
        this.fileSize = fileSize;
        this.format = format;
    }

    public double getFileSize() {
        return fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void displayDetails() {
        System.out.println("=== E-BOOK DETAILS ===");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Price: $" + getPrice());
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Format: " + format);
        System.out.println("======================");
    }
}
