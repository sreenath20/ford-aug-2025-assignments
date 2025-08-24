package assignment6.accessModifier.HospitalMgmtSystem;

import assignment6accessmodif.Patient;

public class SubDriver {
    public static void main(String[] args) {
        Patient patient = new Patient("Fever",9987,"Mediassist","Simon");
        InsuranceClaim insuranceclaim = new InsuranceClaim(
                patient.getName(),
                patient.getHospitalID(),
                patient.getInsuranceDetails(),
                patient.getName()) ;
        insuranceclaim.display();
        Biling billing =new Biling();
        billing.billingDisplay(patient);

    }
}
