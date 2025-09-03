package com.jdbc.demo.wallet;

import java.util.Collection;

public interface WalletDao {
    public Wallet saveWallet(Wallet newWallet) throws WalletException;
    public Wallet getWalletByEmail(String emailId) throws WalletException;
    public Wallet getWalletByName(String name) throws WalletException;
    public Wallet updateWallet(Wallet wallet) throws WalletException;
    public Wallet updateWalletBalance(Wallet wallet) throws WalletException;
    public void deleteWalletByEmail(String emailId) throws WalletException;
    Collection<Wallet> getAllWallets() throws WalletException;
    public Boolean updateWalletPassword(String emailId,String newPassword) throws WalletException;
    public Wallet getWalletByBalance(Double balance)throws WalletException;

}
