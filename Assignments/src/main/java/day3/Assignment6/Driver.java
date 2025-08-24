package day3.Assignment6;

public class Driver {
    public static void main(String[] args) {
        Patient inpatient = new InPatient("GE104","ABC",24,"14-04-25",118);
        Patient outpatient = new OutPatient("GY209","XYZ",29,500,"09-05-25");
        System.out.println("------------------In-Patient Details---------------");
        inpatient.displayDetails();
        System.out.println("---------------Out-Patient Details---------------");
        outpatient.displayDetails();
    }
}
