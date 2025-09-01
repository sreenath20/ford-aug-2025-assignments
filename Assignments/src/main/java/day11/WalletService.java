package day11;

import java.nio.file.AccessDeniedException;
import java.util.Collection;

public interface WalletService {
    WalletCustomer registerNewUserWallet(WalletCustomer newWallet) throws UserAlreadyExistsException;

    Double addFundsToWalletByEmailID(String emailID, Double funds)
            throws InvalidAmountException, UserNotFoundException;

    Double withdrawFromWalletByEmailID(String emailID, Double amount)
            throws InvalidAmountException, UserNotFoundException, InsufficientBalanceException;

    Boolean transferFunds(String fromEmailID, String toEmailID, Double amount)
            throws InvalidAmountException, UserNotFoundException, InsufficientBalanceException;

    WalletCustomer getUserWalletByEmailID(String emailID) throws UserNotFoundException;

    Collection<WalletCustomer> getAllWalletCustomers(String adminPassword) throws AccessDeniedException , NoUsersFoundException, AcessDeniedException;
}
