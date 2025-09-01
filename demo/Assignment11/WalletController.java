package com.demo.Assignment11;

public class WalletController {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(1, "User 1", 500.0, "name1@gmail.com", "123@name1");
        WalletService walletService= new WalletServiceImpl();

        try{

            walletService.registerNewUserWallet(wallet);
            System.out.println("Successfully registered user wallet"+wallet.getEmail());
            walletService.registerNewUserWallet(new Wallet(2, "User 2", 600.0, "name2@gmail.com", "1453@name1"));

            System.out.println("Successfully registered user wallet"+wallet.getEmail());
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            System.out.println("Successfully credited "+walletService.addFundsToWalletByEmailId("name2@gmail.com",500.0));

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("Successfully debited "+walletService.withdrawFromWalletByEmailId("name1@gmail.com",100.0));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            walletService.transferFunds("name2@gmail.com", "name1@gmail.com", 600.0);
            System.out.println("Successfully transfer funds"+wallet.getEmail());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(walletService.getAllCustomerWallets());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }






    }
}
