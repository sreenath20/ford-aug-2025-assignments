package Assignment9_JavaCollectionSetMapwithCustomDataTypes;

import java.util.*;
import java.util.stream.Collectors;

class Vehicle {
    private final String plateNumber; // unique
    private String ownerName;
    private String type; // e.g., SUV, Sedan, Bike

    public Vehicle(String plateNumber, String ownerName, String type) {
        this.plateNumber = plateNumber;
        this.ownerName = ownerName;
        this.type = type;
    }

    public String getPlateNumber() { return plateNumber; }
    public String getOwnerName() { return ownerName; }
    public String getType() { return type; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }
    public void setType(String type) { this.type = type; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle v = (Vehicle) o;
        return Objects.equals(plateNumber, v.plateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber);
    }

    @Override
    public String toString() {
        return "Vehicle{plate='" + plateNumber + "', owner='" + ownerName + "', type='" + type + "'}";
    }
}

class ParkingSlot {
    private final int slotId;
    private final String location;

    public ParkingSlot(int slotId, String location) {
        this.slotId = slotId;
        this.location = location;
    }

    public int getSlotId() { return slotId; }
    public String getLocation() { return location; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingSlot that = (ParkingSlot) o;
        return slotId == that.slotId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(slotId);
    }

    @Override
    public String toString() {
        return "Slot{id=" + slotId + ", loc='" + location + "'}";
    }
}

class ParkingManager {
    private final Set<Vehicle> parkedVehicles = new HashSet<>();
    private final Map<ParkingSlot, Vehicle> slotMap = new HashMap<>();

    // Park vehicle at slot: returns true if parked successfully.
    // Fails if vehicle already parked or slot occupied.
    public boolean parkVehicle(ParkingSlot slot, Vehicle v) {
        if (parkedVehicles.contains(v)) return false; // vehicle already parked
        if (slotMap.containsKey(slot)) return false;  // slot occupied
        parkedVehicles.add(v);
        slotMap.put(slot, v);
        return true;
    }

    // Remove vehicle by plate: returns true if removed
    public boolean removeVehicle(String plateNumber) {
        Optional<Map.Entry<ParkingSlot, Vehicle>> entry = slotMap.entrySet().stream()
                .filter(e -> e.getValue().getPlateNumber().equals(plateNumber))
                .findFirst();
        if (!entry.isPresent()) return false;
        Vehicle v = entry.get().getValue();
        ParkingSlot slot = entry.get().getKey();
        slotMap.remove(slot);
        parkedVehicles.remove(v);
        return true;
    }

    // Update vehicle details (ownerName/type) by plate
    public boolean updateVehicleDetails(String plateNumber, String newOwner, String newType) {
        for (Vehicle v : parkedVehicles) {
            if (v.getPlateNumber().equals(plateNumber)) {
                if (newOwner != null) v.setOwnerName(newOwner);
                if (newType != null) v.setType(newType);
                return true;
            }
        }
        return false;
    }

    // View all occupied slots
    public Map<ParkingSlot, Vehicle> viewOccupiedSlots() {
        return Collections.unmodifiableMap(slotMap);
    }

    // Find which slot a given vehicle is parked in
    public Optional<ParkingSlot> findSlotByVehicle(String plateNumber) {
        return slotMap.entrySet().stream()
                .filter(e -> e.getValue().getPlateNumber().equals(plateNumber))
                .map(Map.Entry::getKey)
                .findFirst();
    }

    // Find all vehicles by type (e.g., SUV or Bike)
    public List<Vehicle> findVehiclesByType(String type) {
        return parkedVehicles.stream()
                .filter(v -> v.getType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }

    // Vehicles sorted by owner's name
    public List<Vehicle> vehiclesSortedByOwner() {
        return parkedVehicles.stream()
                .sorted(Comparator.comparing(Vehicle::getOwnerName, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }

    // Slots sorted by slotId
    public List<ParkingSlot> slotsSortedById() {
        return slotMap.keySet().stream()
                .sorted(Comparator.comparingInt(ParkingSlot::getSlotId))
                .collect(Collectors.toList());
    }
}

class ParkingDemo {
    public static void main(String[] args) {
        ParkingManager pm = new ParkingManager();

        ParkingSlot s1 = new ParkingSlot(1, "Level1-A1");
        ParkingSlot s2 = new ParkingSlot(2, "Level1-A2");
        ParkingSlot s3 = new ParkingSlot(10, "Level2-B5");

        Vehicle v1 = new Vehicle("ABC123", "John Doe", "SUV");
        Vehicle v2 = new Vehicle("XYZ999", "Jane Smith", "Bike");
        Vehicle v3 = new Vehicle("HIJ456", "Zack Brown", "Sedan");

        System.out.println("Park v1 in s1: " + pm.parkVehicle(s1, v1));
        System.out.println("Park v2 in s2: " + pm.parkVehicle(s2, v2));
        System.out.println("Park v1 again in s3 (should fail): " + pm.parkVehicle(s3, v1));
        System.out.println("Occupied slots: " + pm.viewOccupiedSlots());
        System.out.println("Slot for ABC123: " + pm.findSlotByVehicle("ABC123"));

        System.out.println("All SUVs: " + pm.findVehiclesByType("SUV"));
        System.out.println("Vehicles sorted by owner: " + pm.vehiclesSortedByOwner());
        System.out.println("Slots sorted by id: " + pm.slotsSortedById());

        pm.updateVehicleDetails("ABC123", "John A. Doe", null);
        System.out.println("After update: " + pm.viewOccupiedSlots());

        pm.removeVehicle("ABC123");
        System.out.println("After removing ABC123: " + pm.viewOccupiedSlots());
    }
}

