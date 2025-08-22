package com.assignments.assignment4;

public abstract class SmartDevice {
    String deviceName;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }
    public abstract void turnOn();

}
