package javatopic.day4_inheritance_encapsulation.assignments.assignment2;

public class Assignment2currentAccount extends Assignment2BankAccount {
 Double overDraftLimit;

    public Assignment2currentAccount(Integer accountNumber,Double balance,String ownerName,Double overDraftLimit) {
        super(accountNumber,balance,ownerName);
        this.overDraftLimit = overDraftLimit;
    }

    public void calaculateOverDraftLimit(Double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
        System.out.println("overDraftLimit:"+overDraftLimit);
    }


}
