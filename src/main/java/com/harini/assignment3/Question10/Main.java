package com.harini.assignment3.Question10;

public class Main {
    public static void main(String[] args) {
        Device d1 = new SmartLight("D101", "Living Room Light");
        Device d2 = new SmartThermostat("D102", "Bedroom Thermostat");
        Device d3 = new SmartLock("D103", "Main Door Lock");
        d1.performAction();
        d2.performAction();
        d3.performAction();
    }
}
