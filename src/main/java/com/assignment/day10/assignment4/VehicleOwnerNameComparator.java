package com.assignment.day10.assignment4;

import java.util.Comparator;

public class VehicleOwnerNameComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return o1.getOwnerName().compareTo(o2.getOwnerName());
    }
}
