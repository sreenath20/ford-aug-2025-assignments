package OnlineDigitalWallet;

public class WalletException extends Exception {
    public WalletException(String email, String message) {
        super(message);
    }
}
