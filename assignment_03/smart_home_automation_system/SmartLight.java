package assignment_03.smart_home_automation_system;

class SmartLight extends Device {
    private int brightness;

    public SmartLight(String deviceId, String deviceName, String status, int brightness) {
        super(deviceId, deviceName, status);
        this.brightness = brightness;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public void performAction() {
        if (getStatus().equals("OFF")) {
            setStatus("ON");
            System.out.println(" Smart Light '" + getDeviceName() + "' turned ON");
            System.out.println(" Brightness set to: " + brightness + "%");
        } else {
            setStatus("OFF");
            System.out.println(" Smart Light '" + getDeviceName() + "' turned OFF");
        }
    }

    public void displaySmartLightInfo() {
        displayDeviceInfo();
        System.out.println("Brightness: " + brightness + "%");
    }

}
