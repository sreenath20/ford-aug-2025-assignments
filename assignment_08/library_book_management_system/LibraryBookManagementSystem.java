package assignment_08.library_book_management_system;

import java.util.ArrayList;
import java.util.Collections;

public class LibraryBookManagementSystem {
    private static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("📚 Library Book Management System 📚\n");

        books.add(new Book(101, "Gitanjali", "Rabindranath Tagore", 250.0));
        books.add(new Book(102, "Train to Pakistan", "Khushwant Singh", 300.0));
        books.add(new Book(103, "The God of Small Things", "Arundhati Roy", 450.0));
        books.add(new Book(104, "A Fine Balance", "Rohinton Mistry", 400.0));
        books.add(new Book(105, "The White Tiger", "Aravind Adiga", 350.0));

        System.out.println("Original List:");
        printBooks();

        System.out.println("\n--- Sorted by Title (Comparable) ---");
        Collections.sort(books);
        printBooks();

        System.out.println("\n--- Sorted by Price (Comparator) ---");
        Collections.sort(books ,new PriceComparator());
        printBooks();

        System.out.println("\n--- Sorted by Author (Comparator) ---");
        Collections.sort(books , new AuthorComparator());
        printBooks();
    }

    private static void printBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.print((i + 1) + ". ");
            books.get(i).displayBook();
        }
    }
}