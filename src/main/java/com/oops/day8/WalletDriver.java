package com.oops.day8;

public class WalletDriver {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(500.0);
        try {
            wallet.withdaw(600.0);
        } catch (WalletWithdrawException e) {
            System.out.println(e.getMessage());
        } catch (WalletVadidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("amount withdraw successful, current balance: " + wallet.withdaw(200.0));
        } catch (WalletWithdrawException e) {
            System.out.println(e.getMessage());
        } catch (WalletVadidationException e) {
            throw new RuntimeException(e);
        }
        System.out.println("sucessfull");
    }
}
