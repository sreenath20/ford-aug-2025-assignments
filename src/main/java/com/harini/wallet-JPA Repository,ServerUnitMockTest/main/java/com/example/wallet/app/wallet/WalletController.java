package com.example.wallet.app.wallet;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("api/v1/wallet")
public class WalletController {

    private WalletServiceImp walletServiceImp;

    @Autowired
    public WalletController(WalletServiceImp walletServiceImp) {
        this.walletServiceImp = walletServiceImp;
    }

   // @ResponseStatus(HttpStatus.CREATED)
    //ResponseEntity - a wrapper class
    @PostMapping
    public Wallet registerWallet(@RequestBody Wallet newWallet) throws WalletException {
        return this.walletServiceImp.registerNewUserWallet(newWallet);
    }

    @GetMapping("/allusers")
    public Collection<Wallet> getAllUsers() throws WalletException {
        return this.walletServiceImp.getAllCustomerWallets();
    }

    @Transactional
    @PatchMapping("/addFund")
    public Double addFundsByEmailId(@RequestParam("email") String email, @RequestParam("amount") Double amount) throws WalletException {
        return this.walletServiceImp.addFundsToWalletByEmailId(email, amount);
    }

    @Transactional
    @PatchMapping("/withdrawFund")
    public Double withdrawFundsByEmailId(@RequestParam("email") String email, @RequestParam("amount") Double amount) throws WalletException {
        return this.walletServiceImp.withdrawFromWalletByEmailId(email, amount);
    }



}
