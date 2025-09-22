package bank.wallet;

import jakarta.validation.constraints.Pattern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface WalletDao extends JpaRepository<Wallet,Integer>{


        // CRUD ON WALLET DATABASE



    @Query("update Wallet w set w.balance=w.balance-:amount where w.email = :emailId")
    @Modifying
    int updateWalletBalanceByEmail(String emailId, Double amount);

    @Query("update Wallet w set w.balance=w.balance+:amount where w.email = :emailId")
    @Modifying
    int updateWalletAddBalanceByEmail(String emailId, Double amount);


    @Query("SELECT w.balance from Wallet w where w.email=:email")
    Double getWalletCheckBalanceByEmail(String email);


    Collection<Wallet> getWalletByEmail(String fromEmailId);

    @Query("SELECT w FROM Wallet w WHERE w.email=:userEmailId AND w.password=:password ")
    Collection<Wallet> getWalletCheckByEmail(String userEmailId, String password) ;

    @Query("update Wallet w set w.password =:newPassword where w.email = :email AND w.password=:oldPassword")
    @Modifying
    int updateWalletPasswordByEmailEquals(String email,String oldPassword,String newPassword);
}

