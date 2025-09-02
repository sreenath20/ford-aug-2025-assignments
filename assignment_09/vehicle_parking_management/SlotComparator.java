package assignment_09.vehicle_parking_management;

import java.util.Comparator;

public class SlotComparator implements Comparator<ParkingSlot> {
    public int compare(ParkingSlot s1, ParkingSlot s2) {
        return Integer.compare(s1.slotId, s2.slotId);
    }
}