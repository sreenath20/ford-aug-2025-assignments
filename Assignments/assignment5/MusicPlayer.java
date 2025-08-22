package com.assignments.assignment5;

public interface MusicPlayer {
    void playMusic(String fileName);
    default void stopMusic(){
        System.out.println("Music stopped.");
    }
}
