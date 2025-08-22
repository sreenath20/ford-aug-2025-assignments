package com.assignments.assignment3;

public class SmartLight extends Device {
    public SmartLight(int deviceId, String deviceName, String status) {
        super(deviceId, deviceName, status);
        System.out.println("SmartLight");
    }

    @Override
    public void performAction() {
        if(getStatus().equals("light-off")){
            System.out.println("Light On");
            setStatus("light-on");
        }else if(getStatus().equals("light-on")){
            System.out.println("Light Off");
            setStatus("light-off");
        }
    }
}
