package com.assignments.assignment3;

public class SmartThermostat extends Device{
    public SmartThermostat(int deviceId, String deviceName, String status) {
        super(deviceId, deviceName, status);
        System.out.println("SmartThermostat");
    }

    @Override
    public void performAction() {
        if(getStatus().equals("high")){
            System.out.println("Turn ON Cooler.");
            setStatus("low");
        }else if(getStatus().equals("low")){
            System.out.println("Turn OFF Cooler.");
            setStatus("ligh");
        }
    }
}
