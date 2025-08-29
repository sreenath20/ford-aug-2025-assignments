package com.jdbc.demo.wallet;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WalletDAOImpl implements WalletDAO {

    private Connection connection;

    WalletDAOImpl() {
        try {
            connection = DriverManager.getConnection("jdbc:h2:file:./data/demo", "sa", "123");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Wallet saveWallet(Wallet newWallet) throws WalletException {

        String insertQuery = "INSERT INTO wallet VALUES (?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setInt(1, newWallet.getId());
            preparedStatement.setString(2, newWallet.getName());
            preparedStatement.setString(3, newWallet.getEmail());
            preparedStatement.setString(4, newWallet.getPassword());
            preparedStatement.setDouble(5,newWallet.getBalance());

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
                wallet.setId(resultSet.getInt("id"));
                wallet.setName(resultSet.getString("name"));
                wallet.setEmail(resultSet.getString("email"));
                wallet.setPassword(resultSet.getString("password"));
                wallet.setBalance(resultSet.getDouble("balance"));
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
    public Wallet getWalletByEmail(String email) throws WalletException{
        String selectQuery = "SELECT * FROM wallet WHERE email = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){ // wallet exist
                Wallet foundWallet = new Wallet();
                foundWallet.setId(resultSet.getInt("id"));
                foundWallet.setName(resultSet.getString("name"));
                foundWallet.setEmail(resultSet.getString("email"));
                foundWallet.setBalance(resultSet.getDouble("balance"));
                foundWallet.setPassword(resultSet.getString("password"));

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
        String updateQuery = "UPDATE wallet SET balance = ? WHERE id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setDouble(1, wallet.getBalance());
            preparedStatement.setInt(2, wallet.getId());
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
    public Collection<Wallet> getWalletByName(String name) throws WalletException {
        String selectQuery = "SELECT * FROM wallet WHERE name = ?";
        List<Wallet>  wallets = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Wallet wallet = new Wallet();
                wallet.setId(resultSet.getInt("id"));
                wallet.setName(resultSet.getString("name"));
                wallet.setEmail(resultSet.getString("email"));
                wallet.setPassword(resultSet.getString("password"));
                wallet.setBalance(resultSet.getDouble("balance"));
                wallets.add(wallet);
            }
            return  wallets;
        }
        catch (SQLException e){
            throw new WalletException(e.getMessage());
        }
    }

    @Override
    public Collection<Wallet> findAllWalletsHavingBalanceBetween(Double fromAmount, Double toAmount) throws WalletException {

        String selectQuery = "SELECT * FROM wallet WHERE balance BETWEEN ? AND ?";
        List<Wallet>  wallets = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setDouble(1,fromAmount);
            preparedStatement.setDouble(2,toAmount);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                Wallet wallet = new Wallet();
                wallet.setId(resultSet.getInt("id"));
                wallet.setName(resultSet.getString("name"));
                wallet.setEmail(resultSet.getString("email"));
                wallet.setPassword(resultSet.getString("password"));
                wallet.setBalance(resultSet.getDouble("balance"));
                wallets.add(wallet);
            }

            return  wallets;
        }
        catch (SQLException e){
            throw new WalletException(e.getMessage());
        }

    }

    @Override
    public Wallet updatePassword(Wallet wallet, String newPassword) throws WalletException {

        String updateQuery = "UPDATE wallet SET password = ? WHERE id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1,wallet.getPassword());
            preparedStatement.setInt(2,wallet.getId());
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
        String deleteQuery = "DELETE FROM wallet WHERE email = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setString(1,wallet.getEmail());
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
