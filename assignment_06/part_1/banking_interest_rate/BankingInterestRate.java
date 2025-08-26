package assignment_06.part_1.banking_interest_rate;

import static assignment_06.part_1.banking_interest_rate.BankAccount.calculateAndDisplayInterest;

public class BankingInterestRate {
    public static void main(String[] args) {
        System.out.println(" BANK ACCOUNT MANAGEMENT SYSTEM \n");

        BankAccount bankAccount1 = new BankAccount("Acc1453215", 10_219.200);
        BankAccount bankAccount2 = new BankAccount("Acc2894689", 209.7400);
        BankAccount bankAccount3 = new BankAccount("Acc3123008", 9_000_219.990);

//        System.out.println("Initial System Status");
//        System.out.println("-------------------------------------");
//        System.out.println("Current Interest Rate: " + BankAccount.getInterestRate() + "%");
        System.out.println("Total Accounts Created: 3");
        System.out.println();

        System.out.println("Account Details");
        System.out.println("-------------------------------------");
        BankAccount.displayAccountInfo(bankAccount1);
        BankAccount.displayAccountInfo(bankAccount2);
        BankAccount.displayAccountInfo(bankAccount3);


        System.out.println("Interest Calculation (Current Rate: " + BankAccount.getInterestRate() + "%)");
        System.out.println("-------------------------------------");
        calculateAndDisplayInterest(bankAccount1);
        calculateAndDisplayInterest(bankAccount2);
        calculateAndDisplayInterest(bankAccount3);

        System.out.println("\nUpdating Interest Rate");
        System.out.println("-------------------------------------");
        System.out.println("Previous Rate: " + BankAccount.getInterestRate() + "%");
        BankAccount.updateInterestRate(4.500);
        System.out.println("Updated Rate: " + BankAccount.getInterestRate() + "%");

        System.out.println("\nUpdated Interest Calculation (New Rate: " + BankAccount.getInterestRate() + "%)");
        System.out.println("-------------------------------------");
        calculateAndDisplayInterest(bankAccount1);
        calculateAndDisplayInterest(bankAccount2);
        calculateAndDisplayInterest(bankAccount3);

        System.out.println("\nSystem Summary");
        System.out.println("-------------------------------------");
        double totalBalance = bankAccount1.getBalanceAmount() +
                bankAccount2.getBalanceAmount() +
                bankAccount3.getBalanceAmount();
        System.out.print("Total Accounts: 3\n");
        System.out.printf("Current Interest Rate: %.2f%%%n", BankAccount.getInterestRate());
        System.out.println("Total Balance: Rs."+totalBalance);
    }
}
