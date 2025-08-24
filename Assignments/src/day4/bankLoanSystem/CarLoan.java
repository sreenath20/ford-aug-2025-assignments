package day4.bankLoanSystem;

public class CarLoan extends Loan implements ApprovalProcess {
    @Override
    public double calculateEMI(double principle,double rate,int tenureMonths)
    {
        double emi=((principle*rate)/(tenureMonths*100));
        return emi;
    }
    @Override
    public void approveLoan(){
        System.out.println("Car Loan approved");
    }
}
