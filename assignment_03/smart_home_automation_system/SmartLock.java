package assignment_03.smart_home_automation_system;

class SmartLock extends Device {
    private String lockCode;

    public SmartLock(String deviceId, String deviceName, String status, String lockCode) {
        super(deviceId, deviceName, status);
        this.lockCode = lockCode;
    }

    public String getLockCode() {
        return lockCode;
    }

    public void setLockCode(String lockCode) {
        this.lockCode = lockCode;
    }

    @Override
    public void performAction() {
        if (getStatus().equals("LOCKED")) {
            setStatus("UNLOCKED");
            System.out.println(" Smart Lock '" + getDeviceName() + "' UNLOCKED");
            System.out.println(" Access granted with code: " + lockCode);
        } else {
            setStatus("LOCKED");
            System.out.println(" Smart Lock '" + getDeviceName() + "' LOCKED");
            System.out.println(" Security enabled");
        }
    }

    public void displaySmartLockInfo() {
        displayDeviceInfo();
        System.out.println("Lock Code: " + lockCode);
    }
}