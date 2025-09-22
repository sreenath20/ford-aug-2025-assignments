package com.demo.banking;

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
    public Wallet addFundByEmail(@RequestParam("email") String emailAddress,@RequestParam("amount") Double depositAmount){
        return walletService.addFundsToWalletByEmail(emailAddress,depositAmount);
    }

    @PatchMapping("/withdraw/email")
    public Wallet withdrawFundByEmail(@RequestParam("email") String emailAddress,@RequestParam("amount") Double withdrawAmount){
        try {
            return walletService.withdrawFundsFromWalletByEmail(emailAddress,withdrawAmount);
        } catch (WalletException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/all")
    public Collection<Wallet> getAllWallets(){
        return walletService.getAllWallets();
    }

    @PatchMapping("/transfer/from/to")
    public String transferFundByEmail(@RequestParam("fromEmail") String senderEmail,
                                      @RequestParam("toEmail") String receiverEmail,@RequestParam("amount") Double transferAmount){
        return walletService.transferFundsToWalletByEmail(senderEmail,receiverEmail,transferAmount);
    }

    @GetMapping("/get/user/email")
    public Wallet getUserByEmail(@RequestParam("email") String emailAddress){
        return walletService.getWalletByEmail(emailAddress);
    }

    @GetMapping("/user/logIn")
    public String logIn(@RequestParam("email") String emailAddress,@RequestParam("password") String userPassword){
        try {
            return walletService.userLogIn(emailAddress,userPassword);
        } catch (WalletException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/sort/order/{order}")
    public Collection<Wallet> getWalletByOrder(@PathVariable("order") String sortOrder){
        return walletService.sortCustomerWallets(sortOrder);
    }

    @GetMapping("/find/users/name/{name}")
    public Collection<Wallet> getWalletsByName(@PathVariable("name") String customerName){
        return walletService.findWalletsByName(customerName);
    }

    @GetMapping("/get/users/balance/between")
    public Collection<Wallet> getWalletByBetween(@RequestParam("fromAmount") Double startAmount,
                                                 @RequestParam("toAmount") Double endAmount){
        return walletService.findAllWalletsHavingBalanceBetween(startAmount,endAmount);
    }

    @PatchMapping("/update/password")
    public String updateUserPassword(@RequestParam("email") String emailAddress,
                                     @RequestParam("oldPassword") String currentPassword,@RequestParam("newPassword") String updatedPassword){
        return walletService.updateWalletPassword(emailAddress,currentPassword,updatedPassword);
    }

    @DeleteMapping("/delete/user/email")
    public String deleteUserByEmail(@RequestParam("email") String emailAddress){
        return walletService.deleteWalletByEmail(emailAddress);
    }


}
