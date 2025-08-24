package day3.Assignment10;

public class Driver {
    public static void main(String[] args) {
        Device d1 = new SmartLight("SL101", "Living Room Light");
        Device d2 = new SmartThermostat("ST102", "Bedroom Thermostat");
        Device d3 = new SmartLock("SML103", "Main Door Lock");
        d1.performAction();
        d2.performAction();
        d3.performAction();
    }
}
