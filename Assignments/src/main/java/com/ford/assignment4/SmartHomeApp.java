package com.ford.assignment4;

// Abstract class representing a smart device
abstract class SmartDevice {
    String deviceName;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    // Abstract method to turn on the device
    abstract void turnOn();
}

// Interface for voice control functionality
interface VoiceControl {
    void controlByVoice(String command);
}

// SmartLight class with voice control
class SmartLight extends SmartDevice implements VoiceControl {

    public SmartLight(String deviceName) {
        super(deviceName);
    }

    @Override
    void turnOn() {
        System.out.println("Turning on " + deviceName);
    }

    @Override
    public void controlByVoice(String command) {
        System.out.println(deviceName + " controlled by voice: '" + command + "'");
    }
}

// SmartAC class with voice control
class SmartAC extends SmartDevice implements VoiceControl {

    public SmartAC(String deviceName) {
        super(deviceName);
    }

    @Override
    void turnOn() {
        System.out.println("Turning on " + deviceName);
    }

    @Override
    public void controlByVoice(String command) {
        System.out.println(deviceName + " controlled by voice: '" + command + "'");
    }
}

// Main class to simulate smart home control
public class SmartHomeApp {
    public static void main(String[] args) {
        SmartDevice light = new SmartLight("Light");
        SmartDevice ac = new SmartAC("AC");

        light.turnOn();
        ((VoiceControl) light).controlByVoice("Turn on the lights");

        System.out.println();

        ac.turnOn();
        ((VoiceControl) ac).controlByVoice("Set temperature to 22°C");
    }
}
