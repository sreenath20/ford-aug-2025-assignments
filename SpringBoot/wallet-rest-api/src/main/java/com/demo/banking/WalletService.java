package com.demo.banking;

import java.util.Collection;

public interface WalletService {

    Wallet registerNewUser(Wallet newWallet)throws WalletException;

    Wallet addFundsToWalletByEmail(String emailAddress,Double depositAmount) throws WalletException;

    Wallet withdrawFundsFromWalletByEmail(String emailAddress,Double withdrawAmount) throws WalletException;

    String transferFundsToWalletByEmail(String senderEmail,String receiverEmail,Double transferAmount) throws WalletException;

    Wallet getWalletByEmail(String emailAddress) throws WalletException;

    Collection<Wallet> getAllWallets() throws WalletException;

    String userLogIn(String emailAddress, String userPassword) throws WalletException;

    Collection<Wallet> sortCustomerWallets(String sortOrder) throws WalletException;

    Collection<Wallet> findWalletsByName(String customerName) throws WalletException;

    Collection<Wallet> findAllWalletsHavingBalanceBetween(Double startAmount, Double endAmount) throws WalletException;

    String updateWalletPassword(String emailAddress, String currentPassword, String updatedPassword) throws WalletException;

    String deleteWalletByEmail(String emailAddress) throws WalletException;

}
