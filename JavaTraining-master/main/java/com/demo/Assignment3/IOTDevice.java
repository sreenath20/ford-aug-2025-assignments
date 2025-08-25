package com.demo.Assignment3;
//-----------------------Assignment 10----------------------
public abstract class  IOTDevice {
   private String device;
    private String deviceName;
    private String status;
    public IOTDevice(String device, String deviceName, String status) {
        this.device = device;
        this.deviceName = deviceName;
        this.status = status;

    }
    String getStatus() {
        return status;
    }


    abstract void performAction();
}
class SmartLight extends IOTDevice {
    public SmartLight(String device, String deviceName, String status) {
        super(device, deviceName, status);
    }
    @Override
    public void performAction() {
        System.out.println("smartlighting system");
    }
}
class SmartThermostat extends IOTDevice {
    public SmartThermostat(String device, String deviceName, String status) {
        super(device, deviceName, status);
    }
    @Override
    public void performAction() {
        if(getStatus().equals("ON")){
            System.out.println("smartthermostat system is ON");
        }
        else{
            System.out.println("smartthermostat system is OFF");
        }
    }
}
class SmartLock extends IOTDevice {
    public SmartLock(String device, String deviceName, String status) {
        super(device, deviceName, status);
    }
    @Override
    public void performAction() {
        if(getStatus().equals("ON")){
            System.out.println("smartlock system is ON");
        }
        else{
            System.out.println("smartlock system is OFF");
        }
    }
}

class Main1{
    public static void main(String[] args){
        SmartLight smartLight = new SmartLight("SmartLight", "SmartLight", "ON");
        smartLight.performAction();
        SmartThermostat smartthermostat = new SmartThermostat("SmartThermostat", "SmartThermostat", "ON");
        smartthermostat.performAction();
        SmartLock smartLock = new SmartLock("SmartLock", "SmartLock", "ON");
        smartLock.performAction();
    }
}