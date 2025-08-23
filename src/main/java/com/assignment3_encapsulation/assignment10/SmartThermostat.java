package com.assignment3_encapsulation.assignment10;

public class SmartThermostat extends Device {
    private int targetTemperature;
    private String mode;

    public SmartThermostat(String deviceId, String deviceName, boolean status, int targetTemperature, String mode) {
        super(deviceId, deviceName, status);
        this.targetTemperature = targetTemperature;
        this.mode = mode;
    }

    public int getTargetTemperature() {
        return targetTemperature;
    }

    public String getMode() {
        return mode;
    }

    public void setTargetTemperature(int targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public void performAction() {
        if (getStatus()) {
            setStatus(false);
            System.out.println("Smart Thermostat " + getDeviceName() + " is turning OFF");
        } else {
            setStatus(true);
            System.out.println("Smart Thermostat " + getDeviceName() + " is turning ON");
            System.out.println("Adjusting temperature to: " + targetTemperature + "°C");
            System.out.println("Mode set to: " + mode);
        }
    }

    @Override
    public void displayDeviceInfo() {
        System.out.println("=== SMART THERMOSTAT ===");
        super.displayDeviceInfo();
        System.out.println("Target Temperature: " + targetTemperature + "°C");
        System.out.println("Mode: " + mode);
        System.out.println("========================");
    }
}
