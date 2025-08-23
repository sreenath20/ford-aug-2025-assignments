package com.assignment6_part1.assignment2;

public class Reception {
        public Reception(String name, String medicalHistory, String hospitalID, String insuranceDetails) {
            Patient patient = new Patient("aaa", "cancer", "1234", "heath insurance");

            System.out.println("Inside the package only public , protected , default, private data member");
            System.out.println("Name: " + patient.Name);
            System.out.println("Hospital ID:"+ patient.HosiptalID);
            System.out.println("Since Medical History is private we can acces through gettermethod ");
            System.out.println("Medical History: " + patient.getMedicalHistory());
            System.out.println("Insurance Details: " + insuranceDetails);
        }
}
