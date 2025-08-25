package assignment_05.music_player_application;

public class MusicPlayerApplication {
    public static void main(String[] args) {
        System.out.println(" Welcome to Music Player Application! 🎵\n");

        MP3Player mp3Player = new MP3Player();
        WAVPlayer wavPlayer = new WAVPlayer();

        System.out.println("--- Testing MP3 Player ---");
        mp3Player.play("song1.mp3");
        mp3Player.stop();
        System.out.println();

        System.out.println("--- Testing WAV Player ---");
        wavPlayer.play("song2.wav");
        wavPlayer.stop();
        System.out.println();

        System.out.println("--- Playing Music ---");
        mp3Player.play("favorite_song.mp3");
        mp3Player.stop();

        wavPlayer.play("classical_music.wav");
        wavPlayer.stop();
        System.out.println();

        System.out.println("--- Default Method Execution---");
        System.out.println("Both players use the same stop() method from interface:");

        System.out.print("MP3Player stop(): ");
        mp3Player.stop();

        System.out.print("WAVPlayer stop(): ");
        wavPlayer.stop();
    }
}
