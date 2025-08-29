import java.util.*;

public class VehicleParking {
    private Set<Vehicle> vehicleSet = new HashSet<>();
    private Map<ParkingSlot, Vehicle> parkingMap = new HashMap<>();


    // Parking a vehicle
    public void parkVehicle(ParkingSlot slot, Vehicle vehicle) {
        //checking for availability of slot is empty or not
        if(parkingMap.containsKey(slot)) {
            System.out.println("slot is occupied!");
            return;
        }

        if(vehicleSet.contains(vehicle)) {
            System.out.println("Vehicle already parked!");
            return;
        }
        parkingMap.put(slot, vehicle);
        vehicleSet.add(vehicle);
        System.out.println("Vehicle parked in slot: "+slot.getSlotId());

    }

    // Removing a vehicle
    public void unparkVehicle(String numberPlate) {
        Vehicle vehicleToRemove = null;

        for(Vehicle vehicle : vehicleSet) {
            if(vehicle.getPlateNumber().equalsIgnoreCase(numberPlate))
            {
                vehicleToRemove = vehicle;
                break;
            }
        }
        if(vehicleToRemove == null) {
            System.out.println("Vehicle with plate number " + numberPlate + " not found!");
            return;
        }
        //removing from vehicleset
        vehicleSet.remove(vehicleToRemove);
        System.out.println("Vehicle unparked with plate number "+numberPlate);


        //now remove slot also from the map

       ParkingSlot slotToRemove = null;
        for(Map.Entry<ParkingSlot, Vehicle> entry : parkingMap.entrySet()) {
            if(entry.getValue().equals(vehicleToRemove)) {
                slotToRemove = entry.getKey();
                break;
            }
        }
        if(slotToRemove != null) {
            parkingMap.remove(slotToRemove);
            System.out.println("Vehicle unparked from slot: " + slotToRemove.getSlotId());
            return;
        }
        else{
            System.out.println("Vehicle found but not mapped to any slot!");
        }


    }


    public void updateVehicleBySlotId(int slotId, String newNumberPlate,String newOwnerName,String newType) {
        boolean found = false;
      for(Map.Entry<ParkingSlot, Vehicle> entry : parkingMap.entrySet()) {
          if(entry.getKey().getSlotId() == slotId) {
              Vehicle vehicle = entry.getValue();
//            updating vehicle means replacing old vehicle with new vehicle
//              so we are removing old vehicle temporarily
              vehicleSet.remove(vehicle);

//            updating vehicle details
              vehicle.setPlateNumber(newNumberPlate);
              vehicle.setOwnerName(newOwnerName);
              vehicle.setType(newType);

//             re adding the updating vehicle to a vehicle set
              vehicleSet.add(vehicle);
              found = true;
              System.out.println("vehicle updated successfully for slot ID: "+slotId);
              break;
          }
      }
      if(!found) {
          System.out.println("Slot with slotId " + slotId + " not found!");
      }

    }


    //viewing all occupied slots
    public void allOccupiedSlots() {
        if (parkingMap.isEmpty()) {
            System.out.println("No occupied slots.");
            return;
        }

        for(Map.Entry<ParkingSlot, Vehicle> entry : parkingMap.entrySet()) {
            Vehicle vehicle = entry.getValue();



            System.out.println("Slot ID: "+entry.getKey().getSlotId());
            System.out.println("Location :"+entry.getKey().getLocation());
            System.out.println("vehicle parked : "+vehicle.toString());
            System.out.println();

        }
    }

//    search slot by vehicle number plate

    public void findSlot(String numberPlate)
    {
        boolean found = false;
        for(Map.Entry<ParkingSlot, Vehicle> entry : parkingMap.entrySet()) {
            if(entry.getValue().getPlateNumber().equalsIgnoreCase(numberPlate)) {
                System.out.println("- slot found :"+entry.getKey().getSlotId());
                found = true;
                return;
            }
        }
        if(!found) {
            System.out.println("- no vehicle found with plate number !"+numberPlate+" in any of the slots");
        }
    }

//    finding all vehicles of given type "suv" or bike
    public void findVehicle(String type)
    {
        boolean found = false;
        for(Map.Entry<ParkingSlot, Vehicle> entry : parkingMap.entrySet()) {
            if(entry.getValue().getType().equalsIgnoreCase(type))
            {
                System.out.println("Vehicles found :"+entry.getValue().toString());
                found = true;
            }
        }
        if(!found) {
            System.out.println("no vehicle found with type! "+type+" in any of the slot");
        }
    }

//    sorting
//    sort by owner name

    public void sortByOwnerName()
    {
        List<Vehicle> list = new LinkedList<>(vehicleSet);
        list.sort(new OwnerNameComparator());

        System.out.println("Vehicles sorted by owner name:");
        for(Vehicle vehicle : list)
        {
            System.out.println(vehicle.toString());
        }
    }

//    sort by slotid
    public void sortBySlotId()
    {
        List<ParkingSlot> list = new LinkedList<>(parkingMap.keySet());
        list.sort(new SlotIdComparator());

        System.out.println("slots sorted by slot id:");
        for (ParkingSlot parkingSlot : list){
            System.out.println(parkingSlot.toString());
        }
    }








}
