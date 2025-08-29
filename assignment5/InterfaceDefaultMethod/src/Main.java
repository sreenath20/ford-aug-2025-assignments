//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MusicPlayer mp3=new MP3Player();
        MusicPlayer wav=new WAVPlayer();

        System.out.println("Playing WAV file");
        wav.play("song.wav");
        wav.stop();
        System.out.println("-----------------------");
        System.out.println("playing mp3 player");
        mp3.play("song.mp3");
        mp3.stop();
    }
}