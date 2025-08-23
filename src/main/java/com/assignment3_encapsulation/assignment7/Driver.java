package com.assignment3_encapsulation.assignment7;

public class Driver {
    public static void main(String[] args) {
        System.out.println("*** LIBRARY BOOK MANAGEMENT SYSTEM ***\n");

        PrintedBook printedBook1 = new PrintedBook(
            "The Great Gatsby",
            "F. Scott Fitzgerald",
            "978-0-7432-7356-5",
            12.99,
            180,
            "Paperback"
        );

        EBook eBook1 = new EBook(
            "1984",
            "George Orwell",
            "978-0-452-28423-4",
            9.99,
            2.5,
            "PDF"
        );

        AudioBook audioBook1 = new AudioBook(
            "The Catcher in the Rye",
            "J.D. Salinger",
            "978-0-316-76948-0",
            19.99,
            "8.5 hours",
            "Ray Porter"
        );

        Book[] library = {printedBook1, eBook1, audioBook1};

        System.out.println("DISPLAYING ALL BOOKS IN LIBRARY:\n");

        for (int i = 0; i < library.length; i++) {
            System.out.println("Book " + (i + 1) + ":");
            library[i].displayDetails();
            System.out.println();
        }
    }
}
