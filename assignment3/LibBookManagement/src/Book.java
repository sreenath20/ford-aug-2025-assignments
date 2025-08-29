public class Book {
    private String title;
    private String author;
    private int ISBN;
    private double price;

    public Book() {
    }



    public Book(String title, String author, int ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Price: " + this.price);

    }

}





class PrintedBook extends Book {
    private int numberOfpages;
    private String coverType;

    public PrintedBook() {
    }

    public PrintedBook(int numberOfpages, String coverType) {
        this.numberOfpages = numberOfpages;
        this.coverType = coverType;
    }

    public PrintedBook(String title, String author, int ISBN, double price, int numberOfpages, String coverType) {
        super(title, author, ISBN, price);
        this.numberOfpages = numberOfpages;
        this.coverType = coverType;
    }

    public int getNumberOfpages() {
        return numberOfpages;
    }

    public void setNumberOfpages(int numberOfpages) {
        this.numberOfpages = numberOfpages;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public void displayDetails() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("ISBN: " + this.getISBN());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Number of pages: " + this.getNumberOfpages());
        System.out.println("Cover Type: " + this.getCoverType());

    }

}

class EBook extends Book {
    private double fileSize;
    private String Formate;
    public EBook() {

    }

    public EBook(double fileSize, String formate) {
        this.fileSize = fileSize;
        this.Formate = formate;
    }

    public EBook(String title, String author, int ISBN, double price, double fileSize, String formate) {
        super(title, author, ISBN, price);
        this.fileSize = fileSize;
        this.Formate = formate;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormate() {
        return Formate;
    }

    public void setFormate(String formate) {
        Formate = formate;
    }

    public void displayDetails() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("ISBN: " + this.getISBN());
        System.out.println("Price: " + this.getPrice());
        System.out.println("File Size: " + this.getFileSize());
        System.out.println("Formate: " + this.getFormate());

    }
}

class AudioBook extends Book {
    private String duration;
    private String narrator;


    public AudioBook() {}

    public AudioBook(String duration, String narrator) {
        this.duration = duration;
        this.narrator = narrator;
    }

    public AudioBook(String title, String author, int ISBN, double price, String duration, String narrator) {
        super(title, author, ISBN, price);
        this.duration = duration;
        this.narrator = narrator;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }
    public void displayDetails() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("ISBN: " + this.getISBN());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Duration: " + this.getDuration());
        System.out.println("Narrator: " + this.getNarrator());

    }
}
