package Assignment9.VehicleParkingManagementSystem;

import java.util.Objects;

public class ParkingSlot {
    private int slotId;
    private String location;

    public ParkingSlot() {}

    public ParkingSlot(int slotId, String location) {
        this.slotId = slotId;
        this.location = location;
    }

    public int getSlotId() {
        return slotId;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "slotId=" + slotId +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != ParkingSlot.class) return false;
        ParkingSlot ps = (ParkingSlot) o;
        return this.slotId == ps.slotId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(slotId);
    }
}

