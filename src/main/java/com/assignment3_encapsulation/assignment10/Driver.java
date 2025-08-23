package com.assignment3_encapsulation.assignment10;

public class Driver {
    public static void main(String[] args) {
        System.out.println("*** SMART HOME AUTOMATION SYSTEM ***\n");

        SmartLight smartLight = new SmartLight(
            "SL001",
            "Living Room Light",
            false,
            75,
            "Warm White"
        );

        SmartThermostat smartThermostat = new SmartThermostat(
            "ST001",
            "Main Thermostat",
            false,
            24,
            "Auto"
        );

        SmartLock smartLock = new SmartLock(
            "SK001",
            "Front Door Lock",
            true,
            "1234",
            true
        );

        Device[] devices = {smartLight, smartThermostat, smartLock};

        System.out.println("DISPLAYING ALL DEVICES:\n");

        for (int i = 0; i < devices.length; i++) {
            System.out.println("Device " + (i + 1) + ":");
            devices[i].displayDeviceInfo();
            System.out.println();
        }

        System.out.println("DEMONSTRATING POLYMORPHIC CALLS:\n");

        for (Device device : devices) {
            System.out.println("Performing action on " + device.getDeviceName() + ":");
            device.performAction();
            System.out.println();
        }

        System.out.println("PERFORMING SECOND ACTION (Toggle/Change State):\n");

        for (Device device : devices) {
            System.out.println("Performing second action on " + device.getDeviceName() + ":");
            device.performAction();
            System.out.println();
        }
    }
}
