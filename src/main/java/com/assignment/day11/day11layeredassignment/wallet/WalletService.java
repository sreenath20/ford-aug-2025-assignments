package com.assignment.day11.day11layeredassignment.wallet;

import java.util.Collection;

public interface WalletService {

    Wallet registerWallet(Wallet wallet) throws UserAlreadyExistsException;

    Double addFundsByCustomerId(Integer CustomerId, Double amount) throws UserNotFoundException,InvalidAmountException;

    Double withdrawFundsByCustomerId(Integer CustomerId, Double amount) throws UserNotFoundException,InsufficientBalanceException,InvalidAmountException;

    Boolean transferFunds(Integer fromCustomerId, Integer toCustomerId, Double amount) throws UserNotFoundException,InsufficientBalanceException,InvalidAmountException;

    Wallet getWalletByCustomerId(Integer CustomerId) throws UserNotFoundException;

    Collection<Wallet> getAllWallets() throws NoUsersFoundException;

}
