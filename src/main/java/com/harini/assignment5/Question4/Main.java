package com.harini.assignment5.Question4;

public class Main {
    public static void main(String[] args) {
        System.out.println(DataValidator.isNotEmpty(""));
        EmailValidator emailValidator = new EmailValidator();
        System.out.println(emailValidator.isValid("hari@ford"));
        PhoneValidator phoneValidator = new PhoneValidator();
        System.out.println(phoneValidator.isValid("+915678934210"));
    }
}
