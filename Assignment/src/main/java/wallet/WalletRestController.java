package com.bank.wallet;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wallet")
public class WalletRestController {

    private WalletService walletService;

    @Autowired
    public WalletRestController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping
    public ResponseEntity<Wallet> createWallet( @RequestBody Wallet wallet) throws WalletException {
        return new ResponseEntity<>(this.walletService.addWallet(wallet), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Wallet getWalletById(@PathVariable Integer id) throws WalletNotFoundException {
        return this.walletService.getWalletById(id);
    }

    @PutMapping("/{id}")
    public Wallet updateWallet(@PathVariable Integer id, @Valid @RequestBody Wallet wallet) throws WalletNotFoundException {
        return this.walletService.updateWalletById(id, wallet);
    }

    @PutMapping("/addFunds/{id}")
    public Wallet addFunds(@PathVariable Integer id, @RequestParam Double amount) throws WalletNotFoundException, InvalidBalanceException {
        return this.walletService.addFunds(id, amount);
    }

    @PutMapping("/withdrawFunds/{id}")
    public Wallet withdrawFunds(@PathVariable Integer id, @RequestParam Double amount) throws WalletNotFoundException, InvalidBalanceException {
        return this.walletService.withdrawFunds(id, amount);
    }

    @PutMapping("/transferFunds")
    public List<Wallet> transferFunds(@RequestParam Double amount, @RequestParam Integer fromId, @RequestParam Integer toId) throws WalletNotFoundException, InvalidBalanceException {
        return this.walletService.transferFunds(fromId, toId, amount);
    }

    @DeleteMapping("/{id}")
    public Wallet deleteWalletById(@PathVariable Integer id) throws WalletNotFoundException {
        return this.walletService.deleteWalletById(id);
    }

    @GetMapping("/all")
    public List<Wallet> getAllWallets() throws WalletException {
        return this.walletService.getAllWallets();
    }
}
