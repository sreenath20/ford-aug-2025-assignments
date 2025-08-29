public class SmartLight extends SmartDevice implements VoiceControl{

    @Override
    public void turnOn() {
        System.out.println("Turning on Smart Light");

    }

    @Override
    public void controlByVoice(String command) {
    System.out.println("Smart Light controlled by voice: "+command);
    }
}
