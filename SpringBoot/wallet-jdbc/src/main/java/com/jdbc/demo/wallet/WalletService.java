package com.jdbc.demo.wallet;

import java.util.Collection;

public interface WalletService {

    Wallet registerNewUserWallet(Wallet newWallet) throws WalletException;

    Double addFundsToWalletByEmailId(String emailId, Double amount) throws WalletException;

    Double withdrawFromWalletByEmailId(String emailId, Double amount) throws WalletWithdrawException;

    Boolean transferFunds(String fromEmailId, String toEmailId, Double amount) throws WalletException;

    Wallet getUserWalletByEmailId(String userEmailId) throws WalletException;

    Collection<Wallet> getAllCustomerWallets() throws WalletException;

    Wallet userLogin(String userEmailId, String password) throws WalletException;

    Collection<Wallet> findWalletsByName(String name) throws WalletException;

    Boolean updateWalletPassword(String emailId, String oldPassword, String newPassword) throws WalletException;

    Boolean deleteWalletByEmailId(String emailId) throws WalletException;

}
