package day4.Assignment5;

public class Driver {
    public static void main(String[] args) {
        SmartAC smartAC = new SmartAC("SmartAC");
        smartAC.turnOn();
        smartAC.controlByVoice("'Set temperature to 22°C'");
        SmartLight smartLight = new SmartLight("SmartLight");
        System.out.println();
        smartLight.turnOn();
        smartLight.controlByVoice("'Turn on Lights'");
    }
}
