package com.demo.Assignment11;

import java.util.Collection;

public interface WalletService {
    Wallet registerNewUserWallet(Wallet newWallet) throws UserAlreadyException;

    Double addFundsToWalletByEmailId(String emailId, Double amount) throws InvalidAmountException,UserNotFoundException;

    Double withdrawFromWalletByEmailId(String emailId, Double amount) throws InsufficientBalanceException,UserNotFoundException;

    Boolean transferFunds(String fromEmailId, String toEmailId, Double amount) throws UserNotFoundException;

    Wallet getUserWalletByEmailId(String userEmailId) throws UserNotFoundException;

    Collection<Wallet> getAllCustomerWallets() throws UserNotFoundException;


}
