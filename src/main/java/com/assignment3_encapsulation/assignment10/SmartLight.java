package com.assignment3_encapsulation.assignment10;

public class SmartLight extends Device {
    private int brightness;
    private String color;

    public SmartLight(String deviceId, String deviceName, boolean status, int brightness, String color) {
        super(deviceId, deviceName, status);
        this.brightness = brightness;
        this.color = color;
    }

    public int getBrightness() {
        return brightness;
    }

    public String getColor() {
        return color;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void performAction() {
        if (getStatus()) {
            setStatus(false);
            System.out.println("Smart Light " + getDeviceName() + " is turning OFF");
        } else {
            setStatus(true);
            System.out.println("Smart Light " + getDeviceName() + " is turning ON");
            System.out.println("Brightness set to: " + brightness + "%");
            System.out.println("Color set to: " + color);
        }
    }

    @Override
    public void displayDeviceInfo() {
        System.out.println("=== SMART LIGHT ===");
        super.displayDeviceInfo();
        System.out.println("Brightness: " + brightness + "%");
        System.out.println("Color: " + color);
        System.out.println("===================");
    }
}
