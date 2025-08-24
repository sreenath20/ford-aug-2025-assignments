package day1;

public class Assignment2 {
    public static void main(String[] args) {
        int sensorInput = Integer.parseInt("42");
        String binary = Integer.toBinaryString(sensorInput | 0b10000000).substring(1);

        boolean motionDetected = (sensorInput & 0b00001000) != 0;
        boolean lightIsOff = (sensorInput & 0b00000010) == 0;

        System.out.println("Sensor Input (Binary): " + binary);
        System.out.println("Motion Detected: " + motionDetected);
        System.out.println("Light Is Off: " + lightIsOff);

        if (motionDetected && lightIsOff) {
            System.out.println("Action: Turn ON the light.");
        } else {
            System.out.println("No action required.");
        }

    }
}
