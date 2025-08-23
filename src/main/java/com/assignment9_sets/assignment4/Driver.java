
package com.assignment9_sets.assignment4;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Driver {
    public static void main(String[] args) {
        Set<Vehicle> vehicles = new HashSet();
        Vehicle vehicles1 = new Vehicle("1001", "ddd", "SUV");
        Vehicle vehicles2 = new Vehicle("1002", "aaa", "SUV");
        Vehicle vehicles3 = new Vehicle("1003", "ccc", "Bike");
        Vehicle vehicles4 = new Vehicle("1001", "ddd", "SUV");
        vehicles.add(vehicles1);
        vehicles.add(vehicles2);
        vehicles.add(vehicles3);
        vehicles.add(vehicles4);
        System.out.println("displaying vehicles  without duplicate" + String.valueOf(vehicles));
        Map<ParkingSlot, Vehicle> map = new HashMap();
        map.put(new ParkingSlot(5003, "xxx"), vehicles1);
        map.put(new ParkingSlot(5002, "yyy"), vehicles2);
        map.put(new ParkingSlot(5001, "zzz"), vehicles3);
        System.out.println("student registration detials" + String.valueOf(map));
        System.out.println();
        ParkingSlot parkingSlot1 = new ParkingSlot(5002, "yyy");
        Vehicle updatevehicle = new Vehicle("1010", "ttt", "SUV");
        PrintStream var10000 = System.out;
        Object var10001 = map.get(parkingSlot1);
        var10000.println("before updating vehicle details update for slot yyy " + String.valueOf(var10001));
        map.replace(parkingSlot1, updatevehicle);
        var10000 = System.out;
        var10001 = map.get(parkingSlot1);
        var10000.println("after updating vehicle details update for slot yyy " + String.valueOf(var10001));
        System.out.println();
        System.out.println("View all occupied slots.");
        System.out.println(map.keySet());
        System.out.println();
        List<Vehicle> vehiclelist = new ArrayList(map.values());
        System.out.println("Display all vehicles before sorted by ownerName. " + String.valueOf(vehiclelist));
        Collections.sort(vehiclelist);
        System.out.println("Display all vehicles after sorted by ownerName. " + String.valueOf(vehiclelist));
        List<ParkingSlot> slotlist = new ArrayList(map.keySet());
        System.out.println(" Display all slots before  sorted by slotId. " + String.valueOf(slotlist));
        Collections.sort(slotlist);
        System.out.println(" Display all slots after   sorted by slotId. " + String.valueOf(slotlist));
    }
}
