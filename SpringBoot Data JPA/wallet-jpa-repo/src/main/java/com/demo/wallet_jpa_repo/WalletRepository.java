package com.demo.wallet_jpa_repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {

    Wallet findByEmail(String email);

    boolean existsByEmail(String email);

    @Query("SELECT wallet FROM Wallet wallet ORDER BY wallet.balance DESC")
    Collection<Wallet> findAllWalletsOrderByBalanceDesc();

    @Query("SELECT wallet FROM Wallet wallet ORDER BY wallet.name")
    Collection<Wallet> findAllWalletsOrderByName();

    @Query("SELECT wallet FROM Wallet wallet ORDER BY wallet.id")
    Collection<Wallet> findAllWalletsOrderById();

    @Modifying
    @Query("DELETE FROM Wallet w WHERE w.email = :email")
    int deleteByEmail(@Param("email") String email);
}
