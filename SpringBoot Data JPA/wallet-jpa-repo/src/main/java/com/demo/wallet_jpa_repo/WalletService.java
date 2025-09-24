package com.demo.wallet_jpa_repo;

import java.util.Collection;

public interface WalletService {
    Wallet registerUser(Wallet wallet) throws WalletException;

    Wallet addFunds(String email, Double amount) throws WalletException;

    Wallet withdrawFunds(String email, Double amount) throws WalletWithdrawException;

    String transferFunds(String fromEmail, String toEmail, Double amount) throws WalletException;

    Collection<Wallet> getAllWallets();

    Collection<Wallet> getWalletsByOrder(String order) throws WalletException;

    String deleteWalletByEmail(String email) throws WalletException;

    String userLogin(String email, String password) throws InvalidUserException;
}
