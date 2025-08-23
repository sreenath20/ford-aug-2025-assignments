package com.assignment5_polymorphism.assignment5;

public class MP3Player implements MusicPlayer {
    public void play(String fileName) {
        System.out.println("Playing MP3 file: " + fileName);
    }

    public void stop() {
        System.out.println("MP3 Music Stopped");
    }
}
