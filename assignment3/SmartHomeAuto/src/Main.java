public class Main {
    public static void main(String[] args) {

        Device philips = new SmartLight(1000222, "Living Room Light", "OFF");
        Device thermometer = new SmartThermometer(455566, "Hall Thermostat", "IDLE");
        Device lock = new SmartLock(988787, "Main Door Lock", "UNLOCKED");
        Device[] devices = {philips, thermometer, lock};

        for (Device device : devices) {
            System.out.println("Device: " + device.getDeviceName());
            System.out.println("Initial Status: " + device.getStatus());
            device.performAction();
            System.out.println("Updated Status: " + device.getStatus());
            System.out.println("---------------------------");
        }

    }
}