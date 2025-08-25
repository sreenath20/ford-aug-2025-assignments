package assignment_01;

import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int sensorData=sc.nextInt();
        System.out.println("Sensor Raw Data (binary): " +
                String.format("%8s", Integer.toBinaryString(sensorData)).replace(' ', '0'));

        boolean motion       = (sensorData & (1 << 7)) != 0;
        boolean light        = (sensorData & (1 << 6)) != 0;
        boolean doorOpen     = (sensorData & (1 << 5)) != 0;
        boolean windowOpen   = (sensorData & (1 << 4)) != 0;
        boolean smoke        = (sensorData & (1 << 3)) != 0;
        boolean gasLeak      = (sensorData & (1 << 2)) != 0;
        boolean tempHigh     = (sensorData & (1 << 1)) != 0;
        boolean humidityHigh = (sensorData & 1) != 0;

        System.out.println("Motion Detected: " + motion);
        System.out.println("Light Status: " + (light ? "ON" : "OFF"));
        System.out.println("Door: " + (doorOpen ? "Open" : "Closed"));
        System.out.println("Window: " + (windowOpen ? "Open" : "Closed"));
        System.out.println("Smoke Detected: " + smoke);
        System.out.println("Gas Leak Detected: " + gasLeak);
        System.out.println("Temperature High: " + tempHigh);
        System.out.println("Humidity High: " + humidityHigh);
        System.out.println();
        if (motion && !light) {
            System.out.println("Motion detected - Turn ON the light.");
        }

        if (smoke || gasLeak) {
            System.out.println("Emergency! Smoke or Gas Leak detected.");
        }

        if (tempHigh && humidityHigh) {
            System.out.println("Warning: Hot and Humid conditions detected.");
        }
    }
}