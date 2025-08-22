package com.assignments.assignment3;

public class SmartLock extends Device{

    public SmartLock(int deviceId, String deviceName, String status) {
        super(deviceId, deviceName, status);
        System.out.println("SmartLock");
    }

    @Override
    public void performAction() {
        if(getStatus().equals("locked")){
            System.out.println("Locked");
            setStatus("unlocked");
        }else if(getStatus().equals("unlocked")){
            System.out.println("Unlocked");
            setStatus("locked");
        }
    }
}
