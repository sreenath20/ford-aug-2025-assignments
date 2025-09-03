package com.jdbc.demo.wallet;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WalletDaoImp implements WalletDao {

    private Connection connection;
    public WalletDaoImp(){
        try{
            connection=DriverManager.getConnection("jdbc:h2:file:./data/demo", "sa", "password");
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    @Override
    public Wallet saveWallet(Wallet newWallet) throws WalletException {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("Insert into wallet values (?,?,?,?,?)");
            preparedStatement.setInt(1, newWallet.getId());
            preparedStatement.setString(2, newWallet.getName());
            preparedStatement.setString(3, newWallet.getEmail());
            preparedStatement.setString(4, newWallet.getPassword());
            preparedStatement.setDouble(5, newWallet.getBalance());
            int recordCount = preparedStatement.executeUpdate();
            if (recordCount> 0) {
                return newWallet;
            }
            else  {
                throw new WalletException("Wallet could not be added to db");
            }
        } catch (SQLException e) {
            throw new WalletException(e.getMessage());
        }

    }

    @Override
    public Wallet getWalletByEmail(String emailId) throws WalletException {
        String selectSql = "select * from wallet where email = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(selectSql);
            preparedStatement.setString(1,emailId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                Wallet foundWallet = new Wallet();
                foundWallet.setId(resultSet.getInt("id"));
                foundWallet.setName(resultSet.getString("name"));
                foundWallet.setEmail(resultSet.getString("email"));
                foundWallet.setBalance(resultSet.getDouble("balance"));
                foundWallet.setPassword(resultSet.getString("password"));
                return foundWallet;
            }
            else
            {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Wallet getWalletByName(String name) throws WalletException {
        String selectSql = "select * from wallet where name = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(selectSql);
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                Wallet foundWallet = new Wallet();
                foundWallet.setId(resultSet.getInt("id"));
                foundWallet.setName(resultSet.getString("name"));
                foundWallet.setEmail(resultSet.getString("email"));
                foundWallet.setBalance(resultSet.getDouble("balance"));
                foundWallet.setPassword(resultSet.getString("password"));
                return foundWallet;
            }
            else
            {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public Wallet getWalletByBalance(Double balance) throws WalletException {
        String selectSql = "select * from wallet where balance = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(selectSql);
            preparedStatement.setDouble(1,balance);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                Wallet foundWallet = new Wallet();
                foundWallet.setId(resultSet.getInt("id"));
                foundWallet.setName(resultSet.getString("name"));
                foundWallet.setEmail(resultSet.getString("email"));
                foundWallet.setBalance(resultSet.getDouble("balance"));
                foundWallet.setPassword(resultSet.getString("password"));
                return foundWallet;
            }
            else
            {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Wallet updateWallet(Wallet wallet) throws WalletException {
        try{
            PreparedStatement updatepreparedStatement = connection.prepareStatement("Update wallet set name = ?,password=?,balance =? where email = ?");
            updatepreparedStatement.setString(1, wallet.getName());
            updatepreparedStatement.setString(2,wallet.getPassword());
            updatepreparedStatement.setDouble(3, wallet.getBalance());
            updatepreparedStatement.setString(4, wallet.getEmail());
            int count = updatepreparedStatement.executeUpdate();
            if (count > 0) {
                return wallet;
            }
            else  {
                throw new WalletException("Wallet could not be added to db");
            }
        }catch (SQLException e){
            throw new WalletException(e.getMessage());
        }

    }

    @Override
    public Wallet updateWalletBalance(Wallet wallet) throws WalletException {
        try{
            PreparedStatement updatepreparedStatement = connection.prepareStatement("Update wallet set balance =? where email = ?");
            updatepreparedStatement.setDouble(1, wallet.getBalance());
            updatepreparedStatement.setString(2,wallet.getEmail());
            int count = updatepreparedStatement.executeUpdate();
            if (count > 0) {
                return wallet;
            }
            else  {
                throw new WalletException("Wallet could not be added to db");
            }
        }catch (SQLException e){
            throw new WalletException(e.getMessage());
        }

    }
    @Override
    public Boolean updateWalletPassword(String emailId, String newPassword) throws WalletException {
        try{
            PreparedStatement updatepreparedStatement = connection.prepareStatement("Update wallet set password =? where email = ?");
            updatepreparedStatement.setString(1, newPassword);
            updatepreparedStatement.setString(2,emailId);
            int count = updatepreparedStatement.executeUpdate();
            if (count > 0) {
                return true;
            }
            else  {
                throw new WalletException("Wallet could not be added to db");
            }
        }catch (SQLException e){
            throw new WalletException(e.getMessage());
        }

    }

    @Override
    public void deleteWalletByEmail(String emailId) throws WalletException {
        try{
            PreparedStatement deletePreparedStatement = connection.prepareStatement("Delete from wallet where email = ?");
            deletePreparedStatement.setString(1,emailId);
            int count = deletePreparedStatement.executeUpdate();
            if (count > 0) {
                return;
            }
            else {
                throw new WalletException("Wallet could not be deleted from db");
            }

        }catch (SQLException e){
            throw new WalletException(e.getMessage());
        }

    }

    @Override
    public Collection<Wallet> getAllWallets() throws WalletException {
        try{
            Collection<Wallet> allWallets = new ArrayList<>();
            PreparedStatement getPreparedStatement = connection.prepareStatement("SELECT * FROM wallet");
            ResultSet resultSet = getPreparedStatement.executeQuery();

//            if(!resultSet.next()){
//                throw new WalletException("Wallet not found in db");
//            }
            while (resultSet.next()) {
                Wallet wallet = new Wallet();
                wallet.setId(resultSet.getInt("id"));
                wallet.setName(resultSet.getString("name"));
                wallet.setEmail(resultSet.getString("email"));
                wallet.setPassword(resultSet.getString("password"));
                wallet.setBalance(resultSet.getDouble("balance"));
                allWallets.add(wallet);
            }
            if(allWallets.isEmpty()){
                throw new WalletException("Wallet not found in db");
            }
            return allWallets;
        }catch (SQLException e){
                throw new WalletException(e.getMessage());
        }

    }
}
