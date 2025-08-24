package com.harini.layeredProject.wallet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WalletController {
    public static void main(String[] args) {

        WalletService walletService = new WalletServiceImpl();

        // Add new user
        Wallet wallet = new Wallet(1, "User 1", "name1@gmail.com", "123@name1", 500.0);
        try {
            System.out.println(  walletService.registerNewUserWallet(wallet));
            System.out.println( walletService.registerNewUserWallet(new Wallet(2, "User 2", "name2@gmail.com", "123@name2", 600.0)));
            System.out.println(  walletService.registerNewUserWallet(wallet));
        } catch (WalletException e) {
            //throw new RuntimeException(e); // rethrow
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("All users:"+ walletService.getAllCustomerWallets());
        } catch (WalletException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        try {
            Double newBalance = walletService.addFundsToWalletByEmailId("name1@gmail.com",1000.0);
            System.out.println("Successfully deposited! New Balance is "+ newBalance);
        } catch (WalletException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        try {
            Double newBalance = walletService.withdrawFromWalletByEmailId("name2@gmail.com",100.0);
            System.out.println("Successfully withdrawn! New Balance is "+ newBalance);
        } catch (WalletWithdrawException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        try {
            Boolean isTransactionSuccess = walletService.transferFunds("name2@gmail.com","name2@gmail.com",-250.0);
            System.out.println("Is the transaction Success?: "+ isTransactionSuccess);
        } catch (WalletException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("The sorted wallet is "+ walletService.sortCustomerWallets("ascending"));
        } catch (WalletException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        try{
            System.out.println( walletService.registerNewUserWallet(new Wallet(3,"User 3","name3@gmail.com","123@name3",250.8)));
            System.out.println( walletService.registerNewUserWallet(new Wallet(4,"User 4","name4@gmail.com","123@name4",2500.0)));
            System.out.println( walletService.registerNewUserWallet(new Wallet(5,"User 5","name5@gmail.com","123@name5",1020.5)));

        }
        catch (WalletException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(walletService.findAllWalletsHavingBalanceBetween(200.0,1000.0));
        }
        catch(WalletException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("The wallet with the provided name is given here: "+walletService.findWalletsByName("User 1"));
        }
        catch(WalletException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("The wallet with the provided name is given here: "+walletService.findWalletsByName("User 1"));
        }
        catch(WalletException e){
            System.out.println(e.getMessage());
        }




    }
}
