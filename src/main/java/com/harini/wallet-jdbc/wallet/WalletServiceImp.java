package com.jdbc.demo.wallet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WalletServiceImp implements WalletService {

    private WalletDao walletDao = new WalletDaoImp();

    @Override
    public Wallet registerNewUserWallet(Wallet newWallet) throws WalletException {
        try {
            Wallet foundWallet = walletDao.getWalletByEmail(newWallet.getEmail());
            if (foundWallet != null) {
                throw new WalletException("User wallet already exists for the email: "+newWallet.getEmail());
            }
            else{
                walletDao.saveWallet(newWallet);
            }
        } catch (WalletException e) {
            throw e;
        }
        return null;
    }

    @Override
    public Double addFundsToWalletByEmailId(String emailId, Double amount) throws WalletException {
        try {
            Wallet foundWallet = walletDao.getWalletByEmail(emailId);
            if (amount < 0) {
                throw new WalletException("Amount must be greater than zero");
            }
            if (foundWallet == null) {
                throw new WalletException("User wallet does not exists for the email: " + emailId);
            } else {
                double balance = foundWallet.getBalance();
                balance += amount;
                foundWallet.setBalance(balance);
                walletDao.updateWalletBalance(foundWallet);
                return balance;
            }
        }catch (WalletException e){
            throw e;
        }

    }

    @Override
    public Double withdrawFromWalletByEmailId(String emailId, Double amount) throws WalletException,WalletWithdrawException {
        try {
            Wallet foundWallet = walletDao.getWalletByEmail(emailId);
            if (amount < 0) {
                throw new WalletException("Amount must be greater than zero");
            }

            if (foundWallet == null) {
                throw new WalletWithdrawException("User wallet does not exists for the email: " + emailId);
            } else if (amount>foundWallet.getBalance()) {
                throw new WalletWithdrawException("User wallet does not have enough balance");
            } else {
                double balance = foundWallet.getBalance();
                balance -= amount;
                foundWallet.setBalance(balance);
                walletDao.updateWalletBalance(foundWallet);
                return balance;
            }
        }catch (WalletWithdrawException e){
            throw new WalletWithdrawException(e.getMessage());
        }
        catch (WalletException e){
            throw new WalletException(e.getMessage());
        }

    }

    @Override
    public Boolean transferFunds(String fromEmailId, String toEmailId, Double amount) throws WalletException {
        try {
            Wallet foundFromWallet = walletDao.getWalletByEmail(fromEmailId);
            Wallet foundToWallet = walletDao.getWalletByEmail(toEmailId);
            if (amount < 0) {
                throw new WalletException("Amount must be greater than zero");
            }

            if (foundFromWallet == null) {
                throw new WalletException("User wallet does not exists for the email: " + fromEmailId);
            } else if (foundToWallet == null) {
                throw new WalletException("User wallet does not exists for the email: " + toEmailId);
            } else if (amount>foundFromWallet.getBalance()) {
                throw new WalletException("User wallet does not have enough balance");
            } else {
                double balance = foundFromWallet.getBalance();
                balance -= amount;
                foundFromWallet.setBalance(balance);
                walletDao.updateWalletBalance(foundFromWallet);
                double balance2 = foundToWallet.getBalance();
                balance2+=amount;
                foundToWallet.setBalance(balance2);
                walletDao.updateWalletBalance(foundToWallet);
                return true;

            }
        }
        catch (WalletException e){
            throw new WalletException(e.getMessage());
        }

    }

    @Override
    public Wallet getUserWalletByEmailId(String userEmailId) throws WalletException {
        try{
            Wallet foundWallet = walletDao.getWalletByEmail(userEmailId);
            if (foundWallet == null) {
                throw new WalletException("User wallet does not exists for the email: " + userEmailId);
            }
            else{
                return foundWallet;
            }
        }catch (WalletException e){
            throw e;
        }
    }

    @Override
    public Collection<Wallet> getAllCustomerWallets() throws WalletException {
        Collection<Wallet> allwallets = walletDao.getAllWallets();
        return allwallets;
    }

    @Override
    public Wallet userLogin(String userEmailId, String password) throws WalletException {
        try {
            Wallet foundWallet = walletDao.getWalletByEmail(userEmailId);
            if (foundWallet == null) {
                throw new WalletException("User wallet does not exists for the email: " + userEmailId);
            } else if(foundWallet.getPassword()!=password){
                throw new WalletException("Incorrect password");
            }
            else {
                System.out.println("Login successful");
                return foundWallet;
            }
        }catch (WalletException e){
            throw e;
        }
    }

    @Override
    public Wallet findWalletsByName(String name) throws WalletException {
        try{
            Wallet foundWallet = walletDao.getWalletByEmail(name);
            if (foundWallet == null) {
                throw new WalletException("User wallet does not exists for the username: " + name);
            }
            else{
                return foundWallet;
            }
        }catch (WalletException e){
            throw e;
        }
    }

    @Override
    public Collection<Wallet> findAllWalletsHavingBalanceBetween(Double fromAmount, Double toAmount) throws WalletException {
        try{
        Collection<Wallet> allwallet = new ArrayList<>();
        Wallet wallet ;
        if (fromAmount > toAmount|| fromAmount<0 || toAmount<0) {
            throw new WalletException("Amount must be greater than zero");
        }
        for(double balance = fromAmount; balance <= toAmount; balance++){
            wallet = walletDao.getWalletByBalance(balance);
            if(wallet==null)
                continue;
            else
                allwallet.add(wallet);
        }
            return allwallet;

        }
        catch (WalletException e){
            throw e;
        }


    }

    @Override
    public Boolean updateWalletPassword(String emailId, String oldPassword, String newPassword) throws WalletException {
        try{
            Boolean foundWallet = walletDao.updateWalletPassword(emailId,newPassword);
            if (!foundWallet) {
                throw new WalletException("User wallet does not exists for the email: " + emailId);
            }
            else{
                System.out.println("Password updated successfully");
                return true;
            }
        }catch (WalletException e){
            throw e;
        }
    }
}
