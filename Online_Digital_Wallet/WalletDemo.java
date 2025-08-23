package Online_Digital_Wallet;

public class WalletDemo {
    public static void main(String[] args) {
        WalletService walletService = new WalletServiceImpl();

        try {
            // Register customers
            System.out.println("=== REGISTERING CUSTOMERS ===");
            Customer alice = walletService.registerCustomer(new Customer(101, "Alice", "alice@email.com", "9876543210", 500.0));
            Customer bob = walletService.registerCustomer(new Customer(102, "Bob", "bob@email.com", "9876543211", 1000.0));
            System.out.println("Alice registered: " + alice);
            System.out.println("Bob registered: " + bob);

            // Add funds
            System.out.println("\n=== ADDING FUNDS ===");
            Customer aliceUpdated = walletService.addFunds(101, 200.0);
            System.out.println("Alice after adding 200: " + aliceUpdated);

            // Withdraw funds
            System.out.println("\n=== WITHDRAWING FUNDS ===");
            Customer bobUpdated = walletService.withdrawFunds(102, 500.0);
            System.out.println("Bob after withdrawing 500: " + bobUpdated);

            // Transfer funds
            System.out.println("\n=== TRANSFERRING FUNDS ===");
            boolean transferSuccess = walletService.transferFunds(101, 102, 300.0);
            if (transferSuccess) {
                System.out.println("Transfer successful!");
                System.out.println("Alice after transfer: " + walletService.getAccountDetails(101));
                System.out.println("Bob after transfer: " + walletService.getAccountDetails(102));
            }

            // List all customers
            System.out.println("\n=== ALL CUSTOMERS ===");
            walletService.getAllCustomers().forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
