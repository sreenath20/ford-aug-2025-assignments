package day5.assignment5_polymorphisam.interfaceDefault;

public class MP3Player implements MusicPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("MP3: Playing " + fileName);
    }
}
