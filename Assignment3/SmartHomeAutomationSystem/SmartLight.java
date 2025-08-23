package Assignment3.SmartHomeAutomationSystem;

public class SmartLight extends Device {
    public SmartLight(String deviceId, String deviceName) {
        super(deviceId, deviceName);
    }

    @Override
    public void performAction() {
        toggleStatus();
        System.out.println("SmartLight is now " + (status ? "illuminating the room." : "turned off."));
    }
}
