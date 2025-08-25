package assignment_05.music_player_application;

class WAVPlayer implements MusicPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing WAV file: " + fileName);
    }
}