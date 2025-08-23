package Assignment9.VehicleParkingManagementSystem;


import java.util.Comparator;

public class SortVehicleByOwnerName implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        return v1.getOwnerName().compareToIgnoreCase(v2.getOwnerName());
    }
}
