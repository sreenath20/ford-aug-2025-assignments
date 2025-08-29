public class WAVPlayer implements MusicPlayer
{
    @Override
    public void play(String fileName) {
    System.out.println("Playing WAV file: "+fileName);
    }

    @Override
    public void stop() {
        MusicPlayer.super.stop();
    }
}
