package bank.wallet;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class WalletServiceImpl implements WalletService {

    @Autowired
    private WalletDao walletDao;// Dependency injection , if obj gets create it is called inversion of control

    //WalletDao walletDao=new WalletDaoImpl;


    public WalletServiceImpl(WalletDao walletDao) {
        this.walletDao = walletDao;
    }

    @Override
    public Wallet registerNewUserWallet(Wallet newWallet) throws WalletException {

       return this.walletDao.save(newWallet);


    }
    @Override
    @Transactional
    public int withdrawFundsFromWalletByEmailId(String emailId, Double amount) throws WalletException {
        return this.walletDao.updateWalletBalanceByEmail(emailId,amount);
    }

    @Override
    @Transactional
    public int addFundsToWalletByEmailId(String emailId, Double amount) throws WalletException {
        return this.walletDao.updateWalletAddBalanceByEmail(emailId,amount);
    }


    @Override
    @Transactional
    public Boolean transferFunds(String fromEmailId, String toEmailId, Double amount) throws WalletException {
        Double availableBalance = this.walletDao.getWalletCheckBalanceByEmail(fromEmailId);

        if (availableBalance < amount) {
            throw new WalletException("Available balance is less than Transfer amount");
        }

        if (fromEmailId == null || toEmailId == null || fromEmailId.equals(toEmailId)) {
            throw new WalletException("Invalid email address");
        }


        if (this.walletDao.getWalletByEmail(fromEmailId).isEmpty()){
            throw new WalletException("Invalid sender email address");
        }

        if(this.walletDao.getWalletByEmail(toEmailId).isEmpty()) {
            throw new WalletException("Invalid receiver email address");
        }




        int fromAccountTransaction=this.walletDao.updateWalletBalanceByEmail(fromEmailId,amount);
        int toAccountTransaction=this.walletDao.updateWalletAddBalanceByEmail(toEmailId,amount);

        return fromAccountTransaction > 0 && toAccountTransaction > 0;

    }

    @Override
    public Collection<Wallet> getUserWalletByEmailId(String emailId) throws WalletException {
        return walletDao.getWalletByEmail(emailId);
    }

    @Override
    public Collection<Wallet> getAllCustomerWallets() throws WalletException {
        return walletDao.findAll();
    }

    @Override
    public Collection<Wallet> userLogin(String userEmailId, String password) throws WalletException {

        if (this.walletDao.getWalletByEmail(userEmailId).isEmpty()){
            throw new WalletException("Invalid email address no user exists");
        }
        return walletDao.getWalletCheckByEmail(userEmailId,password);
    }


    @Override
    @Transactional
    public Boolean updateWalletPassword(String emailId, String oldPassword, String newPassword) throws WalletException {
        if (this.walletDao.getWalletByEmail(emailId).isEmpty()){
            throw new WalletException("Invalid email address no user exists");
        }
        int change = this.walletDao.updateWalletPasswordByEmailEquals(emailId,oldPassword,newPassword);

        if(change > 0){
            return true;
        }

        return false;
    }
















//
//    @Override
//    public Collection<Wallet> sortCustomerWallets(String order) throws WalletException {
//        return List.of();
//    }
//
//    @Override
//    public Collection<Wallet> findWalletsByName(String name) throws WalletException {
//        return List.of();
//    }
//
//    @Override
//    public Collection<Wallet> findAllWalletsHavingBalanceBetween(Double fromAmount, Double toAmount) throws WalletException {
//        return List.of();
//    }
}
