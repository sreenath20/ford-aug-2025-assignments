package com.fullstackabi.assignment.Assign9.Ex4SetMap;

import java.util.Objects;

public class Vehicle {
    String plateNumber;
    String ownerName;
    String type;
    public Vehicle(){

    }
    public Vehicle(String plateNumber, String ownerName, String type) {
        this.plateNumber = plateNumber;
        this.ownerName = ownerName;
        this.type = type;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getType() {
        return type;
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
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(plateNumber, vehicle.plateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(plateNumber);
    }
}
