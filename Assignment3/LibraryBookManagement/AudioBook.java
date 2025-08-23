package Assignment3.LibraryBookManagement;

public class AudioBook extends Book {
    private double duration;
    private String narrator;

    public AudioBook(String title, String author, String ISBN, double price, double duration, String narrator) {
        super(title, author, ISBN, price);
        this.duration = duration;
        this.narrator = narrator;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Narrator: " + narrator);
    }
}
