package com.ford.assignment8;


import java.util.*;

// Book class with Comparable (sort by title)
class Book implements Comparable<Book> {
    int bookId;
    String title;
    String author;
    double price;

    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{id=" + bookId + ", title='" + title + "', author='" + author + "', price=" + price + "}";
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title);
    }
}

// Comparator to sort by price
class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return Double.compare(b1.price, b2.price);
    }
}

// Comparator to sort by author
class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.author.compareToIgnoreCase(b2.author);
    }
}

// Main class
public class LibraryBookSorting {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        // Adding books
        books.add(new Book(101, "Java Programming", "Raj", 499.99));
        books.add(new Book(102, "Data Structures", "Priya", 399.50));
        books.add(new Book(103, "Algorithms", "Amit", 450.00));
        books.add(new Book(104, "Operating Systems", "Zara", 550.75));
        books.add(new Book(105, "Database Systems", "Meena", 420.25));

        // Sort by title (Comparable)
        Collections.sort(books);
        System.out.println("\nBooks sorted by Title:");
        for (Book b : books) {
            System.out.println(b);
        }

        // Sort by price (Comparator)
        books.sort(new PriceComparator());
        System.out.println("\nBooks sorted by Price:");
        for (Book b : books) {
            System.out.println(b);
        }

        // Sort by author (Comparator)
        books.sort(new AuthorComparator());
        System.out.println("\nBooks sorted by Author:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
