package com.harini.assignment5.Question5;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MP3Player();
        musicPlayer.play("Pachai Nirame");
        musicPlayer.stop();
        MusicPlayer musicPlayer2 = new WAVPlayer();
        musicPlayer2.play("Mulumathi");
        musicPlayer2.stop();
    }
}
