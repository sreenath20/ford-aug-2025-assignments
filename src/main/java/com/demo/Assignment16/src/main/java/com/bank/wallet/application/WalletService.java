package com.bank.wallet.application;

import java.util.Collection;

public interface WalletService {
    Wallet registerNewUserWallet(Wallet newWallet) throws WalletException;

    Double addFundsToWalletByEmailId(String EmailId, Double amount) throws WalletException;

    Double withdrawFromWalletByEmailId(String emailId, Double amount) throws WalletException;

    Boolean transferFunds(String fromEmailId, String toEmailId, Double amount) throws WalletException;

    Collection<Wallet> getUserWalletByEmailId(String userEmailId) throws WalletException;

    Collection<Wallet> getAllCustomerWallets() throws WalletException;

    Wallet userLogin(String userEmailId, String password) throws WalletException;

    Collection<Wallet> sortCustomerWallets(String order) throws WalletException;

    Collection<Wallet> findWalletsByName(String name) throws WalletException;

    Collection<Wallet> findAllWalletsHavingBalanceBetween(Double fromAmount, Double toAmount) throws WalletException;

    Wallet updateWalletPassword(String emailId,Wallet newWallet) throws WalletException;

    Wallet DeleteWalletByEmailId(String emailId) throws WalletException;

}
