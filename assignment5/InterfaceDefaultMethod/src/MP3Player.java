public class MP3Player implements MusicPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("Playing MP3Player: "+fileName);
    }

    @Override
    public void stop() {
        MusicPlayer.super.stop();
    }
}
