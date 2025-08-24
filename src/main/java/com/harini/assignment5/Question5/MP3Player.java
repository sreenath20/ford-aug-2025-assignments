package com.harini.assignment5.Question5;

public class MP3Player implements MusicPlayer{
    @Override
    public void play(String fileName) {
        System.out.println(fileName+" song is playing");
    }
}
