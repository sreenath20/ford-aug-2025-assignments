package com.assignment.day5.assignment5;

abstract class SmartDevice{
    String deviceName;
    abstract void turnOn();

    public SmartDevice() {
    }

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }
}

interface voiceControl {
    void controlByVoice(String command);
}

class SmartLight extends SmartDevice implements voiceControl {
    public SmartLight() {
    }

    public SmartLight(String deviceName) {
        super(deviceName);
    }

    @Override
    void turnOn() {
        System.out.println("Turning on " + deviceName);
    }

    @Override
    public void controlByVoice(String command) {
        System.out.println("Smart Light controlled by voice: " + command);
    }
}

class SmartAC extends SmartDevice implements voiceControl {
    public SmartAC() {
    }

    public SmartAC(String deviceName) {
        super(deviceName);
    }

    @Override
    void turnOn() {
        System.out.println("Turning on " + deviceName);
    }

    @Override
    public void controlByVoice(String command) {
        System.out.println("Smart AC controlled by voice: " + command);
    }
}

public class Day5Assignment5 {
    public static void main(String[] args) {

        SmartLight smartLight = new SmartLight("Living Room Light");
        smartLight.turnOn();
        smartLight.controlByVoice("Turn on the light");
        System.out.println();
        SmartAC smartAC = new SmartAC("Bedroom AC");
        smartAC.turnOn();
        smartAC.controlByVoice("Set AC to 24 degrees");

    }
}
