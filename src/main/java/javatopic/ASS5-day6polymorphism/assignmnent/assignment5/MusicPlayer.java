package javatopic.day6polymorphism.assignmnent.assignment5;

public interface MusicPlayer {
    void play(String fileName);

    default void stop(){
        System.out.println("Music stopped");
    }
//Understand that default methods allow adding new methods to interfaces without breaking
//existing implementations.
}
