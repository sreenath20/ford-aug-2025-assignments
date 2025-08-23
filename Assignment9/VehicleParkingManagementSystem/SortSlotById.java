package Assignment9.VehicleParkingManagementSystem;

import java.util.Comparator;

public class SortSlotById implements Comparator<ParkingSlot> {
    @Override
    public int compare(ParkingSlot s1, ParkingSlot s2) {
        return Integer.compare(s1.getSlotId(), s2.getSlotId());
    }
}
