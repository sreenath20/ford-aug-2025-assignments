package com.oops.day8;

public class Wallet {
    private Double balance;
    public Wallet(Double balance) {
        this.balance = balance;
    }
    public Double withdaw(Double amount) throws WalletWithdrawException , WalletVadidationException {
        if(amount<0) {
            throw new WalletVadidationException("Amount should be greater than 0");
        }

        if (amount <= this.balance) {
            //
            this.balance -= amount;

        } else {
            // do exception handling
            throw new WalletWithdrawException("Insufficient balance, current balance:" + this.balance);
        }
        return this.balance;
    }
}
