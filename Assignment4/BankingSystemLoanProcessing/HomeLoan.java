package Assignment4.BankingSystemLoanProcessing;


public class HomeLoan extends Loan implements ApprovalProcess {

    @Override
    public void approveLoan() {
        System.out.println("Home Loan Approved");
    }
}

