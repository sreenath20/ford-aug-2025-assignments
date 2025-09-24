package OnlineDigitalWallet;

import java.util.Collection;

public interface WalletService {

    Wallet registerNewUserWallet(Wallet newWallet) throws WalletNewUserException;

    Double addFundsToWalletByEmailId(String emailId, Double amount) throws WalletAddFundException, WalletNotFoundException;

    Double withdrawFundsFromWalletByEmailId(String emailId, Double amount) throws WalletWithdrawFundException, WalletNotFoundException;

    Boolean transferFunds(String fromEmailId, String toEmailId, Double amount) throws WalletTransferFundException, WalletNotFoundException;

    Wallet getWalletByEmailId(String emailId) throws WalletNotFoundException;

    Collection<Wallet> getAllCustomerWallets() throws WalletNotFoundException;

    boolean userLogin(String emailId, String password) throws UserNotFoundException;

    Collection<Wallet> sortCustomerWallets(String order) throws WalletNotFoundException;

    Collection<Wallet> findWalletByName(String name) throws WalletNotFoundException;

    Collection<Wallet> findWalletsBetweenBalance(Double fromAmount, Double toAmount) throws WalletNotFoundException;

    Boolean updateWalletPassword(String emailId, String oldPassword, String newPassword) throws WalletNotFoundException;
}

