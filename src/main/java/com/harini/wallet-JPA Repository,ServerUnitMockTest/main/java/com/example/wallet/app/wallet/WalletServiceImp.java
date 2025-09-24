package com.example.wallet.app.wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class WalletServiceImp implements WalletService {

    private WalletRepository walletRepository;

    @Autowired
    public WalletServiceImp(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    @Override
    public Wallet registerNewUserWallet(Wallet newWallet) throws WalletException {
        return this.walletRepository.save(newWallet);
    }

    @Override
    public Double addFundsToWalletByEmailId(String emailId, Double amount) throws WalletException {
                Wallet wallet= this.walletRepository.findByEmail(emailId);
                if (amount < 0) {
                    throw new WalletException("Amount must be greater than zero");
                }
                Double balance = wallet.getBalance();
                balance += amount;
                this.walletRepository.updateBalanceByEmail(emailId, balance);
                return balance;
    }

    @Override
    public Double withdrawFromWalletByEmailId(String emailId, Double amount) throws WalletException {
        Wallet wallet= this.walletRepository.findByEmail(emailId);
        if (amount < 0) {
            throw new WalletException("Amount must be greater than zero");
        }
        Double balance = wallet.getBalance();
        if (balance < amount) {
            throw new WalletException("Insufficient balance");
        }
        balance -= amount;
        this.walletRepository.updateBalanceByEmail(emailId, balance);
        return balance;


    }

    @Override
    public Boolean transferFunds(String fromEmailId, String toEmailId, Double amount) throws WalletException {
        double withdrawBalance = this.walletRepository.findBalanceByEmail(fromEmailId);
        if (amount < 0) {
            throw new WalletException("Amount must be greater than zero");
        }
        if (withdrawBalance < amount) {
            throw new WalletException("Insufficient balance");
        }
        withdrawBalance -= amount;
        this.walletRepository.updateBalanceByEmail(fromEmailId, withdrawBalance);
        double balance = this.walletRepository.findBalanceByEmail(toEmailId);
        balance += amount;
        this.walletRepository.updateBalanceByEmail(toEmailId, balance);
        return true;
    }

    @Override
    public Wallet getUserWalletByEmailId(String userEmailId) throws WalletException {
        return this.walletRepository.findByEmail(userEmailId);
    }

    @Override
    public Collection<Wallet> getAllCustomerWallets() throws WalletException {
        return this.walletRepository.findAll();
    }

    @Override
    public Wallet userLogin(String userEmailId, String password) throws WalletException {
        try {
            Wallet foundWallet = walletRepository.findByEmail(userEmailId);
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
        return this.walletRepository.findByName(name);
    }

    @Override
    public Collection<Wallet> findAllWalletsHavingBalanceBetween(Double fromAmount, Double toAmount) throws WalletException {
        return this.walletRepository.findByBalanceBetween(fromAmount, toAmount);
    }

    @Override
    public Boolean updateWalletPassword(String emailId, String oldPassword, String newPassword) throws WalletException {
        this.walletRepository.updatePasswordByEmail(emailId, newPassword);
        return true;

    }
}
