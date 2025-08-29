package com.assignment.day10.assignment4;

public class ParkingSlot {
    int slotId;
    String location;

    public ParkingSlot(int slotId, String location) {
        this.slotId = slotId;
        this.location = location;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
