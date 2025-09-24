package com.bank.wallet.application;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j

public class WalletServiceImpl implements WalletService{


    private WalletRepository walletRepository;
    @Autowired
    public WalletServiceImpl(WalletRepository walletRepository) {
        //here handle further customise/ validation of walletDao
        this.walletRepository = walletRepository;

    }
    //Create

    @Override
    public Wallet registerNewUserWallet(Wallet newWallet) throws WalletException {
        try {
            Optional<Wallet> optionalWallet = walletRepository.findById(newWallet.getId());
            if (optionalWallet.isEmpty()) {
                return this.walletRepository.save(newWallet);
            } else {
                // Handle the case where wallet already exists
                throw new WalletException("Wallet with ID " + newWallet.getId() + " already exists");
            }}catch(Exception e){
            throw new WalletException(e.getMessage());
        }


    }

    @Override

    public Double addFundsToWalletByEmailId(String EmailId, Double amount) throws WalletException {
        try{
            Optional<Wallet> optionalWallet= walletRepository.findByEmailId(EmailId);
            Double finalAmout= this.walletRepository.findByEmailId(EmailId).get().getBalance();
            finalAmout=finalAmout+amount;
            if(this.walletRepository.findByEmailId(EmailId).isPresent()){
                
               optionalWallet.get().setBalance(finalAmout);
                 this.walletRepository.save(optionalWallet.get());
                 return finalAmout;
            }
        }catch(Exception e){
            throw new WalletException(e.getMessage());
        }
        return amount;
    }

    @Override
    public Double withdrawFromWalletByEmailId(String emailId, Double amount) throws WalletException {
        Double balance= walletRepository.findByEmailId(emailId).get().getBalance();
        if(amount>0 && balance>amount){
           Double  balances=balance-amount;
           this.walletRepository.findByEmailId(emailId).get().setBalance(balances);
           return balances;
       }
        else{
            throw new WalletException("withdraw is not possible");
        }

    }

    @Override
    public Boolean transferFunds(String fromEmailId, String toEmailId, Double amount) throws WalletException {
        if(walletRepository.findByEmailId(fromEmailId).isPresent() && walletRepository.findByEmailId(toEmailId).isPresent()) {
            Double fromBalance = walletRepository.findByEmailId(fromEmailId).get().getBalance() - amount;
            Double toBalance = walletRepository.findByEmailId(toEmailId).get().getBalance() + amount;
            this.walletRepository.findByEmailId(fromEmailId).get().setBalance(fromBalance);
            this.walletRepository.findByEmailId(toEmailId).get().setBalance(toBalance);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Collection<Wallet> getUserWalletByEmailId(String userEmailId) throws WalletException {
        if(walletRepository.findByEmailId(userEmailId).isPresent()){
            return List.of(this.walletRepository.findByEmailId(userEmailId).get());
        }
        else{
            throw new WalletException("User with ID " + userEmailId + " does not exist");
        }
    }

    @Override
    public Collection<Wallet> getAllCustomerWallets() throws WalletException {
        return walletRepository.findAll();
    }

    @Override
    public Wallet userLogin(String userEmailId, String password) throws WalletException {
        if(walletRepository.findByEmailId(userEmailId).isPresent()){
            if(password.equals(walletRepository.userLogin(userEmailId,password))){
                return walletRepository.findByEmailId(userEmailId).get();
            }
            else{
                throw new WalletException("your mailId or password is incorrect");
            }
        }else{
            throw new WalletException("User with ID " + userEmailId + " does not exist");

        }
    }

    @Override
    public Collection<Wallet> sortCustomerWallets(String orderBY) throws WalletException {
        return walletRepository.sortCustomerWallets(orderBY);
    }

    @Override
    public Collection<Wallet> findWalletsByName(String name) throws WalletException {
        return this.walletRepository.findByName(name);
    }

    @Override
    public Collection<Wallet> findAllWalletsHavingBalanceBetween(Double fromAmount, Double toAmount) throws WalletException {
        return this.walletRepository.findWalletBetween(fromAmount,toAmount);
    }

    @Override
    public Wallet updateWalletPassword(String emailId, Wallet newWallet) throws WalletException {
        try{

            if(walletRepository.findByEmailId(emailId).isPresent()){
                return this.walletRepository.save(newWallet);
            }
            else{
                throw new WalletException("Wallet is not found");
            }

        }catch(Exception e){
            throw new WalletException(e.getMessage());
        }


    }

    @Override
    public Wallet DeleteWalletByEmailId(String emailId) throws WalletException {
        try{
            Optional<Wallet> optionalWallet = walletRepository.findByEmailId(emailId);
            if(walletRepository.findByEmailId(emailId).isPresent()){
                Wallet newWallet = optionalWallet.get();
                this.walletRepository.deleteBY(emailId);
                return newWallet;
            }

        }catch(Exception e){
            throw new WalletException(e.getMessage());
        }
        return null;
    }


}

