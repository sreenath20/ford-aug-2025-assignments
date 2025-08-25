package assignment_04.banking_system_loan_processing;

public class HomeLoan extends Loan implements ApprovalProcess {

    public HomeLoan() {
        super("Home Loan");
    }

    @Override
    public void approveLoan() {
        System.out.println("Home loan Approved");
    }
}
