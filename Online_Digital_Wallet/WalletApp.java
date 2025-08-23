package Online_Digital_Wallet;



import java.util.Collection;
import java.util.Scanner;

public class WalletApp {
    private WalletService walletService;
    private Scanner scanner;

    public WalletApp() {
        this.walletService = new WalletServiceImpl();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("=================================================");
        System.out.println("    Welcome to Online Digital Wallet System");
        System.out.println("=================================================");

        while (true) {
            displayMenu();
            int choice = getChoice();

            try {
                switch (choice) {
                    case 1:
                        registerCustomer();
                        break;
                    case 2:
                        addFunds();
                        break;
                    case 3:
                        withdrawFunds();
                        break;
                    case 4:
                        transferFunds();
                        break;
                    case 5:
                        getAccountDetails();
                        break;
                    case 6:
                        listAllCustomers();
                        break;
                    case 7:
                        System.out.println("Thank you for using Digital Wallet System!");
                        return;
                    default:
                        System.out.println("Invalid choice! Please select 1-7.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
        }
    }

    private void displayMenu() {
        System.out.println("\n=== DIGITAL WALLET MENU ===");
        System.out.println("1. Register New Customer");
        System.out.println("2. Add Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Transfer Funds");
        System.out.println("5. Get Account Details");
        System.out.println("6. List All Customers (Admin)");
        System.out.println("7. Exit");
        System.out.print("Enter your choice (1-7): ");
    }

    private int getChoice() {
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            return choice;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void registerCustomer() throws UserAlreadyExistsException {
        System.out.println("\n=== CUSTOMER REGISTRATION ===");

        System.out.print("Enter Customer ID: ");
        Integer customerId = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile = scanner.nextLine();

        System.out.print("Enter Initial Balance (press Enter for 0): ");
        String balanceStr = scanner.nextLine();
        Double balance = balanceStr.isEmpty() ? 0.0 : Double.parseDouble(balanceStr);

        Customer customer = new Customer(customerId, name, email, mobile, balance);
        Customer savedCustomer = walletService.registerCustomer(customer);

        System.out.println("Customer registered successfully!");
        System.out.println(savedCustomer);
    }

    private void addFunds() throws UserNotFoundException, InvalidAmountException {
        System.out.println("\n=== ADD FUNDS ===");

        System.out.print("Enter Customer ID: ");
        Integer customerId = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Amount to Add: ");
        Double amount = Double.parseDouble(scanner.nextLine());

        Customer updatedCustomer = walletService.addFunds(customerId, amount);
        System.out.println("Funds added successfully!");
        System.out.println("New Balance: " + updatedCustomer.getBalance());
    }

    private void withdrawFunds() throws UserNotFoundException, InvalidAmountException, InsufficientBalanceException {
        System.out.println("\n=== WITHDRAW FUNDS ===");

        System.out.print("Enter Customer ID: ");
        Integer customerId = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Amount to Withdraw: ");
        Double amount = Double.parseDouble(scanner.nextLine());

        Customer updatedCustomer = walletService.withdrawFunds(customerId, amount);
        System.out.println("Funds withdrawn successfully!");
        System.out.println("New Balance: " + updatedCustomer.getBalance());
    }

    private void transferFunds() throws UserNotFoundException, InvalidAmountException, InsufficientBalanceException {
        System.out.println("\n=== TRANSFER FUNDS ===");

        System.out.print("Enter Sender Customer ID: ");
        Integer fromCustomerId = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Receiver Customer ID: ");
        Integer toCustomerId = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Amount to Transfer: ");
        Double amount = Double.parseDouble(scanner.nextLine());

        boolean success = walletService.transferFunds(fromCustomerId, toCustomerId, amount);
        if (success) {
            System.out.println("Funds transferred successfully!");

            // Show updated balances
            Customer sender = walletService.getAccountDetails(fromCustomerId);
            Customer receiver = walletService.getAccountDetails(toCustomerId);
            System.out.println("Sender new balance: " + sender.getBalance());
            System.out.println("Receiver new balance: " + receiver.getBalance());
        }
    }

    private void getAccountDetails() throws UserNotFoundException {
        System.out.println("\n=== ACCOUNT DETAILS ===");

        System.out.print("Enter Customer ID: ");
        Integer customerId = Integer.parseInt(scanner.nextLine());

        Customer customer = walletService.getAccountDetails(customerId);
        System.out.println("\n" + customer);
    }

    private void listAllCustomers() throws NoUsersFoundException {
        System.out.println("\n=== ALL CUSTOMERS ===");

        Collection<Customer> customers = walletService.getAllCustomers();
        System.out.println("Total Customers: " + customers.size());
        System.out.println("-".repeat(80));

        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public static void main(String[] args) {
        WalletApp app = new WalletApp();
        app.start();
    }
}
