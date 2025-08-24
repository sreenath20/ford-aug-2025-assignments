package day5.assignment5_polymorphisam.interfaceDefault;

public class WAVPlayer implements MusicPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("WAV: Playing " + fileName);
    }
}
