package com.bank.wallet.application;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class WalletControllerAdvice {
// handle wallet exception
    @ExceptionHandler(WalletException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
public String handleException(WalletException e) {
    return "Wallet Exception : "+e.getMessage();
}

    @ExceptionHandler(WalletWithdrawException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleException(WalletWithdrawException e) {
        return "Wallet Withdraw Exception : "+e.getMessage();
    }

    @ExceptionHandler(InvalidUserException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleException(InvalidUserException e) {
        return "Invalid User Exception : "+e.getMessage();
    }
}
