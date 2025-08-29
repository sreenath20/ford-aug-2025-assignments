import java.util.Objects;

public class ParkingSlot {
    private int slotId;
    private String location;

    public ParkingSlot() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ParkingSlot that = (ParkingSlot) o;
        return slotId == that.slotId;
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
}
