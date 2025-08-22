package com.assignments.assignment9;

import java.util.Objects;

public class ParkingSlot implements Comparable<ParkingSlot> {
    Integer slotId;
    String location;

    public ParkingSlot(){}
    public ParkingSlot(Integer slotId){
        this.slotId = slotId;
    }
    public ParkingSlot(Integer slotId, String location){
        this.slotId = slotId;
        this.location = location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ParkingSlot that = (ParkingSlot) o;
        return Objects.equals(slotId, that.slotId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(slotId);
    }

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "slotId=" + slotId +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public int compareTo(ParkingSlot o) {
        return slotId.compareTo(o.slotId);
    }
}
