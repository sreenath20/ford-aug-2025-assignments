package assignment_09.vehicle_parking_management;

import java.util.Objects;

public class Vehicle {
    String plateNumber;
    String ownerName;
    String type;

    public Vehicle(String plateNumber, String ownerName, String type) {
        this.plateNumber = plateNumber;
        this.ownerName = ownerName;
        this.type = type;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Vehicle other = (Vehicle) obj;
        return plateNumber.equals(other.plateNumber);
    }

    public int hashCode() {
        return Objects.hash(plateNumber);
    }

    public void displayVehicle() {
        System.out.println("Plate: " + plateNumber + ", Owner: " + ownerName + ", Type: " + type);
    }
}
