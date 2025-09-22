package javatopic.day6polymorphism.assignmnent.assignment5;

public class Main {
    public static void main(String[] args) {
        MusicPlayer mp;
        mp = new MP3Player();
        mp.play("mp3");
        mp.stop();
        mp=new WAVPlayer();
        mp.play("wav");
        mp.stop();
    }
}
