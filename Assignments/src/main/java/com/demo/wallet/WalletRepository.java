package com.bank.wallet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WalletRepository extends JpaRepository<Wallet, Integer> {

    Wallet findByEmail(String email);
    List<Wallet> findByBalanceBetween(Double fromAmount, Double toAmount);
    @Query("SELECT wallet FROM Wallet wallet WHERE wallet.name like %?1")
    List<Wallet> getAllWalletsByNameEndingWith(String endingName);

}
