package com.bank.wallet.application;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.Optional;

public interface WalletRepository extends JpaRepository<Wallet,Integer> {

    @Query("Select wallet from Wallet wallet where wallet.email=?1")
    Optional<Wallet> findByEmailId(String emailId);

    @Modifying
    @Transactional
    @Query("Delete  from Wallet wallet where wallet.email=?1 ")
    void deleteBY(String emailId);

    @Query("SELECT wallet.password FROM Wallet wallet where wallet.email=?1")
    String userLogin(String emailId,String password);

    @Query("SELECT wallet FROM Wallet wallet ORDER BY ?1")
    Collection<Wallet> sortCustomerWallets(String orders);

    @Query("SELECT wallet FROM Wallet wallet where wallet.name=?1")
    Collection<Wallet> findByName(String name) throws WalletException;


    @Query("SELECT wallet FROM Wallet wallet where wallet.balance BETWEEN ?1 AND ?2")
    Collection<Wallet> findWalletBetween(Double fromAmount,Double toAmount);



}
