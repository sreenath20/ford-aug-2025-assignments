package day11_layered_project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WalletServiceImpl implements WalletService {
    private Map<String, Wallet> userwalletmap = new HashMap();

    public Wallet registerNewuser(Wallet wallet) throws WalletException {
        if (this.userwalletmap.containsKey(wallet.getEmail())) {
            throw new WalletException("email id  already exists, please retry with new id");
        } else {
            this.userwalletmap.put(wallet.getEmail(), wallet);
            return (Wallet)this.userwalletmap.put(wallet.getEmail(), wallet);
        }
    }

    public Double addfundstowalletbyemail(String emailid, Double amount) throws WalletException {
        Wallet wallet = (Wallet)this.userwalletmap.get(emailid);
        if (amount <= (double)0.0F) {
            throw new WalletException("amount should be greater than zero");
        } else if (this.userwalletmap.containsKey(emailid)) {
            wallet.setBalance(wallet.getBalance() + amount);
            return wallet.getBalance();
        } else {
            throw new WalletException("email id not found");
        }
    }

    public Double withdrawfundsfromwalletbyemail(String emailid, Double amount) throws WalletWithdrawException {
        Wallet wallet = (Wallet)this.userwalletmap.get(emailid);
        if (amount <= (double)0.0F) {
            throw new WalletWithdrawException("amount should be greater than zero");
        } else if (this.userwalletmap.containsKey(emailid)) {
            wallet.setBalance(wallet.getBalance() - amount);
            return wallet.getBalance();
        } else {
            throw new WalletWithdrawException("email id not found");
        }
    }

    public Boolean transferfunds(String fromemail, String toemail, Double amount) throws WalletException {
        if (!this.userwalletmap.containsKey(fromemail)) {
            throw new WalletException("From email id not found");
        } else if (!this.userwalletmap.containsKey(toemail)) {
            throw new WalletException("To email id not found");
        } else {
            Wallet fromwallet = (Wallet)this.userwalletmap.get(fromemail);
            Wallet towallet = (Wallet)this.userwalletmap.get(toemail);
            if (amount <= (double)0.0F) {
                throw new WalletException("amount should be greater than zero");
            } else if (this.userwalletmap.containsKey(fromemail) && this.userwalletmap.containsKey(toemail)) {
                fromwallet.setBalance(fromwallet.getBalance() - amount);
                towallet.setBalance(towallet.getBalance() + amount);
                return true;
            } else {
                throw new WalletException("email id not found");
            }
        }
    }

    public Wallet getUserWalletByEmail(String useremail) throws WalletException {
        Wallet wallet = null;
        if (this.userwalletmap.containsKey(useremail)) {
            wallet = (Wallet)this.userwalletmap.get(useremail);
            return wallet;
        } else {
            throw new WalletException("email id not found");
        }
    }

    public Collection<Wallet> getallUser() throws WalletException {
        return this.userwalletmap.values();
    }

    public Wallet userlogin(String email, String password) throws WalletException {
        Wallet wallet = (Wallet)this.userwalletmap.get(email);
        if (!this.userwalletmap.containsKey(email)) {
            throw new WalletException("email id not found");
        } else if (!((Wallet)this.userwalletmap.get(email)).getPassword().equals(password)) {
            throw new WalletException("password is incorrect");
        } else if (wallet.getEmail().equals(email) && wallet.getPassword().equals(password)) {
            System.out.println("login successful");
            return wallet;
        } else {
            throw new WalletException("login failed due to some issue");
        }
    }

    public void sortwalletbybalance() throws WalletException {
        if (this.userwalletmap.isEmpty()) {
            throw new WalletException("No users found to sort");
        } else {
            List<Wallet> walletList = new ArrayList(this.userwalletmap.values());
            Collections.sort(walletList);
            System.out.println("Sorted wallets by balance: " + String.valueOf(walletList));
        }
    }

    public List<Wallet> sortwalletbyname() throws WalletException {
        if (this.userwalletmap.isEmpty()) {
            throw new WalletException("No users found to sort");
        } else {
            List<Wallet> walletList = new ArrayList(this.userwalletmap.values());
            Collections.sort(walletList, new NameComparator());
            return walletList;
        }
    }

    public void displayzerobalanceacoount() throws WalletException {
        List<Wallet> zerobalancelist = new ArrayList(this.userwalletmap.values());
        System.out.println("zerobalance account list: ");

        for(Wallet w : zerobalancelist) {
            if (w.getBalance() == (double)0.0F) {
                System.out.println(w);
            }
        }

    }

    public boolean changepassword(String email, String oldpassword, String newpassword) throws WalletException {
        if (!this.userwalletmap.containsKey(email)) {
            throw new WalletException("email id not found");
        } else if (this.userwalletmap.containsKey(email)) {
            Wallet wallet = (Wallet)this.userwalletmap.get(email);
            if (wallet.getPassword().equals(oldpassword)) {
                wallet.setPassword(newpassword);
                System.out.println("password changed successfully");
                return true;
            } else {
                throw new WalletException("old password is incorrect");
            }
        } else {
            return false;
        }
    }

    public Collection<Wallet> findwalletbetween(Double fromamount, Double toamount) throws WalletException {
        Collection<Wallet> wallets = this.userwalletmap.values();
        System.out.println("wallets colllection: " + String.valueOf(wallets));
        if (wallets.isEmpty()) {
            throw new WalletException("no users found");
        } else {
            Collection<Wallet> wallets1 = wallets.stream().filter((w) -> w.getBalance() >= fromamount && w.getBalance() <= toamount).toList();
            return wallets1;
        }
    }
}