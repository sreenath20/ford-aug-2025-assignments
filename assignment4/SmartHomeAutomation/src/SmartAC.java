public class SmartAC extends SmartDevice implements VoiceControl{
    @Override
    public void turnOn() {
        System.out.println("Turning on Smart AC");
    }

    @Override
    public void controlByVoice(String command) {
    System.out.println("Smart AC controlled by voice: "+command);
    }
}
