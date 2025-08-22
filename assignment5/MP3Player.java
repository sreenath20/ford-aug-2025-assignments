package com.assignments.assignment5;

public class MP3Player implements MusicPlayer{
    @Override
    public void playMusic(String fileName) {
        System.out.println("Playing MP3 music "+fileName);
    }
}
