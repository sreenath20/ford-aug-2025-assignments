package com.ford.assignment5;

interface MusicPlayer {
    void play(String fileName);

    default void stop() {
        System.out.println("Music stopped");
    }
}

class MP3Player implements MusicPlayer {
    public void play(String fileName) {
        System.out.println("Playing MP3 file: " + fileName);
    }
}

class WAVPlayer implements MusicPlayer {
    public void play(String fileName) {
        System.out.println("Playing WAV file: " + fileName);
    }
}

class MusicApp {
    public static void main(String[] args) {
        MusicPlayer mp3 = new MP3Player();
        MusicPlayer wav = new WAVPlayer();

        mp3.play("song.mp3");
        mp3.stop();

        wav.play("track.wav");
        wav.stop();
    }
}
