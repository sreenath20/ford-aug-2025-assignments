package javatopic.day6polymorphism.assignmnent.assignment6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean verificationStatus=false;
        short accountTypeSpecification;
        short bankprocess;
        String accountType;
        boolean balance;
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO ONLINE BANKING");

        System.out.println("Login process");
        System.out.println("Please enter your username:");
        String userName = input.nextLine();
        System.out.println("Please enter your password:");
        String password = input.nextLine();

        SecurityCheck bankAccount1=new BankAccount();
        verificationStatus=bankAccount1.verifyUser(userName,password);


        if(verificationStatus){
            bankAccount1.showSecurityStatus();
            SecurityCheck.logAttempt(userName);

            System.out.println("enter account type \n 1.for savings account \n  2.for current account");
            accountTypeSpecification=input.nextShort();
            if(accountTypeSpecification==1){
                accountType="Savings";
            }
            else if(accountTypeSpecification==2){
                accountType="Current";
            }
            System.out.println("press \n number : 1.Deposit Amount \n number : 2.Transfer amount \n number : 3.calculateInterest");
            bankprocess=input.nextShort();
            if(bankprocess==3){
                BankAccount bankAccount;
                if(accountTypeSpecification==1){
                    bankAccount=new SavingsAccount();
                    bankAccount.calculateInterest();
                }
                else if(accountTypeSpecification==2){
                    bankAccount=new CurrentAccount();
                    bankAccount.calculateInterest();
                }


            }
            else if(bankprocess==2){
                System.out.println("enter from account");
                int fromAccount=input.nextInt();
                System.out.println("enter to account");
                int toAccount=input.nextInt();
                System.out.println("enter amount");
                double amount=input.nextDouble();

                TransactionProcessor transactionProcessor=new TransactionProcessor();
                transactionProcessor.process(fromAccount,toAccount,amount);
            }
            else{
                System.out.println("enter account");
                int accountNumber=input.nextInt();
                System.out.println("enter amount");
                double amount=input.nextDouble();

                TransactionProcessor transactionProcessor=new TransactionProcessor();
                transactionProcessor.process(accountNumber,amount);
            }

        }

    }
}
