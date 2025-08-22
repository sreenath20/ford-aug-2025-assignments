package com.fullstackabi.assignment.Assign11.LayeredArch;

import java.util.*;

public class WalletServiceImpl implements WalletService {
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
        Double addFund = 0.0;
        if (this.userWalletsMap.containsKey(emailId)) {
            addFund = this.userWalletsMap.get(emailId).getBalance() + amount;
        }
        return addFund;
    }

    ;

    @Override
    public Double withdrawFromWalletByEmailId(String emailId, Double amount) throws WalletWithdrawException {
        Double withDrawFund = 0.0;
        if (this.userWalletsMap.containsKey(emailId)) {
            withDrawFund = this.userWalletsMap.get(emailId).getBalance() - amount;
        } else {
            throw new WalletWithdrawException("Email id not found, please try again");
        }
        return withDrawFund;

    }

    @Override
    public Boolean transferFunds(String fromEmailId, String toEmailId, Double amount) throws WalletTransferFundException {
        // Double transferFund = 0.0;
        Wallet fromWallet = this.userWalletsMap.get(fromEmailId);
        Wallet toWallet = this.userWalletsMap.get(toEmailId);
        if (fromWallet.getBalance() < amount) {
            throw new WalletTransferFundException("Transfer failed - Insufficient funds");

        }
        fromWallet.setBalance(fromWallet.getBalance() - amount);
        toWallet.setBalance(toWallet.getBalance() + amount);
        return true;
    }

    @Override
    public Wallet getUserWalletByEmailId(String userEmailId) throws WalletException {
        if (!this.userWalletsMap.containsKey(userEmailId)) {
            throw new WalletException("Email id not found, please try again");
        }
        return this.userWalletsMap.get(userEmailId);

    }

    @Override
    public Collection<Wallet> getAllCustomerWallets() throws WalletException {
        return this.userWalletsMap.values();
    }

    public Wallet userLogin(String userEmailID, String password) throws WalletException {

        if (userWalletsMap.get(userEmailID) == null) {
            throw new WalletException("User email ID does not exists");
        } else if (!userWalletsMap.get(userEmailID).getPassword().equals(password)) {
            throw new WalletException("Password does not match");
        } else {
            System.out.println("Your login Succeeded");
        }
        return this.userWalletsMap.get(userEmailID);
    }

    public Collection<Wallet> sortCustomerWallets(String order) throws WalletException {
        List<Wallet> sortWallet = new ArrayList<>((Collection) userWalletsMap);
        if(order == "desc") {
            sortWallet.stream().sorted(Collections.reverseOrder())
                    .toList();
        }else if(order == "asc") {
            sortWallet.stream().sorted(Comparator.comparing(Wallet::getName))
                    .toList();
        }else{
            throw new  WalletException("Invalid order entered");
        }
        return sortWallet;

    }
}

