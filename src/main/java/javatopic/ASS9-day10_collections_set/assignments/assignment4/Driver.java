package javatopic.day10_collections_set.assignments.assignment4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Driver {
    public static void main(String args[]){
        Set<Vehicle> vehicles = new HashSet<Vehicle>();
        vehicles.add(new Vehicle("TN2345","Anil","Bike"));
        vehicles.add(new Vehicle("TN2342","Kavin","Bike"));
        vehicles.add(new Vehicle("TN3411","Aany","SUV"));
        vehicles.add(new Vehicle("TN3221","Vino","Bike"));
        vehicles.add(new Vehicle("TN0145","Shree","SUV"));

        Map<ParkingSlot,Set<Vehicle>> parkingMap = new HashMap<ParkingSlot, Set<Vehicle>>();

        parkingMap.put(new ParkingSlot(1,"gandhi street"),vehicles);
        parkingMap.put(new ParkingSlot(2,"nehru street"),vehicles);
        parkingMap.put(new ParkingSlot(3,"bose street"),vehicles);
        parkingMap.put(new ParkingSlot(4,"rajiv street"),vehicles);

        System.out.println(parkingMap);

        //remove vehicle
      // parkingMap.forEach((k,v)->{if(parkingMap.containsKey(k)){

       //}})

    }
}
