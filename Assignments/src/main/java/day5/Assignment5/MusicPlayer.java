package day5.Assignment5;

public interface MusicPlayer {
    default void stop() {
        System.out.println("Music stopped");
    }
    public void play(String fileName);
}
