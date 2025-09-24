package com.example.wallet.app;

import com.example.wallet.app.wallet.Wallet;
import com.example.wallet.app.wallet.WalletException;
import com.example.wallet.app.wallet.WalletRepository;
import com.example.wallet.app.wallet.WalletService;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Collection;

@SpringBootTest
@AutoConfigureMockMvc
public class WalletServiceTest {
    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private WalletRepository walletRepository;

    @Autowired
    private WalletService walletService;

    Collection<Wallet> walletCollection = new ArrayList<>();

//    public WalletServiceTest(){
//        walletCollection.add(new Wallet(1,"TestName1","TestEmail1","TestPassword1",100.0));
//        walletCollection.add(new Wallet(2,"TestName2","TestEmail2","TestPassword2",200.0));
//        walletCollection.add(new Wallet(3,"TestName3","TestEmail3","TestPassword3",300.0));
//        walletCollection.add(new Wallet(4,"TestName4","TestEmail4","TestPassword4",400.0));
//        walletCollection.add(new Wallet(5,"TestName5","TestEmail5","TestPassword5",500.0));
//    }
//
//    @BeforeEach
//    void setUp(){
//        walletRepository.saveAll(walletCollection);
//    }

    @Test
    void testGetWalletBalanceBetween(){
        Mockito.when(walletRepository.findByBalanceBetween(200.0,400.0)).thenReturn(new ArrayList<Wallet>() {{
            add(new Wallet(2,"TestName2","TestEmail2","TestPassword2",200.0));
            add(new Wallet(3,"TestName3","TestEmail3","TestPassword3",300.0));
            add(new Wallet(4,"TestName4","TestEmail4","TestPassword4",400.0));
        }});
        try {
            Collection<Wallet> wallets = walletService.findAllWalletsHavingBalanceBetween(200.0,400.0);
            assertNotNull(wallets," Wallets should not be null");
            assertEquals(3,wallets.size());
        } catch (WalletException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testGetWallet(){
        Mockito.when(walletRepository.findByEmail("TestEmail")).thenReturn(new Wallet(1,"TestName","TestEmail","TestPassword",100.0));
        Mockito.when(walletRepository.findByName("TestName")).thenReturn(new Wallet(1,"TestName","TestEmail","TestPassword",100.0));

        try {
            Wallet walletByEmail = walletService.getUserWalletByEmailId("TestEmail");
            Wallet walletByName = walletService.findWalletsByName("TestName");
            assertNotNull(walletByEmail," Wallet should not be null");
            assertNotNull(walletByName," Wallet should not be null");
            assertEquals("TestName",walletByEmail.getName());
            assertEquals("TestEmail",walletByName.getEmail());
        } catch (WalletException e) {

            throw new RuntimeException(e);
        }
    }

    @Test
    void testAddFunds(){
        Mockito.when(walletRepository.findByEmail("TestEmail")).thenReturn(new Wallet(1,"TestName","TestEmail","TestPassword",100.0));
        Mockito.doNothing().when(walletRepository).updateBalanceByEmail("TestEmail",50.0);
        try {
            Double withdrawFunds = walletService.addFundsToWalletByEmailId("TestEmail", 50.0);
            assertEquals(150.0,withdrawFunds);
        } catch (WalletException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testWalletNotExist(){
        Mockito.when(walletRepository.findByEmail("TestEmail")).thenReturn(new Wallet(1,"TestName","TestEmail","TestPassword",100.0));

            Exception exception = assertThrows(WalletException.class, ()->{
                walletService.userLogin("Email","Password");
            });
            assertEquals("User wallet does not exists for the email: Email",exception.getMessage());

    }

    @Test
    void testWithdrawFunds(){
        Mockito.when(walletRepository.findByEmail("TestEmail")).thenReturn(new Wallet(1,"TestName","TestEmail","TestPassword",100.0));
        Mockito.doNothing().when(walletRepository).updateBalanceByEmail("TestEmail",50.0);
        try {
            Double withdrawFunds = walletService.withdrawFromWalletByEmailId("TestEmail", 50.0);
            assertEquals(50.0,withdrawFunds);
        } catch (WalletException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testAddFundsNegativeAmount(){
        Mockito.when(walletRepository.findByEmail("TestEmail")).thenReturn(new Wallet(1,"TestName","TestEmail","TestPassword",100.0));
        Exception exception = assertThrows(WalletException.class, () -> {
            walletService.addFundsToWalletByEmailId("TestEmail", -50.0);
        });
        String expectedMessage = "Amount must be greater than zero";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage,actualMessage);
    }

}
