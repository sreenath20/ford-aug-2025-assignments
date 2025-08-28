package com.assignment.day4.assignment7;

class Book{
    String title;
    String author;
    String ISBN;
    double price;

    public Book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Price: $" + price);
    }

}

class PrintedBook extends Book {
    int numberOfPages;
    String coverType;

    public PrintedBook(String title, String author, String ISBN, double price, int numberOfPages,String coverType) {
        super(title, author, ISBN, price);
        this.numberOfPages = numberOfPages;
        this.coverType = coverType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Cover Type: " + coverType);
    }
}

class EBook extends Book {
    String fileFormat;
    double fileSize;

    public EBook(String title, String author, String ISBN, double price, String fileFormat, double fileSize) {
        super(title, author, ISBN, price);
        this.fileFormat = fileFormat;
        this.fileSize = fileSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("File Format: " + fileFormat);
        System.out.println("File Size: " + fileSize + " MB");
    }
}

class AudioBook extends Book {
    double duration;
    String narrator;

    public AudioBook(String title, String author, String ISBN, double price, double duration, String narrator) {
        super(title, author, ISBN, price);
        this.duration = duration;
        this.narrator = narrator;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Narrator: " + narrator);
    }
}

public class Day4Assignment7 {
    public static void main(String[] args) {

        Book[] books = new Book[3];
        books[0] = new PrintedBook("Effective Java", "Joshua Bloch", "978-0134686097", 45.00, 416, "Hardcover");
        books[1] = new EBook("Clean Code", "Robert C. Martin", "978-0132350884", 35.00, "PDF", 1.5);
        books[2] = new AudioBook("The Pragmatic Programmer", "Andrew Hunt", "978-0135957059", 40.00, 12.5, "Dave Thomas");
        for (Book book : books) {
            book.displayDetails();
            System.out.println("-----------------------------");
        }

    }
}
