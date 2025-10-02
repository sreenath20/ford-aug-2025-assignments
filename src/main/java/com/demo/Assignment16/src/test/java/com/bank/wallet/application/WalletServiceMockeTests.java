package com.bank.wallet.application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import com.bank.wallet.*;

// ✅ CORRECT imports for Collection
import java.util.Arrays;
import java.util.Collection;

// ✅ REMOVE this Jackson import completely
// import static com.fasterxml.jackson.databind.type.LogicalType.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
public class WalletServiceMockeTests {

    @MockitoBean
    private WalletRepository walletRepository;

    @Autowired
    private WalletService walletService;

    @Test
    void testGetsUser() throws WalletException {

        Wallet wallet1 = new Wallet(22, "Akash", "AK@Gmail.com", "123@", 5000.04);
        Wallet wallet2 = new Wallet(23, "Akash", "AK2@Gmail.com", "124@", 3000.50);

        Collection<Wallet> expectedWallets = Arrays.asList(wallet1, wallet2);
        when(walletRepository.findByName("Akash")).thenReturn(expectedWallets);

        Collection<Wallet> result = walletService.findWalletsByName("Akash");


        assertNotNull(result);
        assertEquals(2, result.size());
    }

    @Test
    void testGetsWallet() throws WalletException {}
}
