public class Device {
    private int deviceId;
    private String deviceName;
    private String status;

    public Device(int deviceId, String deviceName, String status) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.status = status;


    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void performAction() {
        System.out.println("Performing action...");
    }

}
class SmartLight extends Device {
    public SmartLight(int deviceId, String deviceName, String status) {
        super(deviceId, deviceName, status);
    }
    public void performAction() {
        System.out.println("Turning on the smart light: " + getDeviceName());
        setStatus("ON");
    }
}

class SmartThermometer extends Device {

    public SmartThermometer(int deviceId, String deviceName, String status) {
        super(deviceId, deviceName, status);
    }
    public void performAction() {
        System.out.println("Measuring the temperature : " + getDeviceName() + " 22°C");
        setStatus("Room Temperature");
    }
}

class SmartLock extends Device {

    public SmartLock(int deviceId, String deviceName, String status) {
        super(deviceId, deviceName, status);
    }
    public void performAction() {
        System.out.println("Locking the smart lock: " + getDeviceName());
        setStatus("LOCKED");
    }
}
