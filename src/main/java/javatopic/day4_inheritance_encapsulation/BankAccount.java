package javatopic.day4_inheritance_encapsulation;

public class BankAccount {

    // data member
    private Integer accountNumber;
    private String accountHolderName ;
    private Double accountBalance;


    //constructor

    public BankAccount(Integer accountNumber, String accountHolderName, Double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;

    }

    // method

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }



    public void addFunds(Double amount){
        if(amount>0) {
            accountBalance = accountBalance + amount;
        }
        else{
            System.out.println("Please enter a valid amount");
        }

    }
    public void withdrawFunds(Double amount){
        if(amount>accountBalance) {
            System.out.println("Insufficient balance");
            System.out.println("Your account balance is:" + accountBalance);
        }
        else{
            accountBalance=accountBalance-amount;
        }

    }

    public void displayAccountdetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Account Balance: "+accountBalance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountBalance=" + accountBalance +

                '}';
    }
}

