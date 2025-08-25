package day9.Assignment4;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Set<Vehicle> vehicleSet = new HashSet<>();
        Map<ParkingSlot, Vehicle> slotMap = new HashMap<>();

        // Park Vehicles
        Vehicle v1 = new Vehicle("AB01DC1234", "ABCD", "Sedan");
        Vehicle v2 = new Vehicle("AB02EF5678", "EFGH", "Bike");
        Vehicle v3 = new Vehicle("AB03UV9876", "IJKL", "Truck");

        ParkingSlot ps1 = new ParkingSlot(101, "Basement 1");
        ParkingSlot ps2 = new ParkingSlot(102, "Basement 2");
        ParkingSlot ps3 = new ParkingSlot(103, "Ground Floor");

        parkVehicle(vehicleSet, slotMap, v1, ps1);
        parkVehicle(vehicleSet, slotMap, v2, ps2);
        parkVehicle(vehicleSet, slotMap, v3, ps3);

        System.out.println("-----All Occupied Slots:-----");
        displaySlotMap(slotMap);
        System.out.println();
        // Remove Vehicle
        removeVehicle(vehicleSet, slotMap, v2);

        System.out.println("-----After Removing EFGH's Vehicle:-----");
        displaySlotMap(slotMap);
        System.out.println();
        // Update Vehicle Info
        v1.setOwnerName("VXYZ");
        v1.setType("EV Car");

        System.out.println("------After Updating ABCD's Vehicle:-----");
        displaySlotMap(slotMap);
        System.out.println();

        // Search: Find Slot by Vehicle
        System.out.println("-----Finding Slot for Vehicle AB03UV9876:-----");
        findSlotByVehicle(slotMap, "AB03UV9876");
        System.out.println();

        // Search: Find all Sedans or Bikes
        System.out.println("-----All Vehicles of Type Sedan or Bike:-----");
        for (Vehicle v : vehicleSet) {
            if (v.getType().equalsIgnoreCase("Sedan") || v.getType().equalsIgnoreCase("Bike")) {
                System.out.println(v);
                System.out.println();
            }
        }

        // Sorting Vehicles by Owner Name
        List<Vehicle> sortedVehicles = new ArrayList<>(vehicleSet);
        sortedVehicles.sort(new OwnerNameComparator());
        System.out.println("\n------Vehicles Sorted by Owner Name:-----");
        for (Vehicle v : sortedVehicles) {
            System.out.println(v);
            System.out.println();
        }

        // Sorting Parking Slots by Slot ID
        List<ParkingSlot> sortedSlots = new ArrayList<>(slotMap.keySet());
        sortedSlots.sort(new SlotIdComparator());
        System.out.println("-----Parking Slots Sorted by Slot ID:-----");
        for (ParkingSlot ps : sortedSlots) {
            System.out.println(ps + " --> " + slotMap.get(ps));
            System.out.println();
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
