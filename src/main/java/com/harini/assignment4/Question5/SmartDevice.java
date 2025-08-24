package com.harini.assignment4.Question5;

public abstract class SmartDevice {
    String deviceName;
    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }
    public abstract void turnOn();
}
