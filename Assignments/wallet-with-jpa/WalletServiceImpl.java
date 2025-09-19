package com.demo.wallet.app;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

@Service
public class WalletServiceImpl implements WalletService {

    private final WalletRepository walletRepository;

    @Autowired
    public WalletServiceImpl(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }


    @Override
    public Wallet registerNewUser(Wallet newWallet) throws WalletException {
        if(walletRepository.findById(newWallet.getId()).isPresent()){
            throw new WalletException("Wallet already exists");
        }
        return walletRepository.save(newWallet);
    }

    @Override
    public Wallet addFundsToWalletByEmail(String email, Double amount) throws WalletException {
        Wallet fromWallet = walletRepository.findByEmail(email);
        fromWallet.setBalance(fromWallet.getBalance() + amount);
        return walletRepository.save(fromWallet);
    }

    @Override
    public Wallet withdrawFundsFromWalletByEmail(String email, Double amount) throws WalletWithdrawException {
        Wallet foundWallet = walletRepository.findByEmail(email);
        if(foundWallet == null)
            throw new WalletWithdrawException("Wallet not found for email " + email);

        if(amount > foundWallet.getBalance())
            throw new WalletWithdrawException("Insufficient funds to withdraw from wallet " +
                    "\nEmail :" + email + "\nBalance :"+foundWallet.getBalance() +"\nAmount(>Balance) :" + amount);
        foundWallet.setBalance(foundWallet.getBalance() - amount);

        return walletRepository.save(foundWallet);
    }

    @Override
    public String transferFundsToWalletByEmail(String fromEmail, String toEmail, Double amount) throws WalletException {
        Wallet fromWallet = walletRepository.findByEmail(fromEmail);
        if(fromWallet == null)
            throw new WalletException("From wallet not found for email " + fromEmail);
        Wallet toWallet = walletRepository.findByEmail(toEmail);
        if(toWallet == null)
            throw new WalletException("To wallet not found for email " + toEmail);
        if(amount > fromWallet.getBalance())
            throw new WalletException("Insufficient balance to transfer "+
            "\nFrom email :" + fromEmail + "\nBalance" + fromWallet.getBalance() + "\nAmount(>Balance) :" + amount);

       fromWallet.setBalance(fromWallet.getBalance()  - amount);
       walletRepository.save(fromWallet);
       toWallet.setBalance(toWallet.getBalance() + amount);
       walletRepository.save(toWallet);
       
       return "Transfer Successful..!";
    }

    @Override
    public Wallet getWalletByEmail(String email) throws WalletException {
        return walletRepository.findByEmail(email);
    }

    @Override
    public Collection<Wallet> getAllWallets() throws WalletException {
        return walletRepository.findAll();
    }

    @Override
    public String userLogIn(String email, String password) throws InvalidUserException {
        Wallet foundWallet = walletRepository.findByEmail(email);
        if(foundWallet == null)
            throw new InvalidUserException("Invalid email ");
        if(!password.equals(foundWallet.getPassword()))
            throw new InvalidUserException("Invalid password");
        return "Logged in Successfully as " + email;
    }

    @Override
    public Collection<Wallet> sortCustomerWallets(String order) throws WalletException {

        Collection<Wallet> foundWallets = switch (order) {
            case "name" -> walletRepository.findAllWalletsOrderByName();
            case "balance" -> walletRepository.findAllWalletsOrderByBalanceDesc();
            case "id" -> walletRepository.findWalletsOrderById();
            case "email" -> walletRepository.findAllWalletsOrderByEmail();
            default -> throw new WalletException("Invalid order : " + order);
        };

        if(foundWallets.isEmpty())
            throw new WalletException("No wallets found");

        return foundWallets;
    }

    @Override
    public Collection<Wallet> getWalletsByName(String name) throws WalletException {
        Collection<Wallet> foundWallets = walletRepository.findWalletsByName(name);
        if(foundWallets.isEmpty())
            throw new WalletException("No wallets found for name " + name);
        return foundWallets;
    }

    @Override
    public Collection<Wallet> getAllWalletsHavingBalanceBetween(Double fromAmount, Double toAmount) throws WalletException {
        Collection<Wallet> foundWallets = walletRepository.findAllWalletsHavingBalanceBetween(fromAmount, toAmount);
        if(foundWallets.isEmpty())
            throw new WalletException("No wallets found for balance between " + fromAmount + " and " + toAmount);
        return foundWallets;
    }

    @Override
    public Wallet updateWalletPassword(String emailId, String oldPassword, String newPassword) throws WalletException {
        Wallet foundWallet = walletRepository.findByEmail(emailId);
        if(foundWallet == null)
            throw new WalletException("Invalid email");
        if(!oldPassword.equals(foundWallet.getPassword()))
            throw new WalletException("Old Password don't match");
        foundWallet.setPassword(newPassword);
        return walletRepository.save(foundWallet);
    }

    @Override
    public String deleteWalletById(Integer id) throws WalletException {
        if(!walletRepository.existsById(id))
            throw new WalletException("Wallet with id " + id + " does not exist to delete");
        walletRepository.deleteById(id);
        return "Deleted wallet Successfully with id " + id;
    }

    @Override
    @Transactional
    public String deleteWalletByEmail(String email) throws WalletException {

        int deleted =  walletRepository.deleteByEmail(email);
        if(deleted == 0)
            throw new WalletException("Delete wallet failed for email " + email);

        return "Delete wallet successfully for " + email;
    }
}
