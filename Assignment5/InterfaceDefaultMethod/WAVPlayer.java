package Assignment5.InterfaceDefaultMethod;


public class WAVPlayer implements MusicPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing WAV file: " + fileName);
    }
}

