package com.assignment5_polymorphism.assignment5;

public interface MusicPlayer {
    public abstract void play(String fileName) ;
    default void  stop() {
        System.out.println("Music Stopped");
    }

}
