package com.harini.layeredProject.wallet;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class WalletServiceImpl implements WalletService {

    // Data structure emailId->Wallet

    private Map<String, Wallet> userWalletsMap = new HashMap<>();

    @Override
    public Wallet registerNewUserWallet(Wallet newWallet) throws WalletException {
        // exception handling if email id already exists
        if (this.userWalletsMap.containsKey(newWallet.getEmail())) {
            throw new WalletException("Email id already exists, please retry with new id:" + newWallet.getEmail());
        }
        this.userWalletsMap.put(newWallet.getEmail(), newWallet); // adding wallet to map
        return this.userWalletsMap.get(newWallet.getEmail()); // retrieve saved customer wallet
    }

    @Override
    public Double addFundsToWalletByEmailId(String emailId, Double amount) throws WalletException {
        Double balance=0.0;
        if(amount<0){
            throw new WalletException("Invalid amount");
        }
        if (userWalletsMap.containsKey(emailId)) {
            balance=userWalletsMap.get(emailId).getBalance();
            balance=balance+amount;
            userWalletsMap.get(emailId).setBalance(balance);
        }
        else{
            throw new WalletException("Email id not exists, please login first");
        }
        return balance;
    }

    @Override
    public Double withdrawFromWalletByEmailId(String emailId, Double amount) throws WalletWithdrawException {
        if(amount<0){
            throw new WalletWithdrawException("Invalid amount");
        }
        if(!userWalletsMap.containsKey(emailId)){
            throw new WalletWithdrawException("Email id not exists, please login first");
        }
        if(userWalletsMap.get(emailId).getBalance()<amount){
            throw new WalletWithdrawException("Insufficient balance");
        }
        Double balance=userWalletsMap.get(emailId).getBalance();
        balance=balance-amount;
        userWalletsMap.get(emailId).setBalance(balance);
        return balance;
    }

    @Override
    public Boolean transferFunds(String fromEmailId, String toEmailId, Double amount) throws WalletException {
        if(!userWalletsMap.containsKey(fromEmailId)){
            throw new WalletException("FromEmail id does not exists");
        }
        if(!userWalletsMap.containsKey(toEmailId)){
            throw new WalletException("ToEmail id does not exists");
        }
        if(userWalletsMap.get(fromEmailId).getBalance()<amount){
            throw new WalletException("Insufficient balance in FromEmail Id");
        }
        if(amount<0){
            throw new WalletException("Invalid amount");
        }
        Double balance=userWalletsMap.get(fromEmailId).getBalance();
        balance=balance-amount;
        userWalletsMap.get(fromEmailId).setBalance(balance);
        Double balance2=userWalletsMap.get(toEmailId).getBalance();
        balance2=balance2+amount;
        userWalletsMap.get(toEmailId).setBalance(balance2);
        System.out.println("The new balance of fromEmail Id is "+balance);
        System.out.println("The new balance of toEmail Id is "+balance2);
        return true;
    }

    @Override
    public Wallet getUserWalletByEmailId(String userEmailId) throws WalletException {
        return this.userWalletsMap.get(userEmailId);
    }

    @Override
    public Collection<Wallet> getAllCustomerWallets() throws WalletException {
        return this.userWalletsMap.values();
    }

    @Override
    public Wallet userLogin(String emailId, String password) throws WalletException {
        if(!userWalletsMap.containsKey(emailId)){
            throw new WalletException("Email id not exists, please login first");
        }
        if(!userWalletsMap.get(emailId).getPassword().equals(password)){
            throw new WalletException("Password does not match");
        }
        System.out.println("Login successfull");
        return userWalletsMap.get(emailId);
    }

    @Override
    public Collection<Wallet> sortCustomerWallets(String order) throws WalletException {
        List<Wallet> sortedWallets = new ArrayList<>(userWalletsMap.values());
        if(order.equals("ascending")){
            Collections.sort(sortedWallets);
        }
        else if(order.equals("descending")){
            sortedWallets.sort(Collections.reverseOrder());
        }
        else{
            throw new WalletException("Invalid order");
        }

        return sortedWallets;
    }

    @Override
    public Collection<Wallet> findWalletsByName(String name) throws WalletException {
        List<Wallet> wallets = new ArrayList<>(userWalletsMap.values());
//        if(!wallets.get(wallets.size()-1).getName().equals(name)){
//            throw new WalletException("User does not exists");
//        }
//        for(Wallet wallet:userWalletsMap.values()){
//            if(wallet.getName().equals(name)){
//                return Collections.singleton(wallet);
//            }
//        }
        if(!wallets.stream().anyMatch(w->w.getName().equals(name)))
            throw new WalletException("Wallet Name does not exists");

        wallets = wallets.stream().filter(wallet->wallet.getName().equals(name)).toList();
        return wallets;

    }

    @Override
    public Collection<Wallet> findAllWalletsHavingBalanceBetween(Double fromAmount, Double toAmount) throws WalletException {
        List<Wallet> allWalletsHavingBalanceBetween = new ArrayList<>();
        if(userWalletsMap.values().size()==0){
            throw new WalletException("User does not exists");
        }
        if(fromAmount>toAmount){
            throw new WalletException("FromAmount should be less than toAmount");
        }
        for(Wallet wallet:userWalletsMap.values()){
            if(wallet.getBalance()>=fromAmount && wallet.getBalance()<=toAmount){
                allWalletsHavingBalanceBetween.add(wallet);
            }
        }
        return allWalletsHavingBalanceBetween;
    }

    @Override
    public Boolean updateWalletPassword(String emailId, String oldPassword, String newPassword) throws WalletException {
        if(!userWalletsMap.containsKey(emailId)){
            throw new WalletException("Email id not exists, please login first");
        }
        if(!userWalletsMap.get(emailId).getPassword().equals(oldPassword)){
            throw new WalletException("Old password does not match");
        }
        userWalletsMap.get(emailId).setPassword(newPassword);
        System.out.println("Password updated successfully");
        return true;
    }

}
