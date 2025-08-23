package Assignment3.LibraryBookManagement;

public class Driver {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new PrintedBook("Java Basics", "Ram", "123ABC", 29.99, 350, "Paperback");
        books[1] = new EBook("Learn Python", "Sam", "456XYZ", 19.99, 5.5, "PDF");
        books[2] = new AudioBook("C++ Mastery", "Emily", "789QPE", 39.99, 10, "Tom");

        for (Book book : books) {
            System.out.println("----- Book Details -----");
            book.displayDetails();
            System.out.println();
        }
    }
}
