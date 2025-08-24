package day6_1.Assignment2.sub_package;


import day6_1.Assignment2.Patient;

public class Billing {
    public static void main(String[] args) {
        Patient patient = new Patient();
        System.out.println(patient.name);
        System.out.println(patient.getHospitalId());
        System.out.println(patient.getMedicalHistory());
        System.out.println(patient.getInsuranceDetails());

    }
}
