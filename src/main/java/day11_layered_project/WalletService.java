package day11_layered_project;

import java.util.Collection;
import java.util.List;

public interface WalletService {
    Wallet registerNewuser(Wallet var1) throws WalletException;

    Double addfundstowalletbyemail(String var1, Double var2) throws WalletException;

    Double withdrawfundsfromwalletbyemail(String var1, Double var2) throws WalletWithdrawException;

    Boolean transferfunds(String var1, String var2, Double var3) throws WalletException;

    Wallet getUserWalletByEmail(String var1) throws WalletException;

    Collection<Wallet> getallUser() throws WalletException;

    Wallet userlogin(String var1, String var2) throws WalletException;

    void sortwalletbybalance() throws WalletException;

    List<Wallet> sortwalletbyname() throws WalletException;

    void displayzerobalanceacoount() throws WalletException;

    boolean changepassword(String var1, String var2, String var3) throws WalletException;

    Collection<Wallet> findwalletbetween(Double var1, Double var2) throws WalletException;
}
