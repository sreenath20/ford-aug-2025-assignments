package com.demo.wallet.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface WalletRepository extends JpaRepository<Wallet,Integer> {


    Wallet findByEmail(String email);

    Collection<Wallet> findWalletsByName(String name);

    @Query("SELECT wallet FROM Wallet wallet ORDER BY wallet.name")
    Collection<Wallet> findAllWalletsOrderByName();

    @Query("SELECT wallet FROM Wallet wallet ORDER BY  wallet.balance DESC")
    Collection<Wallet> findAllWalletsOrderByBalanceDesc();

    @Query("SELECT wallet FROM Wallet wallet ORDER BY wallet.email")
    Collection<Wallet> findAllWalletsOrderByEmail();

    @Query("SELECT wallet FROM Wallet wallet ORDER BY wallet.id")
    Collection<Wallet> findWalletsOrderById();

    @Query("SELECT wallet FROM Wallet wallet WHERE wallet.balance BETWEEN :fromAmount AND :toAmount ORDER BY wallet.balance")
    Collection<Wallet> findAllWalletsHavingBalanceBetween(@Param("fromAmount") Double fromAmount, @Param("toAmount") Double toAmount);

    @Modifying
    @Query("DELETE FROM Wallet w WHERE w.email = :email")
    int deleteByEmail(@Param("email") String email);

}

