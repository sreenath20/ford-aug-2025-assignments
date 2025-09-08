package com.jdbc.demo;

import com.jdbc.demo.wallet.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;
import java.util.Collection;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		WalletService walletService = new WalletServiceImpl();
		Scanner scanner = new Scanner(System.in);

		// Initialize database table
		initializeDatabase();

		System.out.println("\n Digital Wallet Management System \n");

		while (true) {
			displayMenu();
			int choice = scanner.nextInt();
			scanner.nextLine(); // consume newline

			try {
				switch (choice) {
					case 1:
						registerNewWallet(walletService, scanner);
						break;
					case 2:
						addFunds(walletService, scanner);
						break;
					case 3:
						withdrawFunds(walletService, scanner);
						break;
					case 4:
						transferFunds(walletService, scanner);
						break;
					case 5:
						viewWallet(walletService, scanner);
						break;
					case 6:
						viewAllWallets(walletService);
						break;
					case 7:
						userLogin(walletService, scanner);
						break;
					case 8:
						updatePassword(walletService, scanner);
						break;
					case 9:
						findWalletsByName(walletService, scanner);
						break;
					case 10:
						deleteWallet(walletService, scanner);
						break;
					case 11:
						System.out.println("Thank you for using Digital Wallet!");
						return;
					default:
						System.out.println("Invalid choice. Please try again.");
				}
			}
			catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}

	private void initializeDatabase() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:h2:file:./data/demo", "sa", "password");

			// Drop existing table and recreate with correct schema
			String dropTableSQL = "DROP TABLE IF EXISTS wallet";
			PreparedStatement dropStatement = connection.prepareStatement(dropTableSQL);
			dropStatement.execute();

			String createWalletSQL = "CREATE TABLE IF NOT EXISTS wallet (id INT PRIMARY KEY, name VARCHAR(50), email VARCHAR(100) UNIQUE, password VARCHAR(100), balance DOUBLE)";
			PreparedStatement preparedStatement = connection.prepareStatement(createWalletSQL);
			preparedStatement.execute();
			connection.close();
			System.out.println("Database initialized successfully!");
		}
		catch (SQLException e) {
			System.out.println("Database initialization failed: " + e.getMessage());
		}
	}

	private void displayMenu() {
		System.out.println("\n--- Menu ---");
		System.out.println("1. Register New Wallet");
		System.out.println("2. Add Funds");
		System.out.println("3. Withdraw Funds");
		System.out.println("4. Transfer Funds");
		System.out.println("5. View Wallet");
		System.out.println("6. View All Wallets");
		System.out.println("7. User Login");
		System.out.println("8. Update Password");
		System.out.println("9. Find Wallets by Name");
		System.out.println("10. Delete Wallet");
		System.out.println("11. Exit");
		System.out.print("Enter your choice: ");
	}

	private void registerNewWallet(WalletService walletService, Scanner scanner) throws WalletException {
		System.out.print("Enter ID: ");
		Integer id = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter Email: ");
		String email = scanner.nextLine();
		System.out.print("Enter Password: ");
		String password = scanner.nextLine();
		System.out.print("Enter Initial Balance: ");
		Double balance = scanner.nextDouble();

		Wallet wallet = new Wallet(id, name, email, password, balance);
		Wallet result = walletService.registerNewUserWallet(wallet);
		System.out.println("Wallet registered successfully: " + result);
	}

	private void addFunds(WalletService walletService, Scanner scanner) throws WalletException {
		System.out.print("Enter Email: ");
		String email = scanner.nextLine();
		System.out.print("Enter Amount to Add: ");
		Double amount = scanner.nextDouble();

		Double newBalance = walletService.addFundsToWalletByEmailId(email, amount);
		System.out.println("Funds added successfully. New balance: Rs." + newBalance);
	}

	private void withdrawFunds(WalletService walletService, Scanner scanner) throws WalletWithdrawException {
		System.out.print("Enter Email: ");
		String email = scanner.nextLine();
		System.out.print("Enter Amount to Withdraw: ");
		Double amount = scanner.nextDouble();

		Double newBalance = walletService.withdrawFromWalletByEmailId(email, amount);
		System.out.println("Funds withdrawn successfully. New balance: Rs." + newBalance);
	}

	private void transferFunds(WalletService walletService, Scanner scanner) throws WalletException {
		System.out.print("Enter From Email: ");
		String fromEmail = scanner.nextLine();
		System.out.print("Enter To Email: ");
		String toEmail = scanner.nextLine();
		System.out.print("Enter Amount to Transfer: ");
		Double amount = scanner.nextDouble();

		Boolean success = walletService.transferFunds(fromEmail, toEmail, amount);
		System.out.println(success ? "Transfer successful!" : "Transfer failed!");
	}

	private void viewWallet(WalletService walletService, Scanner scanner) throws WalletException {
		System.out.print("Enter Email: ");
		String email = scanner.nextLine();

		Wallet wallet = walletService.getUserWalletByEmailId(email);
		System.out.println("Wallet Details: " + wallet);
	}

	private void viewAllWallets(WalletService walletService) throws WalletException {
		Collection<Wallet> wallets = walletService.getAllCustomerWallets();
		System.out.println("All Wallets:");
		wallets.forEach(System.out::println);
	}

	private void userLogin(WalletService walletService, Scanner scanner) throws WalletException {
		System.out.print("Enter Email: ");
		String email = scanner.nextLine();
		System.out.print("Enter Password: ");
		String password = scanner.nextLine();

		Wallet wallet = walletService.userLogin(email, password);
		if (wallet != null) {
			System.out.println("Login successful! Welcome " + wallet.getName());
		} else {
			System.out.println("Invalid credentials!");
		}
	}

	private void updatePassword(WalletService walletService, Scanner scanner) throws WalletException {
		System.out.print("Enter Email: ");
		String email = scanner.nextLine();
		System.out.print("Enter Old Password: ");
		String oldPassword = scanner.nextLine();
		System.out.print("Enter New Password: ");
		String newPassword = scanner.nextLine();

		Boolean success = walletService.updateWalletPassword(email, oldPassword, newPassword);
		System.out.println(success ? "Password updated successfully!" : "Password update failed!");
	}

	private void findWalletsByName(WalletService walletService, Scanner scanner) throws WalletException {
		System.out.print("Enter Name to Search: ");
		String name = scanner.nextLine();

		Collection<Wallet> wallets = walletService.findWalletsByName(name);
		if (wallets.isEmpty()) {
			System.out.println("No wallets found with name: " + name);
		} else {
			System.out.println("Wallets found with name '" + name + "':");
			wallets.forEach(System.out::println);
		}
	}

	private void deleteWallet(WalletService walletService, Scanner scanner) throws WalletException {
		System.out.print("Enter Email of wallet to delete: ");
		String email = scanner.nextLine();

		System.out.print("Are you sure you want to delete this wallet? (yes/no): ");
		String confirmation = scanner.nextLine();

		if ("yes".equalsIgnoreCase(confirmation)) {
			Boolean success = walletService.deleteWalletByEmailId(email);
			System.out.println(success ? "Wallet deleted successfully!" : "Wallet deletion failed!");
		} else {
			System.out.println("Wallet deletion cancelled.");
		}
	}
}

