package javatopic.day10_collections_set.assignments.assignment4;

public class ParkingSlot {
    private Integer slotId;
    private String location;


    public ParkingSlot() {
    }
    public ParkingSlot(Integer slotId, String location) {
        this.slotId = slotId;
        this.location = location;

    }

    public Integer getSlotId() {
        return slotId;
    }

    public void setSlotId(Integer slotId) {
        this.slotId = slotId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "slotId=" + slotId +
                ", location='" + location + '\'' +
                '}';
    }

}
