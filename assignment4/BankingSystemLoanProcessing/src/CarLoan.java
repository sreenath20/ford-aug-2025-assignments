public class CarLoan extends Loan implements ApprovalProcess{


    @Override
    public void approveLoan() {
    System.out.println("Car Loan is approved");
    }


}
