package Assignment3.SmartHomeAutomationSystem;

abstract class Device {
    protected String deviceId;
    protected String deviceName;
    protected boolean status;

    public Device(String deviceId, String deviceName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.status = false;
    }

    public void toggleStatus() {
        status = !status;
    }

    public abstract void performAction(); // to be overridden

    public void displayStatus() {
        System.out.println(deviceName + " [" + deviceId + "] is " + (status ? "ON" : "OFF"));
    }
}
