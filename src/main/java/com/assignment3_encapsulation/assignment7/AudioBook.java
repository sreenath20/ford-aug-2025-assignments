package com.assignment3_encapsulation.assignment7;

public class AudioBook extends Book {
    private String duration;
    private String narrator;

    public AudioBook(String title, String author, String ISBN, double price, String duration, String narrator) {
        super(title, author, ISBN, price);
        this.duration = duration;
        this.narrator = narrator;
    }

    public String getDuration() {
        return duration;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    @Override
    public void displayDetails() {
        System.out.println("=== AUDIO BOOK DETAILS ===");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Price: $" + getPrice());
        System.out.println("Duration: " + duration);
        System.out.println("Narrator: " + narrator);
        System.out.println("==========================");
    }
}
