package assignment_03.library_book_management_system;

class PrintedBook extends Book {
    private int pages;
    private String coverType;

    public PrintedBook(String title, String author, String ISBN, double price, int pages, String coverType) {
        super(title, author, ISBN, price);
        this.pages = pages;
        this.coverType = coverType;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Pages: " + pages);
        System.out.println("Cover Type: " + coverType);
        System.out.println("Book Type: Printed Book");

    }
}
