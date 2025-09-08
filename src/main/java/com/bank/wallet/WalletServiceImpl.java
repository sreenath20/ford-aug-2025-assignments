package com.bank.wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
// extends / imlements => IS-A
public class WalletServiceImpl implements WalletService {

    // Loose coupling
    // Has - A dependency
    //@Autowired
    private WalletDao walletDao;// Dependency injection  = //new WalletDaoImpl(); // if this object gets crested by spring we call it as inversion of control

    @Autowired
    public WalletServiceImpl(WalletDao walletDao) {
        // here handle further customise / validation of wallDao
        this.walletDao = walletDao;
    }

    @Override
    public Wallet registerNewUserWallet(Wallet newWallet) throws WalletException {
        // Check ig user exists already with given email
        try {
            Wallet foundWallet = walletDao.getWalletByEmail(newWallet.getEmail());
            if (foundWallet != null)
                throw new WalletException("User already exists for email:" + newWallet.getEmail());
            else {  // save wallet to DB
                return walletDao.saveWallet(newWallet);

            }
        } catch (WalletException e) {
            throw e; // rethrow of wallet exception
        }

        //return null;
    }

    @Override
    public Double addFundsToWalletByEmailId(String emailId, Double amount) throws WalletException {
        Wallet foundWallet = walletDao.getWalletByEmail(emailId);
        if (foundWallet == null) {
            throw new WalletException("Wallet not found for email id:" + emailId);

        } else {
            Double currentBalance = foundWallet.getBalance();
            currentBalance += amount;
            foundWallet.setBalance(currentBalance);
            walletDao.updateWalletBalance(foundWallet);
        }
        return foundWallet.getBalance();
    }

    @Override
    public Double withdrawFromWalletByEmailId(String emailId, Double amount) throws WalletException {
        Wallet foundWallet = walletDao.getWalletByEmail(emailId);
        if (foundWallet == null) {
            throw new WalletException("Wallet not found for email id:" + emailId);

        } else {
            Double currentBalance = foundWallet.getBalance();
            currentBalance -= amount;
            foundWallet.setBalance(currentBalance);
            walletDao.updateWalletBalance(foundWallet);
        }
        return foundWallet.getBalance();

    }

    @Override
    public Boolean transferFunds(String fromEmailId, String toEmailId, Double amount) throws WalletException {
        return null;
    }

    @Override
    public Wallet getUserWalletByEmailId(String userEmailId) throws WalletException {
        return null;
    }

    @Override
    public Collection<Wallet> getAllCustomerWallets() throws WalletException {
        return this.walletDao.getAllWallets();
    }

    @Override
    public Wallet userLogin(String userEmailId, String password) throws WalletException {
        return null;
    }

    @Override
    public Collection<Wallet> sortCustomerWallets(String order) throws WalletException {
        return List.of();
    }

    @Override
    public Collection<Wallet> findWalletsByName(String name) throws WalletException {
        return List.of();
    }

    @Override
    public Collection<Wallet> findAllWalletsHavingBalanceBetween(Double fromAmount, Double toAmount) throws WalletException {
        return List.of();
    }

    @Override
    public Boolean updateWalletPassword(String emailId, String oldPassword, String newPassword) throws WalletException {
        return null;
    }
}