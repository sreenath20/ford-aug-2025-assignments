package com.training.day12_layered_arch;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WalletServiceImpl implements WalletService {

//    email : wallet
    Map<String, Wallet> userWallets = new HashMap<String, Wallet>();

    @Override
    public Wallet registerNewUser(Wallet newWallet) throws WalletException {

//        exception handling for user wallet already exist
        if(userWallets.containsKey(newWallet.getEmail())){
            throw new WalletException("User wallet already exists. Try with new email");
        }
//        adding user to map
        userWallets.put(newWallet.getEmail(),newWallet);
//        retrieving saved user
        return userWallets.get(newWallet.getEmail());
    }

    @Override
    public Boolean addFundsToWalletByEmail(String email, Double amount) throws WalletException {
//        checking whether user is available
        if(!userWallets.containsKey(email)){throw new WalletException("Incorrect email id to add funds to wallet");}
//        adding funds to user's wallet
        Wallet wallet = userWallets.get(email);
        wallet.setBalance(wallet.getBalance()+amount);
        return true;
    }

    @Override
    public Boolean withdrawFundsFromWalletByEmail(String email, Double amount) throws WalletWithdrawException {
//        checking whether user is available
        if(!userWallets.containsKey(email)) throw new WalletWithdrawException("Account does not exist");
        
        Wallet wallet = userWallets.get(email);
//        checking for sufficient balance to withdraw
        if(wallet.getBalance() < amount) throw new WalletWithdrawException("Insufficient balance to withdraw from wallet");
//        withdraw amount must be multiple of 100
        if(amount%100 != 0) throw new WalletWithdrawException("Withdraw amount must be multiple of 100s.");
//        withdraw amount not less than 99
        if(amount<99) throw new WalletWithdrawException("Withdraw amount must be greater than Rs. 99.");
//        withdrawing amount
        wallet.setBalance(wallet.getBalance()-amount);
        return true;
    }

    @Override
    public Boolean transferFundsToWalletByEmail(String fromEmail, String toEmail, Double amount) throws WalletException {
//        checking whether sender and receiver wallet are available
        if(!userWallets.containsKey(fromEmail)) throw new WalletException("Incorrect sender email id to transfer from wallet");
        if(!userWallets.containsKey(toEmail)) throw new WalletException("Incorrect receiver email id to transfer to wallet");
//        checking amount is correct
        if(amount <= 0) throw new WalletException("Amount must be greater than 0.");
//        checking sender has sufficient balance to tranfer
        Wallet fromWallet = userWallets.get(fromEmail);
        if(fromWallet.getBalance() < amount) throw new WalletException("Insufficient balance from sender wallet to transfer.");
//        transferring amount
        fromWallet.setBalance(fromWallet.getBalance()-amount);
        Wallet toWallet = userWallets.get(toEmail);
        toWallet.setBalance(toWallet.getBalance()+amount);
        return true;
    }

    @Override
    public Wallet getWalletByEmail(String email) throws WalletException {
//        checking whether user is available
        if(!userWallets.containsKey(email)){ throw new WalletException("User wallet does not exist"); }
        return userWallets.get(email);
    }

    @Override
    public Collection<Wallet> getAllWallets() throws WalletException {
//        checking wallet available
        if(userWallets.isEmpty()){throw new WalletException("User wallet empty");}
        return userWallets.values();
    }
}
