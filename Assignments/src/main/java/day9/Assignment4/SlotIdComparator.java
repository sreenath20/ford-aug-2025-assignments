package day9.Assignment4;

import java.util.Comparator;

public class SlotIdComparator implements Comparator<ParkingSlot> {
    @Override
    public int compare(ParkingSlot s1, ParkingSlot s2) {
        return Integer.compare(s1.getSlotId(), s2.getSlotId());
    }
}
