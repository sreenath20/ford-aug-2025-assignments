package com.assignments.assignment5;

public class WAVPlayer implements MusicPlayer{
    @Override
    public void playMusic(String fileName) {
        System.out.println("Playing WAV music "+fileName);
    }
}
