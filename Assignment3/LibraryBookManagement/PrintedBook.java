package Assignment3.LibraryBookManagement;

public class PrintedBook extends Book {
    private int pages;
    private String coverType;

    public PrintedBook(String title, String author, String ISBN, double price, int pages, String coverType) {
        super(title, author, ISBN, price);
        this.pages = pages;
        this.coverType = coverType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Pages: " + pages);
        System.out.println("Cover Type: " + coverType);
    }
}
