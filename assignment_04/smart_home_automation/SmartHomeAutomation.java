package assignment_04.smart_home_automation;

public class SmartHomeAutomation {
    public static void main(String[] args) {
        System.out.println("\nSmart Home Automation Application\n");

        SmartLight sl = new SmartLight("Bed Light");
        SmartAC sac  = new SmartAC("Hall AC");

        sl.turnOn();
        sl.controlByVoice(" 'Turn on the lights' ");
        System.out.println("");

        sac.turnOn();
        sac.controlByVoice(" 'Set temperature to 22 degrees' ");
    }
}
