package com.bank.wallet.application;

import jakarta.transaction.Transactional;
import javafx.print.Collation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ActiveProfiles;

import java.util.Collection;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@SpringBootTest
@ActiveProfiles("test") // Use test profile
@Transactional
public class WalletServiceTests {


    @Autowired
    private WalletService walletService;

    @Autowired
    private WalletRepository walletRepository;

    private Wallet wallet;
    @BeforeEach
    void setUp(){
        this.wallet= new  Wallet(22,"Akash","AK@Gmail.com","123@",5000.04);

    }



    @Test

    void newWalletRegistrationTest(){
        assumeTrue(walletService!=null,"wallet service should not be error");


        try {
            Wallet resultWallet= this.walletService.registerNewUserWallet(wallet);
            assertEquals("Akash",resultWallet.getName() );
            Optional<Wallet> foundWallet= this.walletRepository.findByEmailId("AK@Gmail.com");
//          assertEquals(foundWallet.get().getEmail(),"AK@Gmail.com");
            Double finalBalance=foundWallet.get().getBalance();
            assertEquals(finalBalance,5000.04);

        }
        catch (WalletException e){
            throw new RuntimeException(e);
        }
        }
        @AfterEach
    void deleteWallet()  {
        try{
            this.walletService.DeleteWalletByEmailId("AK@Gmail.com");
        }
        catch (WalletException e){
            throw new RuntimeException(e);
        }
        }

        @Test
    void checkForIdAlreadyExist(){
        try{
            this.walletService.registerNewUserWallet(wallet);
            WalletException walletexception=assertThrows(WalletException.class,()->this.walletService.registerNewUserWallet(wallet));
            assertEquals("Wallet with ID  already exists",walletexception.getMessage());
        }
        catch (WalletException e){
            throw new RuntimeException(e);
        }
        }


        @Test
    void addfunds(){
        try{
            this.walletService.registerNewUserWallet(wallet);
            Double value=this.walletService.addFundsToWalletByEmailId("AK@Gmail.com",500.04);
                    assertEquals(value,5500.08);
        }
        catch (WalletException e){
            throw new RuntimeException(e);
        }
        }
}