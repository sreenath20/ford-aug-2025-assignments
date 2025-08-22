package Day1;

import java.util.Scanner;

public class IOT_SensorNormalisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sensor byte value (0-255): ");
        String input = sc.nextLine();
        int value = Integer.valueOf(input) & 0xFF;

        String binary = Integer.toBinaryString(value);
        binary = String.format("%8s", binary).replace(' ', '0');
        System.out.println("Raw (8-bit): " + binary);

        boolean motion = (value & 1) != 0;
        boolean lightOn = (value & (1 << 1)) != 0;
        boolean doorOpen = (value & (1 << 2)) != 0;
        boolean tempHigh = (value & (1 << 3)) != 0;
        boolean smoke = (value & (1 << 4)) != 0;
        boolean batteryLow = (value & (1 << 5)) != 0;
        boolean tamper = (value & (1 << 6)) != 0;

        System.out.println("Motion detected: " + motion);
        System.out.println("Light is ON: " + lightOn);
        System.out.println("Door open: " + doorOpen);
        System.out.println("Temperature high: " + tempHigh);
        System.out.println("Smoke detected: " + smoke);
        System.out.println("Battery low: " + batteryLow);
        System.out.println("Tamper detected: " + tamper);

        if (motion && !lightOn) {
            System.out.println("Action: Turn ON the light (motion + light off).");
        }
        if (smoke && tempHigh) {
            System.out.println("ALERT: Possible fire - send emergency notification!");
        }
        if (batteryLow) {
            System.out.println("Warning: Battery low - schedule maintenance.");
        }
        if (tamper) {
            System.out.println("Security Alert: Sensor tampering detected.");
        }

        sc.close();
    }
}

