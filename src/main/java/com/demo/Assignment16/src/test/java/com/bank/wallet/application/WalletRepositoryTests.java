package com.bank.wallet.application;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class WalletRepositoryTests {
    @Autowired
    private WalletRepository walletRepository;
private List<Wallet> wallets = new ArrayList<>();
    public WalletRepositoryTests() {
        wallets.add(new Wallet(22,"Akash","AK@Gmail.com","123@",5000.04));
        wallets.add(new Wallet(23,"Aash","A@Gmail.com","13@",500.04));
        wallets.add(new Wallet(24,"Ash","@Gmail.com","23@",50.04));

    }

    @BeforeEach
    public void setup() {


        walletRepository.saveAll(wallets);

    }
    //userLogin
    @Test
    public void userLoginTest(){
         String pass=this.walletRepository.userLogin("AK@Gmail.com","123@");
        assertEquals("123@",pass );
    }

    @AfterEach
    public void tearDown(){
        walletRepository.deleteAll();
    }
}
