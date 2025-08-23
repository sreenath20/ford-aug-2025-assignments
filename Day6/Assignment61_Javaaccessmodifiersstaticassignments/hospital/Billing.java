package hospital.billing;

import hospital.records.Patient;

public class Billing {
    public static void main(String[] args) {
        Patient p = new Patient("Gina", 888, "InsurerZ: Policy 12", "Asthma");

        System.out.println("Name (via public getter): " + p.getName());
        System.out.println("Hospital ID (via public getter): " + p.getHospitalId());

    }
}
