package day11;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class WalletServiceImpl implements WalletService {
    private final Map<String, WalletCustomer> walletStore = new HashMap<>();
    private final String ADMIN_PASSWORD = "admin123";

    @Override
    public WalletCustomer registerNewUserWallet(WalletCustomer newWallet) throws UserAlreadyExistsException {
        if (walletStore.containsKey(newWallet.getEmail())) {
            throw new UserAlreadyExistsException("User with the email " + newWallet.getEmail() + " already exists!");
        }
        walletStore.put(newWallet.getEmail(), newWallet);
        return newWallet;
    }

    @Override
    public Double addFundsToWalletByEmailID(String emailID, Double funds)
            throws InvalidAmountException, UserNotFoundException {
        if (funds == null || funds <= 0) {
            throw new InvalidAmountException("Amount must be greater than 0.");
        }
        WalletCustomer wallet = getUserWalletByEmailID(emailID);
        wallet.setBalance(wallet.getBalance() + funds);
        return wallet.getBalance();
    }

    @Override
    public Double withdrawFromWalletByEmailID(String emailID, Double amount)
            throws InvalidAmountException, UserNotFoundException, InsufficientBalanceException {
        if (amount == null || amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than 0.");
        }
        WalletCustomer wallet = getUserWalletByEmailID(emailID);
        if (wallet.getBalance() < amount) {
            throw new InsufficientBalanceException("Insufficient balance in wallet.");
        }
        wallet.setBalance(wallet.getBalance() - amount);
        return wallet.getBalance();
    }

    @Override
    public Boolean transferFunds(String fromEmailID, String toEmailID, Double amount)
            throws InvalidAmountException, UserNotFoundException, InsufficientBalanceException {
        if (amount == null || amount <= 0) {
            throw new InvalidAmountException("Transfer amount must be greater than 0.");
        }

        WalletCustomer sender = getUserWalletByEmailID(fromEmailID);
        WalletCustomer receiver = getUserWalletByEmailID(toEmailID);

        if (sender.getBalance() < amount) {
            throw new InsufficientBalanceException("Sender has insufficient funds.");
        }

        sender.setBalance(sender.getBalance() - amount);
        receiver.setBalance(receiver.getBalance() + amount);

        return true;
    }

    @Override
    public WalletCustomer getUserWalletByEmailID(String emailID) throws UserNotFoundException {
        WalletCustomer wallet = walletStore.get(emailID);
        if (wallet == null) {
            throw new UserNotFoundException("User with the email " + emailID + " not found.");
        }
        return wallet;
    }

    @Override
    public Collection<WalletCustomer> getAllWalletCustomers(String adminPassword) throws AcessDeniedException , NoUsersFoundException {
      if(!ADMIN_PASSWORD.equals(adminPassword)) {
          throw new AcessDeniedException("Invalid Admin Password! .");
      }
    if (walletStore.isEmpty()) {
        throw new NoUsersFoundException("No users found.");
    }
    return walletStore.values();
    }
}
