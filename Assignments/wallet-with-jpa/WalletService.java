package com.demo.wallet.app;

import java.util.Collection;

public interface WalletService {
    
    Wallet registerNewUser(Wallet newWallet)throws WalletException;

    Wallet addFundsToWalletByEmail(String email,Double amount) throws WalletException;

    Wallet withdrawFundsFromWalletByEmail(String email,Double amount) throws WalletWithdrawException;

    String transferFundsToWalletByEmail(String fromEmail,String toEmail,Double amount) throws WalletException;

    Wallet getWalletByEmail(String email) throws WalletException;

    Collection<Wallet> getAllWallets() throws WalletException;

    String userLogIn(String email, String password) throws InvalidUserException;

    Collection<Wallet> sortCustomerWallets(String order) throws WalletException;

    Collection<Wallet> getWalletsByName(String name) throws WalletException;

    Collection<Wallet> getAllWalletsHavingBalanceBetween(Double fromAmount, Double toAmount) throws WalletException;

    Wallet updateWalletPassword(String emailId, String oldPassword, String newPassword) throws WalletException;

    String deleteWalletById(Integer id) throws WalletException;

    String deleteWalletByEmail(String email) throws WalletException;

}
