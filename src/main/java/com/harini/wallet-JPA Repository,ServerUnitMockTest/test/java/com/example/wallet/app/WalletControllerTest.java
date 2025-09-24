package com.example.wallet.app;

import com.example.wallet.app.wallet.Wallet;
import com.example.wallet.app.wallet.WalletException;
import com.example.wallet.app.wallet.WalletService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static java.nio.file.Paths.get;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
public class WalletControllerTest {
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockitoBean
//    private WalletService walletService;
//
//    @Test
//    void testGetWalletByEmailId(){
//
//    }
    @LocalServerPort
    int port;
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void createWallaetAndTestBalance(){
        Wallet wallet = new Wallet(1,"Name 1","email","password",200.0);

        ResponseEntity<Wallet> walletResponse = testRestTemplate.postForEntity("http://localhost:"+port+"/api/v1/wallet",wallet,Wallet.class);
        Assertions.assertEquals(HttpStatus.OK,walletResponse.getStatusCode());
        Wallet walletGet = walletResponse.getBody();
        Assertions.assertNotNull(walletGet, "Response body should not be null");
        Assertions.assertEquals(200.0,walletGet.getBalance());
    }



}
