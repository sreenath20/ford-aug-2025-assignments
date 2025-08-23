package Assignment9.VehicleParkingManagementSystem;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Set<Vehicle> vehicleSet = new HashSet<>();
        Map<ParkingSlot, Vehicle> slotMap = new HashMap<>();

        // Park Vehicles
        Vehicle v1 = new Vehicle("KA01AB1234", "Alice", "SUV");
        Vehicle v2 = new Vehicle("KA02XY9876", "Bob", "Bike");
        Vehicle v3 = new Vehicle("KA03CD5678", "Charlie", "Car");

        ParkingSlot ps1 = new ParkingSlot(101, "Basement A");
        ParkingSlot ps2 = new ParkingSlot(102, "Basement B");
        ParkingSlot ps3 = new ParkingSlot(103, "Ground Floor");

        parkVehicle(vehicleSet, slotMap, v1, ps1);
        parkVehicle(vehicleSet, slotMap, v2, ps2);
        parkVehicle(vehicleSet, slotMap, v3, ps3);

        System.out.println("All Occupied Slots:");
        displaySlotMap(slotMap);

        // Remove Vehicle
        removeVehicle(vehicleSet, slotMap, v2);

        System.out.println("After Removing Bob's Vehicle:");
        displaySlotMap(slotMap);

        // Update Vehicle Info
        v1.setOwnerName("Alice M.");
        v1.setType("Electric SUV");

        System.out.println("After Updating Alice's Vehicle:");
        displaySlotMap(slotMap);

        // Search: Find Slot by Vehicle
        System.out.println("Finding Slot for Vehicle KA03CD5678:");
        findSlotByVehicle(slotMap, "KA03CD5678");

        // Search: Find all SUVs or Bikes
        System.out.println("All Vehicles of Type SUV or Bike:");
        for (Vehicle v : vehicleSet) {
            if (v.getType().equalsIgnoreCase("SUV") || v.getType().equalsIgnoreCase("Bike")) {
                System.out.println(v);
            }
        }

        // Sorting Vehicles by Owner Name
        List<Vehicle> sortedVehicles = new ArrayList<>(vehicleSet);
        sortedVehicles.sort(new SortVehicleByOwnerName());
        System.out.println("\nVehicles Sorted by Owner Name:");
        for (Vehicle v : sortedVehicles) {
            System.out.println(v);
        }

        // Sorting Parking Slots by Slot ID
        List<ParkingSlot> sortedSlots = new ArrayList<>(slotMap.keySet());
        sortedSlots.sort(new SortSlotById());
        System.out.println("Parking Slots Sorted by Slot ID:");
        for (ParkingSlot ps : sortedSlots) {
            System.out.println(ps + " --> " + slotMap.get(ps));
        }
    }

    public static void parkVehicle(Set<Vehicle> vehicleSet, Map<ParkingSlot, Vehicle> slotMap,
                                   Vehicle vehicle, ParkingSlot slot) {
        if (!vehicleSet.contains(vehicle)) {
            vehicleSet.add(vehicle);
            slotMap.put(slot, vehicle);
        } else {
            System.out.println("Vehicle already parked: " + vehicle.getPlateNumber());
        }
    }

    public static void removeVehicle(Set<Vehicle> vehicleSet, Map<ParkingSlot, Vehicle> slotMap,
                                     Vehicle vehicle) {
        vehicleSet.remove(vehicle);
        ParkingSlot toRemove = null;
        for (Map.Entry<ParkingSlot, Vehicle> entry : slotMap.entrySet()) {
            if (entry.getValue().equals(vehicle)) {
                toRemove = entry.getKey();
                break;
            }
        }
        if (toRemove != null) {
            slotMap.remove(toRemove);
        }
    }

    public static void findSlotByVehicle(Map<ParkingSlot, Vehicle> slotMap, String plateNumber) {
        for (Map.Entry<ParkingSlot, Vehicle> entry : slotMap.entrySet()) {
            if (entry.getValue().getPlateNumber().equalsIgnoreCase(plateNumber)) {
                System.out.println("Found in Slot: " + entry.getKey());
                return;
            }
        }
        System.out.println("Vehicle not found.");
    }

    public static void displaySlotMap(Map<ParkingSlot, Vehicle> map) {
        for (Map.Entry<ParkingSlot, Vehicle> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }
}

