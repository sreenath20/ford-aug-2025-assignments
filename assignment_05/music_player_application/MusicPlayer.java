package assignment_05.music_player_application;

interface MusicPlayer {
    public void play(String fileName);
    public default void stop() {
        System.out.println("Music stopped");
    }
}
