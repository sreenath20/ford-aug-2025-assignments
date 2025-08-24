package day5.assignment5_polymorphisam.interfaceDefault;

public class InterfaceDriver {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        mp3Player.play("beat.mp3");
        mp3Player.stop();

        WAVPlayer wavPlayer = new WAVPlayer();
        wavPlayer.play("pitch.wav");
        wavPlayer.stop();

    }
}
