package day3.Assignment10;

public class SmartThermostat extends Device{
    public SmartThermostat(String deviceId, String deviceName) {
        super(deviceId, deviceName);
    }

    @Override
    public void performAction() {
        status = "Heating";
        System.out.println(deviceName + " is set to 24°C");
    }
}
