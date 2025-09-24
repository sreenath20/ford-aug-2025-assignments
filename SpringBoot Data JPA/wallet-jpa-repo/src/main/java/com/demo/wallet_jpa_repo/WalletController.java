package com.demo.wallet_jpa_repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("/wallet")
public class WalletController {

    private final WalletService walletService;

    @Autowired
    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Wallet registerUser(@Valid @RequestBody Wallet wallet) throws WalletException {
        return walletService.registerUser(wallet);
    }

    @PatchMapping("/deposit")
    public Wallet addFunds(@RequestParam String email, @RequestParam Double amount) throws WalletException {
        return walletService.addFunds(email, amount);
    }

    @PatchMapping("/withdraw")
    public Wallet withdrawFunds(@RequestParam String email, @RequestParam Double amount) throws WalletWithdrawException {
        return walletService.withdrawFunds(email, amount);
    }

    @PatchMapping("/transfer")
    public String transferFunds(@RequestParam String fromEmail, @RequestParam String toEmail, @RequestParam Double amount) throws WalletException {
        return walletService.transferFunds(fromEmail, toEmail, amount);
    }

    @GetMapping("/all")
    public Collection<Wallet> getAllWallets() {
        return walletService.getAllWallets();
    }

    @GetMapping("/order/{order}")
    public Collection<Wallet> getWalletsByOrder(@PathVariable String order) throws WalletException {
        return walletService.getWalletsByOrder(order);
    }

    @DeleteMapping("/delete/{email}")
    public String deleteWalletByEmail(@PathVariable String email) throws WalletException {
        return walletService.deleteWalletByEmail(email);
    }

    @GetMapping("/log-in")
    public String userLogin(@RequestParam String email, @RequestParam String password) throws InvalidUserException {
        return walletService.userLogin(email, password);
    }
}
