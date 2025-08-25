package assignment_04.smart_home_automation;

public class SmartLight extends SmartDevice implements VoiceControl {
    public SmartLight(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on " + getDeviceName());
    }

    @Override
    public void controlByVoice(String command) {
        System.out.println(getDeviceName()+" controlled by voice:" +  command);
    }
}
