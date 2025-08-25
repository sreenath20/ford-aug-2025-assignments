package assignment_03.smart_home_automation_system;

class Device {
    private String deviceId;
    private String deviceName;
    private String status;

    public Device(String deviceId, String deviceName, String status) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.status = status;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getStatus() {
        return status;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void performAction() {
        System.out.println("Generic device action performed on " + deviceName);
    }

    public void displayDeviceInfo() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Device Name: " + deviceName);
        System.out.println("Status: " + status);
    }
}
