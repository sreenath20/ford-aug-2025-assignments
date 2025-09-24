package com.bank.wallet.application;

import com.bank.wallet.application.Dto.BalanceDto;
import com.bank.wallet.application.Dto.WalletDto;
import jakarta.validation.Valid;
import org.hibernate.validator.internal.constraintvalidators.bv.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("api/v1/wallet")

public class WalletController {


    private final EmailValidator emailValidator;
    private WalletService walletService;


    public void setWalletService(WalletService walletService) {}
    //CRUD OPERATION
    @Autowired
    public WalletController(WalletService walletService, EmailValidator emailValidator) {


        this.walletService = walletService;
        this.emailValidator = emailValidator;
    }
    //Create
     @PostMapping("/addanother")
     public Wallet addWallets(@Valid @RequestBody WalletDto walletDto) throws WalletException {
        Wallet newUser= new Wallet(walletDto);
        return this.walletService.registerNewUserWallet(newUser);
     }

    @PutMapping("/update")
    public Wallet updateDetails(@RequestBody WalletDto walletDto) throws WalletException {
        Wallet newUser= new Wallet(walletDto);
        return this.walletService.updateWalletPassword(newUser.getEmail(),newUser);
    }

    @GetMapping("/get")
    Collection<Wallet> getWallets() throws WalletException {
        return this.walletService.getAllCustomerWallets();
    }
    @DeleteMapping("/deleteById")
    Wallet deleteWalletById(@RequestParam("mailId") String Emailid) throws WalletException {
        return this.walletService.DeleteWalletByEmailId(Emailid);

    }
    @PatchMapping("/patch")
    Double patchWallet(@RequestBody BalanceDto balanceDto) throws WalletException {
        Wallet newUser= new Wallet(balanceDto);
        return this.walletService.addFundsToWalletByEmailId(newUser.getEmail(),newUser.getBalance());
    }

    @GetMapping("/withdraw")
    Double withdrawFromWalletByEmailId(@RequestParam("emailId") String Emailid) throws WalletException {
        return this.walletService.withdrawFromWalletByEmailId(Emailid,500.9);
    }

    @PatchMapping("/Transfer")
    Boolean TransferBalance(@RequestParam("emailId") String emailFromId,@RequestParam("emailId") String emailToId,@RequestParam("amount") Double amount) throws WalletException {
        return this.walletService.transferFunds(emailFromId,emailToId,amount);
    }

    @GetMapping("/email/{emailId}")
    Collection<Wallet> getWalletByEmailId(@PathVariable("emailId") String emailId) throws WalletException {
        return this.walletService.getUserWalletByEmailId(emailId);
    }


    @GetMapping("/sorting/{order}")
    Collection<Wallet> arrange(@PathVariable("order") String order) throws WalletException {
        return this.walletService.sortCustomerWallets(order);
    }

    @GetMapping("/getname/{name}")
    Collection<Wallet> findWalletByName(@PathVariable("name") String name) throws WalletException {
        return this.walletService.findWalletsByName(name);
    }


}
