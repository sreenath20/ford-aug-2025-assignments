package com.assignment3_encapsulation.assignment10;

public class SmartLock extends Device {
    private String accessCode;
    private boolean isLocked;

    public SmartLock(String deviceId, String deviceName, boolean status, String accessCode, boolean isLocked) {
        super(deviceId, deviceName, status);
        this.accessCode = accessCode;
        this.isLocked = isLocked;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public boolean getIsLocked() {
        return isLocked;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public void setIsLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }

    @Override
    public void performAction() {
        if (getStatus()) {
            if (isLocked) {
                isLocked = false;
                System.out.println("Smart Lock " + getDeviceName() + " is UNLOCKING");
                System.out.println("Access granted with code: " + accessCode);
            } else {
                isLocked = true;
                System.out.println("Smart Lock " + getDeviceName() + " is LOCKING");
                System.out.println("Security enabled");
            }
        } else {
            setStatus(true);
            System.out.println("Smart Lock " + getDeviceName() + " is powering ON");
            System.out.println("Lock status: " + (isLocked ? "LOCKED" : "UNLOCKED"));
        }
    }

    @Override
    public void displayDeviceInfo() {
        System.out.println("=== SMART LOCK ===");
        super.displayDeviceInfo();
        System.out.println("Access Code: " + accessCode);
        System.out.println("Lock Status: " + (isLocked ? "LOCKED" : "UNLOCKED"));
        System.out.println("==================");
    }
}
