public interface MusicPlayer {

    abstract void play(String fileName);
    default void stop(){
        System.out.println("Music stopped");
    }
}
