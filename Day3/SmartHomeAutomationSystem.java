abstract class Device {
    private String deviceId;
    private String deviceName;
    private boolean status; // on/off

    public Device(String deviceId, String deviceName) {
        this.deviceId = deviceId; this.deviceName = deviceName; this.status = false;
    }
    public void setStatus(boolean status) { this.status = status; }
    public boolean getStatus() { return status; }
    public String getDeviceName() { return deviceName; }
    public abstract void performAction(String action);

    public void display() {
        System.out.println(deviceName + " (id=" + deviceId + ", status=" + (status?"on":"off") + ")");
    }
}

class SmartLight extends Device {
    public SmartLight(String id, String name) { super(id, name); }
    @Override
    public void performAction(String action) {
        if ("turnOn".equalsIgnoreCase(action)) {
            setStatus(true);
            System.out.println(getDeviceName() + " turned on.");
        } else if ("turnOff".equalsIgnoreCase(action)) {
            setStatus(false);
            System.out.println(getDeviceName() + " turned off.");
        } else {
            System.out.println("Unsupported action for light: " + action);
        }
    }
}

class SmartThermostat extends Device {
    private double temperature;
    public SmartThermostat(String id, String name) { super(id, name); this.temperature = 22.0; }
    @Override
    public void performAction(String action) {
        if (action.startsWith("setTemp:")) {
            String val = action.split(":",2)[1];
            temperature = Double.parseDouble(val);
            System.out.println(getDeviceName() + " temperature set to " + temperature + "°C");
        } else {
            System.out.println("Unsupported thermostat action: " + action);
        }
    }
}

class SmartLock extends Device {
    private boolean locked = true;
    public SmartLock(String id, String name) { super(id, name); }
    @Override
    public void performAction(String action) {
        if ("lock".equalsIgnoreCase(action)) {
            locked = true;
            System.out.println(getDeviceName() + " locked.");
        } else if ("unlock".equalsIgnoreCase(action)) {
            locked = false;
            System.out.println(getDeviceName() + " unlocked.");
        } else {
            System.out.println("Unsupported lock action: " + action);
        }
    }
}

public class SmartHomeAutomationSystem {
    public static void main(String[] args) {
        Device[] devices = {
                new SmartLight("D1","Hall Light"),
                new SmartThermostat("D2","Living Room Thermostat"),
                new SmartLock("D3","Front Door Lock")
        };

        devices[0].performAction("turnOn");
        devices[1].performAction("setTemp:20.5");
        devices[2].performAction("unlock");
    }
}
