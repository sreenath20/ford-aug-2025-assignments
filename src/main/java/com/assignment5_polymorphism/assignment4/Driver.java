package com.assignment5_polymorphism.assignment4;


import static com.assignment5_polymorphism.assignment4.DataValidator.isnotempty;

public class Driver {
    public static void main(String[] args) {
        DataValidator emailValidator = new EmailValidator();
        DataValidator phoneValidator = new PhoneValidator();

        String input1 = "abc@gmail.com";
        String input2="";
        String input3 = "9876543210";

        System.out.println("input1 is "+ isnotempty(input1) + " input");
        System.out.println("input2 is "+ isnotempty(input2) + " input");
        System.out.println("input3 is "+ isnotempty(input3) + " input");
        System.out.println("Email validation for input1: " + emailValidator.isvalid(input1));
        System.out.println("Phone validation for input3: " + phoneValidator.isvalid(input3));
        System.out.println("Phone validation for input1: " + phoneValidator.isvalid(input1));
        System.out.println("Email validation for input3: " + emailValidator.isvalid(input3));


    }
}
