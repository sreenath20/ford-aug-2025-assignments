package Hospital;

public class Reception {


    public void getPatientDetails(Patient patient)
    {
        System.out.println("patient name:" +patient.name);
        System.out.println("HospitalID:" +patient.hospitalID);
//        System.out.println(patient.medicalHistory);
        System.out.println("medicalhistory is private so we cannot access it in another class");
        System.out.println("insurance details: "+patient.insuranceDetails);
    }
}
