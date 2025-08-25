package assignment_03.smart_home_automation_system;

public class SmartHomeAutomationSystem {
    public static void main(String[] args) {
        System.out.println(" Welcome to Smart Home Automation System! \n");

        System.out.println("--- Creating Smart Devices ---");
        SmartLight livingRoomLight = new SmartLight("LIGHT001", "Living Room Light", "OFF", 75);
        SmartThermostat mainThermostat = new SmartThermostat("THERMO001", "Main Thermostat", "OFF", 72);
        SmartLock frontDoorLock = new SmartLock("LOCK001", "Front Door Lock", "LOCKED", "1234");

        livingRoomLight.displaySmartLightInfo();
        System.out.println();
        mainThermostat.displaySmartThermostatInfo();
        System.out.println();
        frontDoorLock.displaySmartLockInfo();
        System.out.println();

        System.out.println("Simulating 'Welcome Home' automation:");

        Device[] homeDevices = {
                new SmartLock("LOCK003", "Main Entrance", "LOCKED", "HOME123"),
                new SmartLight("LIGHT003", "Hallway Light", "OFF", 80),
                new SmartThermostat("THERMO003", "Home Thermostat", "OFF", 70)
        };

        for (int i = 0; i < homeDevices.length; i++) {
            System.out.println("Step " + (i + 1) + ":");
            homeDevices[i].performAction();
            System.out.println();
        }

    }
}
