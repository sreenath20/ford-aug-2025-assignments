import java.util.Scanner;

public class iotSensor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IoT Sensor Data : ");

        short parsedData = sc.nextShort();
        System.out.println("Binary form of data : " + Integer.toBinaryString(parsedData));

        int motionMask = 1 << 7;
        int lightMask = 1 << 6;
        int temperatureMask = 1 << 5;
        int smokeMask = 1 << 4;

        boolean motionDetected = (parsedData & motionMask) != 0;
        boolean lightOn = (parsedData & lightMask) != 0;
        Boolean smokeDetected = (parsedData & smokeMask) != 0;
        Boolean highTemperature = (parsedData & temperatureMask) != 0;

        if (motionDetected && !lightOn)
            System.out.println("Turn On the light");
        else if (!motionDetected && lightOn)
            System.out.println("No motion detected ,Turn Off the light");
        if (smokeDetected && highTemperature)
            System.out.println("High Temperature & Smoke Detected !!!");
        else if (highTemperature)
            System.out.println("High Temperature detected !!! Check the cooling system.");
        else if (smokeDetected)
            System.out.println("Smoke Detected !!! Alert the maintenance team.");
    }

}
