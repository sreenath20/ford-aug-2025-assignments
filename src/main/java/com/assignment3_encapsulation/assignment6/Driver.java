package com.assignment3_encapsulation.assignment6;

public class Driver {
    public static void main(String[] args) {
        System.out.println("*** PATIENT MANAGEMENT SYSTEM ***\n");

        InPatient inPatient1 = new InPatient(
            "IP001",
            "aaa",
            45,
            "Room-101A",
            "2025-08-05"
        );

        OutPatient outPatient1 = new OutPatient(
            "OP001",
            "bbbb",
            28,
            "2025-08-11",
            150.00
        );

        System.out.println("DISPLAYING PATIENT RECORDS:\n");

        inPatient1.displayPatientInfo();
        System.out.println();

        outPatient1.displayPatientInfo();
    }
}
