package com.harini.assignment4.Question5;

public class Main {
    public static void main(String[] args) {
        SmartAC smartAC = new SmartAC("SmartAC");
        smartAC.turnOn();
        smartAC.controlByVoice("'Set temperature to 22°C'");
        SmartLight smartLight = new SmartLight("SmartLight");
        smartLight.turnOn();
        smartLight.controlByVoice("'Turn on Light");
    }
}
