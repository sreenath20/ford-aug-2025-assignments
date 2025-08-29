package com.jdbc.demo.wallet;

import java.util.Collection;

public interface WalletService {
    
    Wallet registerNewUser(Wallet newWallet)throws WalletException;

    Boolean addFundsToWalletByEmail(String email,Double amount) throws WalletException;

    Boolean withdrawFundsFromWalletByEmail(String email,Double amount) throws WalletWithdrawException;

    Boolean transferFundsToWalletByEmail(String fromEmail,String toEmail,Double amount) throws WalletException;

    Wallet getWalletByEmail(String email) throws WalletException;

    Collection<Wallet> getAllWallets() throws WalletException;

    Boolean userLogIn(String email, String password) throws InvalidUserException;

    Collection<Wallet> sortCustomerWallets(String order) throws WalletException;

    Collection<Wallet> findWalletsByName(String name) throws WalletException;

    Collection<Wallet> findAllWalletsHavingBalanceBetween(Double fromAmount, Double toAmount) throws WalletException;

    Wallet updateWalletPassword(String emailId, String oldPassword, String newPassword) throws WalletException;

    Boolean deleteWalletByEmail(String email) throws WalletException;


}
