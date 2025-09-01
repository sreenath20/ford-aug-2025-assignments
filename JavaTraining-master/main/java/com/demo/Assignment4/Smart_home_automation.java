package com.demo.Assignment4;

import java.sql.SQLOutput;

public class Smart_home_automation {

   public static void main(String[] args) {
       SmartLight smartLight = new SmartLight();
       smartLight.turnOn();
       smartLight.controlByVoice("TurnON");
       SmartAc smartAc = new SmartAc();
       smartAc.turnOn();
       smartAc.controlByVoice("TurnOFF");

   }
}
abstract class SmartDevice{
    String deviceName;
    abstract void turnOn();
}
interface VoiceControl{
    void controlByVoice(String command);
    }
class SmartLight extends SmartDevice implements VoiceControl{


    @Override
    void turnOn() {
        System.out.println("Turning on SmartLight");
    }

    @Override
    public void controlByVoice(String command){
        System.out.println("Controling SmartLight by Voice");
    }
}
class SmartAc extends SmartDevice implements VoiceControl{
    @Override
    public void controlByVoice(String command){
        System.out.println("Controling SmartAc by Voice"+command);
    }
    void turnOn() {
        System.out.println("Turning on SmartAc");
    }
}
