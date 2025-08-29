package com.assignment.day10.assignment4;

public class Vehicle {
    String plateNumber;
    String ownerName;
    String type;

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
}
