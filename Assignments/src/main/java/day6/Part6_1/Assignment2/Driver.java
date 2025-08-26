package day6.Part6_1.Assignment2;

import day6.Part6_1.Assignment2.SubPackage1.InsuranceClaim;
import day6.Part6_1.Assignment2.SubPackage2.Billing;

public class Driver {
    public static void main(String[] args) {
        Patient p1 = new Patient("Typhoid", 201, "Star Health", "ABC");

        Reception reception = new Reception();
        reception.printPatientDetails(p1);

        InsuranceClaim claim = new InsuranceClaim("Appendicitis", 202, "HDFC Health+ Care", "DEF");
        claim.claimInsurance();

        Billing bill = new Billing();
        bill.generateBill(p1);
    }
}
