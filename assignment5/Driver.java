package com.assignments.assignment5;

import com.assignments.assignment4.Loan;
import com.training.day5.C;

import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {

        MathOperations mathOperations = new MathOperations();
        System.out.println("Integer add(10,20)   : "+mathOperations.add(10,20));
        System.out.println("Double add(10.57,22.89)   : "+mathOperations.add(10.57,22.89));
        Integer[] l1 = {2,45,6};
        Integer[] l2 = {9,-32,0};
        System.out.println("Integer[] add(l1,l2)   : "+ Arrays.toString(mathOperations.add(l1, l2)));

        Payment payment = new Payment();
        payment.processPayment(100);
        payment = new CreditCardPayment();
        payment.processPayment(50000);
        payment = new UPIPayment();
        payment.processPayment(2500);

        Customer customer;
        customer = new RegularCustomer();
        customer.calculateDiscount(10000);
        customer.calculatePayment(10000,1000);
        customer = new PremiumCustomer();
        customer.calculateDiscount(10000);
        customer.calculatePayment(10000,1000);

        DataValidator dataValidator;
        dataValidator = new EmailValidator();
        System.out.println("Is validate email id raamji123@gmail.com :"+dataValidator.isValid("raamji123@gmail.com"));
        System.out.println("Is validate email id raamji123gmail.com :"+dataValidator.isValid("raamji123gmail.com"));
        dataValidator = new PhoneValidator();
        System.out.println("Is valid phone no. 9876543210 :"+dataValidator.isValid("9876543210"));
        System.out.println("Is valid phone no. 987654321 :"+dataValidator.isValid("987654321"));

        MusicPlayer musicPlayer;
        musicPlayer = new MP3Player();
        musicPlayer.playMusic("song1.mp3");
        musicPlayer.stopMusic();
        musicPlayer = new WAVPlayer();
        musicPlayer.playMusic("song2.wav");
        musicPlayer.stopMusic();

        TransactionProcessor transactionProcessor = new TransactionProcessor();
        transactionProcessor.process(241,10000.0);
        transactionProcessor.process(241,245,5000.0);

        BankAccount bankAccount;
        bankAccount = new SavingsAccount();
        bankAccount.calculateInterest(10000,6,2);
        bankAccount = new CurrentAccount();
        bankAccount.calculateInterest(50000,2,5);

        SecurityCheck.logAttempt("Raamji");
        LogIn logIn = new LogIn();
        logIn.showSecurityStatus();
        logIn.verifyUser("Raamji", "123");
        SecurityCheck.logAttempt("Raj");
        logIn.showSecurityStatus();
        logIn.verifyUser("Raj", "123");

    }

}
