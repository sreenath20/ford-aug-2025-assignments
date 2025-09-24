package OnlineDigitalWallet;

public class WalletController {
    public static void main(String[] args) {
        WalletService walletService = new WalletServiceImplementation();
//add new users

        System.out.println("Online Digital Wallet Application");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Registering new user wallets...");
        System.out.println("---------------------------------------------------------------------------------");
        Wallet wallet1 = new Wallet(1, "user1", "user1@gmail.com", "User1@password", 2000.0);
        Wallet wallet2 = new Wallet(2, "user2", "user2@gmail.com", "user2@password", 5000.0);
        Wallet wallet3 = new Wallet(3,"user3","user3@gmail.com","user3@password",10000.0);
        Wallet wallet4= new Wallet(1, "user1", "user1@gmail.com", "User1@password", 2000.0);

        try {
            System.out.println("New user wallet registered successfully."+ walletService.registerNewUserWallet(wallet1));
            System.out.println("New user wallet registered successfully."+ walletService.registerNewUserWallet(wallet2));
            System.out.println("New user wallet registered successfully."+walletService.registerNewUserWallet(wallet3));

        } catch (WalletNewUserException e) {
            System.err.println("Error registering new user wallet: " + e.getMessage());
        }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Adding funds to user wallets...");
        System.out.println();
        try {

            System.out.println("Funds added successfully. Updated balance: " + walletService.addFundsToWalletByEmailId("user1@gmail.com", 500.0) );
            System.out.println("Funds added successfully. Updated balance: " + walletService.addFundsToWalletByEmailId("user2@gmail.com", 1.0) );
            System.out.println("Funds added successfully. Updated balance: " + walletService.addFundsToWalletByEmailId("user3@gmail.com", 100.0));
            System.out.println("Funds added successfully. Updated balance: " + walletService.addFundsToWalletByEmailId("user4@gmail.com", 100.0));
        } catch (WalletAddFundException | WalletNotFoundException e) {
            System.err.println("Error adding funds: " + e.getMessage());
        }

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Withdrawing funds from user wallets...");
        System.out.println();
        try {
            System.out.println("Funds withdrawn successfully. Updated balance: " + walletService.withdrawFundsFromWalletByEmailId("user1@gmail.com", 500.00) );
            System.out.println("Funds withdrawn successfully. Updated balance: " + walletService.withdrawFundsFromWalletByEmailId("user2@gmail.com", 100000.0) );
            System.out.println("Funds withdrawn successfully. Updated balance: " + walletService.withdrawFundsFromWalletByEmailId("user3@gmail.com", 100.0));

        } catch (WalletWithdrawFundException | WalletNotFoundException e) {
            System.err.println("Error withdrawing funds: " + e.getMessage());
        }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Transferring funds between user wallets...");
        System.out.println();
        try {
            System.out.println("Funds transferred successfully: " + walletService.transferFunds("user1@gmail.com", "user2@gmail.com", 200.0));
            System.out.println("Funds transferred successfully: " + walletService.transferFunds("user2@gmail.com", "user3@gmail.com", 100.0));

        } catch (WalletTransferFundException | WalletNotFoundException e) {
            System.err.println("Error transferring funds: " + e.getMessage());
        }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Retrieving user wallets...");
        System.out.println();

        try {
            System.out.println("Successfully retrieved User Wallet By Email ID" + walletService.getWalletByEmailId("user1@gmail.com"));

        } catch (WalletNotFoundException e) {
            System.err.println("Error retrieving wallet: " + e.getMessage());
        }
        System.out.println();
        try {
            System.out.println("All Users Wallets:");
            System.out.println(walletService.getAllCustomerWallets());

        } catch (WalletNotFoundException e) {
            System.err.println("Error retrieving wallets: " + e.getMessage());
        }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("User Login...");
        System.out.println();
        try {
//            System.out.println("User logged in successfully: " );
            boolean userLogin1 = walletService.userLogin("user1@gmail.com", "User1@password");
            System.out.println("User logged in successfully: " + userLogin1);
        }catch (UserNotFoundException e) {
                System.err.println("Error logging in: " + e.getMessage());
            }
        try {
            boolean userLogin2 = walletService.userLogin("user2@gmail.com", "user1@password");
            System.out.println("User logged in successfully: " + userLogin2);
        } catch (UserNotFoundException e) {
            System.err.println("Error logging in: " + e.getMessage());
        }


        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Sorting user wallets by balance...");
        System.out.println();

        try {
            System.out.println("Wallets sorted by balance in ascending order:");
            System.out.println(walletService.sortCustomerWallets("ascending"));
            System.out.println("Wallets sorted by balance in descending order:");
            System.out.println(walletService.sortCustomerWallets("descending"));
        } catch (WalletNotFoundException e) {
            System.err.println("Error sorting wallets: " + e.getMessage());
        }
        System.out.println("---------------------------------------------------------------------------------");

        try{
            System.out.println("Wallets found by Names");
            System.out.println();

            System.out.println("Wallets found by name 'user1':"+walletService.findWalletByName("user1"));
            System.out.println("Wallets found by name 'user2':" + walletService.findWalletByName("user3"));
            System.out.println("Wallets found by name 'user4':" + walletService.findWalletByName("user4"));
        } catch (WalletNotFoundException e) {
            System.err.println("Error finding wallets by name: " + e.getMessage());
        }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Find wallets between balance range...");
        System.out.println();
        try {
            System.out.println("Wallets found between balance 500.0 and 2000.0: \n" + walletService.findWalletsBetweenBalance(500.0, 2000.0));
        }catch (WalletNotFoundException e){
            System.err.println("Error finding wallets between balance: " + e.getMessage());
        }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Update wallet password...");

        System.out.println();
        try {

            System.out.println("Updating wallet password: " + walletService.updateWalletPassword("user1@gmail.com", "User1@password", "Password1"));
            System.out.println("Updating wallet password :"+ walletService.updateWalletPassword("user2@gmail.com", "wrong", "Password2"));
        }catch (WalletNotFoundException e){
            System.err.println("Error updating wallet password: " + e.getMessage());
        }
        System.out.println("---------------------------------------------------------------------------------");

    }
}

