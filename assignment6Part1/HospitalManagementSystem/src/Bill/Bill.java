package Bill;

import Hospital.Patient;

public class Bill {

    public void getBill(Patient patient){


        System.out.println("Bill Details:");
        System.out.println("name: "+patient.getName());
        System.out.println("medical history: "+patient.getMedicalHistory());
        System.out.println("Insurance Details :"+patient.getInsuranceDetails());
        System.out.println("hospital ID: "+patient.getHospitalID());
    }
}
