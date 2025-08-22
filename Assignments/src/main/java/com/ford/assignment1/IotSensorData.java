package com.ford.assignment1;
import java.util.Scanner;

public class IotSensorData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 8-bit sensor integer : ");
        Integer sensorData  = sc.nextInt();


        if (sensorData < 0 || sensorData > 255) {
            System.out.println("Invalid input - must be 8-bit integer .");

            return;
        }

        String binaryString = String.format("%8s", Integer.toBinaryString(sensorData)).replace(' ', '0');
        System.out.println("Binary representation: " + binaryString);



        boolean motionDetected = (sensorData & 0b10000000) != 0;
        boolean lightOn = (sensorData & 0b01000000) != 0;
        boolean tempAlert = (sensorData & 0b00100000) != 0;

        if (motionDetected && !lightOn) {
            System.out.println("Motion detected & light off: Turning on light.");
        } else if (motionDetected) {
            System.out.println("Motion detected & light already on.");
        } else {
            System.out.println("No motion detected.");
        }

        if (tempAlert) {
            System.out.println("Temperature alert! Check sensor.");
        } else {
            System.out.println("Temperature normal.");
        }

        // Display other bits as flags for demo
        System.out.println("Other signal bits (bits 4-0): " + binaryString.substring(3));


    }
}
