package Assignment5.InterfaceDefaultMethod;


public class MP3Player implements MusicPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing MP3 file: " + fileName);
    }
}

