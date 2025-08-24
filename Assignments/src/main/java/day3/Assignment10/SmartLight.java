package day3.Assignment10;

public class SmartLight extends Device{
    public SmartLight(String deviceId, String deviceName) {
        super(deviceId, deviceName);
    }

    @Override
    public void performAction() {
        status = "On";
        System.out.println(deviceName + " is now ON (Light Glowing)");
    }
}
