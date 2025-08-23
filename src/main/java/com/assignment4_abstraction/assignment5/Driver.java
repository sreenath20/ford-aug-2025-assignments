package com.assignment4_abstraction.assignment5;

public class Driver {
    public static void main(String[] args) {
        SmartAC smartAC = new SmartAC();
        smartAC.turnOn();
        smartAC.controlByVoice("Set temperature to 22 degrees");

        SmartLight smartLight = new SmartLight();
        smartLight.turnOn();
        smartLight.controlByVoice("Turn on the lights");

    }
}
