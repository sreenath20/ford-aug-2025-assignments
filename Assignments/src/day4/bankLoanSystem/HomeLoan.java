package day4.bankLoanSystem;

//import com.assignment.day4.vehicleService.Repairable;

public class HomeLoan extends Loan implements ApprovalProcess {
    @Override
    public double calculateEMI(double principle,double rate,int tenureMonths)
    {
        double emi=((principle*rate)/(tenureMonths*100));
        return emi;
    }
    @Override
    public void approveLoan(){
        System.out.println("Home Loan approved");
    }

}
