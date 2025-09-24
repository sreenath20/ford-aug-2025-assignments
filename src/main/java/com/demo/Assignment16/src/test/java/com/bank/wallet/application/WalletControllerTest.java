package com.bank.wallet.application;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class WalletControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockitoBean
    private WalletService walletService;

    @Test
    void testWalletById(){
        try{
            Mockito.when(walletService.addFundsToWalletByEmailId("abi@gmail.com",670898.0)).thenReturn(670898.0);
            String requestBody = """
        {
            "email": "abi@gmail.com",
            "balance": 670898.0
        }
        """;
            mockMvc.perform(patch("/api/v1/wallet/patch")
                            .contentType("application/json")
                            .content(requestBody))
                    .andExpect(status().isOk());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
