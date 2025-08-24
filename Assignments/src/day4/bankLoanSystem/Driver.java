package day4.bankLoanSystem;

public class Driver {
    public static void main(String[] args) {
        HomeLoan homeLoan=new HomeLoan();

        double emi=homeLoan.calculateEMI(50000.0,10.0,6);
        System.out.println("Home Loan EMI is $"+emi+"/month");
        homeLoan.approveLoan();

        CarLoan carLoan=new CarLoan();
        double carEMI=carLoan.calculateEMI(20000.0,10.0,9);
        System.out.println("Car Loan EMI is $"+carEMI+"/month");
        carLoan.approveLoan();
    }
}
