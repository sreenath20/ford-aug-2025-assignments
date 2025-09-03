package com.assignment.day11.day11layeredassignment.wallet;

public class WalletController {
    public static void main(String[] args) {

        WalletService walletService = new WalletServiceImplementation();

        //add new user
        Wallet wallet = new Wallet(1,"Deepak","deepak@gmail.com",500.0);

        try{
            System.out.println(walletService.registerWallet(wallet));
            System.out.println(walletService.registerWallet(new Wallet(2,"Kumar","kumar@gmail.com",1000.0)));
        } catch (UserAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        //add funds
        try{
            System.out.println("Deepak balance after adding funds : "+walletService.addFundsByCustomerId(1,200.0));
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        //withdraw funds
        try{
            System.out.println("Kumar balance after withdrawing funds : "+walletService.withdrawFundsByCustomerId(2,500.0));
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        //transfer funds
        try{
            System.out.println("Transfer funds from Alice to Bob is : "+walletService.transferFunds(1,2,300.0));
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        //get wallet details
        try{
            System.out.println(walletService.getWalletByCustomerId(1));
            System.out.println(walletService.getWalletByCustomerId(2));
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //admin lists all customers
        try{
            System.out.println("ADMIN LISTS ALL CUSTOMERS");
            System.out.println(walletService.getAllWallets());
        }
        catch (NoUsersFoundException e){
            System.out.println(e.getMessage());
        }


    }
}
