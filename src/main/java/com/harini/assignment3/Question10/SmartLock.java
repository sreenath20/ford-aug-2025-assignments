package com.harini.assignment3.Question10;

public class SmartLock extends Device{
    public SmartLock(String deviceId, String deviceName) {
        super(deviceId, deviceName);
    }

    @Override
    public void performAction() {
        status = "Locked";
        System.out.println(deviceName + " is now LOCKED");
    }
}
