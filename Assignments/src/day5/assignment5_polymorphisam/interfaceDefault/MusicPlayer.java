package day5.assignment5_polymorphisam.interfaceDefault;

public interface MusicPlayer {
    void play(String fileName);
    default void stop(){
        System.out.println("Music Stopped");
    }
}
