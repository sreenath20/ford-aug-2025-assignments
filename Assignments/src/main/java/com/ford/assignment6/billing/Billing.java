package com.ford.assignment6.billing;


import com.ford.assignment6.hospital.Patient;

public class Billing {
    public static void main(String[] args) {
        Patient p = new Patient();
        System.out.println("Name: " + p.getName());              //  public
        System.out.println("Hospital ID: " + p.getHospitalId()); // public
        System.out.println("Insurance: " + p.getInsuranceDetails()); // public
        // System.out.println(p.medicalHistory);    //  private(error)
        // System.out.println(p.insuranceDetails);  //  protected(error)
    }
}
