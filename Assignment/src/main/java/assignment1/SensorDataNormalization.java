package assignment1;

public class SensorDataNormalization {
    public static void main(String[] args) {

        byte sensorMask = 0b00000001;

        byte lightSensorInput = 0b000001;
        byte gasSensorInput = 0b111111;
        byte waterSensorInput = 0b000010;
        byte doorSensorInput = 0b0001000;
        byte windowSensorInput = 0b100000;
        byte temperatureSensorInput = 0b100000;
        byte thiefSensorInput = (byte) 01000000;
        byte smokeSensorInput = (byte) 10000000;


        int lightcheck = sensorMask & (lightSensorInput);
        System.out.println("Lights are - " + (lightcheck == 1 ? "ON" : "OFF"));

        int gascheck = sensorMask & (gasSensorInput >> 1);
        System.out.println("Gas check - " + (gascheck == 1 ? "Leakage found" : "All good"));

        int watercheck = sensorMask & (waterSensorInput >> 2);
        System.out.println("Water check - " + (watercheck == 1 ? "Water spillage noticed" : "No water leakage"));

        int doorcheck = sensorMask & (doorSensorInput >> 3);
        System.out.println("Check for open doors - " + (doorcheck == 1 ? "Doors are open" : "All doors are closed"));

        int windowcheck = sensorMask & (windowSensorInput >> 4);
        System.out.println("check for open windows - " + (windowcheck == 1 ? "Windows are open" : "All windows are closed"));

        int temperaturecheck = sensorMask & (temperatureSensorInput >> 5);
        System.out.println("Temperature check - " + (temperaturecheck == 1 ? "High temperature noticed" : " The temperature is normal"));

        int thiefcheck = sensorMask & (thiefSensorInput >> 6);
        System.out.println("Scanning for intruders - " + (thiefcheck == 1 ? "Alert Intruders at home" : "The house is safe from intruders"));

        int smokecheck = sensorMask & (smokeSensorInput >> 7);
        System.out.println("Smoke detection - " + (smokecheck == 1 ? "Smoke dectected inside home" : "No smoke"));


    }
}
