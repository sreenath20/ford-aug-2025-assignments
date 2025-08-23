
package day11_layered_project;

import java.io.PrintStream;

public class WalletController {
    public static void main(String[] args) {
        WalletService walletService = new WalletServiceImpl();
        Wallet wallet = new Wallet(1, "user1@123", "user1", (double)500.0F, "user1@gmail.com");

        try {
            System.out.println(walletService.registerNewuser(wallet));
            System.out.println(walletService.registerNewuser(wallet));
        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(walletService.getallUser());
        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Current balamnce " + walletService.addfundstowalletbyemail("user1@gmail.com", (double)200.0F));
        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Current balance " + walletService.withdrawfundsfromwalletbyemail("user1@gmail.com", (double)100.0F));
        } catch (WalletWithdrawException e) {
            System.out.println(e.getMessage());
        }

        Wallet wallet2 = new Wallet(2, "user2@123", "user2", (double)300.0F, "user2@gmail.com");

        try {
            System.out.println(walletService.registerNewuser(wallet2));
        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----");

        try {
            System.out.println(walletService.getallUser());
        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("fund transfer status " + walletService.transferfunds("user1@gmail.com", "user2@gmail.com", (double)-5000.0F));
        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(walletService.getallUser());
        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(walletService.userlogin("user1@gmail.com", "user1@123"));
        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }

        try {
            walletService.sortwalletbybalance();
        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(walletService.sortwalletbyname());
        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }

        try {
            PrintStream var10000 = System.out;
            Wallet var10001 = walletService.registerNewuser(new Wallet(3, "user3@123", "user3", (double)0.0F, "user3@gmail.com"));
            var10000.println("new user added" + String.valueOf(var10001));
            var10000 = System.out;
            var10001 = walletService.registerNewuser(new Wallet(4, "user4@123", "user4", (double)1.0F, "user4@gmail.com"));
            var10000.println("new user added" + String.valueOf(var10001));
        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }

        try {
            walletService.displayzerobalanceacoount();
        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }

        try {
            PrintStream var21 = System.out;
            String var23 = String.valueOf(walletService.findwalletbetween((double)100.0F, (double)500.0F));
            var21.println("show wallet between 100 to 500" + var23);
        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("password change status " + walletService.changepassword("user1@gmail.com", "user1@123", "user1@456"));
        } catch (WalletException e) {
            System.out.println(e.getMessage());
        }

    }
}
