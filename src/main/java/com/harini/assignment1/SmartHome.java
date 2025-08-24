package com.harini.assignment1;

public class SmartHome {


        public static void processSensorData(int data) {
            String binary = String.format("%8s", Integer.toBinaryString(data)).replace(' ', '0');
            System.out.println("Raw sensor byte: " + binary);

            boolean motion = (data & 0x80) != 0;
            boolean lightOn = (data & 0x40) != 0;
            boolean doorOpen = (data & 0x20) != 0;
            boolean windowOpen = (data & 0x10) != 0;
            boolean smoke = (data & 0x08) != 0;
            boolean waterLeak = (data & 0x04) != 0;
            boolean tempHigh = (data & 0x02) != 0;
            boolean tempLow = (data & 0x01) != 0;


            System.out.println("Motion Detected: " + motion);
            System.out.println("Light is On: " + lightOn);
            System.out.println("Door Open: " + doorOpen);
            System.out.println("Window Open: " + windowOpen);
            System.out.println("Smoke Detected: " + smoke);
            System.out.println("Water Leak: " + waterLeak);
            System.out.println("Temperature High: " + tempHigh);
            System.out.println("Temperature Low: " + tempLow);


            if (motion && !lightOn) {
                System.out.println("Motion detected and light is OFF → Turning ON the light.");
            }

            if (smoke || waterLeak) {
                System.out.println("ALERT: Smoke or Water Leak detected! Notify authorities.");
            }

            if (tempHigh) {
                System.out.println("Warning: Temperature is too high!");
            } else if (tempLow) {
                System.out.println("Warning: Temperature is too low!");
            }

            if (doorOpen) {
                System.out.println("Notice: Door is open.");
            }

            if (windowOpen) {
                System.out.println("Notice: Window is open.");
            }

            if (!motion && lightOn) {
                System.out.println("No motion detected but light is ON → Consider turning OFF the light.");
            }
        }

        public static void main(String[] args) {

            int sampleData = 0b10000000; 
            processSensorData(sampleData);

            System.out.println("\n--------------------------\n");

            sampleData = 0b10000000 | 0b00000000; 
            processSensorData(sampleData);

            System.out.println("\n--------------------------\n");

            sampleData = 0b10001000; 
            processSensorData(sampleData);
        }


}
