package com.demo.wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("api/v1/wallet")
public class WalletController {

    @Autowired
    private WalletService walletService;

    @PostMapping("/add/user")
    public Wallet registerNewWalletUser(@RequestBody Wallet newWallet){
        try {
            return  walletService.registerNewUser(newWallet);
        }
        catch (Exception e){
            System.out.println( e.getMessage() );
        }
        return null;
    }

    @PostMapping("add/users")
    public String registerMultipleUsers(@RequestBody Collection<Wallet> newWallets){
        newWallets.forEach( wallet -> walletService.registerNewUser( wallet) );
        return "Multiple Users added successfully";
    }

    @PatchMapping("/add/fund/email")
    public Wallet addFundByEmail(@RequestParam("email") String email,@RequestParam("amount") Double amount){
        return walletService.addFundsToWalletByEmail(email,amount);
    }

    @PatchMapping("/withdraw/email")
    public Wallet withdrawFundByEmail(@RequestParam("email") String email,@RequestParam("amount") Double amount){
        try {
            return walletService.withdrawFundsFromWalletByEmail(email,amount);
        } catch (WalletWithdrawException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/all")
    public Collection<Wallet> getAllWallets(){
        return walletService.getAllWallets();
    }

    @PatchMapping("/transfer/from/to")
    public String transferFundByEmail(@RequestParam("fromEmail") String fromEmail,
                                      @RequestParam("toEmail") String toEmail,@RequestParam("amount") Double amount){
        return walletService.transferFundsToWalletByEmail(fromEmail,toEmail,amount);
    }

    @GetMapping("/get/user/email")
    public Wallet getUserByEmail(@RequestParam("email") String email){
        return walletService.getWalletByEmail(email);
    }

    @GetMapping("/user/logIn")
    public String logIn(@RequestParam("email") String email,@RequestParam("password") String password){
        try {
            return walletService.userLogIn(email,password);
        } catch (InvalidUserException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/sort/order/{order}")
    public Collection<Wallet> getWalletByOrder(@PathVariable("order") String order){
        return walletService.sortCustomerWallets(order);
    }

    @GetMapping("/find/users/name/{name}")
    public Collection<Wallet> getWalletsByName(@PathVariable("name") String name){
        return walletService.findWalletsByName(name);
    }

    @GetMapping("/get/users/balance/between")
    public Collection<Wallet> getWalletByBetween(@RequestParam("fromAmount") Double fromAmount,
                                                 @RequestParam("toAmount") Double toAmount){
        return walletService.findAllWalletsHavingBalanceBetween(fromAmount,toAmount);
    }

    @PatchMapping("/update/password")
    public String updateUserPassword(@RequestParam("email") String email,
                                     @RequestParam("oldPassword") String oldPassword,@RequestParam("newPassword") String newPassword){
        return walletService.updateWalletPassword(email,oldPassword,newPassword);
    }

    @DeleteMapping("/delete/user/email")
    public String deleteUserByEmail(@RequestParam("email") String email){
        return walletService.deleteWalletByEmail(email);
    }

    
}
