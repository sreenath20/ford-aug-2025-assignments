package com.assignment.day10_set.assignment4;

import java.util.*;

public class Day10Assignment4 {
    public static void main(String[] args) {
        Set<Vehicle> vehicles = new HashSet<>();
        vehicles.add(new Vehicle("KA01AB1234", "Alice", "Car"));
        vehicles.add(new Vehicle("KA02CD5678", "Bob", "Bike"));
        vehicles.add(new Vehicle("KA03EF9012", "Charlie", "Truck"));

        Map<ParkingSlot,Vehicle> parkingMap = new HashMap<>();

        List<Vehicle> vehicleList = new ArrayList<>(vehicles);

        //park a vehicle
        ParkingSlot slot1 = new ParkingSlot(1, "A1");
        parkingMap.put(slot1, vehicleList.get(0));
        System.out.println("Vehicle parked at slot " + slot1.getSlotId() + ": " + parkingMap.get(slot1).getPlateNumber());

        ParkingSlot slot2 = new ParkingSlot(2, "B2");
        parkingMap.put(slot2, vehicleList.get(1));
        System.out.println("Vehicle parked at slot " + slot2.getSlotId() + ": " + parkingMap.get(slot2).getPlateNumber());

        //remove a vehicle
        parkingMap.remove(slot1);
        System.out.println("Vehicle at slot " + slot1.getSlotId() + " removed.");

        //update parking slot for a vehicle
        ParkingSlot slot3 = new ParkingSlot(3, "C3");
        parkingMap.put(slot3, vehicleList.get(1)); // Bob moves to slot
        parkingMap.remove(slot2); // remove from old slot
        System.out.println("Vehicle " + vehicleList.get(1).getPlateNumber() + " moved to slot " + slot3.getSlotId());

        //display all parked vehicles
        System.out.println("Currently parked vehicles:");
        for(Map.Entry<ParkingSlot,Vehicle> entry : parkingMap.entrySet()) {
            System.out.println("Slot " + entry.getKey().getSlotId() + ": " + entry.getValue().getPlateNumber() + " owned by " + entry.getValue().getOwnerName());
        }

        //Find which slot a given vehicle is parked in.
        String searchPlate = "KA02CD5678"; // Bob's vehicle
        for(ParkingSlot slot : parkingMap.keySet()) {
            if(parkingMap.get(slot).getPlateNumber().equals(searchPlate)) {
                System.out.println("Vehicle " + searchPlate + " is parked at slot " + slot.getSlotId());
            }
        }

        //Find all vehicles of type “SUV” or “Bike”.
        System.out.println("Vehicles of type 'Bike':");
        for(Vehicle vehicle : parkingMap.values()) {
            if(vehicle.getType().equalsIgnoreCase("Bike")) {
                System.out.println("Plate Number: " + vehicle.getPlateNumber() + ", Owner: " + vehicle.getOwnerName());
            }
        }

        //Sort the parking slots based on slotId.
        List<ParkingSlot> slotList = new ArrayList<>(parkingMap.keySet());
        slotList.sort(new SlotIdComparator());
        System.out.println("Parking slots sorted by slotId:");
        for(ParkingSlot slot : slotList) {
            System.out.println("Slot ID: " + slot.getSlotId() + ", Location: " + slot.getLocation());
        }

        //Sort the vehicles based on ownerName.
        List<Vehicle> sortedVehicles = new ArrayList<>(parkingMap.values());
        sortedVehicles.sort(new VehicleOwnerNameComparator());
        System.out.println("Vehicles sorted by ownerName:");
        for(Vehicle vehicle : sortedVehicles) {
            System.out.println("Owner: " + vehicle.getOwnerName() + ", Plate Number: " + vehicle.getPlateNumber());
        }

    }
}
