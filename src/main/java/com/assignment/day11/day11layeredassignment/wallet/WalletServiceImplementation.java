package com.assignment.day11.day11layeredassignment.wallet;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WalletServiceImplementation implements WalletService{

    private Map<Integer, Wallet> userWallets = new HashMap<>();

    @Override
    public Wallet registerWallet(Wallet wallet) throws UserAlreadyExistsException {
        if(this.userWallets.containsKey(wallet.getId())){
            throw new UserAlreadyExistsException("Customer id already exists : "+wallet.getId());
        }
        this.userWallets.put(wallet.getId(), wallet);
        return this.userWallets.get(wallet.getId());
    }

    @Override
    public Double addFundsByCustomerId(Integer CustomerId, Double amount) throws UserNotFoundException,InvalidAmountException {
        if(!this.userWallets.containsKey(CustomerId)){
            throw new UserNotFoundException("Account does not exist for "+CustomerId);
        }
        if(amount<0){
            throw new InvalidAmountException("Amount cannot be negative");
        }
        Wallet wallet = this.userWallets.get(CustomerId);
        wallet.setBalance(wallet.getBalance()+amount);
        return wallet.getBalance();
    }

    @Override
    public Double withdrawFundsByCustomerId(Integer CustomerId, Double amount) throws UserNotFoundException,InsufficientBalanceException,InvalidAmountException {
        if(!this.userWallets.containsKey(CustomerId)){
            throw new UserNotFoundException("Account does not exist for "+CustomerId);
        }
        if(amount<0){
            throw new InvalidAmountException("Amount cannot be negative");
        }
        Wallet wallet = this.userWallets.get(CustomerId);
        if(wallet.getBalance()<amount){
            throw new InsufficientBalanceException("Insufficient balance");
        }
        wallet.setBalance(wallet.getBalance()-amount);
        return wallet.getBalance();
    }

    @Override
    public Boolean transferFunds(Integer fromCustomerId, Integer toCustomerId, Double amount) throws UserNotFoundException, InsufficientBalanceException,InvalidAmountException {
        if(!this.userWallets.containsKey(fromCustomerId)){
            throw new UserNotFoundException("Account does not exist for "+fromCustomerId);
        }
        if(!this.userWallets.containsKey(toCustomerId)){
            throw new UserNotFoundException("Account does not exist for "+toCustomerId);
        }
        if(amount<1){
            throw new InvalidAmountException("Transfer amount cannot be less than 1 Rs");
        }

        Wallet fromWallet = this.userWallets.get(fromCustomerId);
        Wallet toWallet = this.userWallets.get(toCustomerId);
        fromWallet.setBalance(fromWallet.getBalance()-amount);
        toWallet.setBalance(toWallet.getBalance()+amount);

        return true;
    }

    @Override
    public Wallet getWalletByCustomerId(Integer customerId) throws UserNotFoundException {
        Wallet wallet = this.userWallets.get(customerId);
        if(wallet==null){
            throw new UserNotFoundException("Account does not exist for "+customerId);
        }
        return wallet;
    }

    @Override
    public Collection<Wallet> getAllWallets() throws NoUsersFoundException {
        Collection<Wallet> wallets = this.userWallets.values();
        if(wallets==null){
            throw new NoUsersFoundException("No users found");
        }
        return wallets;
    }

}
