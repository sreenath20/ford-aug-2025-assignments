package assignment_09.vehicle_parking_management;

import java.util.Comparator;

public class OwnerComparator implements Comparator<Vehicle> {
    public int compare(Vehicle v1, Vehicle v2) {
        return v1.ownerName.compareTo(v2.ownerName);
    }
}