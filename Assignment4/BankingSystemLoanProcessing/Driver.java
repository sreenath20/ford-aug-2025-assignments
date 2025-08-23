package Assignment4.BankingSystemLoanProcessing;

public class Driver {
    public static void main(String[] args) {
        HomeLoan homeLoan = new HomeLoan();
        double homeEMI = homeLoan.calculateEMI(50000, 7.5, 60);
        System.out.println("Home Loan EMI for 50000 is " + homeEMI);
        homeLoan.approveLoan();

        System.out.println();

        CarLoan carLoan = new CarLoan();
        double carEMI = carLoan.calculateEMI(20000, 8.0, 48);
        System.out.println("Car Loan EMI for 20000 is " + carEMI );
        carLoan.approveLoan();
    }
}
