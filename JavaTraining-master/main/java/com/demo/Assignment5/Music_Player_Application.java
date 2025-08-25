package com.demo.Assignment5;

public class Music_Player_Application {
    public static void main(String[] args) {
        MP3PLayer mp3PLayer = new MP3PLayer();
        mp3PLayer.play();
        mp3PLayer.stop();
        WAVPLayer wavPLayer = new WAVPLayer();
        wavPLayer.play();
        wavPLayer.stop();
    }

}
interface MusicPlayer{
    void play();
    default void stop(){
        System.out.println("MusicPlayer::stop");
    }
}
class MP3PLayer implements MusicPlayer{
    public void play(){
        System.out.println("MP3PLayer::play");
    }
}
class WAVPLayer implements MusicPlayer{
    public void play(){
        System.out.println("WAVPLayer::play");
    }
}
