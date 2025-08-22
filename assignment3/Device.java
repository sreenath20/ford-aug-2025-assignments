package com.assignments.assignment3;

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

    public void performAction(){

    }

}
