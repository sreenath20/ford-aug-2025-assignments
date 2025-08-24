package assignment5.assignment5Polymorphism;

public interface MusicPlayer {
    void play(String fileName);

    default void stop(){
        System.out.println("Music stopped");
    }
}
