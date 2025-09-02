package assignment_09.vehicle_parking_management;

import java.util.Objects;

public class ParkingSlot {
    int slotId;
    String location;

    public ParkingSlot(int slotId, String location) {
        this.slotId = slotId;
        this.location = location;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        ParkingSlot other = (ParkingSlot) obj;
        return slotId == other.slotId;
    }

    public int hashCode() {
        return Objects.hash(slotId);
    }

    public void displaySlot() {
        System.out.println("Slot ID: " + slotId + ", Location: " + location);
    }
}