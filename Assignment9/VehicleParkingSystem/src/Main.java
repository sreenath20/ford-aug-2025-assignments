public class Main {
    public static void main(String[] args) {
        VehicleParking manager = new VehicleParking();

        // Create parking slots
        ParkingSlot slot1 = new ParkingSlot(104, "A1");
        ParkingSlot slot2 = new ParkingSlot(101, "A2");
        ParkingSlot slot3 = new ParkingSlot(105, "B1");
        ParkingSlot slot4 = new ParkingSlot(103, "B2");
        ParkingSlot slot5 = new ParkingSlot(102, "C1");

        // Create vehicles
        Vehicle vehicle1 = new Vehicle("KA01AB1234", "John Doe", "SUV");
        Vehicle vehicle2 = new Vehicle("KA02CD5678", "Alice Smith", "Bike");
        Vehicle vehicle3 = new Vehicle("KA03EF9876", "Bob Marley", "SUV");
        Vehicle vehicle4 = new Vehicle("KA04GH4321", "Charlie Brown", "Car");
        Vehicle vehicle5 = new Vehicle("KA05IJ8765", "Diana Prince", "Bike");

        // Park vehicles
        manager.parkVehicle(slot1, vehicle1);
        manager.parkVehicle(slot2, vehicle2);
        manager.parkVehicle(slot3, vehicle3);
        manager.parkVehicle(slot4, vehicle4);
        manager.parkVehicle(slot5, vehicle5);

        System.out.println("\n--- All Occupied Slots ---");
        manager.allOccupiedSlots();

        System.out.println("\n--- Find Slot by Vehicle Plate ---");
        manager.findSlot("KA02CD567");
        manager.findSlot("KA04GH4321");

        System.out.println("\n--- Find All Vehicles of Type SUV ---");
        manager.findVehicle("SUV");

        System.out.println("\n--- Sort Vehicles by Owner Name ---");
        manager.sortByOwnerName();

        System.out.println("\n--- Sort Slots by Slot ID ---");
        manager.sortBySlotId();

        System.out.println("\n--- Update Vehicle Details in Slot 101 ---");
        manager.updateVehicleBySlotId(106, "KA01ZZ9999", "John Legend", "Sedan");

        System.out.println("\n--- Unpark Vehicle KA02CD5678 ---");
        manager.unparkVehicle("KA02CD5678");

        System.out.println("\n--- Final Occupied Slots ---");
        manager.allOccupiedSlots();
    }
}
