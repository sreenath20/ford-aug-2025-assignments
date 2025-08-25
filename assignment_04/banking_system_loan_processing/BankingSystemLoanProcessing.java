package assignment_04.banking_system_loan_processing;

import javax.smartcardio.Card;

public class BankingSystemLoanProcessing {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Banking System Loan Processing\n");
        CarLoan carLoan = new CarLoan();
        HomeLoan homeLoan = new HomeLoan();

        double homeLoanAmount=50000;
        double homeLoanRate=8.5;
        int homeLoanTenure=60;
        double homeEMI=homeLoan.calculateEMI(homeLoanAmount,homeLoanRate,homeLoanTenure);
        System.out.println("Home loan EMI for Rs."+ (int)homeLoanAmount+" is Rs."+ (int)homeEMI+ "/month");
        homeLoan.approveLoan();
        System.out.println("");
        double carLoanAmount=20000;
        double carLoanRate=7.0;
        int carLoanTenure=48;
        double carEMI=homeLoan.calculateEMI(carLoanAmount,carLoanRate,carLoanTenure);
        System.out.println("Car loan EMI for Rs."+ (int)carLoanAmount+" is Rs."+ (int)carEMI+ "/month");
        carLoan.approveLoan();
    }
}
