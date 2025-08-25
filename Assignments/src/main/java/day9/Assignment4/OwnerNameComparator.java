package day9.Assignment4;

import java.util.Comparator;

public class OwnerNameComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        return v1.getOwnerName().compareTo(v2.getOwnerName());
    }

}
