package day4.Assignment4;

public class Driver {
    public static void main(String[] args) {
        HomeLoan homeLoan = new HomeLoan();
        homeLoan.calculateEMI(50000.0,1200,480);
        homeLoan.approveLoan();
        System.out.println();
        CarLoan carLoan = new CarLoan();
        carLoan.calculateEMI(20000,450,120);
        carLoan.approveLoan();
    }
}
