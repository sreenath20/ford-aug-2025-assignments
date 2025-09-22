package bank.wallet;

import java.util.Collection;

public interface WalletService {

    Wallet registerNewUserWallet(Wallet newWallet)throws WalletException;

    int withdrawFundsFromWalletByEmailId(String emailId,Double amount) throws WalletException;

    int addFundsToWalletByEmailId(String emailId,Double amount) throws WalletException;



    Boolean transferFunds(String fromEmailId, String toEmailId, Double amount) throws WalletException;

    Collection<Wallet> getUserWalletByEmailId(String emailId)throws WalletException;

    Collection<Wallet> getAllCustomerWallets() throws WalletException;

    Collection<Wallet> userLogin(String userEmailId, String password) throws WalletException;

    Boolean updateWalletPassword(String emailId, String oldPassword, String newPassword) throws WalletException;


}







//
//Collection<Wallet> sortCustomerWallets(String order) throws WalletException;
//
//Collection<Wallet> findWalletsByName(String name) throws WalletException;
//
//Collection<Wallet> findAllWalletsHavingBalanceBetween(Double fromAmount, Double toAmount) throws WalletException;