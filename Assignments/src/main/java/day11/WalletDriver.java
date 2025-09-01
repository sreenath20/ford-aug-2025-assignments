package day11;

import java.util.Scanner;

public class WalletDriver {
    public static void main(String[] args) {
        WalletService service = new WalletServiceImpl();
        Scanner sc = new Scanner(System.in);
        boolean menuSelection = true;

        while (menuSelection) {
            System.out.println("********** Welcome to the Online Wallet Services App **********");
            System.out.println("------ Online Wallet Services Menu -----");
            System.out.println("1. Register Customer");
            System.out.println("2. Add Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Transfer Funds");
            System.out.println("5. Get Account Details");
            System.out.println("6. View All Customers (Only Admin Access)");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            try {
                //Adding new user.
                if (choice == 1) {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    WalletCustomer c = new WalletCustomer(id, name, email, balance);
                    service.registerNewUserWallet(c);
                    System.out.println("Customer registered: " + c);

                    //Adding Funds
                } else if (choice == 2) {
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Amount: ");
                    double addAmount = sc.nextDouble();
                    service.addFundsToWalletByEmailID(email, addAmount);
                    System.out.println("Funds added successfully.");

                    //Withdrawing Funds
                } else if (choice == 3) {
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Amount: ");
                    double withAmount = sc.nextDouble();
                    service.withdrawFromWalletByEmailID(email, withAmount);
                    System.out.println("Withdrawal successful.");

                    //Transfer Funds
                } else if (choice == 4) {
                    System.out.print("Enter Sender Email: ");
                    String senderEmail = sc.nextLine();
                    System.out.print("Enter Receiver Email: ");
                    String receiverEmail = sc.nextLine();
                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();
                    boolean success = service.transferFunds(senderEmail, receiverEmail, amount);
                    System.out.println("Transfer successful ?  " + success);

                    //Getting  Account User Details
                } else if (choice == 5) {
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.println(service.getUserWalletByEmailID(email));

                    //Listing All Registered Users
                } else if (choice == 6) {
                    System.out.print("Enter Admin Password: ");
                    String password = sc.nextLine();
                    try {
                        for (WalletCustomer c : service.getAllWalletCustomers(password)) {
                            System.out.println(c);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    //End of Application
                } else if (choice == 7) {
                    menuSelection = false;
                    System.out.println("***** Thank you for using our Online Wallet Services App! ***** ");
                    System.out.println("Exiting App..... ");

                } else {
                    System.out.println("Invalid choice. Try again!");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}


