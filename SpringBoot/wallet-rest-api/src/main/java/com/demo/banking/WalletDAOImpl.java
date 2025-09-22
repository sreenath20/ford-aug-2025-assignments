package com.demo.banking;

import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
public class WalletDAOImpl implements WalletDAO {

    private Connection connection;

    WalletDAOImpl() {
        try {
            connection = DriverManager.getConnection("jdbc:h2:file:./data/wallet_api", "sa", "123");

            // Create table if not exists
            String createTableSQL = "CREATE TABLE IF NOT EXISTS wallet (accountId INT PRIMARY KEY, customerName VARCHAR(50), emailAddress VARCHAR(100) UNIQUE, userPassword VARCHAR(100), accountBalance DOUBLE)";
            PreparedStatement preparedStatement = connection.prepareStatement(createTableSQL);
            preparedStatement.execute();

            System.out.println("Database and table initialized successfully!");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Wallet saveWallet(Wallet newWallet) throws WalletException {

        String insertQuery = "INSERT INTO wallet VALUES (?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setInt(1, newWallet.getAccountId());
            preparedStatement.setString(2, newWallet.getCustomerName());
            preparedStatement.setString(3, newWallet.getEmailAddress());
            preparedStatement.setString(4, newWallet.getUserPassword());
            preparedStatement.setDouble(5,newWallet.getAccountBalance());

            int recordCount = preparedStatement.executeUpdate();
            if(recordCount > 0){
                return newWallet;
            }
            else {
                throw new WalletException("Wallet could not be saved in the Database.");
            }
        }
        catch (SQLException e){
            throw new WalletException(e.getMessage());
        }

    }

    @Override
    public Collection<Wallet> getAllWallets() throws WalletException {
        List<Wallet> wallets = new ArrayList<>();
        String selectQuery = "SELECT * FROM wallet";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Wallet wallet = new Wallet();
                wallet.setAccountId(resultSet.getInt("accountId"));
                wallet.setCustomerName(resultSet.getString("customerName"));
                wallet.setEmailAddress(resultSet.getString("emailAddress"));
                wallet.setUserPassword(resultSet.getString("userPassword"));
                wallet.setAccountBalance(resultSet.getDouble("accountBalance"));
                wallets.add(wallet);
            }

            if(wallets.isEmpty()){
                return  null;
            }
        }
        catch (SQLException e){
            throw new WalletException(e.getMessage());
        }
        return wallets;
    }

    @Override
    public Wallet getWalletByEmail(String emailAddress) throws WalletException{
        String selectQuery = "SELECT * FROM wallet WHERE emailAddress = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setString(1, emailAddress);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){ // wallet exist
                Wallet foundWallet = new Wallet();
                foundWallet.setAccountId(resultSet.getInt("accountId"));
                foundWallet.setCustomerName(resultSet.getString("customerName"));
                foundWallet.setEmailAddress(resultSet.getString("emailAddress"));
                foundWallet.setAccountBalance(resultSet.getDouble("accountBalance"));
                foundWallet.setUserPassword(resultSet.getString("userPassword"));

                return foundWallet;
            }
            else {
                return null;
            }
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Wallet updateWalletBalance(Wallet wallet) throws WalletException {
        String updateQuery = "UPDATE wallet SET accountBalance = ? WHERE accountId = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setDouble(1, wallet.getAccountBalance());
            preparedStatement.setInt(2, wallet.getAccountId());
            int recordCount = preparedStatement.executeUpdate();
            if(recordCount > 0){
                return wallet;
            }
            else {
                throw new WalletException("Wallet balance could not be updated in the Database.");
            }

        }
        catch (SQLException e){
            throw new WalletException(e.getMessage());
        }
    }

    @Override
    public Collection<Wallet> getWalletByName(String customerName) throws WalletException {
        String selectQuery = "SELECT * FROM wallet WHERE customerName = ?";
        List<Wallet>  wallets = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setString(1, customerName);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Wallet wallet = new Wallet();
                wallet.setAccountId(resultSet.getInt("accountId"));
                wallet.setCustomerName(resultSet.getString("customerName"));
                wallet.setEmailAddress(resultSet.getString("emailAddress"));
                wallet.setUserPassword(resultSet.getString("userPassword"));
                wallet.setAccountBalance(resultSet.getDouble("accountBalance"));
                wallets.add(wallet);
            }
            return  wallets;
        }
        catch (SQLException e){
            throw new WalletException(e.getMessage());
        }
    }

    @Override
    public Collection<Wallet> findAllWalletsHavingBalanceBetween(Double startAmount, Double endAmount) throws WalletException {

        String selectQuery = "SELECT * FROM wallet WHERE accountBalance BETWEEN ? AND ?";
        List<Wallet>  wallets = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setDouble(1,startAmount);
            preparedStatement.setDouble(2,endAmount);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                Wallet wallet = new Wallet();
                wallet.setAccountId(resultSet.getInt("accountId"));
                wallet.setCustomerName(resultSet.getString("customerName"));
                wallet.setEmailAddress(resultSet.getString("emailAddress"));
                wallet.setUserPassword(resultSet.getString("userPassword"));
                wallet.setAccountBalance(resultSet.getDouble("accountBalance"));
                wallets.add(wallet);
            }

            return  wallets;
        }
        catch (SQLException e){
            throw new WalletException(e.getMessage());
        }

    }

    @Override
    public Wallet updatePassword(Wallet wallet, String updatedPassword) throws WalletException {

        String updateQuery = "UPDATE wallet SET userPassword = ? WHERE accountId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1,wallet.getUserPassword());
            preparedStatement.setInt(2,wallet.getAccountId());
            int recordCount = preparedStatement.executeUpdate();
            if(recordCount > 0){
                return wallet;
            }
            else {
                throw new WalletException("Wallet password could not be updated in the Database.");
            }
        }
        catch (SQLException e){
            throw new WalletException(e.getMessage());
        }
    }

    @Override
    public Boolean deleteWalletByEmail(Wallet wallet) throws WalletException {
        String deleteQuery = "DELETE FROM wallet WHERE emailAddress = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setString(1,wallet.getEmailAddress());
            int recordCount = preparedStatement.executeUpdate();
            if(recordCount > 0){
                return true;
            }
            else  {
                throw new WalletException("Wallet could not be deleted in the Database.");
            }
        }
        catch (SQLException e){
            throw new WalletException(e.getMessage());
        }
    }
}
