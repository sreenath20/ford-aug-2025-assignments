package Assignment3.SmartHomeAutomationSystem;

public class Driver {
    public static void main(String[] args) {
        // Base class references
        Device[] devices = new Device[3];

        devices[0] = new SmartLight("SL001", "Living Room Light");
        devices[1] = new SmartThermostat("ST001", "Bedroom Thermostat", 22);
        devices[2] = new SmartLock("LOCK001", "Front Door Lock");

        // Loop to perform actions using polymorphism
        for (Device device : devices) {
            System.out.println("------ Performing Action ------");
            device.performAction();
            device.displayStatus();
            System.out.println();
        }
    }
}
