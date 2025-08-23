package Assignment5.InterfaceDefaultMethod;

public interface MusicPlayer {
    void play(String fileName);

    default void stop() {
        System.out.println("Music stopped");
    }
}

