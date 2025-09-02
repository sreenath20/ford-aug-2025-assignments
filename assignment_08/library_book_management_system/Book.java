package assignment_08.library_book_management_system;

class Book implements Comparable<Book> {
    private int bookId;
    private String title;
    private String author;
    private double price;

    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    public void displayBook() {
        System.out.println("ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Price: ₹" + price);
    }
}
