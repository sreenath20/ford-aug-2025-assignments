package Assignment3.SmartHomeAutomationSystem;

public class SmartThermostat extends Device {
    private int temperature;

    public SmartThermostat(String deviceId, String deviceName, int defaultTemp) {
        super(deviceId, deviceName);
        this.temperature = defaultTemp;
    }

    @Override
    public void performAction() {
        status = true;
        temperature += 2;
        System.out.println("SmartThermostat adjusted temperature to " + temperature + "°C.");
    }
}
