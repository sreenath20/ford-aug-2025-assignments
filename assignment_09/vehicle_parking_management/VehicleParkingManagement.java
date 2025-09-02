package assignment_09.vehicle_parking_management;

import java.util.*;

public class VehicleParkingManagement {
    private static HashSet<Vehicle> parkedVehicles = new HashSet<>();
    private static HashMap<ParkingSlot, Vehicle> slotAssignments = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nParking Management System\n");

        ParkingSlot slot1 = new ParkingSlot(1, "Ground Floor A");
        ParkingSlot slot2 = new ParkingSlot(2, "Ground Floor B");
        ParkingSlot slot3 = new ParkingSlot(3, "First Floor A");

        Vehicle rajeshBike = new Vehicle("TN12AB1234", "Rajesh Kumar", "Bike");
        Vehicle priyaCar = new Vehicle("DL14CD5678", "Priya Sharma", "Car");

        parkedVehicles.add(rajeshBike);
        parkedVehicles.add(priyaCar);
        slotAssignments.put(slot1, rajeshBike);
        slotAssignments.put(slot2, priyaCar);

        while (true) {
            System.out.println("\n1. Park Vehicle  2. Remove Vehicle  3. Update Vehicle  4. View Slots  5. Search  6. Sort  7. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: parkVehicle(); break;
                case 2: removeVehicle(); break;
                case 3: updateVehicle(); break;
                case 4: viewOccupiedSlots(); break;
                case 5: searchMenu(); break;
                case 6: sortMenu(); break;
                case 7: System.out.println("Exited Successfully!"); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    private static void parkVehicle() {
        System.out.print("Plate Number: ");
        String plateNumber = scanner.nextLine();

        Vehicle newVehicle = new Vehicle(plateNumber, "", "");
        if (parkedVehicles.contains(newVehicle)) {
            System.out.println("Vehicle already parked!");
            return;
        }

        System.out.print("Owner Name: ");
        String ownerName = scanner.nextLine();
        System.out.print("Vehicle Type (Car/Bike/SUV): ");
        String type = scanner.nextLine();

        System.out.print("Slot ID: ");
        int slotId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Location: ");
        String location = scanner.nextLine();

        Vehicle vehicle = new Vehicle(plateNumber, ownerName, type);
        ParkingSlot slot = new ParkingSlot(slotId, location);

        if (slotAssignments.containsKey(slot)) {
            System.out.println("Slot already occupied!");
            return;
        }

        parkedVehicles.add(vehicle);
        slotAssignments.put(slot, vehicle);
        System.out.println("Vehicle parked successfully!");
    }

    private static void removeVehicle() {
        System.out.print("Enter Plate Number: ");
        String plateNumber = scanner.nextLine();

        Vehicle toRemove = null;
        for (Vehicle vehicle : parkedVehicles) {
            if (vehicle.plateNumber.equals(plateNumber)) {
                toRemove = vehicle;
                break;
            }
        }

        if (toRemove != null) {
            parkedVehicles.remove(toRemove);

            // Remove from slot assignment
            ParkingSlot slotToRemove = null;
            for (ParkingSlot slot : slotAssignments.keySet()) {
                if (slotAssignments.get(slot).equals(toRemove)) {
                    slotToRemove = slot;
                    break;
                }
            }
            if (slotToRemove != null) {
                slotAssignments.remove(slotToRemove);
            }

            System.out.println("Vehicle removed successfully!");
        } else {
            System.out.println("Vehicle not found!");
        }
    }

    private static void updateVehicle() {
        System.out.print("Enter Plate Number: ");
        String plateNumber = scanner.nextLine();
        for (Vehicle vehicle : parkedVehicles) {
            if (vehicle.plateNumber.equals(plateNumber)) {
                System.out.print("New Owner Name: ");
                vehicle.ownerName = scanner.nextLine();
                System.out.print("New Vehicle Type: ");
                vehicle.type = scanner.nextLine();
                System.out.println("Vehicle details updated!");
                return;
            }
        }
        System.out.println("Vehicle not found!");
    }

    private static void viewOccupiedSlots() {
        if (slotAssignments.isEmpty()) {
            System.out.println("No vehicles parked!");
            return;
        }

        System.out.println("\nOccupied Slots:");
        int count = 1;
        for (ParkingSlot slot : slotAssignments.keySet()) {
            System.out.print(count + ". ");
            slot.displaySlot();
            System.out.print("   Vehicle: ");
            slotAssignments.get(slot).displayVehicle();
            count++;
        }
    }

    private static void searchMenu() {
        System.out.println("\n1. Find Vehicle's Slot  2. Find Vehicles by Type");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1: findVehicleSlot(); break;
            case 2: findVehiclesByType(); break;
            default: System.out.println("Invalid choice!");
        }
    }

    private static void findVehicleSlot() {
        System.out.print("Enter Plate Number: ");
        String plateNumber = scanner.nextLine();
        for (ParkingSlot slot : slotAssignments.keySet()) {
            Vehicle vehicle = slotAssignments.get(slot);
            if (vehicle.plateNumber.equals(plateNumber)) {
                System.out.println("Vehicle found in:");
                slot.displaySlot();
                return;
            }
        }
        System.out.println("Vehicle not found!");
    }

    private static void findVehiclesByType() {
        System.out.print("Enter Vehicle Type (Car/Bike/SUV): ");
        String type = scanner.nextLine();
        boolean found = false;
        System.out.println("Vehicles of type " + type + ":");
        for (Vehicle vehicle : parkedVehicles) {
            if (vehicle.type.equalsIgnoreCase(type)) {
                vehicle.displayVehicle();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicles of this type found!");
        }
    }

    private static void sortMenu() {
        System.out.println("\n1. Sort Vehicles by Owner  2. Sort Slots by ID");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: sortVehiclesByOwner(); break;
            case 2: sortSlotsByID(); break;
            default: System.out.println("Invalid choice!");
        }
    }

    private static void sortVehiclesByOwner() {
        ArrayList<Vehicle> sortedVehicles = new ArrayList<>(parkedVehicles);
        Collections.sort(sortedVehicles, new OwnerComparator());
        System.out.println("Vehicles sorted by Owner Name:");
        int count = 1;
        for (Vehicle vehicle : sortedVehicles) {
            System.out.print(count + ". ");
            vehicle.displayVehicle();
            count++;
        }
    }

    private static void sortSlotsByID() {
        ArrayList<ParkingSlot> sortedSlots = new ArrayList<>(slotAssignments.keySet());
        Collections.sort(sortedSlots, new SlotComparator());
        System.out.println("Slots sorted by ID:");
        int count = 1;
        for (ParkingSlot slot : sortedSlots) {
            System.out.print(count + ". ");
            slot.displaySlot();
            count++;
        }
    }
}