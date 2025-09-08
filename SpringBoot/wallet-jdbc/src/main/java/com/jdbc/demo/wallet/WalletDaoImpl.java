package com.jdbc.demo.wallet;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WalletDaoImpl implements WalletDao {

    private Connection connection;

    public WalletDaoImpl() {
        try {
            connection = DriverManager.getConnection("jdbc:h2:file:./data/demo", "sa", "password");
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public Wallet saveWallet(Wallet newWallet) throws WalletException {
        String insertSql = "Insert Into wallet values(?,?,?,?,?) ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
            preparedStatement.setInt(1, newWallet.getId());
            preparedStatement.setString(2, newWallet.getName());
            preparedStatement.setString(3, newWallet.getEmail());
            preparedStatement.setString(4, newWallet.getPassword());
            preparedStatement.setDouble(5, newWallet.getBalance());
            int recordCount = preparedStatement.executeUpdate();
            if (recordCount > 0) {
                return newWallet;
            }
            else {
                throw new WalletException("Wallet could not be added to DB");
            }
        }
        catch (SQLException e) {
            throw new WalletException(e.getMessage());
        }

    }

    @Override
    public Wallet getWalletByEmail(String emailId) throws WalletException {
        String selectSql = "SELECT * FROM wallet WHERE email = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectSql);
            preparedStatement.setString(1, emailId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) { // wallet exits
                Wallet foundWallet = new Wallet();
                foundWallet.setId(resultSet.getInt("id"));
                foundWallet.setName(resultSet.getString("name"));
                foundWallet.setEmail(resultSet.getString("email"));
                foundWallet.setBalance(resultSet.getDouble("balance"));
                foundWallet.setPassword(resultSet.getString("password"));
                return foundWallet;

            }
            else{ // wallet does not exist for given email
                return null; //throw new WalletException("Wallet not found for given email:" + emailId);
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Wallet updateWallet(Wallet wallet) throws WalletException {
        String updateSql = "Update wallet set name = ?,password=? where email=?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
            preparedStatement.setString(1, wallet.getName());
            preparedStatement.setString(2, wallet.getPassword());
            preparedStatement.setString(3, wallet.getEmail());
            int recordCount = preparedStatement.executeUpdate();
            if (recordCount > 0) {
                return wallet;
            } else {
                throw new WalletException("Wallet update failed for email: " + wallet.getEmail());
            }
        }
        catch (SQLException e){
            throw new WalletException(e.getMessage());
        }
    }

    @Override
    public Wallet updateWalletBalance(Wallet wallet) throws WalletException {
        String updateSql = "UPDATE wallet SET balance = ? WHERE email = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
            preparedStatement.setDouble(1, wallet.getBalance());
            preparedStatement.setString(2, wallet.getEmail());
            int recordCount = preparedStatement.executeUpdate();
            if (recordCount > 0) {
                return wallet;
            } else {
                throw new WalletException("Wallet balance update failed for email: " + wallet.getEmail());
            }
        }
        catch (SQLException e) {
            throw new WalletException(e.getMessage());
        }
    }

    @Override
    public Boolean deleteWalletByEmailId(String emailId) throws WalletException {
        // First get the wallet to return it
        Wallet walletToDelete = getWalletByEmail(emailId);
        if (walletToDelete == null) {
            throw new WalletException("Wallet not found for email: " + emailId);
        }

        String deleteSql = "DELETE FROM wallet WHERE email = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteSql);
            preparedStatement.setString(1, emailId);
            int recordCount = preparedStatement.executeUpdate();
            if (recordCount > 0) {
                return true;
            } else {
                throw new WalletException("Wallet deletion failed for email: " + emailId);
            }
        }
        catch (SQLException e) {
            throw new WalletException(e.getMessage());
        }
    }

    @Override
    public Collection<Wallet> getAllWallets() throws WalletException {
        List<Wallet> wallets = new ArrayList<>();
        String selectSql = "SELECT * FROM wallet";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectSql);
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
            return wallets;
        }
        catch (SQLException e) {
            throw new WalletException(e.getMessage());
        }
    }
}
