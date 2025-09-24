package com.example.wallet.app.wallet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.repository.query.Param;

import java.util.Collection;


public interface WalletRepository extends JpaRepository<Wallet,Integer> {
    public Wallet findByEmail(String emailId);

    public Wallet findByName(String name);

    public Collection<Wallet> findByBalanceBetween(Double fromAmount, Double toAmount);

    @Modifying
    @NativeQuery("UPDATE Wallet w SET w.balance=:balance WHERE w.email=:emailId")
    public void updateBalanceByEmail(@Param("emailId") String emailId, @Param("balance") Double balance);


    @NativeQuery("SELECT w.balance FROM Wallet w WHERE w.email=:emailId")
    public Double findBalanceByEmail(@Param("emailId") String emailId);

    @Modifying
    @NativeQuery("UPDATE Wallet w SET w.password=:password WHERE w.email=:emailId")
    public void updatePasswordByEmail(@Param("emailId")String emailId, @Param("password") String newPassword);


//    @NativeQuery("UPDATE Wallet w SET w.balance-=:balance WHERE w.email=:emailId")
//    public Double withdrawFundsByEmail(String emailId,Double balance);

//    public Collection<Wallet> findAll(String name);
//    public Collection<Wallet> findByBalance(Double balance);

}
