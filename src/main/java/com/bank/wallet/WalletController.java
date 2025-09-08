package com.bank.wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("api/v1/wallet") // version of apis
public class WalletController {

    @Autowired
    private WalletService walletService;

    //CRUD on wallet resource
    @Autowired
    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping
    public Wallet registerNewWalletUser(@RequestBody Wallet newWallet) {
        try{
            return this.walletService.registerNewUserWallet(newWallet);
        }
        catch(WalletException e){
            throw new RuntimeException(e);
        }
    }

    @PatchMapping("/{email}/amount/{amount}")
    public Double addFundsToWalletByEmail(@PathVariable("email") String email, @PathVariable Double amount) {
        try {
            return this.walletService.addFundsToWalletByEmailId(email, amount);
        } catch (WalletException e) {
            throw new RuntimeException(e);
        }

    }

    // handler methods
    @PatchMapping("/amount")
    public Double withdrawFundsFromWalletByEmailId(@RequestBody WalletDto walletDto) {
        try {
            return this.walletService.withdrawFromWalletByEmailId(walletDto.getFromEmailId(), walletDto.getAmount());
        } catch (WalletException e) {
            throw new RuntimeException(e);
        }
    }


    @GetMapping("/all")
    public Collection<Wallet> getAllWallets() {
        try {
            return this.walletService.getAllCustomerWallets();
        } catch (WalletException e) {
            throw new RuntimeException(e);
        }
    }

}
