package com.fullstackabi.assignment.Assign11.LayeredArch;

public class WalletController {

    public static void main(String[] args) {

        WalletService walletService = new WalletServiceImpl();

        // Add new user
        Wallet wallet = new Wallet(1, "User 1", 500.00, "name1@gmail.com", "123@name1");
        try {
            System.out.println(walletService.registerNewUserWallet(wallet));
            System.out.println(walletService.registerNewUserWallet(new Wallet(2, "User 2", 500.00, "name2@gmail.com", "123@name2")));
            System.out.println(walletService.registerNewUserWallet(wallet));

        } catch (WalletException e) {
            //throw new RuntimeException(e); // rethrow
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Fund added: "
                    + walletService.addFundsToWalletByEmailId("name2@gmail.com", 500.00));

        } catch (WalletException e) {
            //  throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("WithDrawn Amount:" + walletService.withdrawFromWalletByEmailId("name2@gmail.com", 100.00));
        } catch (WalletWithdrawException e) {
            // throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }

        try {
            Boolean IsTransferSuccess = walletService.transferFunds("name1@gmail.com", "name2@gmail.com", 10.00);
            if (IsTransferSuccess) {
                System.out.println("Transfer fund success");
                System.out.println(wallet);
            }
        } catch (WalletTransferFundException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("User details by email id:"
                    + walletService.getUserWalletByEmailId("name1@gmail.com"));

        } catch (WalletException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("All users:" + walletService.getAllCustomerWallets());
        } catch (WalletException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }

        try {
            walletService.userLogin("name2@gmail.com" , "123@name2");
        } catch (WalletException e) {
          //  throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Sort By Name :" +walletService.sortCustomerWallets("desc"));
        } catch (WalletException e) {
           // throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }

    }
}
