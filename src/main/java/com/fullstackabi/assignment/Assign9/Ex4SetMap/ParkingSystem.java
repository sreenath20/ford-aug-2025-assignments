package com.fullstackabi.assignment.Assign9.Ex4SetMap;

import java.util.*;
import java.util.stream.Collectors;

public class ParkingSystem {

    Set<Vehicle> vehicleSet = new HashSet<Vehicle>();
    Map<ParkingSlot, Vehicle> parkingSlotVehicleMap = new HashMap<ParkingSlot, Vehicle>();

    // ParkingSlot parkingSlot = new ParkingSlot(100,"Lane1");
    private int nextSlotID = 1;

    private ParkingSlot availableSlot() {

        return new ParkingSlot(nextSlotID++, "Ground Floor");

    }

    public void parkVehicle(Vehicle vehicle) {
        if (vehicleSet.contains(vehicle)) {
            System.out.println("Vehicle already parked!");

        } else {
            ParkingSlot parkingSlot = availableSlot();
            vehicleSet.add(vehicle);
            parkingSlotVehicleMap.put(parkingSlot, vehicle);
            System.out.println("Vehicle Parked Successfully" + parkingSlotVehicleMap);

        }
    }


    public void removeVehicle(Vehicle vehicle) {

        // using streams , can get key-value pair of the MAP using optional.
//        Optional<Map.Entry<ParkingSlot, Vehicle>> entry = parkingSlotVehicleMap.entrySet().stream()
//                .filter(e -> e.getValue().getPlateNumber().equals(vehicle.plateNumber))
//                .findFirst();
        //    if (entry.isPresent()) {
        // using Map Entry objects to get key-value pairs and iterate it.
        for (Map.Entry<ParkingSlot, Vehicle> entry : parkingSlotVehicleMap.entrySet()) {
            Vehicle vehicleToRemove = entry.getValue();
            ParkingSlot slotToRemove = entry.getKey();
            if (Objects.equals(vehicleToRemove.getPlateNumber(), vehicle.getPlateNumber())) {
                vehicleSet.remove(vehicleToRemove);
                parkingSlotVehicleMap.remove(slotToRemove);
                System.out.println("Vehicle Removed from the slot");
                break;
            }
        }
        System.out.println("After removing the vehicle from Slot :" + parkingSlotVehicleMap);
    }

    public void updateVehicleDetails(Vehicle vehicle) {

        for (Map.Entry<ParkingSlot, Vehicle> entry : parkingSlotVehicleMap.entrySet()) {
            Vehicle vehicleToUpdate = entry.getValue();
            ParkingSlot slotToUpdate = entry.getKey();
            if (parkingSlotVehicleMap.containsKey(slotToUpdate)) {
                parkingSlotVehicleMap.replace(slotToUpdate, new Vehicle("TNCA002", "Frank", "Bike"), new Vehicle("TNCA002", "Frank", "Car"));
                System.out.println("Vehicle Updated Successfully" + parkingSlotVehicleMap.get(slotToUpdate));
                break;
            }

        }
        System.out.println("After Vehicle Update :" + parkingSlotVehicleMap);
    }

    public void occupiedSlots() {
        if (parkingSlotVehicleMap.isEmpty()) {
            System.out.println("No slots occupied!");
        }
        for (Map.Entry<ParkingSlot, Vehicle> entry : parkingSlotVehicleMap.entrySet()) {
            System.out.println("Slot --> " + entry.getKey().slotId + " Vehicle --> " + entry.getValue().getPlateNumber());
        }
    }

    // Searching
    // Using Streams , implemented the searching
    public void findSlotByVehicle(String plateNumber) {
        Optional<ParkingSlot> foundSlot = parkingSlotVehicleMap.entrySet().stream()
                .filter(e -> e.getValue().getPlateNumber().equals(plateNumber))
                .map(Map.Entry::getKey)
                .findFirst();

        if (foundSlot.isPresent()) {
            System.out.println("\nVehicle " + plateNumber + " is parked at: " + foundSlot.get());
        } else {
            System.out.println("\nVehicle " + plateNumber + " not found in any slot.");
        }
    }

    public void findVehiclesByType(String type1, String type2) {
        List<Vehicle> filteredVehicles = vehicleSet.stream()
                .filter(v -> v.getType().equalsIgnoreCase(type1) || v.getType().equalsIgnoreCase(type2))
                .collect(Collectors.toList());

        System.out.println("\nVehicles of type '" + type1 + "' or '" + type2 + "':");
        filteredVehicles.forEach(System.out::println);
    }

    // Sorting
    // usings streams, sorted - to sort the vehicle.
    public void displayVehiclesSortedByOwnerName() {
        List<Vehicle> sortedVehicles = vehicleSet.stream()
                .sorted(Comparator.comparing(Vehicle::getOwnerName))
                .collect(Collectors.toList());

        System.out.println("\n--- All Vehicles Sorted by Owner's Name ---");
        sortedVehicles.forEach(System.out::println);
    }

    public void displaySlotsSortedBySlotId() {
        List<ParkingSlot> sortedSlots = parkingSlotVehicleMap.keySet().stream()
                .sorted(Comparator.comparingInt(ParkingSlot::getSlotId))
                .collect(Collectors.toList());

        System.out.println("\n--- All Slots Sorted by Slot ID ---");
        sortedSlots.forEach(System.out::println);
    }
}


