package com.demo.banking;

import java.util.Collection;

public interface WalletDAO {

    Wallet saveWallet(Wallet newWallet) throws  WalletException;

    Wallet getWalletByEmail(String emailAddress) throws WalletException;

    Collection<Wallet> getWalletByName(String customerName) throws WalletException;

    Wallet updateWalletBalance(Wallet wallet) throws WalletException;

    Collection<Wallet> getAllWallets() throws WalletException;

    Collection<Wallet> findAllWalletsHavingBalanceBetween(Double startAmount, Double endAmount) throws WalletException;

    Boolean deleteWalletByEmail(Wallet wallet) throws WalletException;

    Wallet updatePassword(Wallet wallet, String updatedPassword) throws WalletException;
}
