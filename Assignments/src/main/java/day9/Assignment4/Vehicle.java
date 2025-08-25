package day9.Assignment4;

import java.util.Objects;

public class Vehicle {
    private String plateNumber;
    private String ownerName;
    private String type;

    public Vehicle() {}

    public Vehicle(String plateNumber, String ownerName, String type) {
        this.plateNumber = plateNumber;
        this.ownerName = ownerName;
        this.type = type;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getType() {
        return type;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "plateNumber='" + plateNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != Vehicle.class) return false;
        Vehicle v = (Vehicle) o;
        return this.plateNumber.equalsIgnoreCase(v.plateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber);
    }
}
