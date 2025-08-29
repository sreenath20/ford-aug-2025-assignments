//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SmartAC smartAC = new SmartAC();
        smartAC.turnOn();
        smartAC.controlByVoice("increase temperature by 25 degreess");

        System.out.println("__________________________");
        SmartLight smartLight = new SmartLight();
        smartLight.turnOn();
        smartLight.controlByVoice("reduce brighness by 5%");

    }
}