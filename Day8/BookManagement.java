package Assignments8_JavaCollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class Book implements Comparable<Book> {
    int bookId;
    String title;
    String author;
    double price;

    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Sort by title (alphabetical)
    @Override
    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title);
    }

    @Override
    public String toString() {
        return String.format("Book{id=%d, title='%s', author='%s', price=%.2f}",
                bookId, title, author, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book b = (Book) o;
        return bookId == b.bookId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId);
    }
}

// Comparator classes
class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        return Double.compare(a.price, b.price);
    }
}

class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        return a.author.compareToIgnoreCase(b.author);
    }
}

public class BookManagement {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Effective Java", "Joshua Bloch", 45.00));
        books.add(new Book(2, "Clean Code", "Robert C. Martin", 40.00));
        books.add(new Book(3, "Java Concurrency in Practice", "Brian Goetz", 55.00));
        books.add(new Book(4, "Refactoring", "Martin Fowler", 47.50));
        books.add(new Book(5, "Head First Java", "Kathy Sierra", 30.00));

        System.out.println("Original list:");
        books.forEach(System.out::println);

        // Sort by title (Comparable)
        Collections.sort(books);
        System.out.println("\nSorted by title (Comparable):");
        books.forEach(System.out::println);

        // Sort by price ascending (Comparator)
        books.sort(new PriceComparator());
        System.out.println("\nSorted by price (ascending):");
        books.forEach(System.out::println);

        // Sort by author alphabetical (Comparator)
        books.sort(new AuthorComparator());
        System.out.println("\nSorted by author (alphabetical):");
        books.forEach(System.out::println);
    }
}
