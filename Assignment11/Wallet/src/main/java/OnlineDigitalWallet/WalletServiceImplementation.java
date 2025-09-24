package OnlineDigitalWallet;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WalletServiceImplementation implements WalletService {
    private final Map<String, Wallet> userWalletsMap = new HashMap<>();

    @Override
    public Wallet registerNewUserWallet(Wallet newWallet) throws WalletNewUserException {
        if (this.userWalletsMap.containsKey(newWallet.getEmail())) {
            throw new WalletNewUserException("User with email " + newWallet.getEmail() + " already exists.Please try with a different email.");
        }
        if (newWallet.getEmail() == null || newWallet.getEmail().isEmpty()) {
            throw new WalletNewUserException("Email cannot be null or empty.Please provide a valid email.");
        }
        this.userWalletsMap.put(newWallet.getEmail(), newWallet);
//if not working first add (put) then return
        return this.userWalletsMap.get(newWallet.getEmail());
    }

    @Override
    public Double addFundsToWalletByEmailId(String emailId, Double amount) throws WalletAddFundException, WalletNotFoundException {
        if (!this.userWalletsMap.containsKey(emailId)) {
            throw new WalletNotFoundException("User with email " + emailId + " does not exist.Please register first.");
        }
        if( amount <= 0) {
            throw new WalletAddFundException("Amount to add must be greater than zero.Please enter a valid amount.");
        }


        Wallet wallet = this.userWalletsMap.get(emailId);
        wallet.setBalance(wallet.getBalance() + amount);
        this.userWalletsMap.put(emailId, wallet); // Update the map with the new
        return wallet.getBalance();

    }

    @Override
    public Double withdrawFundsFromWalletByEmailId(String emailId, Double amount) throws WalletWithdrawFundException, WalletNotFoundException {
        if (!this.userWalletsMap.containsKey(emailId)) {
            throw new WalletNotFoundException("User with email " + emailId + " does not exist.Please register first.");
        } else if (amount <= 0) {
            throw new WalletWithdrawFundException("Amount to withdraw must be greater than zero.Please enter a valid amount.");
        } else if (this.userWalletsMap.get(emailId).getBalance() < amount) {
            throw new WalletWithdrawFundException("Insufficient balance in wallet.Please try with a smaller amount.");
        }
        Wallet wallet = this.userWalletsMap.get(emailId);
        wallet.setBalance(wallet.getBalance() - amount);
        this.userWalletsMap.put(emailId, wallet);
        return wallet.getBalance();

    }

    @Override
    public Boolean transferFunds(String fromEmailId, String toEmailId, Double amount) throws WalletTransferFundException, WalletNotFoundException {
        if (!this.userWalletsMap.containsKey(fromEmailId)) {
            throw new WalletNotFoundException("Sender with email " + fromEmailId + " does not exist.Please register first.");
        } else if (!this.userWalletsMap.containsKey(toEmailId)) {
            throw new WalletNotFoundException("Receiver with email " + toEmailId + " does not exist.Please register first.");
        } else if (amount <= 0) {
            throw new WalletTransferFundException("Amount to transfer must be greater than zero.Please enter a valid amount.");
        } else if (this.userWalletsMap.get(fromEmailId).getBalance() < amount) {
            throw new WalletTransferFundException("Insufficient balance in sender's wallet.Please try with a smaller amount.");
        }

        Wallet fromWallet = this.userWalletsMap.get(fromEmailId);
        Wallet toWallet = this.userWalletsMap.get(toEmailId);
        fromWallet.setBalance(fromWallet.getBalance() - amount);
        toWallet.setBalance(toWallet.getBalance() + amount);
        //this.userWalletsMap.put(fromEmailId, fromWallet);
        //this.userWalletsMap.put(toEmailId, toWallet);
        return true;
    }

    @Override
    public Wallet getWalletByEmailId(String emailId) throws WalletNotFoundException {
        if (!this.userWalletsMap.containsKey(emailId)) {
            throw new WalletNotFoundException("User with email " + emailId + " does not exist.Please register first.");
        }
        Wallet wallet = this.userWalletsMap.get(emailId);
        return wallet;

    }

    @Override
    public Collection<Wallet> getAllCustomerWallets() throws WalletNotFoundException {
        if (this.userWalletsMap.isEmpty()) {
            throw new WalletNotFoundException("No wallets found.Please register users first.");
        }
        return this.userWalletsMap.values();
    }

    @Override
    public boolean userLogin(String emailId, String password) throws UserNotFoundException {
        if (!this.userWalletsMap.containsKey(emailId)) {
            throw new UserNotFoundException("User with email " + emailId + " does not exist.Please register first.");
        }
        Wallet wallet = this.userWalletsMap.get(emailId);
        if ( !wallet.getEmail().equals(emailId)|| !wallet.getPassword().equals(password)) {
            throw new UserNotFoundException("Invalid credentials for email  "+ emailId + " , try again.");

        }
        return true;
    }

    @Override
    public Collection<Wallet> sortCustomerWallets(String order) throws WalletNotFoundException {
        if (this.userWalletsMap.isEmpty()) {
            throw new WalletNotFoundException("No wallets found.Please register users first.");
        }
        List<Wallet> sortedUserWalletList = this.userWalletsMap.values().stream().sorted((w1, w2) -> {
            if (!order.equalsIgnoreCase("ascending")) {
                if (!"descending".equalsIgnoreCase(order)) {
                    throw new IllegalArgumentException("Invalid sort order: " + order);
                } else {
                    return Double.compare(w2.getBalance(), w1.getBalance());
                }
            } else {
                return Double.compare(w1.getBalance(), w2.getBalance());
            }
        }).toList();
        return sortedUserWalletList;


    }

    @Override
    public Collection<Wallet> findWalletByName(String name) throws WalletNotFoundException {
        if (this.userWalletsMap.isEmpty()) {
            throw new WalletNotFoundException("No wallets found.Please register users first.");
        }
        List<Wallet> foundWallets = this.userWalletsMap.values().stream().filter(wallet -> wallet.getCustomerName().equalsIgnoreCase(name)).toList();
        if (foundWallets.isEmpty()) {
            throw new WalletNotFoundException("No wallets found for name: " + name);
        }
        return foundWallets;
    }

    @Override
    public Collection<Wallet> findWalletsBetweenBalance(Double fromAmount, Double toAmount) throws WalletNotFoundException {
        if (this.userWalletsMap.isEmpty()) {
            throw new WalletNotFoundException("No wallets found.Please register users first.");

        }
        List<Wallet> foundWalletsBetweenBalance = this.userWalletsMap.values().stream().filter(wallet -> wallet.getBalance() >= fromAmount && wallet.getBalance() <= toAmount).toList();
        if (foundWalletsBetweenBalance.isEmpty()) {
            throw new WalletNotFoundException("No wallets found between balance: " + fromAmount + " and " + toAmount);
        }
        return foundWalletsBetweenBalance;
    }

    @Override
    public Boolean updateWalletPassword(String emailId, String oldPassword, String newPassword) throws WalletNotFoundException {
        if (!this.userWalletsMap.containsKey(emailId)) {
            throw new WalletNotFoundException("User with email " + emailId + " does not exist.Please register first.");
        }
        Wallet wallet = this.userWalletsMap.get(emailId);
        if (!wallet.getPassword().equals(oldPassword)) {
            throw new WalletNotFoundException("Invalid old password for user with email " + emailId + ".");
        }
        if (wallet.getPassword().equals(newPassword)) {
            throw new WalletNotFoundException("New password cannot be the same as the old password.Please choose a different password.");
        }
        wallet.setPassword(newPassword);
        this.userWalletsMap.put(emailId, wallet);
        return true;
    }
}

