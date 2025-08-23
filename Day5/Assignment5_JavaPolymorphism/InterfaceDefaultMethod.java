public class InterfaceDefaultMethod {

    interface MusicPlayer {
        void play(String fileName);

        default void stop() {
            System.out.println("Music stopped");
        }
    }

    static class MP3Player implements MusicPlayer {
        @Override
        public void play(String fileName) {
            System.out.println("MP3Player playing: " + fileName);
        }
    }

    static class WAVPlayer implements MusicPlayer {
        @Override
        public void play(String fileName) {
            System.out.println("WAVPlayer playing: " + fileName);
        }

    }

    public static void main(String[] args) {
        MusicPlayer mp3 = new MP3Player();
        MusicPlayer wav = new WAVPlayer();

        mp3.play("song.mp3");
        mp3.stop();

        wav.play("sound.wav");
        wav.stop();
    }
}
