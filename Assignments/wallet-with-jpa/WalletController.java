package com.demo.wallet.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RestController
@RequestMapping("wallet")
public class WalletController {

    private final WalletService walletService;

    @Autowired
    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Wallet registerNewWalletUser(@RequestBody Wallet newWallet){
            return  walletService.registerNewUser(newWallet);
    }

    @PostMapping("/many")
    @ResponseStatus(HttpStatus.CREATED)
    public String registerMultipleUsers(@RequestBody Collection<Wallet> newWallets){
        newWallets.forEach(walletService::registerNewUser);
        return "Multiple Users added successfully";
    }

    @PatchMapping("/deposit")
    public Wallet addFundByEmail(@RequestParam("email") String email,@RequestParam("amount") Double amount){
        if(amount < 1)
            throw new WalletException("Amount must be greater than zero to deposit");
        return walletService.addFundsToWalletByEmail(email,amount);
    }

    @PatchMapping("/withdraw")
    public Wallet withdrawFundByEmail(@RequestParam("email") String email,
                                      @RequestParam("amount") Double amount) throws WalletWithdrawException {
        if(amount%100 != 0 || amount < 100)
            throw new WalletWithdrawException("Amount must be a multiples of 100 and greater than 99");

        return walletService.withdrawFundsFromWalletByEmail(email,amount);

    }

    @GetMapping("/all")
    public Collection<Wallet> getAllWallets(){
        return walletService.getAllWallets();
    }

    @PatchMapping("/transfer")
    public String transferFundByEmail(@RequestParam("fromEmail") String fromEmail,
                                      @RequestParam("toEmail") String toEmail,@RequestParam("amount") Double amount){
        return walletService.transferFundsToWalletByEmail(fromEmail,toEmail,amount);
    }


    @GetMapping("/email/{email}")
    public Wallet getUserByEmail(@RequestParam("email") String email){
        return walletService.getWalletByEmail(email);
    }

    @GetMapping("/log-in")
    public String logIn(@RequestParam("email") String email,@RequestParam("password") String password) throws InvalidUserException {
            return walletService.userLogIn(email,password);
    }

    @GetMapping("/order/{order}")
    public Collection<Wallet> getWalletByOrder(@PathVariable("order") String order){
        return walletService.sortCustomerWallets(order);
    }

    @GetMapping("/name/{name}")
    public Collection<Wallet> getWalletsByName(@PathVariable("name") String name){
        return walletService.getWalletsByName(name);
    }

    @GetMapping("balance/between")
    public Collection<Wallet> getWalletByBetween(@RequestParam("fromAmount") Double fromAmount,
                                                 @RequestParam("toAmount") Double toAmount){
        return walletService.getAllWalletsHavingBalanceBetween(fromAmount,toAmount);
    }

    @PatchMapping("/update/password")
    public Wallet updateUserPassword(@RequestParam("email") String email,
                                     @RequestParam("oldPassword") String oldPassword,@RequestParam("newPassword") String newPassword){
        return walletService.updateWalletPassword(email,oldPassword,newPassword);
    }

    @DeleteMapping("/{id}")
    public String deleteWalletById(@PathVariable("id") Integer id){
        return walletService.deleteWalletById(id);
    }
    @DeleteMapping("/delete/{email}")
    public String deleteUserByEmail(@PathVariable String email){
        return walletService.deleteWalletByEmail(email);
    }


}
