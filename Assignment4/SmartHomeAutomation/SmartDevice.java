package Assignment4.SmartHomeAutomation;

public abstract class SmartDevice {
    protected String deviceName;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public abstract void turnOn();
}

