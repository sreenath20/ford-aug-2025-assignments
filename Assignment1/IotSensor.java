package Assignment1;

public class IotSensor {
    public static void main(String[] args) {
        int sensorData = 0b10100101; // Example: 165

        String binary = Integer.toBinaryString(sensorData | 0b100000000).substring(1);
        System.out.println("Binary Sensor Data: " + binary);

        boolean motion = true;
        boolean light = false;

        if (!light) {
            System.out.println("Action: Turn ON the light (Motion detected, light is OFF)");
        } else if (motion) {
            System.out.println("Status: Motion detected, light is ON");
        } else {
            System.out.println("Status: No motion detected");
        }
    }
}
