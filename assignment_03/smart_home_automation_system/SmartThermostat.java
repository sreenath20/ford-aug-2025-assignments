package assignment_03.smart_home_automation_system;

class SmartThermostat extends Device {
    private int temperature;
    public SmartThermostat(String deviceId, String deviceName, String status, int temperature) {
        super(deviceId, deviceName, status);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void performAction() {
        if (getStatus().equals("OFF")) {
            setStatus("ON");
            System.out.println(" Smart Thermostat '" + getDeviceName() + "' activated");
            System.out.println(" Temperature adjusted to: " + temperature + "°F");
        } else {
            temperature += 2;
            System.out.println(" Smart Thermostat '" + getDeviceName() + "' temperature adjusted");
            System.out.println(" New temperature: " + temperature + "°F");
        }
    }

    public void displaySmartThermostatInfo() {
        displayDeviceInfo();
        System.out.println("Temperature: " + temperature + "°F");

    }
}