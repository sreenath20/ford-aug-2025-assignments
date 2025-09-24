package OnlineDigitalWallet;

public class Wallet {
    private int walletId;
    private String customerName;
    private double balance;
    private String email;
    private String password;

    public Wallet() {
    }

    public Wallet(int walletId, String customerName, String email, String password,double balance) {
        this.walletId = walletId;
        this.customerName = customerName;
        this.email = email;
        this.password = password;
        this.balance = balance;
    }

    public int getWalletId() {
        return walletId;
    }

    public void setWalletId(int walletId) {
        this.walletId = walletId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "Wallet { Id :"+ walletId +
                ", Customer Name: '" + customerName + '\'' +
                ", Balance: " + balance +
                ", Email: '" + email + '\'' +
                ", Password: '" + password + '\'' +
                "}\n";
    }
}
