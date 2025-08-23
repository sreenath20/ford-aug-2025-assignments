package com.assignment3_encapsulation.assignment10;

public abstract class Device {
    private String deviceId;
    private String deviceName;
    private boolean status;

    public Device(String deviceId, String deviceName, boolean status) {
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

    public boolean getStatus() {
        return status;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public abstract void performAction();

    public void displayDeviceInfo() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Device Name: " + deviceName);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}
