package com.harini.assignment3.Question6;

public class Main {
    public static void main(String[] args) {
        Patient inpatient = new InPatient("hr33","Harini",21,"12-10-24",104);
        Patient outpatient = new OutPatient("ms22","Meena",23,500,"11-09-28");
        System.out.println("------------------In-Patient Details---------------");
        inpatient.displayDetails();
        System.out.println("---------------Out-Patient Details---------------");
        outpatient.displayDetails();
    }
}
