package WalletApplication;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class WalletServiceImpl implements WalletService {

    private WalletRepository walletRepository;

    @Autowired
    public WalletServiceImpl(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    @Override
    public Wallet addWallet(Wallet wallet) throws WalletException {

        Optional <Wallet> newWallet = this.walletRepository.findById(wallet.getId());
        if (newWallet.isPresent()) {
            throw new WalletException("Wallet with id " + wallet.getId() + " already exists");
        }
        return walletRepository.save(wallet);

    }

    @Override
    public Wallet getWalletById(Integer id) throws WalletNotFoundException {
        Optional<Wallet> wallet = this.walletRepository.findById(id);
        if (wallet.isPresent()) {
            return wallet.get();
        }
        throw new WalletNotFoundException("Wallet with id " + id + " not found");
    }

    @Override
    public Wallet updateWalletById(Integer id, Wallet wallet) throws WalletNotFoundException {

        Optional<Wallet> existingWallet = this.walletRepository.findById(id);
        if (existingWallet.isPresent()) {
            Wallet newWallet = existingWallet.get();
            newWallet.setName(wallet.getName());
            newWallet.setBalance(wallet.getBalance());
            newWallet.setEmail(wallet.getEmail());
            newWallet.setPassword(wallet.getPassword());

            this.walletRepository.save(newWallet);
            return newWallet;

        }
        throw new WalletNotFoundException("Wallet with id " + id + " not found");
    }

    @Override
    public Wallet deleteWalletById(Integer id) throws WalletNotFoundException {
        Optional<Wallet> wallet = this.walletRepository.findById(id);
        if (wallet.isPresent()) {
            this.walletRepository.delete(wallet.get());
            return wallet.get();
        }
        throw new WalletNotFoundException("Wallet with id " + id + " not found");
    }
    @Transactional
    @Override
    public List<Wallet> transferFunds(Integer fromid, Integer toid, double amount) throws WalletNotFoundException, InvalidBalanceException {

        List <Wallet> walletList = new ArrayList<>();
        if (amount<=0.0){
            throw new InvalidBalanceException("Invalid amount "+amount);
        }
        Wallet fromWallet= this.walletRepository.findById(fromid) .orElseThrow(() -> new WalletNotFoundException("Wallet with id " + fromid + " not found"));
        Wallet toWallet= this.walletRepository.findById(toid) .orElseThrow(() -> new WalletNotFoundException("Wallet with id " + toid + " not found"));

        Double transactionBalance = fromWallet.getBalance()-amount;

        if (transactionBalance< 500.0){
            throw new InvalidBalanceException("Invalid Minimum balance "+ transactionBalance);
        }

        fromWallet.setBalance(transactionBalance);
        toWallet.setBalance(toWallet.getBalance()+amount);
        this.walletRepository.save(fromWallet);
        this.walletRepository.save(toWallet);

        walletList.add(fromWallet);
        walletList.add(toWallet);

        return walletList;
    }

    @Override
    public Wallet addFunds(Integer id, double amount) throws WalletNotFoundException, InvalidBalanceException {

        Wallet wallet = this.walletRepository.findById(id).orElseThrow(() -> new WalletNotFoundException("Wallet with id " + id + " not found"));

        if (amount<=0.0){
            throw new InvalidBalanceException("Invalid amount "+amount);
        }
        wallet.setBalance(wallet.getBalance()+amount);
        this.walletRepository.save(wallet);
        return wallet;
    }

    @Override
    public Wallet withdrawFunds(Integer id, double amount) throws WalletNotFoundException, InvalidBalanceException {
        Wallet wallet = this.walletRepository.findById(id).orElseThrow(() -> new WalletNotFoundException("Wallet with id " + id + " not found"));

        if (amount<=0.0){
            throw new InvalidBalanceException("Invalid amount "+amount);
        }
        Double transactionBalance = wallet.getBalance()-amount;
        if (transactionBalance < 500.0){
            throw new InvalidBalanceException("Invalid Minimum balance "+ transactionBalance);
        }
        wallet.setBalance(transactionBalance);
        this.walletRepository.save(wallet);
        return wallet;

    }

    @Override
    public List<Wallet> getAllWallets() throws WalletException {
        return this.walletRepository.findAll();
    }
}
