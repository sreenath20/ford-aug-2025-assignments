package assignment_03.library_book_management_system;

class AudioBook extends Book {
    private double duration;
    private String narrator;

    public AudioBook(String title, String author, String ISBN, double price, double duration, String narrator) {
        super(title, author, ISBN, price);
        this.duration = duration;
        this.narrator = narrator;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Narrator: " + narrator);
        System.out.println("Book Type: Audio Book");
    }
}
