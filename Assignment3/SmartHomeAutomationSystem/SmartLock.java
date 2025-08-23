package Assignment3.SmartHomeAutomationSystem;

public class SmartLock extends Device {
    public SmartLock(String deviceId, String deviceName) {
        super(deviceId, deviceName);
    }

    @Override
    public void performAction() {
        toggleStatus();
        System.out.println("SmartLock is now " + (status ? "locked." : "unlocked."));
    }
}
