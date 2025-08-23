
abstract class SmartDevice {
    protected String deviceName;

    protected SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    abstract void turnOn();
}

interface VoiceControl {
    void controlByVoice(String command);
}

class SmartLight extends SmartDevice implements VoiceControl {
    public SmartLight() {
        super("Smart Light");
    }

    @Override
    void turnOn() {
        System.out.println("Turning on Smart Light");
    }

    @Override
    public void controlByVoice(String command) {
        System.out.println("Smart Light controlled by voice: '" + command + "'");
    }
}

class SmartAC extends SmartDevice implements VoiceControl {
    public SmartAC() {
        super("Smart AC");
    }

    @Override
    void turnOn() {
        System.out.println("Turning on Smart AC");
    }

    @Override
    public void controlByVoice(String command) {
        System.out.println("Smart AC controlled by voice: '" + command + "'");
    }
}

public class SmartHomeAutomation {
    public static void main(String[] args) {
        SmartLight light = new SmartLight();
        light.turnOn();
        light.controlByVoice("Turn on the lights");

        SmartAC ac = new SmartAC();
        ac.turnOn();
        ac.controlByVoice("Set temperature to 22°C");
    }
}
