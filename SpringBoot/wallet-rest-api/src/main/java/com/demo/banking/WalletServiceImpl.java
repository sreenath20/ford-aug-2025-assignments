package com.demo.banking;

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
            Wallet foundWallet = walletDAO.getWalletByEmail(newWallet.getEmailAddress());
            if (foundWallet != null) {
                throw new WalletException("This wallet has already been registered with email : " + newWallet.getEmailAddress());
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        walletDAO.saveWallet(newWallet);

        return newWallet;
    }

    @Override
    public Wallet addFundsToWalletByEmail(String emailAddress, Double depositAmount) throws WalletException {

        Wallet foundWallet = walletDAO.getWalletByEmail(emailAddress);
        if (foundWallet == null) {
            throw new WalletException("Wallet not found for email : " + emailAddress);
        }
        else {
            Double currentBalance = foundWallet.getAccountBalance();
            currentBalance += depositAmount;
            foundWallet.setAccountBalance(currentBalance);
            walletDAO.updateWalletBalance(foundWallet);
        }
        return foundWallet;
    }

    @Override
    public Wallet withdrawFundsFromWalletByEmail(String emailAddress, Double withdrawAmount) throws WalletException {

        Wallet foundWallet = walletDAO.getWalletByEmail(emailAddress);
        if (foundWallet == null) {
            throw new WalletException("Wallet not found for email : " + emailAddress);
        }
        else {
            Double currentBalance = foundWallet.getAccountBalance();
            if(currentBalance < withdrawAmount){
                throw new WalletException("Insufficient funds to withdraw from wallet, balance : "+currentBalance);
            }
            else if(withdrawAmount < 99){
                throw new WalletException("Withdraw amount should be multiple of 100s. Entered : "+withdrawAmount);
            }
            currentBalance -= withdrawAmount;
            foundWallet.setAccountBalance(currentBalance);
            walletDAO.updateWalletBalance(foundWallet);

        }
        return foundWallet;
    }

    @Override
    public String transferFundsToWalletByEmail(String senderEmail, String receiverEmail, Double transferAmount) throws WalletException {
        Wallet foundSenderWallet = walletDAO.getWalletByEmail(senderEmail);
        Wallet foundReceiverWallet = walletDAO.getWalletByEmail(receiverEmail);
        if (foundSenderWallet == null) {
            throw new WalletException("From wallet not found for email : " + senderEmail);
        }
        if (foundReceiverWallet == null) {
            throw new WalletException("To wallet not found for email : " + receiverEmail);
        }
        Double senderBalance = foundSenderWallet.getAccountBalance();
        if (senderBalance < transferAmount) {
            throw new WalletException("Insufficient funds to transfer from wallet, balance : "+senderBalance);
        }
        senderBalance -= transferAmount;
        foundSenderWallet.setAccountBalance(senderBalance);
        Double receiverBalance = foundReceiverWallet.getAccountBalance();
        receiverBalance += transferAmount;
        foundReceiverWallet.setAccountBalance(receiverBalance);
        walletDAO.updateWalletBalance(foundSenderWallet);
        walletDAO.updateWalletBalance(foundReceiverWallet);

        return "Transaction successful from "+senderEmail+" to "+receiverEmail;
    }

    @Override
    public Wallet getWalletByEmail(String emailAddress) throws WalletException {
        Wallet foundWallet = walletDAO.getWalletByEmail(emailAddress);
        if (foundWallet == null) {
            throw new WalletException("Wallet not found for email : " + emailAddress);
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
    public String userLogIn(String emailAddress, String userPassword) throws WalletException {

        Wallet foundWallet = walletDAO.getWalletByEmail(emailAddress);
        if (foundWallet == null) {
            throw new WalletException("User not found for email : " + emailAddress);
        }
        else {
            if (foundWallet.getUserPassword().equals(userPassword)) {
                System.out.println("Logged in as " + foundWallet.getEmailAddress());
            }
            else{
                throw new WalletException("Wrong password for wallet, email : " + emailAddress);
            }
        }

        return "Logged in Successfully..! as "+foundWallet.getCustomerName();
    }

    @Override
    public Collection<Wallet> sortCustomerWallets(String sortOrder) throws WalletException {

        Comparator<Wallet> walletComparator;
        List<Wallet> wallets = (List<Wallet>) walletDAO.getAllWallets();
        if (wallets == null) {
            throw new WalletException("No wallets found.");
        }
        switch (sortOrder) {
            case "name":
                walletComparator = (w1,w2) -> w1.getCustomerName().compareTo(w2.getCustomerName());
                break;
            case "email":
                walletComparator = (w1,w2) -> w1.getEmailAddress().compareTo(w2.getEmailAddress());
                break;
            case "balance":
                walletComparator = (w1,w2) -> w1.getAccountBalance().compareTo(w2.getAccountBalance());
                break;
            case "id":
                walletComparator = (w1,w2) -> w1.getAccountId().compareTo(w2.getAccountId());
                break;
            default:
                throw new WalletException("Invalid order use[Name,Id,Balance,Email]");
        }
        wallets.sort(walletComparator);
        return wallets;
    }

    @Override
    public Collection<Wallet> findWalletsByName(String customerName) throws WalletException {
        Collection<Wallet> wallets = walletDAO.getWalletByName(customerName);
        if (wallets.isEmpty()) {
            throw new WalletException("No wallets found for name : " + customerName);
        }
        return wallets;
    }

    @Override
    public Collection<Wallet> findAllWalletsHavingBalanceBetween(Double startAmount, Double endAmount) throws WalletException {

        List<Wallet> wallets = (List<Wallet>) walletDAO.findAllWalletsHavingBalanceBetween(startAmount,endAmount);
        if(wallets.isEmpty()){
            throw new WalletException("No wallets found for amount between : " + startAmount + " and " + endAmount);
        }
        return wallets;
    }

    @Override
    public String updateWalletPassword(String emailAddress, String currentPassword, String updatedPassword) throws WalletException {
        Wallet foundWallet = walletDAO.getWalletByEmail(emailAddress);
        if (foundWallet == null) {
            throw new WalletException("Wallet not found for email : " + emailAddress);
        }
        else {
            if (foundWallet.getUserPassword().equals(currentPassword)) {
                foundWallet.setUserPassword(updatedPassword);
                walletDAO.updatePassword(foundWallet,updatedPassword);
            }
            else {
                throw new WalletException("Old Passwords do not match for email : " + emailAddress);
            }
        }
        return "Updated password for email : " + emailAddress;
    }

    @Override
    public String deleteWalletByEmail(String emailAddress) throws WalletException {
        Wallet foundWallet = walletDAO.getWalletByEmail(emailAddress);
        if (foundWallet == null) {
            throw new WalletException("Wallet not found for email : " + emailAddress);
        }
        else {
            walletDAO.deleteWalletByEmail(foundWallet);
        }
        return "Wallet deleted successfully..! User : "+foundWallet.getCustomerName();
    }
}
