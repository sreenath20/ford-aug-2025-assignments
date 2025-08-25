package assignment_04.banking_system_loan_processing;

public class CarLoan extends Loan implements ApprovalProcess {

    public CarLoan() {
        super("Car Loan");
    }

    @Override
    public void approveLoan() {
        System.out.println("Car loan Approved");
    }
}
