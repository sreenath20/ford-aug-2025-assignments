package com.bank.wallet;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//@Component
@Repository // used to indentify Data access object
public class WalletDaoImpl implements WalletDao {

    private Connection connection;

    public WalletDaoImpl() {
        try {
            connection = DriverManager.getConnection("jdbc:h2:file:./data/demo", "sa", "password");
        } catch (SQLException e) {
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
            } else
                throw new WalletException("Wallet could not be added to DB");
        } catch (SQLException e) {
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

            } else // wallet does not exist for given email
            {
                return null;
                //throw new WalletException("Wallet not found for given email:" + emailId);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Wallet updateWallet(Wallet wallet) throws WalletException {
        return null;
    }

    @Override
    public Wallet updateWalletBalance(Wallet newWallet) throws WalletException {
        String insertSql = "update wallet set balance = ? where email = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
            preparedStatement.setDouble(1, newWallet.getBalance());
            preparedStatement.setString(2, newWallet.getEmail());

            int recordCount = preparedStatement.executeUpdate();
            if (recordCount > 0) {
                return newWallet;
            } else
                throw new WalletException("Wallet balance could not be added");
        } catch (SQLException e) {
            throw new WalletException(e.getMessage());
        }
    }

    @Override
    public Wallet deleteWalletByEmail(String emailId) throws WalletException {
        return null;
    }

    @Override
    public Collection<Wallet> getAllWallets() throws WalletException {

        String selectSql = "SELECT * FROM wallet ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectSql);

            List<Wallet> wallets = new ArrayList<>();
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) { // wallet exits
                Wallet foundWallet = new Wallet();
                foundWallet.setId(resultSet.getInt("id"));
                foundWallet.setName(resultSet.getString("name"));
                foundWallet.setEmail(resultSet.getString("email"));
                foundWallet.setBalance(resultSet.getDouble("balance"));
                foundWallet.setPassword(resultSet.getString("password"));
                wallets.add(foundWallet);
            }
            return wallets;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}