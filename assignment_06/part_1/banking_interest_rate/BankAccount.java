package assignment_06.part_1.banking_interest_rate;

class BankAccount
{
    private static double interestRate=2.5;
    private String accountNumber;
    private double balanceAmount;

    BankAccount(String accountNumber,double balanceAmount)
    {
        this.accountNumber=accountNumber;
        this.balanceAmount=balanceAmount;
    }
    public String getAccountNumber()
    {
        return this.accountNumber;
    }
    public double getBalanceAmount()
    {
        return this.balanceAmount;
    }

    public static double getInterestRate() {
        return BankAccount.interestRate;
    }

    public static void updateInterestRate(double interestRate)
    {
        BankAccount.interestRate=interestRate;
    }

    static void displayAccountInfo(BankAccount account) {
        System.out.println("Account Number: "+ account.getAccountNumber());
        System.out.println("Balance: Rs."+account.getBalanceAmount());
        System.out.println();
    }

    static void calculateAndDisplayInterest(BankAccount account) {
        double interest = (account.getBalanceAmount() * BankAccount.getInterestRate()) / 100;
        double newBalance = account.getBalanceAmount() + interest;

        System.out.println("Account Number: "+ account.getAccountNumber());
        System.out.println("Balance: Rs."+account.getBalanceAmount());
        System.out.printf("Interest amount: Rs.%.3f%n",interest);
        System.out.printf("After Interest: Rs.%.3f%n",newBalance);
        System.out.println();
    }
}