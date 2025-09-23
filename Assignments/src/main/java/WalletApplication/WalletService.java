package WalletApplication;
import java.util.List;

public interface WalletService {

    Wallet addWallet(Wallet wallet) throws WalletException;
    Wallet getWalletById(Integer id) throws WalletNotFoundException;
    Wallet updateWalletById(Integer id, Wallet wallet) throws WalletNotFoundException;
    Wallet deleteWalletById(Integer id) throws WalletNotFoundException;
    List<Wallet > transferFunds(Integer fromid, Integer toid,double amount) throws WalletNotFoundException,InvalidBalanceException;
    Wallet addFunds(Integer id, double amount) throws WalletNotFoundException,InvalidBalanceException;
    Wallet withdrawFunds(Integer id, double amount) throws WalletNotFoundException,InvalidBalanceException;
    List<Wallet> getAllWallets() throws WalletException;

}
