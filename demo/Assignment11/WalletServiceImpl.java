package com.demo.Assignment11;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WalletServiceImpl implements WalletService{

    Map<String, Wallet> walletsAvailable= new HashMap<String, Wallet>();

    @Override
    public Wallet registerNewUserWallet(Wallet newWallet) throws UserAlreadyException {
        if(this.walletsAvailable.containsKey(newWallet.getEmail())){
            throw new UserAlreadyException("User already exists");
        }
        this.walletsAvailable.put(newWallet.getEmail(), newWallet);
        return this.walletsAvailable.get(newWallet.getEmail());
    }

    @Override
    public Double addFundsToWalletByEmailId(String emailId, Double amount) throws InvalidAmountException,UserNotFoundException {
            if(!this.walletsAvailable.containsKey(emailId)){
                throw new UserNotFoundException("User Not Found");
            }
            if(amount<=0){
                throw new InvalidAmountException("Amount must be greater than 0");
            }
            Wallet newWallet = this.walletsAvailable.get(emailId);
            newWallet.setBalance(newWallet.getBalance()+amount);
            return newWallet.getBalance();
    }

    @Override
    public Double withdrawFromWalletByEmailId(String emailId, Double amount) throws InsufficientBalanceException,UserNotFoundException {
        if(!this.walletsAvailable.containsKey(emailId)){
            throw new UserNotFoundException("user not found");
        }
        Wallet newWallet = this.walletsAvailable.get(emailId);
        if(newWallet.getBalance()<amount){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        newWallet.setBalance(newWallet.getBalance()-amount);
        return newWallet.getBalance();
    }

    @Override
    public Boolean transferFunds(String fromEmailId, String toEmailId, Double amount) throws UserNotFoundException {
        
        if(!this.walletsAvailable.containsKey(fromEmailId) || !this.walletsAvailable.containsKey(toEmailId)){
            throw new UserNotFoundException("user not found");
        }
        Wallet newWallet=this.walletsAvailable.get(fromEmailId);
        if(newWallet.getBalance()<amount){
            throw new UserNotFoundException("Insufficient Balance");
        }
        newWallet.setBalance(newWallet.getBalance()-amount);
        Wallet toWallet=this.walletsAvailable.get(toEmailId);
        toWallet.setBalance(toWallet.getBalance()+amount);
        return true;
    }

    @Override
    public Wallet getUserWalletByEmailId(String userEmailId) throws UserNotFoundException {
        if(!this.walletsAvailable.containsKey(userEmailId)){
            throw new UserNotFoundException("user not found");
        }
        return this.walletsAvailable.get(userEmailId);
    }

    @Override
    public Collection<Wallet> getAllCustomerWallets() throws UserNotFoundException {
        if(this.walletsAvailable.isEmpty()){
            throw new UserNotFoundException("user not found");
        }
        return walletsAvailable.values();
    }
}
