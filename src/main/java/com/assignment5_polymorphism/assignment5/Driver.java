package com.assignment5_polymorphism.assignment5;

public class Driver {
    public static void main(String[] args) {
        MusicPlayer mp3Player = new MP3Player();
        MusicPlayer wavPlayer = new WAVPlayer();

        String mp3File = "song.mp3";
        String wavFile = "track.wav";

        System.out.println("Playing MP3 file:");
        mp3Player.play(mp3File);
        mp3Player.stop();

        System.out.println("\nPlaying WAV file:");
        wavPlayer.play(wavFile);
        wavPlayer.stop();
    }
}
