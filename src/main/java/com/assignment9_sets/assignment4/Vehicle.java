
package com.assignment9_sets.assignment4;

import java.util.Objects;

public class Vehicle implements Comparable<Vehicle> {
    private String plateNumber;
    private String ownerName;
    private String type;

    public Vehicle(String plateNumber, String ownerName, String type) {
        this.plateNumber = plateNumber;
        this.ownerName = ownerName;
        this.type = type;
    }

    public String getPlateNumber() {
        return this.plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "Vehicle{plateNumber='" + this.plateNumber + "', ownerName='" + this.ownerName + "', type='" + this.type + "'}";
    }

    public boolean equals(Object o) {
        if (o != null && this.getClass() == o.getClass()) {
            Vehicle vehicle = (Vehicle)o;
            return Objects.equals(this.plateNumber, vehicle.plateNumber) && Objects.equals(this.ownerName, vehicle.ownerName) && Objects.equals(this.type, vehicle.type);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.plateNumber, this.ownerName, this.type});
    }

    public int compareTo(Vehicle o) {
        return this.ownerName.compareTo(o.getOwnerName());
    }
}
