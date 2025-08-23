
import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String ISBN;
    private double price;

    public Book(String title, String author, String ISBN, double price) {
        this.title = title; this.author = author; this.ISBN = ISBN; this.price = price;
    }
    public void displayDetails() {
        System.out.println(title + " by " + author + " (ISBN: " + ISBN + ") - $" + price);
    }
}

class PrintedBook extends Book {
    private int pages;
    private String coverType;
    public PrintedBook(String title, String author, String ISBN, double price, int pages, String coverType) {
        super(title, author, ISBN, price);
        this.pages = pages; this.coverType = coverType;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("  Printed[" + pages + " pages, cover: " + coverType + "]");
    }
}

class EBook extends Book {
    private double fileSizeMB;
    private String format;
    public EBook(String title, String author, String ISBN, double price, double fileSizeMB, String format) {
        super(title, author, ISBN, price);
        this.fileSizeMB = fileSizeMB; this.format = format;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("  EBook[" + fileSizeMB + "MB, format: " + format + "]");
    }
}

class AudioBook extends Book {
    private double durationHours;
    private String narrator;
    public AudioBook(String title, String author, String ISBN, double price, double durationHours, String narrator) {
        super(title, author, ISBN, price);
        this.durationHours = durationHours; this.narrator = narrator;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("  AudioBook[" + durationHours + "h, narrator: " + narrator + "]");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<Book> library = new ArrayList<>();
        library.add(new PrintedBook("Clean Code","Robert C. Martin","9780132350884",35.0,464,"Hardcover"));
        library.add(new EBook("Effective Java","Joshua Bloch","9780134685991",29.99,5.2,"PDF"));
        library.add(new AudioBook("The Pragmatic Programmer","Andrew Hunt","9780201616224",19.99,11.5,"John Doe"));

        for (Book b : library) b.displayDetails();
    }
}
