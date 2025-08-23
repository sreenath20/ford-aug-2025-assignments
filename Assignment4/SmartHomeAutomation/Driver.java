package Assignment4.SmartHomeAutomation;


public class Driver {
    public static void main(String[] args) {
        SmartLight light = new SmartLight("Smart Light");
        light.turnOn();
        light.controlByVoice("Turn on the lights");

        System.out.println();

        SmartAc ac = new SmartAc("Smart AC");
        ac.turnOn();
        ac.controlByVoice("Set temperature to 22°C");
    }
}
