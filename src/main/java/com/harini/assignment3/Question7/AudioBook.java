package com.harini.assignment3.Question7;

public class AudioBook extends Books{
    String duration;
    String narrator;

    public AudioBook(String name, String author, String ISBN, double price, String duration, String narrator) {
        super(name, author, ISBN, price);
        this.duration = duration;
        this.narrator = narrator;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration);
        System.out.println("Narrator: " + narrator);
    }
}
