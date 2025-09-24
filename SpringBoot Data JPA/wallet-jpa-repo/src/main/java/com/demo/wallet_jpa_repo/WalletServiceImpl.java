package com.demo.wallet_jpa_repo;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class WalletServiceImpl implements WalletService {

    private final WalletRepository walletRepository;

    @Autowired
    public WalletServiceImpl(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    @Override
    public Wallet registerUser(Wallet wallet) throws WalletException {

        if (walletRepository.findById(wallet.getId()).isPresent()) {
            throw new WalletException("Wallet already exists with ID: " + wallet.getId());
        }

        if (walletRepository.existsByEmail(wallet.getEmail())) {
            throw new WalletException("Wallet already exists with email: " + wallet.getEmail());
        }

        return walletRepository.save(wallet);
    }

    @Override
    public Wallet addFunds(String email, Double amount) throws WalletException {
        if (amount <= 0) {
            throw new WalletException("Amount must be greater than zero");
        }

        Wallet wallet = walletRepository.findByEmail(email);
        if (wallet == null) {
            throw new WalletException("Wallet not found for email: " + email);
        }
        wallet.setBalance(wallet.getBalance() + amount);
        return walletRepository.save(wallet);
    }

    @Override
    public Wallet withdrawFunds(String email, Double amount) throws WalletWithdrawException {
        if (amount <= 0) {
            throw new WalletWithdrawException("Amount must be greater than zero");
        }

        Wallet wallet = walletRepository.findByEmail(email);
        if (wallet == null) {
            throw new WalletWithdrawException("Wallet not found for email: " + email);
        }
        if (amount > wallet.getBalance()) {
            throw new WalletWithdrawException("Insufficient balance. Available: " + wallet.getBalance() + ", Requested: " + amount);
        }
        wallet.setBalance(wallet.getBalance() - amount);
        return walletRepository.save(wallet);
    }

    @Override
    public String transferFunds(String fromEmail, String toEmail, Double amount) throws WalletException {
        if (amount <= 0) {
            throw new WalletException("Transfer amount must be greater than zero");
        }

        if (fromEmail.equals(toEmail)) {
            throw new WalletException("Cannot transfer to the same wallet");
        }

        Wallet fromWallet = walletRepository.findByEmail(fromEmail);
        if (fromWallet == null) {
            throw new WalletException("From wallet not found for email: " + fromEmail);
        }

        Wallet toWallet = walletRepository.findByEmail(toEmail);
        if (toWallet == null) {
            throw new WalletException("To wallet not found for email: " + toEmail);
        }

        if (amount > fromWallet.getBalance()) {
            throw new WalletException("Insufficient balance for transfer. Available: " + fromWallet.getBalance() + ", Requested: " + amount);
        }

        fromWallet.setBalance(fromWallet.getBalance() - amount);
        toWallet.setBalance(toWallet.getBalance() + amount);

        walletRepository.save(fromWallet);
        walletRepository.save(toWallet);

        return "Transfer successful from " + fromEmail + " to " + toEmail + ". Amount: " + amount;
    }

    @Override
    public Collection<Wallet> getAllWallets() {
        return walletRepository.findAll();
    }

    @Override
    public Collection<Wallet> getWalletsByOrder(String order) throws WalletException {
        return switch (order.toLowerCase()) {
            case "balance" -> walletRepository.findAllWalletsOrderByBalanceDesc();
            case "name" -> walletRepository.findAllWalletsOrderByName();
            case "id" -> walletRepository.findAllWalletsOrderById();
            default -> throw new WalletException("Invalid order parameter: " + order + ". Valid options: balance, name, id");
        };
    }

    @Override
    @Transactional
    public String deleteWalletByEmail(String email) throws WalletException {
        if (!walletRepository.existsByEmail(email)) {
            throw new WalletException("Wallet not found for email: " + email);
        }

        int deleted = walletRepository.deleteByEmail(email);
        if (deleted == 0) {
            throw new WalletException("Failed to delete wallet for email: " + email);
        }
        return "Wallet deleted successfully for email: " + email;
    }

    @Override
    public String userLogin(String email, String password) throws InvalidUserException {
        Wallet wallet = walletRepository.findByEmail(email);
        if (wallet == null) {
            throw new InvalidUserException("Invalid email: " + email);
        }
        if (!password.equals(wallet.getPassword())) {
            throw new InvalidUserException("Invalid password for email: " + email);
        }
        return "Login successful for: " + email;
    }
}
