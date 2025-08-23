package com.fullstackabi.assignment.Assign9.CollectionsSetMap.Ex4SetMap;

public class ParkingSystemDriver extends ParkingSystem {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("TNCA001", "John", "Car");
        Vehicle vehicle2 = new Vehicle("TNCA002", "Frank", "Bike");
        Vehicle vehicle3 = new Vehicle("TNCA003", "Oliver", "Truck");
        Vehicle vehicle4 = new Vehicle("TNCA004", "Flavia", "Car");

//        ParkingSlot parkingSlot1 = new ParkingSlot(101, "Lane1");
//        ParkingSlot parkingSlot2 = new ParkingSlot(102, "Lane2");
//        ParkingSlot parkingSlot3 = new ParkingSlot(103, "Lane3");
        // ParkingSlot parkingSlot4 = new ParkingSlot(100,"Lane4");
        ParkingSystem parkingSystem = new ParkingSystem();

        //CRUD operations:
        //o Park a vehicle in a slot.
        parkingSystem.parkVehicle(vehicle1);
        parkingSystem.parkVehicle(vehicle2);
        parkingSystem.parkVehicle(vehicle3);

        //o Remove a vehicle when it exits.
        parkingSystem.removeVehicle(vehicle1);

//        //o Update vehicle details.
        parkingSystem.updateVehicleDetails(vehicle2);

        //o View all occupied slots.
        parkingSystem.occupiedSlots();

        //Searching:
        //o Find which slot a given vehicle is parked in.
        parkingSystem.findSlotByVehicle(vehicle3.getPlateNumber());

        //o Find all vehicles of type “SUV” or “Bike”.
        parkingSystem.findVehiclesByType("Car", "Truck");

        //Sorting:
        //o Display all vehicles sorted by owner’s name.
        parkingSystem.displayVehiclesSortedByOwnerName();

        //o Display all slots sorted by slotId.
        parkingSystem.displaySlotsSortedBySlotId();


    }


}
