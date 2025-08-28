package com.assignment.day4.assignment10;

class Device{
    int deviceId;
    String deviceName;
    String status;

    public Device(){
    }

    public Device(int deviceId, String deviceName, String status) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.status = status;
    }

    public void performAction() {
        System.out.println("Performing action on device: " + deviceName);
    }

}

class SmartLight extends Device {
    public SmartLight(int deviceId, String deviceName, String status) {
        super(deviceId, deviceName, status);
    }
    @Override
    public void performAction() {
        System.out.println("Turning on the smart light: " + deviceName);
    }
}

class SmartThermostat extends Device {
    public SmartThermostat(int deviceId, String deviceName, String status) {
        super(deviceId, deviceName, status);
    }
    @Override
    public void performAction() {
        System.out.println("Adjusting the temperature on the smart thermostat: " + deviceName);
    }
}

class SmartLock extends Device {
    public SmartLock(int deviceId, String deviceName, String status) {
        super(deviceId, deviceName, status);
    }
    @Override
    public void performAction() {
        System.out.println("Locking the smart lock: " + deviceName);
    }
}

public class Day4Assignment10 {
    public static void main(String[] args) {
        Device device1 = new SmartLight(1, "Living Room Light", "ON");
        Device device2 = new SmartThermostat(2, "Home Thermostat", "OFF");
        Device device3 = new SmartLock(3, "Front Door Lock", "LOCKED");
        Device[] devices = {device1, device2, device3};
        for (Device device : devices) {
            device.performAction();
        }
    }
}
