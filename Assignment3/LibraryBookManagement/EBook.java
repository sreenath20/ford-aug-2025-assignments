package Assignment3.LibraryBookManagement;

public class EBook extends Book {
    private double fileSize;
    private String format;

    public EBook(String title, String author, String ISBN, double price, double fileSize, String format) {
        super(title, author, ISBN, price);
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Format: " + format);
    }
}
