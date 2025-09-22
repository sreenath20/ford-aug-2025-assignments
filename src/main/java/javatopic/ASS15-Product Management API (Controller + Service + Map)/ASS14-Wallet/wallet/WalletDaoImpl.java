package bank.wallet;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

@Repository
public class WalletDaoImpl implements WalletDao {

    private Connection connection;

    public WalletDaoImpl() {
        try{
            connection = DriverManager.getConnection("jdbc:h2:file:./data/demo", "sa", "password");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    @Override
    public Wallet saveWallet(Wallet wallet) throws Exception {

        String insertSql="INSERT INTO Wallet values(?,?,?,?,?)";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
            preparedStatement.setInt(1,wallet.getId());
            preparedStatement.setString(2,wallet.getName());
            preparedStatement.setString(3,wallet.getEmail());
            preparedStatement.setString(4,wallet.getPassword());
            preparedStatement.setDouble(5,wallet.getBalance());

            int recordCount = preparedStatement.executeUpdate();
            if(recordCount > 0){
                return wallet;
            }
            else{
                throw new WalletException("Insert failed");
            }
            }
            catch(SQLException e){
                System.out.println(e.getMessage());

            }

        return wallet;
    }

    @Override
    public Wallet getWalletByEmail(String emailId) throws Exception {
        return null;
    }

    @Override
    public Wallet updateWallet(Wallet wallet) throws Exception {
        return null;
    }

    @Override
    public Wallet updateWalletBalance(Wallet wallet) throws Exception {
        return null;
    }

    @Override
    public Wallet deleteWalletByEmail(String emailId) throws Exception {
        return null;
    }

    @Override
    public Collection<Wallet> getAllWallets() throws Exception {
        return List.of();
    }
}
