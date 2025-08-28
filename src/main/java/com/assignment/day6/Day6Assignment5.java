package com.assignment.day6;

interface MusicPlayer{
    abstract void play(String fileName);
    default void stop() {
        System.out.println("Music stopped.");
    }
}

class MP3Player implements MusicPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing MP3 file: " + fileName);
    }
}

class WAVPlayer implements MusicPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing WAV file: " + fileName);
    }
}

public class Day6Assignment5 {
    public static void main(String[] args) {
        MusicPlayer mp3 = new MP3Player();
        MusicPlayer wav = new WAVPlayer();
        mp3.play("song.mp3");
        wav.play("track.wav");
        mp3.stop();
        wav.stop();
    }
}
