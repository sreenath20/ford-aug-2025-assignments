package com.jdbc.demo;

import com.jdbc.demo.wallet.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner {

	public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        WalletService walletService = new WalletServiceImpl();

        try {
            walletService.registerNewUser(new Wallet(4,"Dennis","dennis@gmail.com","dennis@123",120000.0));
            System.out.println("Registered new user successfully..!");

            if(walletService.addFundsToWalletByEmail("josh@gmail.com",5000.0))
                System.out.println("Funds added successfully..!");

            if(walletService.withdrawFundsFromWalletByEmail("dennis@gmail.com",3000.0))
                System.out.println("Funds withdrawn successfully..!");

            if(walletService.transferFundsToWalletByEmail("dennis@gmail.com","josh@gmail.com",7500.0))
                System.out.println("Funds transfered successfully..!");

            System.out.println("Get wallet by email : "+
              walletService.getWalletByEmail("dennis@gmail.com").getName()
            );

            System.out.println("All wallets : ");
            walletService.getAllWallets().forEach(w->System.out.println(" "+w));

            if(walletService.userLogIn("franky@gmail.com","franky@123")){
                System.out.println("Franky logged in successfully..");
            }

            System.out.println("Wallets sorted by name :");
            walletService.sortCustomerWallets("Name").forEach(w->System.out.println(" "+w));

            System.out.println("Wallets sorted by balance :");
            walletService.sortCustomerWallets("Balance").forEach(w->System.out.println(" "+w));

            System.out.println("Find customers by name: ");
            walletService.findWalletsByName("Franky").forEach(w->System.out.println(" "+w));

            System.out.println("Find all wallets balance b/w 80000 and 150000");
            walletService.findAllWalletsHavingBalanceBetween(80000.0,150000.0)
                    .forEach(w->System.out.println(" "+w));

            walletService.updateWalletPassword("raamji@gmail.com","raamji@123","r@@mji");
            System.out.println("Password updated successfully..!");

            if(walletService.deleteWalletByEmail("franky@gmail.com"))
                System.out.println("Wallet deleted successfully..!");


        }
        catch (WalletException we) {
            System.out.println("Wallet Exception : "+we.getMessage());
        }
        catch (WalletWithdrawException wwe){
            System.out.println("Wallet Withdraw Exception : "+wwe.getMessage());
        }
        catch (InvalidUserException iue){
            System.out.println("InvalidUserException : "+iue.getMessage());
        }
        catch (Exception e){
            System.out.println("Exception : "+e.getMessage());
        }

/**
        String createWalletSQL = "create table wallet ( id int, name varchar(50), primary key(id))";
//        create table
        PreparedStatement preparedStatement = connection.prepareStatement(createWalletSQL);
        preparedStatement.execute();
//        insert records
        PreparedStatement insertPreparedStatement = connection.prepareStatement("Insert into wallet values(?,?)");
        insertPreparedStatement.setInt(1, 2);
        insertPreparedStatement.setString(2, "Ford USA");
        System.out.println("No of records inserted :"+insertPreparedStatement.executeUpdate());
//        get all records
        PreparedStatement selectPreparedStatement = connection.prepareStatement("Select * from wallet");
        ResultSet resultSet = selectPreparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + ":" + resultSet.getString(2));
        }
//        update a record
        PreparedStatement updatePreparedStatement = connection.prepareStatement("Update wallet set name = ? where id = ?");

        updatePreparedStatement.setString(1, "Ford Chennai");
        updatePreparedStatement.setInt(2, 1);
        System.out.println("No of records updated :"+updatePreparedStatement.executeUpdate());
//        Delete a record
        PreparedStatement deletePreparedStatement = connection.prepareStatement("delete from wallet where id = ?");
        deletePreparedStatement.setInt(1,1);
        System.out.println("No of records deleted  :"+deletePreparedStatement.executeUpdate());

*/

    }

}
