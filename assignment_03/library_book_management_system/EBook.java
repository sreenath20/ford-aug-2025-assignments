package assignment_03.library_book_management_system;

class EBook extends Book {
    private double fileSize;
    private String format;

    public EBook(String title, String author, String ISBN, double price, double fileSize, String format) {
        super(title, author, ISBN, price);
        this.fileSize = fileSize;
        this.format = format;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Format: " + format);
        System.out.println("Book Type: Electronic Book");

    }
}
