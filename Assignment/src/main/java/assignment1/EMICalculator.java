package assignment1;

public class EMICalculator {
    public static void main(String[] args) {
        Double principleAmount = 500.07;
        Float interestRate = 5F;
        Integer tenure = 5;
        Integer totalMonths = tenure * 12;

        Double Tenurepower = Math.pow(1 + interestRate, tenure);
        Double Interestpower = Math.pow(1 + interestRate, tenure - 1);
        Double monthlyEMIAmount = (principleAmount * interestRate * Tenurepower) / Interestpower;
        Double totalEMIAmount = monthlyEMIAmount * totalMonths;

        System.out.println("Your monthly EMI is     - " + monthlyEMIAmount);
        System.out.println("The total EMI amount is - " + totalEMIAmount);

    }
}
