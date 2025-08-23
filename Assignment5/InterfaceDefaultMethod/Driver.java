package Assignment5.InterfaceDefaultMethod;

public class Driver {
        public static void main(String[] args) {
            MusicPlayer mp3 = new MP3Player();
            MusicPlayer wav = new WAVPlayer();

            mp3.play("song.mp3");
            mp3.stop();

            wav.play("tune.wav");
            wav.stop();
        }

}
