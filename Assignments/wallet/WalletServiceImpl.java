package com.demo.wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

@Service
public class WalletServiceImpl implements WalletService {

    @Autowired
    private WalletDAO walletDAO;

    @Override
    public Wallet registerNewUser(Wallet newWallet) throws WalletException {

//      check user if already exist for given email
        try {
            Wallet foundWallet = walletDAO.getWalletByEmail(newWallet.getEmail());
            if (foundWallet != null) {
                throw new WalletException("This wallet has already been registered with email : " + newWallet.getEmail());
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        walletDAO.saveWallet(newWallet);


        return newWallet;
    }

    @Override
    public Wallet addFundsToWalletByEmail(String email, Double amount) throws WalletException {

        Wallet foundWallet = walletDAO.getWalletByEmail(email);
        if (foundWallet == null) {
            throw new WalletException("Wallet not found for email : " + email);
        }
        else {
            Double currentAmount = foundWallet.getBalance();
            currentAmount += amount;
            foundWallet.setBalance(currentAmount);
            walletDAO.updateWalletBalance(foundWallet);
        }
        return foundWallet;
    }

    @Override
    public Wallet withdrawFundsFromWalletByEmail(String email, Double amount) throws WalletWithdrawException {

        Wallet foundWallet = walletDAO.getWalletByEmail(email);
        if (foundWallet == null) {
            throw new WalletException("Wallet not found for email : " + email);
        }
        else {
            Double balance = foundWallet.getBalance();
            if(balance < amount){
                throw new WalletWithdrawException("Insufficient funds to withdraw from wallet, balance : "+balance);
            }
            else if(amount < 99){
                throw new WalletWithdrawException("Withdraw amount should be multiple of 100s. Entered : "+amount);
            }
            balance -= amount;
            foundWallet.setBalance(balance);
            walletDAO.updateWalletBalance(foundWallet);

        }
        return foundWallet;
    }

    @Override
    public String transferFundsToWalletByEmail(String fromEmail, String toEmail, Double amount) throws WalletException {
        Wallet foundFromWallet = walletDAO.getWalletByEmail(fromEmail);
        Wallet foundToWallet = walletDAO.getWalletByEmail(toEmail);
        if (foundFromWallet == null) {
            throw new WalletException("From wallet not found for email : " + fromEmail);
        }
        if (foundToWallet == null) {
            throw new WalletException("To wallet not found for email : " + toEmail);
        }
        Double fromBalance = foundFromWallet.getBalance();
        if (fromBalance < amount) {
            throw new WalletException("Insufficient funds to transfer from wallet, balance : "+fromBalance);
        }
        fromBalance -= amount;
        foundFromWallet.setBalance(fromBalance);
        Double toBalance = foundToWallet.getBalance();
        toBalance += amount;
        foundToWallet.setBalance(toBalance);
        walletDAO.updateWalletBalance(foundFromWallet);
        walletDAO.updateWalletBalance(foundToWallet);

        return "Transaction successful from "+fromEmail+" to "+toEmail;
    }

    @Override
    public Wallet getWalletByEmail(String email) throws WalletException {
        Wallet foundWallet = walletDAO.getWalletByEmail(email);
        if (foundWallet == null) {
            throw new WalletException("Wallet not found for email : " + email);
        }
        return foundWallet;
    }

    @Override
    public Collection<Wallet> getAllWallets() throws WalletException {

        Collection<Wallet> wallets = walletDAO.getAllWallets();
        if (wallets == null) {
            throw new WalletException("No wallets found.");
        }
        return wallets;
    }

    @Override
    public String userLogIn(String email, String password) throws InvalidUserException {
        
        Wallet foundWallet = walletDAO.getWalletByEmail(email);
        if (foundWallet == null) {
            throw new InvalidUserException("User not found for email : " + email);
        }
        else {
            if (foundWallet.getPassword().equals(password)) {
                System.out.println("Logged in as " + foundWallet.getEmail());
            }
            else{
                throw new InvalidUserException("Wrong password for wallet, email : " + email);
            }
        }

        return "Logged in Successfully..! as "+foundWallet.getName();
    }

    @Override
    public Collection<Wallet> sortCustomerWallets(String order) throws WalletException {

        Comparator<Wallet> walletComparator;
        List<Wallet> wallets = (List<Wallet>) walletDAO.getAllWallets();
        if (wallets == null) {
            throw new WalletException("No wallets found.");
        }
        switch (order) {
            case "name":
                walletComparator = (w1,w2) -> w1.getName().compareTo(w2.getName());
                break;
            case "email":
                walletComparator = (w1,w2) -> w1.getEmail().compareTo(w2.getEmail());
                break;
            case "balance":
                walletComparator = (w1,w2) -> w1.getBalance().compareTo(w2.getBalance());
                break;
            case "id":
                walletComparator = (w1,w2) -> w1.getId().compareTo(w2.getId());
                break;
            default:
                throw new WalletException("Invalid order use[Name,Id,Balance,Email]");
        }
        wallets.sort(walletComparator);
        return wallets;
    }

    @Override
    public Collection<Wallet> findWalletsByName(String name) throws WalletException {
        Collection<Wallet> wallets = walletDAO.getWalletByName(name);
        if (wallets.isEmpty()) {
            throw new WalletException("No wallets found for name : " + name);
        }
        return wallets;
    }

    @Override
    public Collection<Wallet> findAllWalletsHavingBalanceBetween(Double fromAmount, Double toAmount) throws WalletException {

        List<Wallet> wallets = (List<Wallet>) walletDAO.findAllWalletsHavingBalanceBetween(fromAmount,toAmount);
        if(wallets.isEmpty()){
            throw new WalletException("No wallets found for amount between : " + fromAmount + " and " + toAmount);
        }
        return wallets;
    }

    @Override
    public String updateWalletPassword(String emailId, String oldPassword, String newPassword) throws WalletException {
        Wallet foundWallet = walletDAO.getWalletByEmail(emailId);
        if (foundWallet == null) {
            throw new WalletException("Wallet not found for email : " + emailId);
        }
        else {
            if (foundWallet.getPassword().equals(oldPassword)) {
                foundWallet.setPassword(newPassword);
                walletDAO.updatePassword(foundWallet,newPassword);
            }
            else {
                throw new WalletException("Old Passwords do not match for email : " + emailId);
            }
        }
        return "Updated password for email : " + emailId;
    }

    @Override
    public String deleteWalletByEmail(String email) throws WalletException {
        Wallet foundWallet = walletDAO.getWalletByEmail(email);
        if (foundWallet == null) {
            throw new WalletException("Wallet not found for email : " + email);
        }
        else {
            walletDAO.deleteWalletByEmail(foundWallet);
        }
        return "Wallet deleted successfully..! User : "+foundWallet.getName();
    }
}
