package hospital.claims;

import hospital.records.Patient;

public class InsuranceClaim extends Patient {
    public InsuranceClaim(String name, int hospitalId, String insuranceDetails, String medicalHistory) {
        super(name, hospitalId, insuranceDetails, medicalHistory);
    }

    public void fileClaim() {
        System.out.println("Insurance details (protected): " + this.insuranceDetails);

    }

    public static void main(String[] args) {
        InsuranceClaim c = new InsuranceClaim("Frank", 777, "InsurerY: Policy 42", "Hypertension");
        c.fileClaim();
    }
}
