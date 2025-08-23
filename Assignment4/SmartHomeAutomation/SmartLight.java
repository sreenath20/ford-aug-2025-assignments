package Assignment4.SmartHomeAutomation;

public class SmartLight extends SmartDevice implements VoiceControl {

    public SmartLight(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on " + deviceName);
    }

    @Override
    public void controlByVoice(String command) {
        System.out.println(deviceName + " controlled by voice: '" + command + "'");
    }
}

