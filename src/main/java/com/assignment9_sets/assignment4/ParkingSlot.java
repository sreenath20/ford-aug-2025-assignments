
package com.assignment9_sets.assignment4;

import java.util.Objects;

public class ParkingSlot implements Comparable<ParkingSlot> {
    private Integer slotid;
    private String location;

    public ParkingSlot(Integer slotid, String location) {
        this.slotid = slotid;
        this.location = location;
    }

    public Integer getSlotid() {
        return this.slotid;
    }

    public void setSlotid(Integer slotid) {
        this.slotid = slotid;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toString() {
        return "ParkingSlot{slotid=" + this.slotid + ", location='" + this.location + "'}";
    }

    public boolean equals(Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            ParkingSlot that = (ParkingSlot)o;
            return Objects.equals(this.slotid, that.slotid) && Objects.equals(this.location, that.location);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.slotid, this.location});
    }

    public int compareTo(ParkingSlot o) {
        return this.slotid.compareTo(o.slotid);
    }
}
