package com.jdbc.demo.wallet;

import java.util.Collection;

public interface WalletDAO {

    Wallet saveWallet(Wallet newWallet) throws  WalletException;

    Wallet getWalletByEmail(String email) throws WalletException;

    Collection<Wallet> getWalletByName(String name) throws WalletException;

    Wallet updateWalletBalance(Wallet wallet) throws WalletException;

    Collection<Wallet> getAllWallets() throws WalletException;

    Collection<Wallet> findAllWalletsHavingBalanceBetween(Double fromAmount, Double toAmount) throws WalletException;

    Boolean deleteWalletByEmail(Wallet wallet) throws WalletException;

    Wallet updatePassword(Wallet wallet, String newPassword) throws WalletException;
}

