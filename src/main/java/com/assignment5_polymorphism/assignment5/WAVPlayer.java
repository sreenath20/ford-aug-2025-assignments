package com.assignment5_polymorphism.assignment5;

public class WAVPlayer implements MusicPlayer {
    public void play(String fileName) {
        System.out.println("Playing WAV file: " + fileName);
    }


    public void stop() {
        System.out.println("Stopping WAV playback.");
    }
}
