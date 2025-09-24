package com.demo.wallet;

import com.demo.wallet.app.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@ActiveProfiles("test")
public class WalletIntegrationTests {


    @Autowired
    private WalletController walletController;


    Wallet wallet1;
    Wallet wallet2;

    @BeforeEach
    public void setup(){
        wallet1 = new Wallet(
                1,
                "Wallet1",
                "wallet1@ford.com",
                "Wallet1@123",
                50000.0
        );

        wallet2 = new Wallet(
                2,
                "Wallet2",
                "wallet2@ford.com",
                "Wallet2@123",
                65000.0
        );

    }

    @AfterEach
    public void tearDown(){
        walletController.deleteWalletById(wallet1.getId());
        walletController.deleteWalletById(wallet2.getId());
    }

    @Test
    @DisplayName("Register New User")
    void testRegisterNewUser(){
//        +ve
        assertEquals(wallet1,walletController.registerNewWalletUser(wallet1));
        assertEquals(wallet2,walletController.registerNewWalletUser(wallet2));

//        duplicate wallet
        assertThrows(WalletException.class,
                () -> walletController.registerNewWalletUser(wallet1));
    }

    @Test
    @DisplayName("Add Funds by Email")
    void testAddFundsByEmail(){

        walletController.registerNewWalletUser(wallet1);
        walletController.registerNewWalletUser(wallet2);

//        invalid amount : -100
        assertThrows(WalletException.class,
                ()->walletController.addFundByEmail(wallet1.getEmail(),-100.0));

//        invalid email : invalidmail@ford.com
        assertThrows(WalletNotFoundException.class,
                ()->walletController.addFundByEmail("invalidmail@ford.com",1000.0));

//        +ve
        assertEquals(wallet1.getBalance()+100, walletController.addFundByEmail(wallet1.getEmail(),100.0).getBalance());

    }

    @Test
    @DisplayName("Withdraw Funds by Email")
    void testWithdrawFundsByEmail() throws WalletWithdrawException {

        walletController.registerNewWalletUser(wallet1);
        walletController.registerNewWalletUser(wallet2);
        Exception exception;


//        invalid amount : 1234
        exception = assertThrows(WalletWithdrawException.class,
                ()->walletController.withdrawFundByEmail(wallet1.getEmail(),1234.0));
        assertEquals("Amount must be a multiples of 100 and greater than 99",exception.getMessage());

//        invalid amount : -100
        exception = assertThrows(WalletWithdrawException.class,
                ()->walletController.withdrawFundByEmail(wallet2.getEmail(),-200.0));
        assertEquals("Amount must be a multiples of 100 and greater than 99",exception.getMessage());

//        invalid email : invalidmail@ford.com
        assertThrows(WalletNotFoundException.class,
                ()->walletController.withdrawFundByEmail("invalidmail@ford.com",1000.0));

//        insufficient funds
         exception = assertThrows(WalletWithdrawException.class,
                 ()->walletController.withdrawFundByEmail(wallet1.getEmail(),1000000.0));
         assertEquals("Insufficient funds to withdraw", exception.getMessage());

//        +ve
        assertEquals(wallet1.getBalance()-1000, walletController.withdrawFundByEmail(wallet1.getEmail(),1000.0).getBalance());

    }

    @Test
    @DisplayName("Transfer Funds")
    void testTransferFunds(){

        walletController.registerNewWalletUser(wallet1);
        walletController.registerNewWalletUser(wallet2);
        Exception exception;


//        invalid from email : invalidfrom@ford.com
        exception = assertThrows(WalletNotFoundException.class,
                ()->walletController.transferFundByEmail("invalidfrom@ford.com",wallet2.getEmail(),500.0));
        assertEquals("From wallet not found", exception.getMessage());

//        invalid to email : invalidto@ford.com
        exception = assertThrows(WalletNotFoundException.class,
                ()->walletController.transferFundByEmail(wallet1.getEmail(), "invalidto@ford.com",500.0));
        assertEquals("To wallet not found", exception.getMessage());

//        invalid amount : -500
        exception = assertThrows(WalletException.class,
                ()->walletController.transferFundByEmail(wallet1.getEmail(),wallet2.getEmail(),-500.0));
        assertEquals("Amount must be greater than 0", exception.getMessage());

//        insufficient balance
        exception = assertThrows(WalletException.class,
                ()->walletController.transferFundByEmail(wallet1.getEmail(), wallet2.getEmail(),5000000.0));
        assertEquals("Insufficient balance to transfer", exception.getMessage());

//        +ve
        String response = walletController.transferFundByEmail(wallet1.getEmail(),wallet2.getEmail(),500.0);
        assertEquals("Transfer Successful..!", response);

    }

    @Test
    @DisplayName("Get Wallet by Email")
    void testGetWalletByEmail(){

        walletController.registerNewWalletUser(wallet1);
        walletController.registerNewWalletUser(wallet2);

//        invalid email : invalidemail@ford.com
        assertThrows(WalletNotFoundException.class,
                ()->walletController.getUserByEmail("invalidemail@ford.com"));

//        +ve
        Wallet resWallet = walletController.getUserByEmail(wallet1.getEmail());
        assertEquals(wallet1, resWallet);

    }

    @Test
    @DisplayName("Get all wallets")
    void testGetAllWallets(){

        Exception exception;

//        empty wallets
        exception = assertThrows(WalletNotFoundException.class,
                ()->walletController.getAllWallets());
        assertEquals("No wallets found", exception.getMessage());

        walletController.registerNewWalletUser(wallet1);
        walletController.registerNewWalletUser(wallet2);

//        +ve
        assertEquals(2, walletController.getAllWallets().size());

    }

