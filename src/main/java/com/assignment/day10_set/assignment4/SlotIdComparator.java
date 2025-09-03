package com.assignment.day10_set.assignment4;

import java.util.Comparator;

public class SlotIdComparator implements Comparator<ParkingSlot> {
    @Override
    public int compare(ParkingSlot o1, ParkingSlot o2) {
        return Integer.compare(o1.getSlotId(), o2.getSlotId());
    }
}

