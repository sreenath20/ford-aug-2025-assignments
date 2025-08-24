package day4.Assignment5;

public class SmartAC extends SmartDevice implements VoiceControl {
    public SmartAC(String deviceName) {
        super(deviceName);
    }

    @Override
    public void controlByVoice(String command) {
        System.out.println("Smart AC controlled by voice: "+command);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on "+deviceName);
    }
}
