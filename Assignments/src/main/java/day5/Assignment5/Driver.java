package day5.Assignment5;

public class Driver {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MP3Player();
        musicPlayer.play("ABC");
        musicPlayer.stop();
        MusicPlayer musicPlayer2 = new WAVPlayer();
        musicPlayer2.play("XYZ");
        musicPlayer2.stop();
    }
}
