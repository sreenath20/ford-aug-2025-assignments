package com.assignments.assignment9;

import java.util.Objects;

public class Vehicle implements Comparable<Vehicle>{
    String plateNumber;
    String ownerName;
    String type;

    public Vehicle(){}
    public Vehicle(String plateNumber){this.plateNumber=plateNumber;}
    public Vehicle(String plateNumber,String ownerName,String type){
        this.plateNumber=plateNumber;
        this.ownerName=ownerName;
        this.type=type;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setType(String type) {
        this.type = type;
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

    @Override
    public String toString() {
        return "Vehicle{" +
                "plateNumber='" + plateNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int compareTo(Vehicle o) {
        return ownerName.compareTo(o.ownerName);
    }
}
