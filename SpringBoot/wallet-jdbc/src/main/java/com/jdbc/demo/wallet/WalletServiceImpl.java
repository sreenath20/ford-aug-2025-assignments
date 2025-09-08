package com.jdbc.demo.wallet;

import java.util.Collection;
import java.util.stream.Collectors;


public class WalletServiceImpl implements WalletService {

    private WalletDao walletDao = new WalletDaoImpl();

    @Override
    public Wallet registerNewUserWallet(Wallet newWallet) throws WalletException {
        // Check ig user exists already with given email
        try {
            Wallet foundWallet = walletDao.getWalletByEmail(newWallet.getEmail());
            if (foundWallet != null)
                throw new WalletException("User already exists for email:" + newWallet.getEmail());
        }
        catch (WalletException e) {
            throw e; // rethrow of wallet exception
        }
        return walletDao.saveWallet(newWallet);
    }

    @Override
    public Double addFundsToWalletByEmailId(String emailId, Double amount) throws WalletException {
        Wallet wallet = walletDao.getWalletByEmail(emailId);
        if (amount <= 0) {
            throw new WalletException("Amount must be positive");
        }

        if (wallet == null) {
            throw new WalletException("Wallet not found for email: " + emailId);
        }

        Double newBalance = wallet.getBalance() + amount;
        wallet.setBalance(newBalance);
        walletDao.updateWalletBalance(wallet);
        return newBalance;
    }

    @Override
    public Double withdrawFromWalletByEmailId(String emailId, Double amount) throws WalletWithdrawException {
        try {
            Wallet wallet = walletDao.getWalletByEmail(emailId);

            if (amount <= 0) {
                throw new WalletWithdrawException("Amount must be positive");
            }
            if (wallet == null) {
                throw new WalletWithdrawException("Wallet not found for email: " + emailId);
            }
            if (wallet.getBalance() < amount) {
                throw new WalletWithdrawException("Insufficient balance. Current balance: Rs." + wallet.getBalance());
            }

            Double newBalance = wallet.getBalance() - amount;
            wallet.setBalance(newBalance);
            walletDao.updateWalletBalance(wallet);
            return newBalance;
        }
        catch (WalletException e) {
            throw new WalletWithdrawException(e.getMessage());
        }
    }

    @Override
    public Boolean transferFunds(String fromEmailId, String toEmailId, Double amount) throws WalletException {
        // Get both wallets
        Wallet fromWallet = walletDao.getWalletByEmail(fromEmailId);
        Wallet toWallet = walletDao.getWalletByEmail(toEmailId);

        if (amount <= 0) {
            throw new WalletException("Amount must be positive");
        }

        if (fromEmailId.equals(toEmailId)) {
            throw new WalletException("Cannot transfer to the same wallet");
        }

        if (fromWallet == null) {
            throw new WalletException("Source wallet not found for email: " + fromEmailId);
        }

        if (toWallet == null) {
            throw new WalletException("Destination wallet not found for email: " + toEmailId);
        }

        if (fromWallet.getBalance() < amount) {
            throw new WalletException("Insufficient balance in source wallet. Current balance: $" + fromWallet.getBalance());
        }

        // Perform transfer
        fromWallet.setBalance(fromWallet.getBalance() - amount);
        toWallet.setBalance(toWallet.getBalance() + amount);

        walletDao.updateWalletBalance(fromWallet);
        walletDao.updateWalletBalance(toWallet);

        return true;
    }

    @Override
    public Wallet getUserWalletByEmailId(String userEmailId) throws WalletException {
        Wallet wallet = walletDao.getWalletByEmail(userEmailId);

        if (wallet == null) {
            throw new WalletException("Wallet not found for email: " + userEmailId);
        }
        return wallet;
    }

    @Override
    public Collection<Wallet> getAllCustomerWallets() throws WalletException {
        Collection<Wallet> wallets = walletDao.getAllWallets();
        if (wallets==null) {
            throw new WalletException("Wallets not found");
        }
        return walletDao.getAllWallets();
    }

    @Override
    public Wallet userLogin(String userEmailId, String password) throws WalletException {
        Wallet wallet = walletDao.getWalletByEmail(userEmailId);

        if (wallet == null) {
            throw new WalletException("Wallet not found for email: " + userEmailId);
        }

        if (wallet.getPassword().equals(password)) {
            return wallet; // Login successful
        }
        else {
           throw new WalletException("Incorrect password for waller with emailId: " + userEmailId);
        }
    }

    @Override
    public Collection<Wallet> findWalletsByName(String name) throws WalletException {
        Collection<Wallet> allWallets = walletDao.getAllWallets();
        return allWallets.stream()
                .filter(wallet -> wallet.getName().toLowerCase().equals(name.toLowerCase()))
                .collect(Collectors.toList());
    }


    @Override
    public Boolean updateWalletPassword(String emailId, String oldPassword, String newPassword) throws WalletException {
        Wallet wallet = walletDao.getWalletByEmail(emailId);

        if (wallet == null) {
            throw new WalletException("Wallet not found for email: " + emailId);
        }

        if (!wallet.getPassword().equals(oldPassword)) {
            throw new WalletException("Old password is incorrect");
        }

        if (newPassword == null || newPassword.trim().isEmpty()) {
            throw new WalletException("New password cannot be empty");
        }

        wallet.setPassword(newPassword);
        walletDao.updateWallet(wallet);
        return true;
    }

    @Override
    public Boolean deleteWalletByEmailId(String emailId) throws WalletException {
        Wallet wallet = walletDao.getWalletByEmail(emailId);
        if (wallet == null) {
            throw new WalletException("Wallet not found for email : " + emailId);
        }
        else {
            return walletDao.deleteWalletByEmailId(emailId);
        }
    }
}

