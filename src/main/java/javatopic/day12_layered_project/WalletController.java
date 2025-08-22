package javatopic.day12_layered_project;

import java.util.List;

public class WalletController {
    public static void main(String args[]) {
        WalletService walletService = new WalletServiceImpl();

        Wallet wallet1 = new Wallet(1, "Aana", "aana@gmail.com", "ana@123", 1000.0);
        Wallet wallet2 = new Wallet(2, "Gamy Alan", "gamy@gmail.com", "gamy@123", 500.0);

        //1.register
        System.out.println("  \n \n \t \t \t \t \t WELCOME TO ONLINE WALLET APPLICATION :)\n");
        System.out.println("USER REGISTERATION FOR ONLINE WALLET");

        try {
            System.out.println(walletService.registerNewUserWallet(wallet1));

            System.out.println(walletService.registerNewUserWallet(wallet2));


            System.out.println(walletService.registerNewUserWallet(wallet2));


        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("---------------------------------------------------------");
        //2.add funds
        System.out.println("ADD FUNDS TO THE WALLET");
        try {
            System.out.println("added fund to your wallet -updated balance: " + walletService.addFundsToWalletByEmailId("gamy@gmail.com", 1.0));
            System.out.println("added fund to your wallet -updated balance: " + walletService.addFundsToWalletByEmailId("gamy@gmail.com", 0.0));

        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }
        try {

            System.out.println("added fund-updated balance: " + walletService.addFundsToWalletByEmailId("gamygmail.com", 0.0));
        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("---------------------------------------------------------");
        //3.withdraw from wallet
        System.out.println("WITHDRAW FUNDS FROM THE WALLET");
        try {
            System.out.println("Withdrawn fund from your wallet - available balance" + walletService.withdrawFromWalletByEmailId("aana@gmail", 20.0));

        } catch (WalletWithdrawException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Withdrawn fund from your wallet - available balance" + walletService.withdrawFromWalletByEmailId("aana@gmail.com", 2000.0));

        } catch (WalletWithdrawException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Withdrawn fund from your wallet - available balance : " + walletService.withdrawFromWalletByEmailId("aana@gmail.com", 20.0));
        } catch (WalletWithdrawException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("---------------------------------------------------------");

        //fund transfer
        System.out.println("TRANSFER FUNDS FROM THE WALLET");
        Boolean transactionStatus1 = false;
        try {
            transactionStatus1 = walletService.transferFunds("gamy@gmail.com", "aana@gmail.com", 200.0);


        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }
        if (transactionStatus1) {
            System.out.println("Successfully transfer funds :)");
        } else {
            System.out.println("Failed to transfer funds :(");
        }
        Boolean transactionStatus2 = false;

        try {
            transactionStatus2 = walletService.transferFunds("gamy@gmail.com", "aana@gmail.com", 22200.0);


        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }
        if (transactionStatus2) {
            System.out.println("Successfully transfer funds :)");
        } else {
            System.out.println("Failed to transfer funds :(");
        }
        System.out.println("-------------------------------------------------------------------------");
        // display user wallet with email id
        System.out.println("USER WALLET DETAILS");
        try {
            Wallet displayWalletData;

            displayWalletData = walletService.getUserWalletByEmailId("aana@gmail.com");

            System.out.println("NAME           : " + displayWalletData.getName());
            System.out.println("USER ID        : " + displayWalletData.getId());
            System.out.println("EMAIL ID       : " + displayWalletData.getEmail());
            System.out.println("WALLET BALANCE : " + displayWalletData.getBalance());
        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("-------------------------------------------------------------------------");

        // admin view the wallet details of users
        System.out.println("ADMIN VIEW ON -- USER WALLET DETAILS");
        try {
            List<Wallet> userList;
            userList= (List<Wallet>) walletService.getAllCustomerWallets();
            System.out.println(userList);
        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------------------------------------------------------");

        //user login
        System.out.println("USER LOGIN FOR ONLINE WALLET");
        Wallet userWalletDataAfterLogin1;
        try {
            userWalletDataAfterLogin1 =walletService.userLogin("amy@gmail.com","gamy@123");
            System.out.println("LOGIN SUCCESSFULLY TO ONLINE WALLET");
            System.out.println("NAME           : " + userWalletDataAfterLogin1.getName());
            System.out.println("USER ID        : " + userWalletDataAfterLogin1.getId());
            System.out.println("EMAIL ID       : " + userWalletDataAfterLogin1.getEmail());
            System.out.println("WALLET BALANCE : " + userWalletDataAfterLogin1.getBalance());
        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("------------------------------------------------------------------------------");
        //  sortCustomerWallets by balance
        System.out.println("SORT WALLET BY BALANCE");
        try {
            System.out.println(walletService.sortCustomerWallets("Descending"));// DOWNCASTING
        } catch (WalletException e) {
            System.out.println(e.getMessage());

        }

        System.out.println("---------------------------------------------------------------");


        // findWalletsByName
        // for substring use contains method
        // check if name exists as a sub string
        System.out.println("FIND WALLET BY WALLET USER NAME");

        try {
            System.out.println(walletService.findWalletsByName("vino"));
        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }


    }
}