    @Test
    @DisplayName("User Log In")
    void testUserLogIn() throws InvalidUserException {

        walletController.registerNewWalletUser(wallet1);
        walletController.registerNewWalletUser(wallet2);
        Exception exception;

//        invalid email : invalidemail@ford.com
        exception = assertThrows(InvalidUserException.class,
                ()->walletController.logIn("invalidemail@ford.com","password"));
        assertEquals("Invalid email", exception.getMessage());

//        wrong password
        exception = assertThrows(InvalidUserException.class,
                ()->walletController.logIn(wallet1.getEmail(),"wrongPassword"));
        assertEquals("Wrong password", exception.getMessage());

//        +ve
        String response = walletController.logIn(wallet1.getEmail(), wallet1.getPassword());
        assertEquals("Logged in Successfully..!",response);

    }

    @Test
    @DisplayName("Sort customer wallets")
    void testSortCustomerWallets() {

            Exception exception;

//        empty
        exception = assertThrows(WalletNotFoundException.class,
                ()->walletController.getWalletByOrder("id"));
        assertEquals("No wallets found", exception.getMessage());

        walletController.registerNewWalletUser(wallet1);
        walletController.registerNewWalletUser(wallet2);

//        invalid order
        exception =  assertThrows(WalletException.class,
                ()->walletController.getWalletByOrder("invalidOrder"));
        assertEquals("Invalid order", exception.getMessage());

//        +ve
        assertEquals(2,walletController.getWalletByOrder("id").size());
        assertEquals(2,walletController.getWalletByOrder("name").size());
        assertEquals(2,walletController.getWalletByOrder("email").size());
        assertEquals(2,walletController.getWalletByOrder("balance").size());

    }

    @Test
    @DisplayName("Get wallets by name")
    void testGetWalletsByName()  {

        walletController.registerNewWalletUser(wallet1);
        walletController.registerNewWalletUser(wallet2);

//        empty or name does not in wallet
        assertThrows(WalletNotFoundException.class,
                ()->walletController.getWalletsByName("nameNotInWallet"));

//        +ve
        assertEquals(1,walletController.getWalletsByName(wallet1.getName()).size());

    }

    @Test
    @DisplayName("Get wallets between balance")
    void testGetWalletsBetweenBalance() {

        walletController.registerNewWalletUser(wallet1); // 50000
        walletController.registerNewWalletUser(wallet2); // 65000
        Exception exception;

//        invalid fromAmount : -1000
        exception = assertThrows(WalletException.class,
                ()->walletController.getWalletByBetween(-1000.0,2000.0));
        assertEquals("fromAmount and toAmount must be greater than 0", exception.getMessage());

//        invalid toAmount : -2000
        exception = assertThrows(WalletException.class,
                ()->walletController.getWalletByBetween(1000.0,-2000.0));
        assertEquals("fromAmount and toAmount must be greater than 0", exception.getMessage());

//        fromAmount  2000 > 1000 toAmount
        exception = assertThrows(WalletException.class,
                ()->walletController.getWalletByBetween(2000.0,1000.0));
        assertEquals("fromAmount must be greater than or equal to toAmount", exception.getMessage());


//        empty or no wallets in between range
        exception = assertThrows(WalletNotFoundException.class,
                ()->walletController.getWalletByBetween(1000.0,2000.0));
        assertEquals("No wallets found between balance", exception.getMessage());

//        +ve
        assertEquals(2,walletController.getWalletByBetween(40000.0,70000.0).size());

    }

    @Test
    @DisplayName("Update wallet password")
    public void testUpdateWalletPassword() {

        walletController.registerNewWalletUser(wallet1);
        walletController.registerNewWalletUser(wallet2);
        Exception exception;

//        invalid user email : invalidemail@ford.com
        exception = assertThrows(WalletNotFoundException.class,
                ()->walletController.updateUserPassword("invalidemail@ford.com","oldPassword","newPassword"));
        assertEquals("Invalid email", exception.getMessage());

//        wrong old password
        exception = assertThrows(WalletException.class,
                ()->walletController.updateUserPassword(wallet1.getEmail(),"oldPassword","newPassword"));
        assertEquals("Old Password don't match", exception.getMessage());

//        +ve newPassword : newWallet1@123
        assertEquals("newWallet1@123",
                walletController.updateUserPassword(
                        wallet1.getEmail(),
                        wallet1.getPassword(),
                        "newWallet1@123").getPassword());
    }

    @Test
    @DisplayName("Delete wallet by id")
    void testDeleteWalletById() {
        walletController.registerNewWalletUser(wallet1);
        walletController.registerNewWalletUser(wallet2);
        Exception exception;

//        invalid id : 105
        exception = assertThrows(WalletNotFoundException.class,
                ()->walletController.deleteWalletById(105));
        assertEquals("Wallet not exist to delete", exception.getMessage());

//        +ve
        assertEquals("Deleted wallet Successfully..!", walletController.deleteWalletById(wallet1.getId()));

//        to be deleted in afterEach (to avoid error)
        walletController.registerNewWalletUser(wallet1);

    }

    @Test
    @DisplayName("Delete wallet by email")
    void testDeleteWalletByEmail() {
        walletController.registerNewWalletUser(wallet1);
        walletController.registerNewWalletUser(wallet2);
        Exception exception;

//        invalid email : invalidemail@ford.com
        exception = assertThrows(WalletNotFoundException.class,
                ()->walletController.deleteUserByEmail("inbalidemail@ford.com"));
        assertEquals("Wallet not exist to delete", exception.getMessage());

//        +ve
        assertEquals("Deleted wallet Successfully..!", walletController.deleteUserByEmail(wallet2.getEmail()));

//        to be deleted in afterEach (to avoid error)
        walletController.registerNewWalletUser(wallet2);

    }













}
