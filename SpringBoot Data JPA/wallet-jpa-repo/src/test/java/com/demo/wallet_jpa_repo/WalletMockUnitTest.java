package com.demo.wallet_jpa_repo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class WalletMockUnitTest {

    @Autowired
    private WalletService walletService;

    @MockBean
    private WalletRepository walletRepository;

    @Test
    void testRegisterUser_Success() {
        Wallet newWallet = new Wallet(1L, "John", "john@email.com", "password123", 100.0);

        when(walletRepository.findById(1L)).thenReturn(Optional.empty());
        when(walletRepository.existsByEmail("john@email.com")).thenReturn(false);
        when(walletRepository.save(newWallet)).thenReturn(newWallet);

        Wallet result = walletService.registerUser(newWallet);

        assertEquals("John", result.getName());
        assertEquals("john@email.com", result.getEmail());
    }

    @Test
    void testAddFunds_Success() {
        Wallet existingWallet = new Wallet(1L, "John", "john@email.com", "password123", 100.0);

        when(walletRepository.findByEmail("john@email.com")).thenReturn(existingWallet);
        when(walletRepository.save(any(Wallet.class))).thenReturn(existingWallet);

        Wallet result = walletService.addFunds("john@email.com", 50.0);

        assertEquals(150.0, result.getBalance());
    }

    @Test
    void testAddFunds_NegativeAmount() {
        assertThrows(WalletException.class, () -> {
            walletService.addFunds("john@email.com", -10.0);
        });
    }

    @Test
    void testWithdrawFunds_InsufficientBalance() {
        Wallet wallet = new Wallet(1L, "John", "john@email.com", "password123", 50.0);

        when(walletRepository.findByEmail("john@email.com")).thenReturn(wallet);

        assertThrows(WalletWithdrawException.class, () -> {
            walletService.withdrawFunds("john@email.com", 100.0);
        });
    }

    @Test
    void testUserLogin_Success() throws InvalidUserException {
        Wallet wallet = new Wallet(1L, "John", "john@email.com", "password123", 100.0);

        when(walletRepository.findByEmail("john@email.com")).thenReturn(wallet);

        String result = walletService.userLogin("john@email.com", "password123");

        assertTrue(result.contains("Login successful"));
    }

    @Test
    void testUserLogin_WrongPassword() {
        Wallet wallet = new Wallet(1L, "John", "john@email.com", "password123", 100.0);

        when(walletRepository.findByEmail("john@email.com")).thenReturn(wallet);

        assertThrows(InvalidUserException.class, () -> {
            walletService.userLogin("john@email.com", "wrongpassword");
        });
    }
}
