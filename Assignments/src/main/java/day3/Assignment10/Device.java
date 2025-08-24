package day3.Assignment10;

public class Device {
    protected String deviceId;
    protected String deviceName;
    protected String status;

    public Device(String deviceId, String deviceName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.status = "Off";
    }

    public void performAction() {
        System.out.println("Performing generic device action...");
    }
}
