package day4.Assignment5;

public abstract class SmartDevice {
    String deviceName;
    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }
    public abstract void turnOn();
}
