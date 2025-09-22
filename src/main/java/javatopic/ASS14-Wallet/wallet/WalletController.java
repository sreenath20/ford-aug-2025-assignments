package bank.wallet;


import jakarta.transaction.Transactional;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

//crud operation on wallet will be performed here
@RestController
@RequestMapping("api/v1/wallet")
public class WalletController {

    @Autowired
    private WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping
    public Wallet registerNewWalletUser(@RequestBody Wallet newWallet) throws WalletException{

        try{
            return this.walletService.registerNewUserWallet(newWallet);
        }

        catch(WalletException e){
            throw new WalletException(e.getMessage());
        }

    }

    @GetMapping("/All")
    @ResponseStatus(HttpStatus.OK)
    public Collection<Wallet> getAllWallets() throws WalletException{
        try{
            return this.walletService.getAllCustomerWallets();
        }
        catch(WalletException e){
            throw new WalletException(e.getMessage());
        }
    }

    @PatchMapping("/debit")
    @ResponseStatus(HttpStatus.OK)
    public String withdrawFundsByEmailId(@RequestParam("email") String emailId,@RequestParam("amount") Double amount) throws WalletException{
       if(this.walletService.withdrawFundsFromWalletByEmailId(emailId, amount)>0){
           return "Amount successfully debited ";
       }
       else{
           return "error in debit";
       }
//        return this.walletService.withdrawFundsFromWalletByEmailId(emailId,amount);
    }

    @PatchMapping("/credit")
    @ResponseStatus(HttpStatus.OK)
    public String AddFundsByEmailId(@RequestParam("email") String emailId,@RequestParam("amount") @Min(1) Double amount) throws WalletException{
        if(this.walletService.addFundsToWalletByEmailId(emailId, amount)>0){
            return "Amount successfully credited";
        }
        else{
            return "error in credit";
        }
    }

    @PatchMapping("/transfer")
    @ResponseStatus(HttpStatus.OK)
    public String TransferFundsByEmailId(@RequestParam("fromEmail") String fromEmailId,@RequestParam("toEmail") String toEmailId,@RequestParam("amount") @Min(1) Double amount) throws WalletException{
        if(this.walletService.transferFunds(fromEmailId,toEmailId,amount)) {
            return "Amount successfully transferred";
        }
        else{
            return "error in transfer";
        }
    }
//
//    @GetMapping("/id")
//    @ResponseStatus(HttpStatus.OK)
//    public Collection<Wallet> getWalletById(@RequestParam("id") String id) throws WalletException{
//         return this.walletService.getUserWalletByEmailId(id);
//
//    }

    @GetMapping("/email")
    @ResponseStatus(HttpStatus.OK)
    public Collection<Wallet> getWalletByEmailId(@RequestParam("email") String email) throws WalletException{
        return this.walletService.getUserWalletByEmailId(email);

    }


    @GetMapping("/userLogin")
    @ResponseStatus(HttpStatus.OK)
    public Collection<Wallet> userLogin(@RequestParam("email") String email,
                                        @RequestParam("password") String password) throws WalletException{
        return this.walletService.userLogin(email,password);
    }

    @PatchMapping("/changePassword")
    @ResponseStatus(HttpStatus.OK)

    public String changePassword(@RequestParam("email") String email,@RequestParam("oldPassword") String oldPassword,@RequestParam("newPassword") String newPassword) throws WalletException{
        if(this.walletService.updateWalletPassword(email,oldPassword,newPassword)){
            return "Successfully changed password";
        }
        else{
            return "error in change password,check you old password ";
        }
    }






}
