package com.assignment.day7.assignment1_2;

import com.assignment.day7.assignment1_2.Billing.Billing;
import com.assignment.day7.assignment1_2.hospital.Patient;
import com.assignment.day7.assignment1_2.hospital.Reception;
import com.assignment.day7.assignment1_2.insuranceclaim.InsuranceClaim;

public class Day7Assignment1_2 {
    public static void main(String[] args) {

        Patient p=new Patient("Diabetes",45,"INS12345","John");

        System.out.println("RECEPTION DETAILS");
        Reception reception=new Reception();
        reception.PatientDetails(p);

        System.out.println("INSURANCE CLAIM DETAILS");
        InsuranceClaim insuranceClaim=new InsuranceClaim();
        insuranceClaim.claimInsurance();

        System.out.println("BILLING DETAILS");
        Billing billing=new Billing();
        billing.billInfo(p);

    }
}
