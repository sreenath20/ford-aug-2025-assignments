//package com.bank.wallet.application;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Assumptions.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.Optional;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assumptions.assumeTrue;
//
//@SpringBootTest
//@ActiveProfiles("test")
//public class WalletServiceTests {
//
//
//    @Autowired
//    private WalletService walletService;
//
//    private Wallet wallet;
//
//    @BeforeEach
//    void setUpTestDataBeforeEachTest() {
//
//        this.wallet = new Wallet(1, "MyName", 5000.0, "name@gmail.com", "123@gmail");
//
//    }
//
//    // Integration testing
//// +ve test case
//    @Test
//    void newWalletRegistrationTest() {
//        assumeTrue(walletService != null, "Wallet service bean is not available");
//
//        try {
//            Wallet resultWallet = this.walletService.addWallet(wallet);
//            // id should get auto generated
//            assertNotEquals(null, resultWallet.getId());
//
//            Wallet foundWallet = null;
//
//            foundWallet = this.walletService.getWalletById(resultWallet.getId());
//            assertEquals(5000.0, foundWallet.getBalance());
//
//        } catch (WalletException e) {
//            throw new RuntimeException(e);
//        } catch (WalletNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    // -ve test case
//    @Test
//    @DisplayName("Checking for duplicate id while creating wallet")
//    void checkForIdAlreadyExistsExceptionTest() {
//        try {
//            this.walletService.addWallet(wallet); // save
//            WalletException walletException = assertThrows(WalletException.class, () -> this.walletService.addWallet(wallet)); // re-save same wallet
//
//            assertEquals("Wallet with id 1 already exists", walletException.getMessage());
//        } catch (WalletException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    // +ve
//    @Test
//    void addFundsTest() {
//        try {
//            this.walletService.addWallet(wallet);
//            this.walletService.addFunds(1, 500.0);
//            Wallet foundWallet = this.walletService.getWalletById(1);
//            // testing for new balance
//            assertEquals(5500.0, foundWallet.getBalance());
//        } catch (WalletException e) {
//            throw new RuntimeException(e);
//        } catch (WalletNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (InvalidBalanceException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    // -ve test cases
//    @Test
//    void addNegativeAmountShouldThrowExceptionTest() {
//        try {
//            this.walletService.addWallet(wallet);
//            InvalidBalanceException invalidBalanceException = assertThrows(InvalidBalanceException.class, () -> this.walletService.addFunds(1, -100.0));
//
//            assertEquals("Invalid amount -100.0", invalidBalanceException.getMessage());
//        } catch (WalletException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//    @AfterEach
//    void cleanUpAfterEachTestCase() {
//
//        try {
//            this.walletService.deleteWalletById(1);
//        } catch (WalletNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//}