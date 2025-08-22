package com.ford.assignment6.hospital;



public class Reception {
    public static void main(String[] args) {
        Patient p = new Patient();
        System.out.println("Name: " + p.name);         // ✅ public
        System.out.println("Hospital ID: " + p.hospitalId); // ✅ default
        // System.out.println(p.medicalHistory);       // ❌ private
        // System.out.println(p.insuranceDetails);     // ✅ protected (same package)
    }
}
